package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ManageRecordingPage {

	WebDriver ldriver;

	public  ManageRecordingPage (WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="selBatchRecording")
	WebElement drpselBatchRecording;
	
	@FindBy(id="selRecordingTopic")
	WebElement drpselRecordingTopic;
	
	@FindBy(id="btnUploadRecording")
	WebElement btnUploadRecording;
	
	@FindBy(id="btnUploadRecResource")
	WebElement btnUploadRecResource;
	
	@FindBy(id="lnkManageRecording")
	WebElement lnkManageRecording;
	
	@FindBy(id="txtmessage")
	WebElement txtMessage;
	
	public void clickManageRecording()
	{
		lnkManageRecording.click();
	}
	
	public void SelectBatchRecording()
	{
		Select dropdownRecording=new Select(drpselBatchRecording);
		dropdownRecording.selectByVisibleText("SDET 02");
	}
	
	public void SelectRecordingTopic()
	{
		Select dropdwnRecordingTopic=new Select(drpselRecordingTopic);
		dropdwnRecordingTopic.selectByVisibleText("Selenium");
	}
	
	public void clickUploadRecording()
	{
		btnUploadRecording.sendKeys("C://Recording//selenium.mp4");
	}
	
	public void clickUploadResources()
	{
		 btnUploadRecResource.sendKeys("C://Resources//Selenium.doc");
	}
	
	public String getTextMessage()
	{
		return txtMessage.getText();
	}
}
