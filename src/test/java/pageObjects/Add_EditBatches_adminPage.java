package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_EditBatches_adminPage {

	WebDriver ldriver;


	public Add_EditBatches_adminPage (WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id="btnAdd")
	WebElement btnAdd;

	@FindBy(id="btnEdit")
	WebElement btnEdit;

	@FindBy(id="txtBatchName")
	WebElement txtBatchName;

	@FindBy(id="txtBatchDescription")
	WebElement txtBatchDescription;

	@FindBy(id="radBatchActiveStatus")
	WebElement radBatchActiveStatus;

	@FindBy(id="radBatchInActiveStatus")
	WebElement  radBatchInActiveStatus;

	@FindBy(id="txtBatchNoClasses")
	WebElement txtBatchNoClasses;

	@FindBy(id="btnSubmit")
	WebElement btnSubmit;
	
	@FindBy(id="txtMessage")
	WebElement txtMessage;

	public void clickAdd()
	{
		btnAdd.click();
	}

	public void clickEdit()
	{
		btnEdit.click();
	}

	public void setBatchName()
	{
		txtBatchName.sendKeys("Batch Name");
	}

	public void setBatchDesc()
	{
		txtBatchDescription.sendKeys("Batch Description");
	}

	public void clickRadActive()
	{
		radBatchActiveStatus.click();
	}
	public void clickRadInactive()
	{
		radBatchInActiveStatus.click();
	}

	public void setBatchNoClasses()
	{
		txtBatchNoClasses.sendKeys("Batch No of Classes");
	}
	public void clickSubmit()
	{
		btnSubmit.click();
	}
	
	public String getMessage()
	{
		return txtMessage.getText();
	}
}
