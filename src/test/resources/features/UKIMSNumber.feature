@AllTest

Feature: Trader Goods Profile setup

  Background: As a UKIMS authorised trader I enter my UKIMS number to setup my TGP
    Given I login to TGP Profile setup page with valid enrollments using authority wizard
    And I select continue

  Scenario: I enter an incorrect formatted UKIMS Number
    Given I should be on the 'UK internal scheme number' page
    When I enter an incorrect format of my UKIMS Number in the free text field
    And I select continue
    Then Error message 'Enter your UKIMS number in the correct format' should be displayed

  Scenario: I leave the UKIMS Number field blank
    Given I should be on the 'UK internal scheme number' page
    When I leave UKIMS Number field blank
    And I select continue
    Then Error message 'Enter your UKIMS number' should be displayed

  Scenario: I can go back from the UKIMS Number page
    Given I should be on the 'UK internal scheme number' page
    When I select the back button
    Then I should be on the 'Setting up your profile' page

  Scenario: I enter a valid UKIMS Number
    Given I should be on the 'UK internal scheme number' page
    When I enter a valid format of my UKIMS Number in the free text field
#    And I select continue
#    Then I should be on the 'Northern Ireland Retail Movement Scheme (NIRMS)' page