Feature: Calculator
    Scenario: Sum two numbers
    Given I have two numbers: 2 and 4
    When the calculator sums them
    Then I receive 6 as a result
