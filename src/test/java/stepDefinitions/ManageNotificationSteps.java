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

public class ManageNotificationSteps extends BaseClass{
	
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
	
	@Given("Admin is on  Notification page")
	public void admin_is_on_notification_page() {
		
		
		ap=new  LaunchApplicationPage(driver);
		lp=new LoginPage(driver);
		sp=new AnsSecurityQuestPage(driver);
		driver.get(readconfig.getApplicationURL());
		driver.manage().window().maximize();
		ap.clickLogin();
		
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		mnp.clickManageNotification();
		
	}

	@When("Admin clicks on submit button after selectingProgram Name from dropdown and enter details  Hackathon Name,hackathon description,Hackathon date and Hackathon comments")
	public void admin_clicks_on_submit_button_after_selecting_program_name_from_dropdown_and_enter_details_hackathon_name_hackathon_description_hackathon_date_and_hackathon_comments() {
	    
		mnp.selectProgramName();
		mnp.setHackathonNmae();
		mnp.setHackathonDesc();
		mnp.setHackathonDesc();
		mnp.setHackathonComments();
		
		mnp.clickSubmit();
	}

	@Then("Notifications will be submitted successfully")
	public void notifications_will_be_submitted_successfully() {
		
	   String msg_Displayed=mnp.getTextMessage();
	   String act_Message="Notifications will be submitted successfully";
	   Assert.assertEquals(msg_Displayed, act_Message);
	}


}
