@AllPipeline

Feature: Trader Goods Profile - Create Record and Categorisation journeys

  Scenario:As a returning user, I want to create a record and categorise Standard goods, Category-1 goods and Category-2(longer commodity and supplementary unit)
    Given I login to TGP with EORI number GB123456789098
    When I click on the Create a new goods record link
    Then I should be on the 'Creating a goods record' page
    And I select continue
    Then I should be on the 'Product reference' page
    When I enter unique Product reference
    And I select continue
    Then I should be on the 'Goods description' page
    When I enter description in Goods description
    And I select continue
    Then I should be on the 'Country of origin' page
    When I enter Germany in country
    And I select continue
    Then I should be on the 'commodity code' page
    When I enter 170490 Commodity code
    And I select continue
    Then I should be on the "Results for the commodity code 170490" page
    When I select Yes for the boolean question
    And I select continue
    Then I should be on the 'Create Record - Check Your Answers' page
    When I click the Product reference change link
    Then I should be on the check 'Product reference' page
    And I enter different Product reference
    And I select continue
    Then I should be on the 'Create Record - Check Your Answers' page
    When I select continue
    Then I should be on the 'Create record success' page
#    Checking Category-1 goods result
    And I click on the Categorise goods now link
    Then I should be on the 'Categorisation Information' page
    And I select continue
    Then I should be on the 'Category assessment 1' page
    When I check none of the above for the checkbox question
    And I select continue
    Then I should be on the Categorisation "Check your category assessment answers for 170490" page
    And I select continue
    Then I should be on the 'Categorisation complete' with Category1 content page
    And I click on the Go back to goods record link
    Then I should be on the 'Goods record' page
#    Checking Standard goods result
    When I click the Category change link
    Then I should be on the 'Categorisation Information' page
    And I select continue
    Then I should be on the 'Category assessment 1' page
    When I check the first box of the checkbox question
    And I select continue
    Then I should be on the 'Category assessment 2' page
    When I check the first box of the checkbox question
    And I select continue
    Then I should be on the 'Category assessment 3' page
    When I check the first box of the checkbox question
    And I select continue
    Then I should be on the 'Category assessment 4' page
    When I check the first box of the checkbox question
    And I select continue
    Then I should be on the 'Category assessment 5' page
    When I check the first box of the checkbox question
    And I select continue
    Then I should be on the 'Category assessment 6' page
    When I check the first box of the checkbox question
    And I select continue
    Then I should be on the 'Category assessment 7' page
    When I check the first box of the checkbox question
    And I select continue
    Then I should be on the Categorisation "Check your category assessment answers for 170490" page
    And I select continue
    Then I should be on the 'Categorisation complete' with standard content page
    And I click on the Go back to goods record link
    Then I should be on the 'Goods record' page
#    Checking Category-2 goods result with longer commodity and supplementary unit
    When I click the Category change link
    Then I should be on the 'Categorisation Information' page
    And I select continue
    Then I should be on the 'Category assessment 1' page
    When I check the first box of the checkbox question
    And I select continue
    Then I should be on the 'Category assessment 2' page
    When I check the first box of the checkbox question
    And I select continue
    Then I should be on the 'Category assessment 3' page
    And I check none of the above for the checkbox question
    And I select continue
    Then I should be on the 'Longer commodity code' page
    And I enter 9912 'Longer Commodity code'
    And I select continue
    Then I should be on the Longer Commodity "Results for the commodity code 1704909912" page
    When I select Yes for the boolean question
    And I select continue
    Then I should be on the 'Supplementary Unit' page
    When I select Yes for the boolean question
    And I select continue
    Then I should be on the 'Goods Supplementary Unit' page
    And I enter 12345.0432 in Goods Supplementary Unit
    And I select continue
    Then I should be on the Categorisation "Check your category assessment answers for 1704909912" page
    When I click the Category assessment 3 change link
    Then I should be on the check 'Category assessment 3' page for Longer Commodity code
    And I select continue
    Then I should be on the Categorisation "Check your category assessment answers for 1704909912" page
    When I click the SupplementaryUnit change link
    Then I should be on the check 'Goods Supplementary Unit' page
    And I select continue
    Then I should be on the Categorisation "Check your category assessment answers for 1704909912" page
    And The 'SupplementaryUnit' has the value 12345.0432 litres
    When I select continue
    Then I should be on the 'Categorisation complete' with Category2 content page