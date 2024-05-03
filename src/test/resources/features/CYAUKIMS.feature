@AllTest

Feature: Trader Goods Profile setup

  Background: As a UKIMS authorised trader I check my answers to setup my TGP
    Given I am on the 'Check Your Answers' page without a NIRMS or NIPHL number
    And I click the first change link

  Scenario: I navigate to the UKIMS Number page to change my UKIMS Number
    When I should be on the 'UK internal scheme number' page
    Then The free text field should be prepopulated

  Scenario: I enter a different valid UKIMS Number
    When I enter different value of my UKIMS Number in the free text field
    And I select continue
    Then I should be on the 'Check Your Answers' page without a NIRMS or NIPHL number

  Scenario: I enter an incorrect formatted UKIMS Number
    When I enter incorrect value of my UKIMS Number in the free text field
    And I select continue
    Then Error message 'Enter your UKIMS number in the correct format' should be displayed

  Scenario: I leave the UKIMS Number field blank
    When I enter empty value of my UKIMS Number in the free text field
    And I select continue
    Then Error message 'Enter your UKIMS number' should be displayed