package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ManagesubmissionsPage {
	
	WebDriver ldriver;

	public ManagesubmissionsPage (WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	
	@FindBy(id="selGradeBatch")
	WebElement drpselGradeBatch;
	
	@FindBy(id="selAssignmentName")
	WebElement drpselAssignmentName;
	
	@FindBy(id="txtAssignmentDate")
	WebElement txtAssignmentDate;
	
	@FindBy(id="txtSubComments")
	WebElement txtSubComments;
	
	@FindBy(id="btnSubmissionFile1")
	WebElement btnSubmissionFile1;
	
	@FindBy(id="btnSubmissionFile2")
	WebElement btnSubmissionFile2;
	
	@FindBy(id="btnSubmissionFile3")
	WebElement btnSubmissionFile3;
	
	@FindBy(id="btnSubmissionFile4")
	WebElement btnSubmissionFile4;
	
	@FindBy(id="btnSubmissionFile5")
	WebElement btnSubmissionFile5;
	
	@FindBy(id="btnManage")
	WebElement btnManage;
	
	@FindBy(id="selGradedBy")
	WebElement drpselGradedBy;
	
	@FindBy(id="selGrade")
	WebElement drpselGrade;
	
	@FindBy(id="chkGradesVisible")
	WebElement chkGradesVisible;
	
	@FindBy(id="btnGradesSubmit")
	WebElement btnGradesSubmit;
	
	public void clickButtonManage()
	{
		btnManage.click();
	}
	
	public void selectGradeBatch()
	{
		Select dropdownGradeBatch=new Select(drpselGradeBatch);
		dropdownGradeBatch.selectByVisibleText("SDET 01");
	}
	
	public void selectAssignmentName()
	{
		Select dropdownAssignmentName=new Select(drpselAssignmentName);
		dropdownAssignmentName.selectByVisibleText("Selenium_1");
	}
	
	public void setAssignmentDate()
	{
		txtAssignmentDate.sendKeys("Assignment Date");
	}
	public void setSubComments()
	{
		txtSubComments.sendKeys("Comments");
	}
	
	public void clickButton1()
	{
		btnSubmissionFile1.click();
	}
	
	public void clickButton2()
	{
		btnSubmissionFile2.click();
	}
	
	public void clickButton3()
	{
		btnSubmissionFile3.click();
	}
	
	public void clickButton4()
	{
		btnSubmissionFile4.click();
	}
	
	public void clickButton5()
	{
		btnSubmissionFile5.click();
	}
	
	public void selectGradedBy()
	
	{
		Select dropdownselectGradedBy=new Select(drpselGrade);
		dropdownselectGradedBy.selectByVisibleText("Staff");
	}
	
	public void selectGrade()
	{
		Select dropdownselectGrade=new Select(drpselGrade);
		dropdownselectGrade.selectByVisibleText("A");
	}
	
	public void clickCheckBox()
	{
		chkGradesVisible.click();
	}
	
	public void clickSubmit()
	{
		btnGradesSubmit.click();
	}
	
	public void verifyGradeVisible()
	{
		Assert.assertTrue(chkGradesVisible.isDisplayed());
	}
	
	public void verifyGradeInVisible()
	{
		Assert.assertFalse(chkGradesVisible.isDisplayed());
	}
}


