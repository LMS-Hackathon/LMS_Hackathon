package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LaunchApplicationPage {

	WebDriver ldriver;
	
	public LaunchApplicationPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="btnLogin")
	WebElement btnLogin;
	
	public void clickLogin()
	{
		btnLogin.click();
	}
}
