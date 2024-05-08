@AllTest

Feature: Trader Goods Profile setup - CYA page

  Background: As a UKIMS authorised trader I check my answers to setup my TGP
    Given I am on the 'Check Your Answers' page without a NIRMS or NIPHL number
    And I click the UKIMS Number change link

  Scenario: I should see my prepopulated UKIMS Number after navigating from the CYA page
    When I should be on the 'UK internal scheme number' page
    Then The UKIMS Number field should be prepopulated

  Scenario: I do not change the UKIMS Number
    When I select continue
    Then I should be on the 'Check Your Answers' page without a NIRMS or NIPHL number
    And My 'UKIMS Number' has the same valid value

  Scenario: I enter a different valid UKIMS Number
    When I enter different value of my UKIMS Number in the free text field
    And I select continue
    Then I should be on the 'Check Your Answers' page without a NIRMS or NIPHL number
    And My 'UKIMS Number' has the different valid value