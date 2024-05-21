@AllLocal

Feature: Trader Goods Profiles Categorisation journey tests

  Background: As a user I want to have guidance on category assessments
    Given I login to TGP Profile setup page with valid enrollments using authority wizard

    Scenario: 01 - I can navigate to the categorisation page
      Given I navigate to the 'categorisation' page
      Then I should be on the 'categorisation' page