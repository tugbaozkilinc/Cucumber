@amazon
Feature: US_01 Amazon Search

  Background: Go to Amazon
  Given User goes to the amazon

  Scenario: TC_01 Amazon Teapot Search
  And User searches for teapot
  Then Assert the result contains teapot
  Then User close the application

  Scenario: TC_02 Amazon Flower Search
  When User searches for flower
  Then Assert the result contains flower
  Then User close the application