@AllPipeline

Feature: Trader Goods Profile - View or Update record journey

  Scenario: As a returning user, with historic data, View and update records
    Given I login to TGP Homepage with EORI number GB123456789085
    Then I should be on the 'Home' page
    When I click on the View or update your goods records link
    Then I should be on the 'Previous movement records' page
    And I select continue
    Then I should be on the 'Goods profile' page 1 results
    When I click on the Change link
    Then I should be on the 'Goods record' page
    When I click the Goods record Trader Reference change link
    Then I should be on the 'Trader reference' update page
    And I enter Unique Trader reference in update text area
    Then I should be on the 'Trader reference' update CYA page
    And I select continue
    Then I should be on the 'Goods record' page
    When I click the Goods record Goods Description change link
    Then I should be on the 'Goods description' update page
    And I select continue
    Then I should be on the 'Goods description' CYA page
    And I select continue
    Then I should be on the 'Goods record' page
    When I click the Goods record Country Of Origin change link
    Then I should be on the Goods record Country Of Origin warning page
    And I select Yes for the boolean question
    When I select continue
    Then I should be on the 'Country of origin' update page
    And I select continue
    Then I should be on the 'Country of origin' CYA page
    And I select continue
    Then I should be on the 'Goods record' page
    When I click the Goods record Commodity Code change link
    Then I should be on the Goods record Commodity Code warning page
    And I select Yes for the boolean question
    When I select continue
    Then I should be on the 'commodity code' update page
    And I enter 9301900000 in the Commodity code text field
    Then I should be on the update 'commodity code' result page
    And I select Yes for the boolean question
    When I select continue
    Then I should be on the update 'commodity code' CYA page
    And I select continue
    Then I should be on the 'Goods record' page
    When I click on the Go to goods profile link
    Then I should be on the 'Goods profile' page 1 results
    When I click on the Remove link
    Then I should be on the 'Removing goods record' page
    And I select continue
    Then Error message 'Select yes if you want to remove this goods record' should be displayed
    When I select Yes for the boolean question
    And I select continue
    Then I should be on the 'Goods profile' page 1 results