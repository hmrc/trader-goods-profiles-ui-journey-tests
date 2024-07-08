@AllPipeline

Feature: Trader Goods Profile - View or Update record journey

  Scenario:As a returning user, With no historic records
    Given I am on the 'Home' page with EORI GB123456789003
    When I click on the View or update your goods records link
    Then I should be on the 'Goods profile' page

  Scenario: As a returning user, with historic data, View and update records
    Given I am on the 'Home' page with EORI GB123456789099
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