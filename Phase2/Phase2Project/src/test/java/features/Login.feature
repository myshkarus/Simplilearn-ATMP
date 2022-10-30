Feature: Login to www.saucedemo.com

  Background: 
    Given User has launched the application

  @sanity @regression
  Scenario: Successful login to the application
    When User enters the correct username "standard_user" and password "secret_sauce"
    And User clicks on the Login button
    Then User should land on the home page "https://www.saucedemo.com/inventory.html"

  @sanity @regression
  Scenario Outline: Failure login to the application
    When User enters invalid username as "<username>" and password as "<password>"
    And User clicks on the Login button
    Then User should get the error message "<warning>"

    Examples: 
      | username                | password       | warning                                                                   |
      | problem_user            | wrong_password | Epic sadface: Username and password do not match any user in this service |
      | locked_out_user         | secret_sauce   | Epic sadface: Sorry, this user has been locked out.                       |
      | performance_glitch_user | wrong_password | Epic sadface: Username and password do not match any user in this service |
