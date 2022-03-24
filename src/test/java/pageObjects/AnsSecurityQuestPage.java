package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AnsSecurityQuestPage {

	WebDriver ldriver;


	public AnsSecurityQuestPage (WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id="txtUserSecurityQ")
	WebElement  txtUserSecurityQuest;

	@FindBy(id="txtUserEmailAddress")
	WebElement txtEmail;

	@FindBy(id="btnForgotPassSubmit")
	WebElement btnforgotpwdSubmit;

	public void setsecurityAnswer()
	{
		txtUserSecurityQuest.clear();
		txtUserSecurityQuest.sendKeys("security question answer");
	}
	public void setEmail(String email)
	{
		txtEmail.clear();
		txtEmail.sendKeys(email );
		
	}
	
	public void clickSubmitForgotPwd()
	{
		btnforgotpwdSubmit.click();
	}
	
	public void verifyEmail()
	{
		String valid_email="valid email";
		String act_email="email address";
		if ((act_email).equals(valid_email))
		{
			System.out.println("Password Reset Link has been sent to Email Address");
		}
		else
		{
			System.out.println("Provided Email Id is not registered");
		}
	}
}
