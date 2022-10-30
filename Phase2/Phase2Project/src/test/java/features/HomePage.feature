Feature: Add product to shopping cart

  Background: 
    Given User has launched the application
    When User enters the correct username "standard_user" and password "secret_sauce"
    And User clicks on the Login button

  @sanity @regression
  Scenario: Add one item of the given product to the cart
    Given User landed to product catalog page "https://www.saucedemo.com/inventory.html"
    When User add to cart the product as "Sauce Labs Bike Light" by clicking on ADD TO CART button
    Then The basket item count should be 1
