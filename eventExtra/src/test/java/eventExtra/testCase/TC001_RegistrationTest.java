package eventExtra.testCase;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import eventExtra.pageObjects.RegistrationPageObject;

public class TC001_RegistrationTest extends BaseClass {
	
	@Test
	public void loginTest()
	{
		driver.get(baseUrl);
		logger.info("URL Opened");
		RegistrationPageObject rp = new RegistrationPageObject(driver);
		rp.enterEmailId(email);
		logger.info("Email is entered");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		rp.clickContinue();
		logger.info("Continue with Email button is clicked");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		rp.enterFirstName(fname);
		logger.info("First Name is entered");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		rp.enterLastLame(lname);
		logger.info("Last Name is entered");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		rp.enterPassword(password);
		logger.info("Password is entered");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		rp.clickSignUp();
		logger.info("Signup button is clicked");
		
		
		if(driver.getTitle().equals("Sign In - EventXtra"))
		{
			System.out.println("Actaul Title is: "+driver.getTitle());
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertFalse(false);
		}
	}

}
