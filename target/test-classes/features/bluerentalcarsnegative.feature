@blue_rental_car_negative
Feature: US_01 BlueRentalCars Negative Login

  @regression
  Scenario Outline: TC_01 User logs in with invalid information
    Given User goes to "https://www.bluerentalcars.com/"
    When User clicks on login button to go to login page
    And User enters valid username "<username>"
    And User enters valid password "<password>"
    And User clicks on login button
    Then User verifies that he is not logged into the page
    And User close the application
    Examples:
      | username         | password |
      | angela@gmail.com | 1234     |
      | john@gmail.com   | 1234     |
      | james@gmail.com  | 3456     |
      | simon@gmail.com  | 3456     |

