@dynamic_url
Feature: US_01 Dynamic Url Test

  @smoke
  Scenario Outline: Dynamic Url Test
    Given User goes to "<url>"
    Then User verifies that he is in current "<url>"
    And take a screenshot
    And User close the application
    Examples:
      | url                             |
      | https://www.google.com          |
      | https://www.bluerentalcars.com/ |
      | https://www.youtube.com         |