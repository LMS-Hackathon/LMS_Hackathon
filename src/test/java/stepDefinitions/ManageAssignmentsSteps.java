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

public class ManageAssignmentsSteps extends BaseClass {


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

	@Given("Admin is on Add tab of manage Assignments page\\(admin view) by clicking on Add Assignment in Manage Assignments Page\\(admin)")
	public void admin_is_on_add_tab_of_manage_assignments_page_admin_view_by_clicking_on_add_assignment_in_manage_assignments_page_admin() {

		
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
		mp.clickAddAssignment();

	}

	@When("Admin clicks on submit button after selecting Batch and enters Assignment name, Assignment Description , Assignment Due, Upload assignments")
	public void admin_clicks_on_submit_button_after_selecting_batch_and_enters_assignment_name_assignment_description_assignment_due_upload_assignments() {

		map.clickDropdown();
		map.setAssignmentName();
		map.setAssignmentDescription();
		map.setDate();
		map.clicklinkUpload1();
		map.clicklinkUpload2();
		map.clicklinkUpload3();
		map.clicklinkUpload4();
		map.clicklinkUpload5();
		map.clickSubmit();



	}

	@Then("Created assignments will be displayed in Manage Assignments Page\\(admin) and Manage Assignment page\\(User View)")
	public void created_assignments_will_be_displayed_in_manage_assignments_page_admin_and_manage_assignment_page_user_view() {

		String message_dsply=map.getText();
		String Act_message="New Assignment is added successfully";

		if (message_dsply.equals(Act_message))
		{
			System.out.println("Assignment is added successfully");
		}
		else
		{
			System.out.println("Something went wrong .Please try again");
		}

	}

	@Given("Admin is on Edit tab of manage Assignments page\\(admin view) by clicking on Add Assignment in Manage Assignments Page\\(admin)")
	public void admin_is_on_edit_tab_of_manage_assignments_page_admin_view_by_clicking_on_add_assignment_in_manage_assignments_page_admin() {

		mp.clickManageAssignments();
		mp.setAssignmentBatch();
		mp.clickEditAssignment();
		
		map.clickbtneditAssignment();
		map.clickDropdown();
		map.setAssignmentName();
		map.setAssignmentDescription();
		map.setDate();
		map.clicklinkUpload1();
		map.clicklinkUpload2();
		map.clicklinkUpload3();
		map.clicklinkUpload4();
		map.clicklinkUpload5();

	}

	@When("Admin clicks on submit button after updating one or more assignment details")
	public void admin_clicks_on_submit_button_after_updating_one_or_more_assignment_details() {

		map.clickSubmit();	
	}

	@Then("Updated assignment details will be displayed in Manage Assignments Page\\(admin) and Manage Assignment page\\(User View)")
	public void updated_assignment_details_will_be_displayed_in_manage_assignments_page_admin_and_manage_assignment_page_user_view() {

		String message_edit=map.getText();
		String Act_message_edit=" Assignment details  are updated successfully";

		if (message_edit.equals(Act_message_edit))
		{
			System.out.println("Assignment is edited successfully");
		}
		else
		{
			System.out.println("Something went wrong .Please try again");
		}
	}

	@Given("Admin is on Manage Assignments Page\\(admin)")
	public void admin_is_on_manage_assignments_page_admin() {

		mp.clickManageAssignments();

	}

	@When("Admin clicks on Trash icon after selecting existing assignments")
	public void admin_clicks_on_trash_icon_after_selecting_existing_assignments() {

		mp.setAssignmentBatch();
		mp.clickDeleteAssignment();
	}

	@Then("Deleted assignment will be removed from Admin View in Manage Assignments Page\\(admin) and Manage Assignment page\\(User View)")
	public void deleted_assignment_will_be_removed_from_admin_view_in_manage_assignments_page_admin_and_manage_assignment_page_user_view() {

		String message_delete=map.getText();
		String Act_message_delete=" Assignment is deleted successfully";

		if (message_delete.equals(Act_message_delete))
		{
			System.out.println("Assignment is deleted successfully");
		}
		else
		{
			System.out.println("Something went wrong .Please try again");
		}

	}

}
