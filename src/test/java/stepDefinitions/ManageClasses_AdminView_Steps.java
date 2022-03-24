package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.Assert;
import pageObjects.Add_EditClasses_AdminPage;
import pageObjects.AnsSecurityQuestPage;
import pageObjects.LaunchApplicationPage;
import pageObjects.LoginPage;
import pageObjects.ManageAssignments_AddEditPage;
import pageObjects.ManageAttendancePage;
import pageObjects.ManageClassesAdminView;

public class ManageClasses_AdminView_Steps extends BaseClass {

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
	
	@Given("Admin is on Manage Classes Page by clicking on Manage Classes tab")
	public void admin_is_on_manage_classes_page_by_clicking_on_manage_classes_tab() {
		
		ap=new  LaunchApplicationPage(driver);
		lp=new LoginPage(driver);
		sp=new AnsSecurityQuestPage(driver);
		driver.get(readconfig.getApplicationURL());
		driver.manage().window().maximize();
		ap.clickLogin();

		lp.setUsername(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		mav.clickManageClass();
	}

	@When("Admin  selects particular Batch")
	public void admin_selects_particular_batch() {
	   
		mav.selectClassBatch();
	}

	@Then("All the existing Classes details are displayed in Manage Classes Page page")
	public void all_the_existing_classes_details_are_displayed_in_manage_classes_page_page() {
	   
		mav.verifyDisplay();
	}

//	@Given("Admin  selects particular Batch")
//	public void admin_selects_particular_batch1() {
//	   
//		mav.selectClassBatch();
//	}

	@Given("clicks on Add classes on Manage Classes page")
	public void clicks_on_add_classes_on_manage_classes_page() {
	 
		mav.clickbtnAddClass();
	}

	@Given("Admin is navigated to Add or Edit Classes page")
	public void admin_is_navigated_to_add_or_edit_classes_page() {
	   
		String Actual_Title="Add/Edit Classes Admin View";
		Assert.assertEquals(Actual_Title,driver.getTitle());
	}

	@When("Admin Selects Add tab")
	public void admin_selects_add_tab() {
	   
		aep.clickAdd();
	}

	@When("Admin enters class details like Class Topic, Class Date, Staff Name, Class Description, Comments for the selected batch")
	public void admin_enters_class_details_like_class_topic_class_date_staff_name_class_description_comments_for_the_selected_batch() {
	   
		aep.setTopic();
		aep.setDate();
		aep.selectStaffName();
		aep.setclassDesc();
		aep.setComments();
		
	}

	@When("Admin clicks on the submit button")
	public void admin_clicks_on_the_submit_button() {
	   
		aep.clickSubmit();
	}

	@Then("Created class is displayed in Manage classes page")
	public void created_class_is_displayed_in_manage_classes_page() {
	   
		String msg=aep.verifyMessage();
		String act_msg="Class has been added successfully";
		Assert.assertEquals(msg,act_msg);
	}

	@Given("clicks on edit  icon on Manage Classes page")
	public void clicks_on_edit_icon_on_manage_classes_page() {
	   
	 mav.clickManageClass();
	 mav.selectClassBatch();
	 mav.clickEditButton();
	}

	@When("Admin Selects Edit tab")
	public void admin_selects_edit_tab() {
	   
		aep.clickEdit();
	}

	@When("Admin updates class details like Class Topic, Class Date, Staff Name, Class Description, Comments for the selected batch")
	public void admin_updates_class_details_like_class_topic_class_date_staff_name_class_description_comments_for_the_selected_batch() {
		
		aep.setTopic();
		aep.setDate();
		aep.selectStaffName();
		aep.setclassDesc();
		aep.setComments();
		aep.clickSubmit();
	}

	@Then("The updated class is displayed in Manage classes page")
	public void the_updated_class_is_displayed_in_manage_classes_page() {
	    
		String msg_edit=aep.verifyMessage();
		String act_msg_edit="Class has been updated successfully";
		Assert.assertEquals(msg_edit,act_msg_edit);
	}

	@When("Admin clicks on the delete icon of a particular class")
	public void admin_clicks_on_the_delete_icon_of_a_particular_class() {
	   
		 mav.clickManageClass();
		 mav.selectClassBatch();
		 mav.clickDelete();
	}

	@Then("Deleted Class details will be removed from Manage Classes Page")
	public void deleted_class_details_will_be_removed_from_manage_classes_page() {
	   
		String msg_delete=aep.verifyMessage();
		String act_msg_delete="Class has been deleted successfully";
		Assert.assertEquals(msg_delete,act_msg_delete);
		
	}




}
