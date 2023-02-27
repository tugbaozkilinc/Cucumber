@amazon_test
Feature: Amazon Test

  Scenario: Selenium Search Test
    Given User goes to "https://www.amazon.com"
    When User searches for "Selenium"
    Then Assert the result contains "Selenium"
    And User close the application