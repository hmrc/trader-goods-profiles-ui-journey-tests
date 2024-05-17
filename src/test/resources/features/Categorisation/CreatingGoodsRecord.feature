@AllTest

Feature: Trader Goods Categorisation - Creating A Goods Records page

  Background: As a UKIMS authorised trader I want to access create record start page
    Given I am on the 'Home' page

  Scenario:I can navigate to Creating a goods record page
    When I click on the Create a new goods record link
    Then I should be on the 'Creating a goods record' page
