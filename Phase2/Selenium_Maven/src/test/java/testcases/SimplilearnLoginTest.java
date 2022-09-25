
package testcases;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import pages.LoginPage;

@Listeners(ListenerExample.class)

public class SimplilearnLoginTest extends BaseClass {

	@Test
	public void Test1() {
		
		test.log(LogStatus.INFO, "Test1 Started");

		LoginPage lp = new LoginPage(driver);
		lp.Login("abc@xyz.com", "Abc@1234");
		
		//Step6: Validate the error message on screen
		WebElement Error = driver.findElement(By.id("msg_box"));
		
		String ActualError = Error.getText();
		String ExpectedError = "The email or password you have entered is invalid"; //Add error

		Assert.assertTrue(Error.isDisplayed());
		Assert.assertEquals(ActualError, ExpectedError);
	}

	@Test
	@Parameters({"uname", "pwd"})
	public void Test2(String UserName, String Password) {
		
		test.log(LogStatus.INFO, "Test2 Started");
		
		LoginPage lp = new LoginPage(driver);
		lp.Login(UserName, Password);
		
	}
	
	@Test
	public void Test3() {
		
		test.log(LogStatus.INFO, "Test3 Started");
		
		String UserName = sheet.getRow(1).getCell(0).getStringCellValue();
		String Password = sheet.getRow(1).getCell(1).getStringCellValue();
		LoginPage lp = new LoginPage(driver);
		lp.Login(UserName, Password);
		
	}
}

