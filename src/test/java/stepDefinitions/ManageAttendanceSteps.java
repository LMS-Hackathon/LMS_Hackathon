package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import pageObjects.AnsSecurityQuestPage;
import pageObjects.LaunchApplicationPage;
import pageObjects.LoginPage;
import pageObjects.ManageAssignments_AddEditPage;
import pageObjects.ManageAttendancePage;

public class ManageAttendanceSteps  extends BaseClass{
	
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
	
	
	@Given("Admin is on Manage Attendance\\(Admin and Class Staff) page")
	public void admin_is_on_manage_attendance_admin_and_class_staff_page() {
	   
		
		ap=new  LaunchApplicationPage(driver);
		lp=new LoginPage(driver);
		sp=new AnsSecurityQuestPage(driver);
		driver.get(readconfig.getApplicationURL());
		driver.manage().window().maximize();
		ap.clickLogin();

		lp.setUsername(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		mat.clickManageAttendance();
	}

	@When("Admin Selects Batch,Class and Class Date")
	public void admin_selects_batch_class_and_class_date() {
	    
		mat.selectAttendanceBatch();
		mat.selectAttendanceClass();
		mat.selectClassDate();
	}

	@Then("Student attendance can be viewed succesfully based on the selected criteria")
	public void student_attendance_can_be_viewed_succesfully_based_on_the_selected_criteria() {
	   
		mat.verifyAttendanceDisplay();
	}

	@When("Admin clicks on save button after selecting batch and class and marks the student as either {string}.")
	public void admin_clicks_on_save_button_after_selecting_batch_and_class_and_marks_the_student_as_either(String string) {
	   
		mat.selectAttendanceBatch();
		mat.selectAttendanceClass();
		mat.selectClassDate();
		mat.setRadioButtonPresent();
		mat.clickbtnSaveAttendance();
	}

	@Then("Student attendance details will be saved  succeesfully .")
	public void student_attendance_details_will_be_saved_succeesfully() {
		
	    String Message=mat.getMessage();
	    String org_Message="Student attendance details will be saved  succeesfully ";
	    Assert.assertEquals(Message, org_Message);
	}

	@When("Admin clicks on reset button after selecting batch , class and class date")
	public void admin_clicks_on_reset_button_after_selecting_batch_class_and_class_date() {
	    
		mat.selectAttendanceBatch();
		mat.selectAttendanceClass();
		mat.selectClassDate();
		
		mat.clickReset();
	}

	@Then("Default radio button {string} will be selected for all the displayed students.")
	public void default_radio_button_will_be_selected_for_all_the_displayed_students(String string) {
		
	    mat.verifyReset();
	}
	
	@Given("Admin is on  Manage Attendance\\(Admin and Class Staff) page ogf Manage Attendance\\(admin)")
	public void admin_is_on_manage_attendance_admin_and_class_staff_page_ogf_manage_attendance_admin() {
	   
		mat.clickManageAttendance();
	}

	@When("When result is containing many  Student records")
	public void when_result_is_containing_many_student_records() {
		
	   mat.verifyPaginationButton();
	}

	@Then("Large number of Student records will be divided into smaller discrete pages")
	public void large_number_of_student_records_will_be_divided_into_smaller_discrete_pages() {
	   
		mat.clickPagination();
	}


}
