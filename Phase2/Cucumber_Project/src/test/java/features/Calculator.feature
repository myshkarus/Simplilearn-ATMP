Feature: This feature would be creating a calculator for Add and Subrract

  @sanity @WIP
  Scenario: To Add two numbers
    Given I have a calculator
    When I add 4 and 5
    Then I should get the result as 9

  @sanity
  Scenario Outline: To Add multiple numbers
    Given I have a calculator
    When I add <int1> and <int2>
    Then I should get the result as <result>

    Examples: 
      | int1 | int2 |
      |    1 |    8 |
      |    7 |    2 |
      |    3 |    6 |

  @sanity
  Scenario Outline: To Add two numbers
    Given I have a calculator
    When I add below numbers
      | 3 |
      | 2 |
      | 5 |
      | 4 |
      | 3 |
    Then I should get the result as 17
