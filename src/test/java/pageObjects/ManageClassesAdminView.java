package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ManageClassesAdminView {
	
	WebDriver ldriver;

	public ManageClassesAdminView(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(id="lnkManageClass")
	WebElement lnkManageClass;
	
	@FindBy(id="selClassBatch")
	WebElement drpselClassBatch;
	
	@FindBy(id="txtClassno")
	WebElement txtClassno ;
	
	@FindBy(id="txtClassTopic")
	WebElement txtClassTopic;
	
	@FindBy(id="txtClassDate")
	WebElement txtClassDate ;
	
	@FindBy(id="selStaffName")
	WebElement selStaffName;
	
	@FindBy(id="txtClassDesc")
	WebElement txtClassDesc;
	
	@FindBy(id="txtClassComments")
	WebElement txtClassComments;
	
	@FindBy(id="btnclassRecording")
	WebElement btnclassRecording;
	
	@FindBy(id="btnClassNote")
	WebElement btnClassNote;
	
	@FindBy(id="btnEditlass")
	WebElement btnEditlass;
	
	@FindBy(id="btnDelClass")
	WebElement btnDelClass;
	
	@FindBy(id="btnAddClass")
	WebElement btnAddClass;		

	public void clickManageClass()
	{
		lnkManageClass.click();
	}
	
	public void selectClassBatch()
	{
		Select dropdownselClassBatch=new Select(drpselClassBatch); 
		dropdownselClassBatch.selectByVisibleText("SDET 02");
	}
	public void clickbtnAddClass()
	{
		btnAddClass.click();
	}
	public void clickEditButton()
	{
		btnEditlass.click();
	}
	
	public void clickDelete()
	{
		btnDelClass.click();
	}
	
	public void verifyDisplay()
	{
		Assert.assertTrue(txtClassno.isDisplayed());
		Assert.assertTrue(txtClassTopic.isDisplayed());
		Assert.assertTrue(txtClassDate.isDisplayed());
		Assert.assertTrue(selStaffName.isDisplayed());
		Assert.assertTrue(txtClassDesc.isDisplayed());
		Assert.assertTrue(txtClassComments.isDisplayed());
		Assert.assertTrue(btnclassRecording.isDisplayed());
		Assert.assertTrue(btnClassNote.isDisplayed());
		Assert.assertTrue(btnEditlass.isDisplayed());
		Assert.assertTrue(btnDelClass.isDisplayed());
		Assert.assertTrue(btnAddClass.isDisplayed());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
