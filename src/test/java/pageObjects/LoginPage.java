package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;


	public LoginPage (WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id="txtUserLoginName")
	WebElement txtloginName;

	@FindBy(id="txtUserPassword")
	WebElement txtPassword;

	@FindBy(id="btnLoginSubmit")
	WebElement btnSubmit;
	
	@FindBy(id="btnForgotPassword")
	WebElement btnForgotPassword;


	public void setUsername(String eusername)
	{
		txtloginName.clear();
		txtloginName.sendKeys(eusername);

	}

	public void setPassword(String epassword)
	{
		txtPassword.clear();
		txtPassword.sendKeys(epassword);
	}

	public void clickSubmit()
	{
		btnSubmit.click();	
	}

	public void clickforgotPassword()
	{
		btnForgotPassword.click();
	}
}
