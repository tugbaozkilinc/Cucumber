@blue_rental_car_positive
Feature: US_01 BlueRentalCars Positive Login

  @test_runner
  Scenario Outline: TC_01 User logs in with valid information
    Given User goes to "https://www.bluerentalcars.com/"
    When User clicks on login button to go to login page
    And User enters valid username "<username>"
    And User enters valid password "<password>"
    And User clicks on login button
    Then User verifies that he is logged into the page
    And User close the application
    Examples:
      | username                       | password  |
      | kate.brown@bluerentalcars.com  | tad1$Fas  |
      | sam.walker@bluerentalcars.com  | c!fas_art |
      | raj.khan@bluerentalcars.com    | v7Hg_va^  |
      | pam.raymond@bluerentalcars.com | Nga^g6!   |
