Feature: This feature would be creating a calculator for Add and Subtraction

  Scenario: To Add two numbers
    Given I have a calculator
    When add 4 and 5
    Then I should get the result as 9

  @regression
  Scenario Outline: To Add two numbers
    Given I have a calculator
    When add <int1> and <int2>
    Then I should get the result as <result>

    Examples: 
      | int1 | int2 | result |
      |    6 |    7 |     13 |
      |    9 |    8 |     18 |
      |   56 |   61 |    100 |

  @regression
  Scenario: To Add multiple numbers
    Given I have a calculator
    When I add below Numbers
      | 6 |
      | 6 |
      | 6 |
      | 6 |
      | 6 |
    Then I should get the result as 38
