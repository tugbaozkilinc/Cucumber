@create_personal
Feature: Create Personal Test

  Scenario Outline: Create Personal
    Given User goes to "https://editor.datatables.net/"
    When User clicks on new button
    And User enters first name "<firstname>"
    And User enters last name "<lastname>"
    When User enters positions "<positions>"
    When User enters office "<office>"
    When User enters extension "<extension>"
    When User enters start_date "<start_date>"
    When User enters salary "<salary>"
    And User clicks on create button
    When User searches with "<firstname>"
    Then User verifies that the "<firstname>" is created
    Then User close the application
    Examples:
      | firstname | lastname | positions | office   | extension | start_date | salary |
      | john      | walker   | SDET      | Istanbul | 345       | 2023-03-01 | 100000 |
      | ece       | can      | developer | Izmir    | 453       | 2023-03-01 | 100000 |
      | elif      | han      | developer | Ankara   | 678       | 2023-03-01 | 90000  |
      | mete      | black    | BA        | Izmir    | 890       | 2023-03-01 | 80000  |
      | james     | walker   | SM        | Ankara   | 871       | 2023-03-01 | 110000 |





