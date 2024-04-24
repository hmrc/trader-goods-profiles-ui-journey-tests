@AllTest

Feature: Trader Goods Profile setup

  Background: As UKIMS authorised trader I log on to the trader goods profile service
    Given I login to TGP Profile setup page with valid enrollments using authority wizard

  Scenario: 01 - I can navigate to UKIMS page
    When I click on the who can apply to UKIMS link on the 'Setting up your profile' page
    Then I should be on the 'UKIMS' page

  Scenario: 02 - I can navigate to NIRMS page
    When I click on the the Northern Ireland Retail Movement Scheme link on the 'Setting up your profile' page
    Then I should be on the 'NIRMS' page

  Scenario: 03 - I can navigate to NIPHL page
    When I click on the Moving plants from Great Britain to Northern Ireland link on the 'Setting up your profile' page
    Then I should be on the 'NIPHL' page