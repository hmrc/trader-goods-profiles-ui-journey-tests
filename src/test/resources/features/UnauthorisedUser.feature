@AllTest

Feature: Trader Goods Profiles unauthorised error page journey tests

  Background: As a user without proper authorisation, I want to access an unauthorised page
    Given I login to TGP Profile setup page with valid enrollments using authority wizard

  Scenario: 01 - I am navigated to the unauthorised error page
    Given I navigate to the 'unauthorised error' page
    Then I should be on the 'unauthorised error' page