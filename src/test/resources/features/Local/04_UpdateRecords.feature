@AllLocal

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
    Then I should be on the 'Goods profile' page
