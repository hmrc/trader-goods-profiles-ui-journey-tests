#@AllTest

Feature: Trader Goods Profile setup

  Background: As a UKIMS authorised trader I enter my UKIMS number to setup my TGP
    Given I login to TGP Profile setup page with valid enrollments using authority wizard

  Scenario: 02 - I enter an incorrect formatted UKIMS Number
    Given I am on the 'UKIMS Number' page
    When I enter an incorrect format of my UKIMS Number in the free text field
    And I select continue
    Then Error message 'Enter your UKIMS number in the correct format' should be displayed

  Scenario: 03 - I leave the UKIMS Number field blank
    Given I am on the 'UKIMS Number' page
    When I leave UKIMS Number field blank
    And I select continue
    Then Error message 'Enter your UKIMS number' should be displayed

  Scenario: 04 - I can go back from
    When I select the back button
    Then I should be on the 'Setting up your profile' page