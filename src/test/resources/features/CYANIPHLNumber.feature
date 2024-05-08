@AllTest

Feature: Trader Goods Profile setup - CYA page

  Background: As a UKIMS authorised trader I check my answers to setup my TGP
    Given I am on the 'Check Your Answers' page without a NIRMS and with a NIPHL number
    And I click the NIPHL Number change link

  Scenario: I should see my prepopulated NIPHL Number after navigating from the CYA page
    When I should be on the 'NIPHL registration number' page
    Then The NIPHL Number field should be prepopulated

  Scenario: I do not change the NIPHL Number
    When I select continue
    Then I should be on the 'Check Your Answers' page without a NIRMS and with a NIPHL number
    And My 'NIPHL Number' has the same valid value

  Scenario: I enter a different valid NIPHL Number
    When I enter different value of my NIPHL Number in the free text field
    And I select continue
    Then I should be on the 'Check Your Answers' page without a NIRMS and with a NIPHL number
    And My 'NIPHL Number' has the different valid value