package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageUser_View_Page {
	

	WebDriver ldriver;

	public ManageUser_View_Page (WebDriver rdriver)
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

	
	public void verifyFieldsDisplay()
	{
		Assert.assertTrue(txtEmail.isDisplayed());
		Assert.assertTrue(txtFirstName.isDisplayed());
		Assert.assertTrue(txtLastName.isDisplayed());
		Assert.assertTrue(txtPhoneNumber.isDisplayed());
		Assert.assertTrue(txtLocation.isDisplayed());
		Assert.assertTrue(drpselUserTimeZone.isDisplayed());
		Assert.assertTrue(txtUserLinkedInUrl.isDisplayed());
		Assert.assertTrue(txtUserEduPG.isDisplayed());
		Assert.assertTrue(txtUserEduUG.isDisplayed());
		Assert.assertTrue(txtUsersSkill.isDisplayed());
		Assert.assertTrue(txtUserMonthsofExperience.isDisplayed());
		Assert.assertTrue(txtUserComments.isDisplayed());
		Assert.assertTrue(drpselUserRoleName.isDisplayed());
		Assert.assertTrue(drpselBatchName.isDisplayed());
		Assert.assertTrue(drpselProgramName.isDisplayed());
	
	}
}
