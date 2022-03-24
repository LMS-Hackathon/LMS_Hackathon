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
import pageObjects.LaunchApplicationPage;


public class LaunchApplicationStepDefinitions extends BaseClass{

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

  
	@Given("Admin\\/User is on LMS portal with Login button Link")
	public void admin_user_is_on_lms_portal_with_login_button_link() {

		
		ap=new  LaunchApplicationPage(driver);
		driver.get(readconfig.getApplicationURL());
		driver.manage().window().maximize();
	}

	@When("Admin\\/User clicks on Login button link")
	public void admin_user_clicks_on_login_button_link() {

		ap.clickLogin();

	}

	@Then("Admin\\/user navigates to Log-In Screen page")
	public void admin_user_navigates_to_log_in_screen_page() {

		String title=driver.getTitle();
		Assert.assertEquals("Actual Title", title);
	}


}
