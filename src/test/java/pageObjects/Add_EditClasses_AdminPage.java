package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Add_EditClasses_AdminPage {

	WebDriver ldriver;


	public Add_EditClasses_AdminPage (WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id="txtClassTopic")
	WebElement txtClassTopic;

	@FindBy(id="dateClassdate")
	WebElement dateClassdate;

	@FindBy(id="selClassStaffName")
	WebElement drpClassStaffName;

	@FindBy(id="txtClassDescription")
	WebElement txtClassDescription;

	@FindBy(id="txtClassComments")
	WebElement txtClassComments;

	@FindBy(id="btnEditClassSubmit")
	WebElement btnAddClassSubmit;

	@FindBy(id="btnaddClass")
	WebElement btnaddClass;

	@FindBy(id="btnEditClass")
	WebElement btnEditClass;
	
	@FindBy(id="txtmsg")
	WebElement txtmsg;

	public void clickAdd()
	{
		btnaddClass.click();
	}

	public void clickEdit()
	{
		btnEditClass.click();
	}

	public void setTopic()	
	{
		txtClassTopic.sendKeys("Class Topic name");
	}

	public void setDate()
	{
		dateClassdate.sendKeys("Date");
	}

	public void selectStaffName()
	{
		Select dropdownStaffName=new Select(drpClassStaffName);
		dropdownStaffName.selectByIndex(0);
	}

	public void setclassDesc()
	{
		txtClassDescription.sendKeys("Class Description");
	}
	public void setComments()
	{
		txtClassComments.sendKeys("Comments");
	}

	public void clickSubmit()
	{
		btnAddClassSubmit.click();
	}

	public String verifyMessage()
	{
		return txtmsg.getText();
	}
}
