@AllPipeline

Feature: Trader Goods Profile - View or Update record journey

  Scenario: As a returning user, with historic data, View and update records
    Given I login to TGP Homepage with EORI number GB123456789098
    Then I should be on the 'Home' page
    When I click on the View or update your goods records link
#    Then I should be on the 'Previous movement records' page
#    And I select continue
    Then I should be on the 'Goods profile' page
