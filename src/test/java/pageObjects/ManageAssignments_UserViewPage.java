package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageAssignments_UserViewPage {
	
	WebDriver ldriver;


	public ManageAssignments_UserViewPage (WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="txtAssignmentName")
	WebElement txtAssignmentName;
	
	@FindBy(id="txtAssignmentDesc")
	WebElement txtAssignmentDesc;
	
	@FindBy(id="txtAssignmentDate")
	WebElement txtAssignmentDate;
	
	@FindBy(id="linkAssignmentFile1")
	WebElement btndownload1;
	
	@FindBy(id="linkAssignmentFile2")
	WebElement btndownload2;
	
	@FindBy(id="linkAssignmentFile3")
	WebElement btndownload3;
	
	@FindBy(id="linkAssignmentFile4")
	WebElement btndownload4;
	
	@FindBy(id="linkAssignmentFile5")
	WebElement btndownload5;
	
	@FindBy(id="txtMsg")
	WebElement txtMessage;

	
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
	
	public void clicklinkDownload1()
	{
		 btndownload1.sendKeys("C:\\Users\\Downloads\\Samplefile1.docx");
	}
	
	public void clicklinkDownload2()
	{
		 btndownload2.sendKeys("C:\\Users\\Downloads\\Samplefile2.docx");
	}
	
	public void clicklinkDownload3()
	{
		 btndownload3.sendKeys("C:\\Users\\Downloads\\Samplefile3.docx");
	}
	
	public void clicklinkDownload4()
	{
		 btndownload4.sendKeys("C:\\Users\\Downloads\\Samplefile4.docx");
	}
	
	public void clicklinkDownload5()
	{
		 btndownload5.sendKeys("C:\\Users\\Downloads\\Samplefile5.docx");
	}
	public String getMessage()
	{
		return txtMessage.getText();
	}
}
