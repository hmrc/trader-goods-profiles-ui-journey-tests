@AllTest

Feature: Trader Goods Profile setup

  Background: As a UKIMS authorised trader I log on to the trader goods profile service
    Given I login to TGP Profile setup page with valid enrollments using authority wizard

  Scenario: I can navigate to UKIMS page
    When I click on the who can apply to UKIMS link on the 'Setting up your profile' page
    Then I should be on the 'UKIMS' page

  Scenario: I can navigate to NIRMS page
    When I click on the the Northern Ireland Retail Movement Scheme link on the 'Setting up your profile' page
    Then I should be on the 'NIRMS' page

  Scenario: I can navigate to NIPHL page
    When I click on the Moving plants from Great Britain to Northern Ireland link on the 'Setting up your profile' page
    Then I should be on the 'NIPHL' page

  Scenario: I can navigate to the UKIMS Number page
    When I select continue
    Then I should be on the 'UK internal scheme number' page