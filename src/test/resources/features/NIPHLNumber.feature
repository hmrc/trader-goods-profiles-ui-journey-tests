@AllTest

Feature: Trader Goods Profile setup

  Background: As a UKIMS authorised trader I provide my NIPHL number to setup my TGP
    Given I am on the 'NIPHL registration number' page

  Scenario:I enter an valid formatted NIPHL Number
    When I enter valid value of my NIPHL Number in the free text field
    And I select continue
    Then I should be on the 'Check Your Answers' page without a NIRMS and with a NIPHL number

  Scenario: I leave the NIPHL Number field blank
    When I enter empty value of my NIPHL Number in the free text field
    And I select continue
    Then Error message 'Enter your NIPHL registration number.' should be displayed

  Scenario: I enter an incorrect formatted NIPHL Number
    When I enter incorrect value of my NIPHL Number in the free text field
    And I select continue
    Then Error message 'Enter your NIPHL registration number in the correct format.' should be displayed

#  Scenario: I can go back from the NIPHL Number page
#    When I select the back link
#    Then I should be on the 'Northern Ireland plant health label' page

#  Scenario: I select back link on the NIPHL Number error page
#    When I enter empty value of my NIPHL Number in the free text field
#    And I select continue
#    And I select the back link
#    Then I should be on the 'Northern Ireland plant health label' page