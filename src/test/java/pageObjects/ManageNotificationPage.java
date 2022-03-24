package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ManageNotificationPage {


	WebDriver ldriver;

	public ManageNotificationPage (WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="selNotificationPgmName")
	WebElement drpNotificationPgmName;
	
	@FindBy(id="txtHackathonName")
	WebElement txtHackathonName;
	
	@FindBy(id="txtHackathonDesc")
	WebElement txtHackathonDesc;
	
	@FindBy(id="txtHackathonDate")
	WebElement txtHackathonDate;
	
	@FindBy(id="txtHackathonComments")
	WebElement txtHackathonComments;
	
	@FindBy(id="btnSaveNotification")
	WebElement btnSaveNotification;
	
	@FindBy(id="lnkManageNotification")
	WebElement linkManageNotification;
	
	@FindBy(id="txtmessage")
	WebElement txtmessage;
	
	public void selectProgramName()
	{
		Select dropdown=new Select(drpNotificationPgmName);
		dropdown.deselectByVisibleText("Program Name");
	}
	
	public void setHackathonNmae()
	{
		txtHackathonName.sendKeys("Hackathon Name");
	}
	
	public void setHackathonDesc()
	{
		txtHackathonDesc.sendKeys("Hackathon Description");
	}
	
	public void setHackathonDate()
	{
		txtHackathonDate.sendKeys("Hackathon Date");
	}
	
	public void setHackathonComments() {
		
		txtHackathonComments.sendKeys("Comments");
	}
	 public void clickSubmit()
	 {
		 btnSaveNotification.click();
	 }
	 
	 public void clickManageNotification()
	 {
		 linkManageNotification.click();
	 }
	 
	 public String getTextMessage()
	 {
		 return	 txtmessage.getText();
		
	 }
}

