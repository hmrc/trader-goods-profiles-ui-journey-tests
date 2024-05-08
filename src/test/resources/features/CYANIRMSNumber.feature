@AllTest

Feature: Trader Goods Profile setup - CYA page

  Background: As a UKIMS authorised trader I check my answers to setup my TGP
    Given I am on the 'Check Your Answers' page with a NIRMS and without a NIPHL number
    And I click the NIRMS Number change link

  Scenario: I should see my prepopulated NIRMS Number after navigating from the CYA page
    When I should be on the 'Northern Ireland Retail Movement Scheme number' page
    Then The NIRMS Number field should be prepopulated

  Scenario: I do not change the NIRMS Number
    When I select continue
    Then I should be on the 'Check Your Answers' page with a NIRMS and without a NIPHL number
    And My 'NIRMS Number' has the same valid value

  Scenario: I enter a different valid NIRMS Number
    When I enter different value of my NIRMS Number in the free text field
    And I select continue
    Then I should be on the 'Check Your Answers' page with a NIRMS and without a NIPHL number
    And My 'NIRMS Number' has the different valid value