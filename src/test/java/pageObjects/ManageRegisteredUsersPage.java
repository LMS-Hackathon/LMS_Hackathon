package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageRegisteredUsersPage {
	
	WebDriver ldriver;

	public  ManageRegisteredUsersPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="btnViewRegUsers")
	WebElement btnViewRegUsers;
	
	@FindBy(id="btnEditRegUsers")
	WebElement btnEditRegUsers;
	
	@FindBy(id="btnDelRegUsers")
	WebElement btnDelRegUsers;
	
	@FindBy(id="txtMessage")
	WebElement txtMessage;
	
	public void clickViewButton()
	{
		btnViewRegUsers.click();
	}

	public void clickEditButton()
	{
		btnEditRegUsers.click();
	}
	
	public void clickDeleteButton()
	{
		btnDelRegUsers.click();
	}
	
	
}
