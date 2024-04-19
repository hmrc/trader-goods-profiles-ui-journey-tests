@AllTests
Feature: Sample feature file

  Scenario: Navigating to the Homepage
    Given I am on the TGP Home Page
    And I refresh the page
    And I should be on the TGP Home Page
