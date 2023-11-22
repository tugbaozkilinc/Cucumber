@failed_scenario
Feature: Hooks Test

  Background: Go to Google
    Given User goes to "https://www.google.com"

  Scenario: TC_01 Google Iphone Search
    When User searches for "iphone"
    Then Assert the result contains "iphone"
    Then User close the application

  Scenario: TC_02 Google Tesla Search
    And User searches for "tesla"
    Then Assert the result contains "range rover"
    Then User close the application
