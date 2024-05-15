@AllTest

Feature: Trader Goods Profiles - Homepage

  Background: As a user I want to access the Homepage
    Given I am on the 'Check Your Answers' page with a NIRMS and NIPHL number

  Scenario: I can access the Home page
    When I select continue
    Then I should be on the 'Home' page