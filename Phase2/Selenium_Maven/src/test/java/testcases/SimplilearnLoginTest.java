
package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import pages.LoginPage;

public class SimplilearnLoginTest extends BaseClass {

	@Test
	public void Test1() {

		LoginPage lp = new LoginPage(driver);
		lp.Login("abc@xyz.com", "Abc@1234");
		
		//Step6: Validate the error message on screen
		WebElement Error = driver.findElement(By.id("msg_box"));
		
		String ActualError = Error.getText();
		String ExpectedError = "The email or password you have entered is invalid.";

		Assert.assertTrue(Error.isDisplayed());
		Assert.assertEquals(ActualError, ExpectedError);
	}

	@Test
	public void Test2() {
		
		LoginPage lp = new LoginPage(driver);
		lp.Login("abc@xyz.com", "Abc@1234");
		
	}
}
