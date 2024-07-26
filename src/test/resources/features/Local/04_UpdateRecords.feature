@AllLocal

Feature: Trader Goods Profile - View or Update record journey

  Scenario:As a new user, with no historic records, I want to view my goods profile
    Given I am on the 'Home' page with EORI GB123456783000
    When I click on the View or update your goods records link
    Then I should be on the 'Goods profile' page

  Scenario: As a returning user, with historic data, I want to view and update records
    Given I login to TGP Homepage with EORI number GB990000000008
    When I click on the View or update your goods records link
    Then I should be on the 'Previous movement records' page
    And I select continue
    Then I should be on the 'Goods profile' page 1 results
    When I click on the Remove link
    Then I should be on the 'Removing goods record' page
    And I select continue
    Then Error message 'Select yes if you want to remove this goods record' should be displayed
    When I select Yes for the boolean question
    And I select continue
    Then I should be on the 'Goods profile' page 1 results