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
import pageObjects.ManageAssignments_AdminPage;
import pageObjects.ManageAssignments_UserViewPage;
import pageObjects.ManageAttendancePage;

public class ManageAssignmenets_UserViewSteps extends BaseClass {

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

	@Given("Given User  is on  manage Assignments page\\(User view) by clicking on edit Assignment in Manage Assignments Page\\(admin)")
	public void given_user_is_on_manage_assignments_page_user_view_by_clicking_on_edit_assignment_in_manage_assignments_page_admin() {


		ap=new  LaunchApplicationPage(driver);
		lp=new LoginPage(driver);
		sp=new AnsSecurityQuestPage(driver);
		driver.get(readconfig.getApplicationURL());
		driver.manage().window().maximize();
		ap.clickLogin();

		lp.setUsername(username);
		lp.setPassword(password);
		lp.clickSubmit();
		mp.clickManageAssignments();
		mp.setAssignmentBatch();
		mp.clickEditAssignment();

	}

	@When("Admin clicks on download  button after updating one or more assignment details")
	public void admin_clicks_on_download_button_after_updating_one_or_more_assignment_details() {

		mvp.setAssignmentName();
		mvp.setAssignmentDescription();
		mvp.setDate();

		mvp.clicklinkDownload1();
		mvp.clicklinkDownload2();
		mvp.clicklinkDownload3();
		mvp.clicklinkDownload4();
		mvp.clicklinkDownload5();

	}

	@Then("Message will be displayed like {string}")
	public void message_will_be_displayed_like(String string) {

		String current_msg=mvp.getMessage();
		String Act_Msg="Files have been downloaded successfully";
		Assert.assertEquals(current_msg, Act_Msg);
	}
}
