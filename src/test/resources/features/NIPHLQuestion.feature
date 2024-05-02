@AllTest

Feature: Trader Goods Profile setup

  Background: As a UKIMS authorised trader I provide my NIPHL reference to setup my TGP
    Given I am on the 'Northern Ireland plant health label' page

  Scenario: I select yes for the boolean question
    When I select Yes for the boolean question
    And I select continue
#    Then I should be on the 'Northern Ireland plant health label number' page

  Scenario: I select no for the boolean question
    When I select No for the boolean question
    And I select continue
#    Then I should be on the 'Check your answers' page

  Scenario: I do not select any option for the boolean question
    And I select continue
    Then Error message 'Select if you are NIPHL registered' should be displayed

  Scenario: I can navigate to the Moving plants from Great Britain to Northern Ireland page
    When I click on the moving plants from Great Britain to Northern Ireland link
    Then I should be on the 'NIPHL' page

#  Scenario: I can go back from the NIPHL Question page
#    When I select the back link
#    Then I should be on the 'NIRMS number' page
