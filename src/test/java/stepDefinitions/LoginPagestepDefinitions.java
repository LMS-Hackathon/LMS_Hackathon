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

public class LoginPagestepDefinitions extends BaseClass {

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


	@Given("Admin\\/User is on LMS Log-In Screen")
	public void admin_user_is_on_lms_log_in_screen() {

		ap=new  LaunchApplicationPage(driver);
		lp=new LoginPage(driver);
		sp=new AnsSecurityQuestPage(driver);
		driver.get(readconfig.getApplicationURL());
		driver.manage().window().maximize();
		ap.clickLogin();
	}



	@When("Admin\\/User enters Login Name as {string} and Password as {string}")
	public void admin_user_enters_login_name_as_and_password_as(String username, String password) {
		lp.setUsername(username);
		lp.setPassword(password);
	}
	@When("Admin\\/User click Submit button")
	public void admin_user_click_submit_button() {

		lp.clickSubmit();
	}

	@Then("Admin\\/user navigates to LMS Home Page")
	public void admin_user_navigates_to_lms_home_page() {

		String current_title=driver.getTitle();
		Assert.assertEquals("LMS Home Page Title", current_title);
	}

	@When("Admin\\/User enters Invalid Login Name and Password")
	public void admin_user_enters_invalid_login_name_and_password() {

	}

	@Then("Admin\\/user will not login successfully with invalid credentials error message")
	public void admin_user_will_not_login_successfully_with_invalid_credentials_error_message() {


	}



	@Given("Admin\\/User is on Answer Security Question page by by clicking on Forgot password link")
	public void admin_user_is_on_answer_security_question_page_by_by_clicking_on_forgot_password_link() {

		lp.clickforgotPassword();
		String Act_title=driver.getTitle();
		Assert.assertEquals("Ans Security Question Page title", Act_title);
	}


	@When("Admin\\/User enters Email Address as {string}")
	public void admin_user_enters_email_address_as(String email) {

		sp.setEmail(email);
		current_email=email;
	}

	@When("Admin\\/User enters the Answer for security Question")
	public void admin_user_enters_the_answer_for_security_question() {

		sp.setsecurityAnswer();
	}

	@When("Admin\\/User clicks on submit button")
	public void admin_user_clicks_on_submit_button() {

		sp.clickSubmitForgotPwd();
	}


	@Then("Valid Message   will be displayed")
	public void valid_message_will_be_displayed() {

		String Valid_Email="valid email address";

		Assert.assertEquals(current_email, Valid_Email);


	}



















}
