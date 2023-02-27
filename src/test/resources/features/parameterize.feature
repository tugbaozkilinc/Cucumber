@parameter
Feature: US_01 Google Search

  Background: Go to Google
    Given User goes to "https://www.google.com"

  Scenario: TC_01 Google Iphone Search
    When User searches for "iphone"
    Then Assert the result contains "iphone"
    And User close the application

  Scenario: TC_02 Google Tesla Search
    When User searches for "tesla"
    Then Assert the result contains "tesla"
    And User close the application

  Scenario: TC_03 Google Vase Search
    When User searches for "vase"
    Then Assert the result contains "vase"
    And User close the application

