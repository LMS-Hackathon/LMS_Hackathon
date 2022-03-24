package stepDefinitions;

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
import pageObjects.ManageAssignments_AdminPage;
import pageObjects.ManageAttendancePage;
import pageObjects.ManagesubmissionsPage;

public class ManageSubmissionSteps extends BaseClass {
	
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
	
	@Given("Admin is on Manage Submissions\\(Admin) page by clicking on Manage button in Manage assignments page\\(admin)")
	public void admin_is_on_manage_submissions_admin_page_by_clicking_on_manage_button_in_manage_assignments_page_admin() {
	   
		
		ap=new  LaunchApplicationPage(driver);
		lp=new LoginPage(driver);
		sp=new AnsSecurityQuestPage(driver);
		driver.get(readconfig.getApplicationURL());
		driver.manage().window().maximize();
		ap.clickLogin();

		lp.setUsername(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		mnap.clickManageAssignments();
		mnap.clickManageGrades();
	}

	@When("Admin clicks on submit button after selecting all th details like Batch,Assignment Name,Assignment Date ,Grade By ,Grade ,Make Garde Visible and add comments")
	public void admin_clicks_on_submit_button_after_selecting_all_th_details_like_batch_assignment_name_assignment_date_grade_by_grade_make_garde_visible_and_add_comments() {
	    
		msp.selectGradeBatch();
		msp.selectAssignmentName();
		msp.setAssignmentDate();
		msp.setSubComments();
		msp.clickButton1();
		msp.clickButton2();
		msp.clickButton3();
		msp.clickButton4();
		msp.clickButton5();
		msp.selectGradedBy();
		msp.selectGrade();
		msp.clickCheckBox();
		msp.clickSubmit();
	}

	@Then("Grade Details will be visible to both Admin and User View")
	public void grade_details_will_be_visible_to_both_admin_and_user_view() {
	   
		msp.verifyGradeVisible();
	}

	@When("Admin clicks on Submit button after selecting all the details like Batch,Assignment Name,Assignment Date ,Grade By ,Grade ,add comments")
	public void admin_clicks_on_submit_button_after_selecting_all_the_details_like_batch_assignment_name_assignment_date_grade_by_grade_add_comments() {
	    
		msp.selectGradeBatch();
		msp.selectAssignmentName();
		msp.setAssignmentDate();
		msp.setSubComments();
		msp.clickButton1();
		msp.clickButton2();
		msp.clickButton3();
		msp.clickButton4();
		msp.clickButton5();
		msp.selectGradedBy();
		msp.selectGrade();
		
		msp.clickSubmit();
	}

	@Then("Grade Details will be visible only to Admin")
	public void grade_details_will_be_visible_only_to_admin() {
		
	   msp.verifyGradeInVisible();
	}

}
