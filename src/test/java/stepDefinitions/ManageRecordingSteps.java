package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.AnsSecurityQuestPage;
import pageObjects.LaunchApplicationPage;
import pageObjects.LoginPage;
import pageObjects.ManageAssignments_AddEditPage;
import pageObjects.ManageNotificationPage;
import pageObjects.ManageRecordingPage;

public class ManageRecordingSteps extends BaseClass {
	
	@Before
	public void setup()
	{
		String br=readconfig.getBrowser();

		if (br.equals("chrome"))
		{	
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();}
		else if (br.equals("firefox"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new FirefoxDriver();}
	}
	
	@Given("Admin is on Manage Recording\\(Admin) page by clicking Manage Recordings tab")
	public void admin_is_on_manage_recording_admin_page_by_clicking_manage_recordings_tab1() {
		
		ap=new  LaunchApplicationPage(driver);
		lp=new LoginPage(driver);
		sp=new AnsSecurityQuestPage(driver);
		driver.get(readconfig.getApplicationURL());
		driver.manage().window().maximize();
		ap.clickLogin();

		lp.setUsername(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
	    mrp.clickManageRecording();
	}

	@When("Admin upload recording after selecting Batch and topic")
	public void admin_upload_recording_after_selecting_batch_and_topic() {
		
	    mrp.SelectBatchRecording();
	    mrp.SelectRecordingTopic();
	    mrp.clickUploadRecording();
	}

	@Then("Uploaded recording will be displayed in Manage Classes page\\(Admin View) for selected topic")
	public void uploaded_recording_will_be_displayed_in_manage_classes_page_admin_view_for_selected_topic() {
	   
		String msg_recording=mrp.getTextMessage();
		String msg_actual="Recording is upoaded successfully";
		
		Assert.assertEquals(msg_recording, msg_actual);
	}
	
	@Given("Admin is on Manage Recording\\(Admin) page by clicking Manage Recordings tab\"")
	public void admin_is_on_manage_recording_admin_page_by_clicking_manage_recordings_tab() {

		  mrp.clickManageRecording();
	}

	@When("Admin upload resources after selecting Batch and topic")
	public void admin_upload_resources_after_selecting_batch_and_topic() {
	    
		    mrp.SelectBatchRecording();
		    mrp.SelectRecordingTopic();
		    mrp.clickUploadResources();
	}

	@Then("Upload resources will be displayed in Manage Classes page\\(Admin View) for selected topic")
	public void upload_resources_will_be_displayed_in_manage_classes_page_admin_view_for_selected_topic() {
		
		String msg_resources=mrp.getTextMessage();
		String msg_actualResources="Resources are upoaded successfully";
		
		Assert.assertEquals(msg_resources, msg_actualResources);
	   
	}


}
