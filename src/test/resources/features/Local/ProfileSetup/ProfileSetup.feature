@AllLocal

Feature: Trader Goods Profile setup - Profile Setup page

  Background: As a UKIMS authorised trader I log on to the trader goods profile service
    Given I login to TGP Profile setup page with valid enrollments using authority wizard

  Scenario: I can navigate to UKIMS page
    When I click on the who can apply to UKIMS link
    Then I should be on the 'UKIMS' page

  Scenario: I can navigate to NIRMS page
    When I click on the the Northern Ireland Retail Movement Scheme link
    Then I should be on the 'NIRMS' page

  Scenario: I can navigate to NIPHL page
    When I click on the Moving plants from Great Britain to Northern Ireland link
    Then I should be on the 'NIPHL' page