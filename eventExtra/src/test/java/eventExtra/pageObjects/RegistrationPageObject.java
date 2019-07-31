package eventExtra.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPageObject {
	
WebDriver ldriver;
	
	public RegistrationPageObject(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//input[contains(@placeholder,'Email')]")
	WebElement txtEmailId;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[3]/button[1]")
	WebElement btnContinue;
	
	@FindBy(xpath="//input[@name='user[first_name]']")
	WebElement txtFirstName;
	
	@FindBy(xpath="//input[@name='user[last_name]']")
	WebElement txtLastName;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//button[@class='xtra-button sc-gPEVay kzQjNa sc-bdVaJa gLKjOu btn btn-primary btn-block']")
	WebElement btnSignUp;
	
	@FindBy(id="xtra-phone-field")
	WebElement txtPhone;
	
	@FindBy(xpath="//input[@placeholder='e.g. ABC Limited']")
	WebElement txtCompany;
	
	
	public void enterEmailId(String email)
	{
		txtEmailId.sendKeys(email);
	}
	
	public void clickContinue()
	{
		btnContinue.click();
	}
	
	public void enterFirstName(String fname)
	{
		txtFirstName.sendKeys(fname);
	}
	
	public void enterLastLame(String lname)
	{
		txtLastName.sendKeys(lname);
	}
	
	public void enterPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	
	public void clickSignUp()
	{
		btnSignUp.click();
	}

}
