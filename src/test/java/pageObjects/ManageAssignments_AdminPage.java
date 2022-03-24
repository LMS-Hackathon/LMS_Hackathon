package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageAssignments_AdminPage {

	WebDriver ldriver;


	public ManageAssignments_AdminPage (WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="lnkManageAssignments")
	WebElement lnkmanageAssignment;

	@FindBy(id="txtAssignmentBatch")
	WebElement txtAssignmentBatch;

	@FindBy(id="btnManageGrades")
	WebElement btnManageGrades;

	@FindBy(id="btnEditAssignment")
	WebElement btnEditAssignment;

	@FindBy(id="btnDelAssignment")
	WebElement btnDelAssignment;

	@FindBy(id="btnAddAssignment")
	WebElement btnAddAssignment;
	

	public void clickManageAssignments()
	{
		lnkmanageAssignment.click();
	}
	
	public void setAssignmentBatch()
	{
		txtAssignmentBatch.sendKeys("SDET 01");
	}

	public void clickManageGrades()
	{
		btnManageGrades.click();	
	}
	public void clickEditAssignment()
	{
		btnEditAssignment.click();	
	}

	public void clickDeleteAssignment()
	{
		btnDelAssignment.click();	
	}

	public void clickAddAssignment()
	{
		btnAddAssignment.click();	
	}
}
