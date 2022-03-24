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
import pageObjects.ManageUnRegisteredUsersPage;
import pageObjects.ManageUser_Edit_Page;
import pageObjects.ManageUser_View_Page;
import pageObjects.ManageUsers_AdminPage;
import pageObjects.ManagesubmissionsPage;

public class ManageUnRegisteredUsersSteps  extends BaseClass{
	
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
	
	@Given("Admin is on LMS   Admin  User Page")
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

	@When("Admin clicks on New Unassigned User hyperlink")
	public void admin_clicks_on_new_unassigned_user_hyperlink() {
	    
		mup.clickUnassignedUsers();
	}

	@Then("Admin will be navigated to  Manage user\\(admin) page, Unregistered User list will be displayed")
	public void admin_will_be_navigated_to_manage_user_admin_page_unregistered_user_list_will_be_displayed() {
	   
		String current_title=mrup.getTitle();
		String org_title="Un Registered User Page List";
		Assert.assertEquals(current_title,org_title);
	}

	@Given("Admin is on  Manage user\\(admin) page, Unregistered User list")
	public void admin_is_on_manage_user_admin_page_unregistered_user_list() {
	   
		mrup.verifyDisplayButtons();
	}

	@When("Admin clicks on edit icon of particular unregistered user and admin will be navigated to manage users\\(admin) page")
	public void admin_clicks_on_edit_icon_of_particular_unregistered_user_and_admin_will_be_navigated_to_manage_users_admin_page() {
	   
		mrup.clickEdit();
	}
	
	@Then("Admin will be able to edit User details like Time zone, User  role , Program and click on save")
	public void admin_will_be_able_to_edit_user_details_like_time_zone_user_role_program_and_click_on_save() {
	    
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


	@When("Admin clicks on trash icon of particular unregistered user")
	public void admin_clicks_on_trash_icon_of_particular_unregistered_user() {
	   
		mrup.clickDelete();
	}

	@Then("Deleted unregistered user will be removed from Unregistered users list")
	public void deleted_unregistered_user_will_be_removed_from_unregistered_users_list() {
		
		
	   String current_msg=mrup.getMessage();
	   String act_msg="User is deleted successfully";
	   
	   Assert.assertEquals(current_msg,act_msg);
	}

	@Given("Admin is on Manage users\\(admin) page of User list\\(Unregistered)")
	public void admin_is_on_manage_users_admin_page_of_user_list_unregistered() {
	    
		mrup.verifyDisplayButtons();
		
	}

	@When("When result is containing many user records")
	public void when_result_is_containing_many_user_records() {
	  
		mrup.verifyButtonPagination();
	}

	@Then("Large number of user records will be divided into smaller discrete pages")
	public void large_number_of_user_records_will_be_divided_into_smaller_discrete_pages() {
		
	    mrup.verifyPaginationEnabled();
	}

}
