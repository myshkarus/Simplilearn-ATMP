
package stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDef {

	WebDriver driver = Hooks.driver;

	@Given("User landed to product catalog page {string}")
	public void user_landed_to_product_catalog_page(String expectedUrl) {
		
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, actualUrl);
		
	}

	@When("User add to cart the product as {string} by clicking on ADD TO CART button")
	public void user_add_to_cart_the_product_as_by_clicking_on_ADD_TO_CART_button(String productName) {

		String xpath = String.format("//div[contains(text(), '%s')]//following::button[1]", productName);
		WebElement addToCartButton = driver.findElement(By.xpath(xpath));
		addToCartButton.click();
		
	}

	@Then("The basket item count should be {int}")
	public void the_basket_item_count_should_be(int expectedCount) {

		WebElement basket = driver.findElement(By.xpath("//div[@id='shopping_cart_container']//span"));
		int actualCount = Integer.parseInt(basket.getText());
		Assert.assertEquals(actualCount, expectedCount);
		
	}

}
