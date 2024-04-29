@AllTest

Feature: Trader Goods Profile setup

  Background: As a UKIMS authorised trader I enter my UKIMS number to setup my TGP
    Given I am on the 'UK internal scheme number' page

  Scenario: I enter a valid UKIMS Number
    When I enter valid value of my UKIMS Number in the free text field
#    And I select continue
#    Then I should be on the 'Northern Ireland Retail Movement Scheme (NIRMS)' page

  Scenario: I enter an incorrect formatted UKIMS Number
    When I enter incorrect value of my UKIMS Number in the free text field
    And I select continue
    Then Error message 'Enter your UKIMS number in the correct format' should be displayed

  Scenario: I leave the UKIMS Number field blank
    When I enter empty value of my UKIMS Number in the free text field
    And I select continue
    Then Error message 'Enter your UKIMS number' should be displayed

  Scenario: I can go back from the UKIMS Number page
    When I select the back button
    Then I should be on the 'Setting up your profile' page
