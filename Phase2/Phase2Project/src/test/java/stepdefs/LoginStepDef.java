
package stepdefs;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {

	WebDriver driver = Hooks.driver;

	@Given("User has launched the application")
	public void user_have_launched_the_application() {

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

	}

	@When("User enters the correct username {string} and password {string}")
	public void user_enter_the_correct_username_and_password(String userName, String password) {

		enterCredentials(userName, password);

	}

	@When("User clicks on the Login button")
	public void user_click_on_the_Login_button() {

		WebElement LoginButton = driver.findElement(By.id("login-button"));
		LoginButton.click();

	}

	@Then("User should land on the home page {string}")
	public void user_should_land_on_the_home_page(String expectedUrl) {

		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, actualUrl);

	}

	@When("User enters invalid username as {string} and password as {string}")
	public void user_enter_invalid_username_as_and_password_as(String userName, String password) {

		enterCredentials(userName, password);

	}

	@Then("User should get the error message {string}")
	public void user_should_get_the_error_message(String expErr) {

		WebElement Error = driver.findElement(By.tagName("h3"));
		String actualErr = Error.getText();
		Assert.assertEquals(expErr, actualErr);

	}

	private void enterCredentials(String userName, String password) {

		WebElement UserName = driver.findElement(By.id("user-name"));
		UserName.sendKeys(userName);

		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(password);
	}
}
