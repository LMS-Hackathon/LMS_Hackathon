package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageUnRegisteredUsersPage {

	WebDriver ldriver;

	public  ManageUnRegisteredUsersPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id="btnEditUsers")
	WebElement btnEditUsers;

	@FindBy(id="btnDelUsers")
	WebElement btnDeleteUsers;
	
	@FindBy(id="txtMsg")
	WebElement txtMsg;
	
	@FindBy(id="btnPagination")
	WebElement btnPagination;

	public void clickEdit()
	{
		btnEditUsers.click();
	}
	public void clickDelete()
	{
		btnDeleteUsers.click();
	}
	
	public String getTitle()
	{
		return ldriver.getTitle();
	}
	
	public void verifyDisplayButtons()
	{
		Assert.assertTrue(btnEditUsers.isDisplayed());
		Assert.assertTrue(btnDeleteUsers.isDisplayed());
		
	}
	
	public String getMessage()
	{
		return txtMsg.getText();
	}
	
	public void verifyButtonPagination()
	{
		Assert.assertTrue( btnPagination.isDisplayed());
	}
	public void verifyPaginationEnabled()
	{
		Assert.assertTrue( btnPagination.isEnabled());
	}
}

