@AllTest

Feature: Trader Goods Profile setup - CYA page

  Background: As a UKIMS authorised trader I check my answers to setup my TGP
    Given I am on the 'Check Your Answers' page without a NIRMS and with a NIPHL number
    And I click the NIPHL Question change link

  Scenario: I should see my prepopulated NIPHL Question answer after navigating from the CYA page
    When I should be on the 'Northern Ireland plant health label' page
    Then The radio button field should be prepopulated

  Scenario: I do not change my answer to the NIPHL question
    When I select continue
    Then I should be on the 'Check Your Answers' page without a NIRMS and with a NIPHL number
    And My 'NIPHL Question' has the same value

  Scenario: I change my answer to the NIPHL question
    When I select No for the boolean question
    And I select continue
    Then I should be on the 'Check Your Answers' page without a NIRMS or NIPHL number
    And My 'NIPHL Question' has the different value