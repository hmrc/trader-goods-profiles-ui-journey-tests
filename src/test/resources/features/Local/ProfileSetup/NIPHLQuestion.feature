@AllLocal

Feature: Trader Goods Profile setup - NIPHL Question page

  Background: As a UKIMS authorised trader I provide my NIPHL reference to setup my TGP
    Given I am on the 'Northern Ireland plant health label' page

  Scenario: I do not select any option for the boolean question
    And I select continue
    Then Error message 'Select if you are NIPHL registered' should be displayed

  Scenario: I can navigate to the Moving plants from Great Britain to Northern Ireland page
    When I click on the moving plants from Great Britain to Northern Ireland link
    Then I should be on the 'NIPHL' page

  Scenario: I can go back from the NIPHL Question page
    When I select the back link
    Then I should be on the 'Northern Ireland Retail Movement Scheme' page
