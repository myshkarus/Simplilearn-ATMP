
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

	WebDriver driver;

	// ************************* Page objects *************************
	@FindBy(linkText = "Log in")
	WebElement LoginLink;
	
	@FindBy(name = "user_login")
	WebElement UserName;
	
	@FindBy(id = "password")
	WebElement Password;
	
	@FindBy(className = "rememberMe")
	WebElement RememberMe;
	
	@FindBy(name = "btn_login")
	WebElement LoginButton;

	public LoginPage(WebDriver basedriver) {

		this.driver = basedriver;
		PageFactory.initElements(basedriver, this);

	}

	// ************************* Page methods *************************
	public void Login(String UserNameVal, String PassVal) {

		// Step1. Click on the Login Link
		LoginLink.click();

		// Step2: Enter Username
		UserName.sendKeys(UserNameVal);

		// Step3: Enter Password
		Password.sendKeys(PassVal);

		// Step4: Click Remember Me checkbox
		RememberMe.click();

		// Step5: Click Login Button
		LoginButton.click();

	}
}
