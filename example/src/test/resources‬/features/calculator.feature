@tag
Feature: Calculator

  Scenario: add two numbers
    Given Two input values, 1 and 2
    When I add the two values
    Then I expect the result 3

  Scenario Outline: add two numbers
    Given Two input values, <first> and <second>
    When I add the two values
    Then I expect the result <result>

    Examples:
      | first | second | result |
      | 1     | 12     | 13     |
      | -1    | 6      |5       |
      |2      |2       |4       |

  Scenario: press Button
    Given One input value 4, and opt "rvs"
    When I press button
    Then I expect the output 0.25

  Scenario Outline: press Button
    Given One input value <Input>, and opt "<opt>"
    When I press button
    Then I expect the output <result>

    Examples:
      | Input | opt | result |
      |4      |rvs|0.25    |
      |4      |sqrt|2      |