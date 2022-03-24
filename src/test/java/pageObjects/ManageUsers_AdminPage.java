package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ManageUsers_AdminPage {
	
	WebDriver ldriver;

	public  ManageUsers_AdminPage (WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id="txtUserEmail")
	WebElement txtUserEmail;
	
	@FindBy(id="selUserBatch")
	WebElement drpselUserBatch;
	
	@FindBy(id="selUserSkill")
	WebElement drpselUserSkill;
	
	@FindBy(id="selUserProgram")
	WebElement drpselUserProgram;
	
	@FindBy(id="linkUnassignedUsers")
	WebElement linkUnassignedUsers;
	
	@FindBy(id="btnSearch")
	WebElement btnSearch;
	
	@FindBy(id="lnkmanageUsers")
	WebElement lnkManageUsers;
	
	public void setEmail()
	{
		txtUserEmail.sendKeys("user email");
	}
	
	public void selectBatch()
	{
		Select dropdownBatch=new Select(drpselUserBatch);
		dropdownBatch.selectByVisibleText("04");
	}
	public void selectUserSkill()
	{
		Select dropdownUserSkill=new Select(drpselUserSkill);
		dropdownUserSkill.selectByVisibleText("Python");
	}
	
	public void selectUserProgram()
	{
		Select dropdownUserProgram=new Select(drpselUserProgram);
		dropdownUserProgram.selectByVisibleText("SDET");
	}
	
	public void clickSearch()
	{
		btnSearch.click();
	}
	
	public void clickManageUsers()
	{
		lnkManageUsers.click();
	}
	
	public void clickUnassignedUsers()
	{
		linkUnassignedUsers.click();
	}
}
