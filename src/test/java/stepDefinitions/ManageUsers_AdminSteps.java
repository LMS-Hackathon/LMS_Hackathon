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
import pageObjects.ManageAttendancePage;
import pageObjects.ManageRegisteredUsersPage;
import pageObjects.ManageUser_Edit_Page;
import pageObjects.ManageUser_View_Page;
import pageObjects.ManageUsers_AdminPage;
import pageObjects.ManagesubmissionsPage;

public class ManageUsers_AdminSteps extends BaseClass {
	

	public ManageRegisteredUsersPage mrp;
	public ManageUser_View_Page mvp;
	
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

	@Given("Admin is on LMS Admin User Page")
	public void admin_is_on_lms_admin_user_page() {
	   
		
		ap=new  LaunchApplicationPage(driver);
		lp=new LoginPage(driver);
		sp=new AnsSecurityQuestPage(driver);
		driver.get(readconfig.getApplicationURL());
		driver.manage().window().maximize();
		ap.clickLogin();

		lp.setUsername(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		mup.clickManageUsers();
		
	}

	@When("Admin clicks on search button after entering  Email or Batch or Skill or program")
	public void admin_clicks_on_search_button_after_entering_email_or_batch_or_skill_or_program() {
	  
		mup.setEmail();
		mup.clickSearch();
	}

	@Then("Admin will be navigated to Manage users\\(admin) page and Registered User list will be displayed")
	public void admin_will_be_navigated_to_manage_users_admin_page_and_registered_user_list_will_be_displayed() {
	    
		String title_RegisteredUsers="Registered Users List";
		Assert.assertEquals(title_RegisteredUsers,driver.getTitle());
	}

	@Given("Admin is on Manage users\\(admin) page, Registered User list,and clicks on edit icon")
	public void admin_is_on_manage_users_admin_page_registered_user_list_and_clicks_on_edit_icon() {
		
		mrp.clickEditButton();
	   
	}

	@When("Admin  will be navigated to Manage users\\(admin) page where User details will be displayed")
	public void admin_will_be_navigated_to_manage_users_admin_page_where_user_details_will_be_displayed() {
	   
		String msg=mep.getMessage();
		String msg_actual="Registered Users List page";
		Assert.assertEquals(msg_actual,msg);
	}

	@Then("Admin will be able to edit User details like Time zone, User role batch, Program and click on save")
	public void admin_will_be_able_to_edit_user_details_like_time_zone_user_role_batch_program_and_click_on_save() {
	   
		mep.setEmail();
		mep.setFirstName();
		mep.setLastName();
		mep.setPhoneNumber();
		mep.setLocation();
		mep.selectTimeZone();
		mep.setLinkednURL();
		mep.setUGEducation();
		mep.setPGEducation();
		
		mep.setUserroleName();
		mep.setUserSkill();
		mep.setExperience();
		mep.txtUserComments();
		mep.selectBatchName();
		mep.selectProgramName();
	
		mep.clickSave();
		
	}

	@Given("Admin is on Manage users\\(admin) page, Registered Users list")
	public void admin_is_on_manage_users_admin_page_registered_users_list() {
	   
		mup.clickManageUsers();
		mup.setEmail();
		mup.clickSearch();
		
	}

	@When("Admin clicks on trash icon of particular registered user")
	public void admin_clicks_on_trash_icon_of_particular_registered_user() {
	  
		mrp.clickDeleteButton();
	}

	@Then("Deleted registered user will be removed from Registered users list")
	public void deleted_registered_user_will_be_removed_from_registered_users_list() {
	   
		String msg=mep.getMessage();
		String msg_actual_delete="User is Deleted successfully";
		Assert.assertEquals(msg_actual_delete,msg);
	}

	@When("Admin clicks on eye icon for particular user")
	public void admin_clicks_on_eye_icon_for_particular_user() {
	   
		mup.clickManageUsers();
		mup.setEmail();
		mup.clickSearch();
		mrp.clickViewButton();
	}

	@Then("Admin will be navigated to Manage users \\(admin) page and view the User details only in read only format")
	public void admin_will_be_navigated_to_manage_users_admin_page_and_view_the_user_details_only_in_read_only_format() {
	   
		mvp.verifyFieldsDisplay();
	}

}
