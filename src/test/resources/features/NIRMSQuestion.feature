@AllTest

Feature: Trader Goods Profile setup

  Background: As a UKIMS authorised trader I provide my NIRMS number to setup my TGP
    Given I am on the 'Northern Ireland Retail Movement Scheme' page

  Scenario: I select yes for the boolean question
    When I select Yes for the boolean question
    And I select continue
    Then I should be on the 'Northern Ireland Retail Movement Scheme number' page

  Scenario: I select no for the boolean question
    When I select No for the boolean question
    And I select continue
    Then I should be on the 'Northern Ireland plant health label' page

  Scenario: I do not select any option for the boolean question
    And I select continue
    Then Error message 'Select if you are NIRMS registered' should be displayed

  Scenario: I can navigate to which product can be moved under NIRMS page
    When I click on the which products can be moved under NIRMS link
    Then I should be on the 'Northern Ireland Retail Movement Scheme: how the scheme will work' page

#  Scenario: I can go back from the NIRMS Question page
#    When I select the back link
#    Then I should be on the 'UK internal scheme number' page