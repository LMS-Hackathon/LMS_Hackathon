package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ManageAssignments_AddEditPage {
	
	WebDriver ldriver;


	public ManageAssignments_AddEditPage (WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id= "btnaddAssignment")
	WebElement btnaddAssignment;
	
	@FindBy(id="btneditAssignment")
	WebElement btneditAssignment;
	
	@FindBy(id="selAssignmentBatch")
	WebElement drpAssignmentBatch;
	
	@FindBy(id="txtAssignmentName")
	WebElement txtAssignmentName;
	
	@FindBy(id="txtAssignmentDesc")
	WebElement txtAssignmentDesc;
	
	@FindBy(id="txtAssignmentDate")
	WebElement txtAssignmentDate;
	
	@FindBy(id="linkAssignmentFile1")
	WebElement btnUpload1;
	
	@FindBy(id="linkAssignmentFile2")
	WebElement btnUpload2;
	
	@FindBy(id="linkAssignmentFile3")
	WebElement btnUpload3;
	
	@FindBy(id="linkAssignmentFile4")
	WebElement btnUpload4;
	
	@FindBy(id="linkAssignmentFile5")
	WebElement btnUpload5;
	
	@FindBy(id="btnAddAssignSubmit")
	WebElement btnAssignSubmit;
	
	
	@FindBy(id="btnAddAssignSubmit")
	WebElement btnAssignmentSubmit;
	
	@FindBy(id="txtmessage")
	WebElement textMessage;
	
	@FindBy(id="txtAssignmentBatch")
	WebElement txtAssignmentBatch;
	
	@FindBy(id="btnManageGrades")
	WebElement btnManageGrades;
	
	@FindBy(id="btnEditAssignment")
	WebElement btnEditAssignment;
	
	@FindBy(id="btnDelAssignment")
    WebElement btnDelAssignment;
	
	
	public void clickbtnaddAssignment()
	{
		btnaddAssignment.click();
	}
	
	public void clickbtneditAssignment()
	{
		btneditAssignment.click();
	}
	public void clickDropdown()
	{
		Select dropdown=new Select(drpAssignmentBatch);
		
		dropdown.selectByVisibleText("SDET 01");
	}
	
	public void setAssignmentName()
	{
		txtAssignmentName.sendKeys("Assignment Name");
	}
	
	public void setAssignmentDescription()
	{
		txtAssignmentDesc.sendKeys("Assignment Description");
	}
	
	public void setDate()
	{
		txtAssignmentDate.sendKeys("Date");
	}
	
	public void clicklinkUpload1()
	{
		 btnUpload1.sendKeys("C:\\Users\\Downloads\\Samplefile1.docx");
	}
	
	public void clicklinkUpload2()
	{
		 btnUpload1.sendKeys("C:\\Users\\Downloads\\Samplefile2.docx");
	}
	
	public void clicklinkUpload3()
	{
		 btnUpload1.sendKeys("C:\\Users\\Downloads\\Samplefile3.docx");
	}
	
	public void clicklinkUpload4()
	{
		 btnUpload1.sendKeys("C:\\Users\\Downloads\\Samplefile4.docx");
	}
	
	public void clicklinkUpload5()
	{
		 btnUpload1.sendKeys("C:\\Users\\Downloads\\Samplefile5.docx");
	}
	
	public void clickSubmit()
	{
		btnAssignmentSubmit.click();
	}
	
	public String getText()
	{
		String message=textMessage.getText();
		return message;
	}
	
	public void setBatchName()
	{
		txtAssignmentBatch.sendKeys("Batch Name");
	}
	public void clickDelete()
	{
		btnDelAssignment.click();
	}
}
