@parameter_1
Feature: US_01 Amazon Search

  Background: Go to Amazon
    Given User goes to "https://www.amazon.com"

  Scenario: TC_01 Amazon Teapot Search
    When User searches for "teapot" in Amazon
    Then Assert the result contains "teapot"
    And User close the application

  Scenario: TC_02 Amazon Flower Search
    When User searches for "flower" in Amazon
    Then Assert the result contains "flower"
    And User close the application

  Scenario: TC_03 Amazon Car Search
    When User searches for "car" in Amazon
    Then Assert the result contains "car"
    And User close the application


