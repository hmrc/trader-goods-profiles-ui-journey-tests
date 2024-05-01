@AllTest

Feature: Trader Goods Profile setup

  Background: As a UKIMS authorised trader I provide my NIRMS number to setup my TGP
    Given I am on the 'Northern Ireland Retail Movement Scheme number' page

  Scenario:I enter an valid formatted NIRMS Number
    When I enter valid value of my NIRMS Number in the free text field
    And I select continue
    Then I should be on the 'Northern Ireland plant health label' page

  Scenario: I leave the NIRMS Number field blank
    When I enter empty value of my NIRMS Number in the free text field
    And I select continue
    Then Error message 'Enter your NIRMS number' should be displayed

  Scenario: I enter an incorrect formatted NIRMS Number
    When I enter incorrect value of my NIRMS Number in the free text field
    And I select continue
    Then Error message 'Enter your NIRMS number in the correct format' should be displayed

  Scenario: I can go back from the NIRMS Number page
    When I select the back link
    Then I should be on the 'Northern Ireland Retail Movement Scheme' page

  Scenario: I select back link on the NIRMS Number error page
    When I enter empty value of my NIRMS Number in the free text field
    And I select continue
    And I select the back link
    Then I should be on the 'Northern Ireland Retail Movement Scheme' page