package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_EditPrograms_adminPage {

	WebDriver ldriver;


	public Add_EditPrograms_adminPage (WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id="btnAddProgram")
	WebElement btnAddProgram;
	
	@FindBy(id="btnEditProgram")
	WebElement btnEditProgram;
	
	
	@FindBy(id="txtProgramName")
	WebElement txtProgramName;


	@FindBy(id="txtProgramDescription")
	WebElement txtProgramDescription;

	@FindBy(id="radPrgmActiveStatus")
	WebElement radPrgmActiveStatus;


	@FindBy(id="radPrgmInActiveStatus")
	WebElement radPrgmInActiveStatus;

	@FindBy(id="btnProgramSubmit")
	WebElement btnProgramSubmit;
	
	@FindBy(id="txtMessage")
	WebElement txtMessage;
			
	
	public void clickAdd()
	{
		btnAddProgram.click();
	}
	
	public void clickEdit()
	{
		btnEditProgram.click();
	}

	public void setProgramName()
	{
		txtProgramName.sendKeys("Program Name");
	}

	public void setProgramDesc()
	{
		txtProgramDescription.sendKeys("Program Desc");
	}

	public void clickradActive()
	{
		radPrgmActiveStatus.click();
	}
	public void clickradINactive()
	{
		radPrgmInActiveStatus.click();
	}
	
	public void clickSubmit()
	{
		btnProgramSubmit.click();
	}
	
	public String getMessage()
	{
		return txtMessage.getText();
	}
}
