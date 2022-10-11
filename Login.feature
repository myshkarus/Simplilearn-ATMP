Feature: Login Feature Scenarios

Scenario: This scenario is to define the login happy path

Given I have launched the application
When I enter the correct username and password
Then I should land on the homepage


Scenario: This scenario is to define failure path

Given I have launched the application                               
When I enter the incorrect username and password         
Then I should get the error message "Incorrect User Name and Password"     

