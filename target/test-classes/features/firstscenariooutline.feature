@scenario_outline_1
Feature: US_01 Google Search

  Background: Go to Google
    Given User goes to "https://www.google.com"

  Scenario Outline: Search Test
    When User searches for "<product>"
    Then Assert the result contains "<product>"
    And User close the application
    Examples: data
      | product |
      | iphone  |
      | tesla   |
      | tv      |
      | flower  |
      | cat     |
      | dog     |


#Scenario -> Scenario Outline
#"" -> "<column_name>"
#Examples kelimesi Scenario Outline dan sonra kullanilmali
#Examples verilerin kullanildigi yerdir
#@a or @b (either or)
#@a and @b (both)
#@a and not @b

