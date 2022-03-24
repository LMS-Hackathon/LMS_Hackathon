package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageProgramsPage {
	
	WebDriver ldriver;

	public ManageProgramsPage (WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="btnPrograms")
	WebElement btnPrograms;
	
	@FindBy(id="btnEditProgram")
	WebElement btnEditProgram;
	
	@FindBy(id="btnDelProgram")
	WebElement btnDelProgram;
	
	@FindBy(id="btnAddProgram")
	WebElement btnAddProgram;
	
	
	public void clickPrograms()
	{
		 btnPrograms.click();
	}
	
	public void clickEdit()
	{
		btnEditProgram.click();
	}
	
	public void clickDelete()
	{
		btnDelProgram.click();
	}
	
	public void clickAddProgram()
	{
		btnAddProgram.click();
	}

}
