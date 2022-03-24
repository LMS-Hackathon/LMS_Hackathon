package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ManageUser_Edit_Page {

	WebDriver ldriver;

	public ManageUser_Edit_Page (WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id="txtUserLoginName")
	WebElement txtEmail;

	@FindBy(id="txtUserFirstName")
	WebElement txtFirstName;

	@FindBy(id="txtUserLastName")
	WebElement txtLastName;

	@FindBy(id="txtUserPhoneNumber")
	WebElement txtPhoneNumber;

	@FindBy(id="txtUserLocation")
	WebElement txtLocation;

	@FindBy(id="selUserTimeZone")
	WebElement drpselUserTimeZone;

	@FindBy(id="txtUserLinkedInUrl")
	WebElement txtUserLinkedInUrl;

	@FindBy(id="txtUserEduUG")
	WebElement txtUserEduUG;

	@FindBy(id="txtUserEduPG")
	WebElement txtUserEduPG;

	@FindBy(id="txtUsersSkill")
	WebElement txtUsersSkill;

	@FindBy(id="txtUserMonthsofExperience")
	WebElement txtUserMonthsofExperience;

	@FindBy(id="txtUserComments")
	WebElement txtUserComments;

	@FindBy(id="selUserRoleName")
	WebElement drpselUserRoleName;

	@FindBy(id="selBatchName")
	WebElement drpselBatchName;

	@FindBy(id="selProgramName")
	WebElement drpselProgramName;

	@FindBy(id="btnSave")
	WebElement btnSave;

	@FindBy(id="txtMessage")
	WebElement txtMessage;

	public void setEmail()
	{
		txtEmail.sendKeys("abc@gmail.com");
	}
	public void setFirstName()
	{
		txtFirstName.sendKeys("First name");
	}

	public void setLastName()
	{
		txtLastName.sendKeys("LastName");
	}

	public void  setPhoneNumber()
	{
		txtPhoneNumber.sendKeys("Phone Number");
	}

	public void setLocation()
	{
		txtLocation.sendKeys("Location");
	}

	public void selectTimeZone()
	{
		Select dropdownselUserTimeZone=new Select(drpselUserTimeZone);
		dropdownselUserTimeZone.selectByVisibleText("EST");
	}
	public void setLinkednURL()
	{
		txtUserLinkedInUrl.sendKeys("LinkednUrl");
	}

	public void  setUGEducation()
	{
		txtUserEduUG.sendKeys("UG education");
	}

	public void setPGEducation()
	{
		txtUserEduPG.sendKeys("PG Education");
	}

	public void setUserSkill()
	{
		txtUsersSkill.sendKeys("User Skill");
	}

	public void setExperience()
	{
		txtUserMonthsofExperience.sendKeys("Months of Experience");
	}

	public void txtUserComments()
	{
		txtUserComments.sendKeys("User  Comments");
	}

	public void setUserroleName()
	{
		Select dropdownselUserRoleName=new Select(drpselUserRoleName);
		dropdownselUserRoleName.selectByVisibleText("User Role name");
	}

	public void selectBatchName()
	{
		Select dropdownselBatchName= new Select(drpselBatchName);
		dropdownselBatchName.selectByVisibleText("BatchName");
	}

	public void selectProgramName()
	{
		Select dropdownselProgramName=new Select(drpselProgramName);
		dropdownselProgramName.deselectByVisibleText("Program Name");
	}
	
	public String getMessage()
	{
		return txtMessage.getText();
	}
	
	public void clickSave()
	{
		btnSave.click();
	}
}

