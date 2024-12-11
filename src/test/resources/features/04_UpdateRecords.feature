@AllPipeline

Feature: Trader Goods Profile - View or Update record journey

  Scenario: As a returning user, with historic data, View and update records
    Given I login to TGP with EORI number GB123456789098
    When I click on the View or update your goods records link
    Then I should be on the 'Previous movement records' page
    And I select continue
    Then I should be on the 'Goods profile' page 1 results
    When I click on the View link
    Then I should be on the 'Goods record' page
#Update trader reference to a new unique value
    When I click the Trader reference change link
    Then I should be on the 'Trader reference' update page
    And I enter Unique Trader reference update
    When I select continue
    Then I should be on the 'Trader reference' update CYA page
    And I select continue
    Then I should be on the 'Goods record' page
#No changes to Goods description after clicking change link
    When I click the Goods description change link
    Then I should be on the 'Goods description' update page
    And I select continue
    Then I should be on the 'Goods description' CYA page
    And I select continue
    Then I should be on the 'Goods record' page
#Update supplementary unit to new value and validating
    When I click the SupplementaryUnit change link
    Then I should be on the 'Goods Supplementary Unit' update page
    When I enter 54321.4302 in Goods Supplementary Unit
    And I select continue
    Then I should be on the update 'Supplementary Unit' CYA page
    And The 'SupplementaryUnit' has the value 54321.4302 squares
    And I select continue
#Removing supplementary unit
    When I click the HasSupplementaryUnit change link
    Then I should be on the 'Supplementary Unit' update page
    When I select No for the boolean question
    And I select continue
    Then I should be on the update 'Supplementary Unit' CYA page
    And The 'HasSupplementaryUnit' has the value No
    And I select continue
    Then I should be on the 'Goods record' page
#Update Commodity Code
    When I click the Commodity code change link
    Then I should be on the Goods record Commodity Code warning page
    And I select Yes for the boolean question
    When I select continue
    Then I should be on the 'commodity code' update page
    And I enter 9301900000 in the Commodity code text field
    Then I should be on the update 'commodity code' result page
    And I select Yes for the boolean question
    When I select continue
    Then I should be on the update 'commodity code updated' page
    When I click on the Categorise this record link
    Then I should be on the 'Categorisation Information' page
    And I select continue
    Then I should be on the 'Category assessment 1' page
    When I check none of the above for the checkbox question
    And I select continue
    Then I should be on the Categorisation "Check your category assessment answers for 1704909912" page
    And I select continue
    Then I should be on the 'Categorisation complete' with Category1 content page
