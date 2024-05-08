@AllTest

Feature: Trader Goods Profile setup - CYA page

  Background: As a UKIMS authorised trader I check my answers to setup my TGP
    Given I am on the 'Check Your Answers' page with a NIRMS and without a NIPHL number
    And I click the NIRMS Question change link

  Scenario: I should see my prepopulated NIRMS Question after navigating from the CYA page
    When I should be on the 'Northern Ireland Retail Movement Scheme' page
    Then The radio button field should be prepopulated

  Scenario: I do not change my answer to the NIRMS question
    When I select continue
    Then I should be on the 'Check Your Answers' page with a NIRMS and without a NIPHL number
    And My 'NIRMS Question' has the same value

  Scenario: I change my answer to the NIRMS question
    When I select No for the boolean question
    And I select continue
    Then I should be on the 'Check Your Answers' page without a NIRMS or NIPHL number
    And My 'NIRMS Question' has the different value