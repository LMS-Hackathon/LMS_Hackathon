package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ManageAttendancePage {

	WebDriver ldriver;

	public ManageAttendancePage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}


	@FindBy(id="selAttendanceBatch")
	WebElement drpAttendanceBatch;

	@FindBy(id="selAttendanceClass")
	WebElement drpAttendanceClass;

	@FindBy(id="txtCassDate")
	WebElement txtClassDate;

	@FindBy(id="radPresent")
	WebElement radPresent;

	@FindBy(id="radAbsent")
	WebElement radAbsent;

	@FindBy(id="radLate")
	WebElement radLate;

	@FindBy(id="radExcused")
	WebElement radExcused;

	@FindBy(id="radUnknown")
	WebElement radUnknown;

	@FindBy(id="btnSaveAttendance")
	WebElement btnSaveAttendance;

	@FindBy(id="btnResetAttendance")
	WebElement btnResetAttendance;

	@FindBy(id="btnPagination")
	WebElement btnPagination;
	
	@FindBy(id="btnManageAttendance")
	WebElement btnManageAttendance;
	
	@FindBy(id="txtStudentName")
	WebElement studentName;
	
	@FindBy(id="txtMessage")
	WebElement txtMessage;

	public void selectAttendanceBatch()
	{
		Select dropdownAttendance= new Select(drpAttendanceBatch);
		dropdownAttendance.selectByVisibleText("SDET 02");

	}

	public void selectAttendanceClass()
	{
		Select dropdownAttendanceClass=new Select(drpAttendanceClass);
		dropdownAttendanceClass.selectByVisibleText("Selenium");
	}

	public void selectClassDate()
	{
		txtClassDate.sendKeys("Class Date");
	}

	public void setRadioButtonPresent()
	{
		radPresent.click();
	}

	public void setRadAbsent()
	{
		radAbsent.click();
	}
	public void setRadLate()
	{
		radLate.click();
	}

	public void setRadExcused()
	{
		radExcused.click();
	}

	public void setRadUnknown()
	{
		radUnknown.click();
	}

	public void clickbtnSaveAttendance()
	{
		btnSaveAttendance.click();
	}

	public void clickReset()
	{
		btnResetAttendance.click();
	}

	public void clickPagination()
	{
		btnPagination.click();
	}
	
	public void clickManageAttendance()
	{
		btnManageAttendance.click();
	}
	
	public void verifyAttendanceDisplay()
	{
		Assert.assertTrue(studentName.isDisplayed());
		Assert.assertTrue(radPresent.isEnabled());
		Assert.assertTrue(radAbsent.isEnabled());
	}
	
	public String getMessage()
	{
		return txtMessage.getText();
	}
	
	public void verifyReset()
	{
		Assert.assertTrue(btnResetAttendance.isSelected());
	}
	
	public void verifyPaginationButton()
	{
		Assert.assertTrue(btnPagination.isDisplayed()&&btnPagination.isEnabled());
	}
}
