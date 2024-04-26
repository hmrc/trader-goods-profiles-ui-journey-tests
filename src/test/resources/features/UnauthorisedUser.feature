@AllTest

Feature: Trader Goods Profiles unauthorised error page journey tests

  Scenario: As a user without proper authorisation, I want to access an unauthorised page
    Given I login to TGP Profile setup page with invalid enrollments using authority wizard
    Then I should be on the 'unauthorised error' page