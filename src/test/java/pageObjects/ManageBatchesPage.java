package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ManageBatchesPage {

	WebDriver ldriver;

	public ManageBatchesPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(id="btnBatches")
	WebElement btnBatches;
	
	@FindBy(id="selBatchProgram")
	WebElement drpselBatchProgram;
	
	@FindBy(id="btnEditBatch")
	WebElement btnEditBatch;
	
	@FindBy(id="btnDelBatch")
	WebElement btnDelBatch;
	
	@FindBy(id="btnAddBatch")
	WebElement btnAddBatch;
	
	public void clickBatches()
	{
		 btnBatches.click();
	}
	
	public void selectBatchProgram()
	{
		Select dropdownBatchProgram=new Select(drpselBatchProgram);
		dropdownBatchProgram.selectByVisibleText("SDET");
	}
	
	public void clickEditButton()
	{
		btnEditBatch.click();
	}
	
	public void clickDeleteButton()
	{
		 btnDelBatch.click();
	}
	
	public void clickAddBatch()
	{
		btnAddBatch.click();
	}
	
	public void verifyFieldsDisplay()
	{
		Assert.assertTrue(drpselBatchProgram.isDisplayed());
		Assert.assertTrue(btnEditBatch.isDisplayed());
		Assert.assertTrue(btnDelBatch.isDisplayed());
		
	}
}
