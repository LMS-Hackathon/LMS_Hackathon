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
import pageObjects.Add_EditPrograms_adminPage;
import pageObjects.AnsSecurityQuestPage;
import pageObjects.LaunchApplicationPage;
import pageObjects.LoginPage;
import pageObjects.ManageAssignments_AddEditPage;
import pageObjects.ManageNotificationPage;
import pageObjects.ManageProgramsPage;

public class ManageProgramsSteps extends BaseClass{

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

	@Given("Admin is on Add tab in Add\\/Edit Programs page by clicking Add Program in Manage Programs Page\\(admin)")
	public void admin_is_on_add_tab_in_add_edit_programs_page_by_clicking_add_program_in_manage_programs_page_admin() {

		ap=new  LaunchApplicationPage(driver);
		lp=new LoginPage(driver);
		sp=new AnsSecurityQuestPage(driver);
		driver.get(readconfig.getApplicationURL());
		driver.manage().window().maximize();
		ap.clickLogin();

		lp.setUsername(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		mpp.clickPrograms();
		mpp.clickAddProgram();
		aepa.clickAdd();
	}

	@When("Admin clicks on submit button after entering the Program Name ,Program Description,Program Status")
	public void admin_clicks_on_submit_button_after_entering_the_program_name_program_description_program_status() {

		aepa.setProgramName();
		aepa.setProgramDesc();
		aepa.clickradActive();
		aepa.clickSubmit();
	}

	@Then("All the program details will be added to Programs List in Manage Programs Page\\(admin) with auto generated same ProgramCreationtime and ProgramModifiedtime in   MM\\/DD\\/YY HH:MM format")
	public void all_the_program_details_will_be_added_to_programs_list_in_manage_programs_page_admin_with_auto_generated_same_program_creationtime_and_program_modifiedtime_in_mm_dd_yy_hh_mm_format() {

		String msg_Add=aepa.getMessage();
		String org_msg_Add="New Programs are added successfully";
		Assert.assertEquals(msg_Add, org_msg_Add);
	}

	@Given("Admin is on Edit tab in Add\\/Edit Programs page by clicking Edit icon in Manage Programs Page\\(admin)")
	public void admin_is_on_edit_tab_in_add_edit_programs_page_by_clicking_edit_icon_in_manage_programs_page_admin() {

		mpp.clickPrograms();
		mpp.clickAddProgram();
		aepa.clickEdit();

	}

	@When("Admin clicks on submit button after updating the required fields like Program Name ,Program Description,Program Status")
	public void admin_clicks_on_submit_button_after_updating_the_required_fields_like_program_name_program_description_program_status() {

		aepa.setProgramName();
		aepa.setProgramDesc();
		aepa.clickradActive();
		aepa.clickSubmit();
	}

	@Then("All the updated program details will be added to Programs List in Manage Programs Page\\(admin) with auto generated same ProgramCreationtime and modified Programtime MM\\/DD\\/YY HH:MM format")
	public void all_the_updated_program_details_will_be_added_to_programs_list_in_manage_programs_page_admin_with_auto_generated_same_program_creationtime_and_modified_programtime_mm_dd_yy_hh_mm_format() {

		String msg_Edit=aepa.getMessage();
		String org_msg_Edit="Programs are updated successfully";
		Assert.assertEquals(msg_Edit, org_msg_Edit);
	}

	@Given("Admin is on Manage Programs Page\\(admin) by clicking on Programs Tab")
	public void admin_is_on_manage_programs_page_admin_by_clicking_on_programs_tab() {

		mpp.clickPrograms();


	}

	@When("Admin clicks on Trash icon for any program in Programs List")
	public void admin_clicks_on_trash_icon_for_any_program_in_programs_list() {

		mpp.clickDelete();
	}

	@Then("Program will be deleted from the Programs List in Manage Programs Page\\(admin)")
	public void program_will_be_deleted_from_the_programs_list_in_manage_programs_page_admin() {

		String msg_Delete=aepa.getMessage();
		String org_msg_Delete="Programs are updated successfully";
		Assert.assertEquals(msg_Delete, org_msg_Delete);
	}


}
