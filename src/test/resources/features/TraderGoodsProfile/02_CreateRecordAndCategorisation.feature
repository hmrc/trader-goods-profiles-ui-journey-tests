@AllPipeline

Feature: Trader Goods Profile - Create Record, Categorisation with longer commodity and supplementary unit journey

  Scenario:As a returning user, I want to create a record and categorise
    Given I login to TGP Homepage with EORI number GB123456789098
    When I click on the Create a new goods record link
    Then I should be on the 'Creating a goods record' page
    And I select continue
    Then I should be on the 'Trader reference' page
    When I enter unique Trader reference
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
    Then I should be on the "Results for 170490" page
    When I select Yes for the boolean question
    And I select continue
    Then I should be on the 'Create Record - Check Your Answers' page
    When I click the Trader reference change link
    Then I should be on the check 'Trader reference' page
    And I enter different Trader reference
    And I select continue
    Then I should be on the 'Create Record - Check Your Answers' page
    When I select continue
    Then I should be on the 'Create record success' page
    And I click on the Categorise goods now link
    Then I should be on the 'Categorisation Information' page
    And I select continue
    Then I should be on the 'Category assessment 1 of 6' page
    And I check the first box of the checkbox question
    And I select continue
    Then I should be on the 'Category assessment 2 of 6' page
    And I check the first box of the checkbox question
    And I select continue
    Then I should be on the 'Category assessment 3 of 6' page
    And I check none of the above for the checkbox question
    And I select continue
    Then I should be on the 'Longer commodity code' page
    And I enter 9912 'Longer Commodity code'
    And I select continue
    Then I should be on the Longer Commodity "Results for 1704909912" page
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
    Then I should be on the check 'Category assessment 3 of 7' page for Longer Commodity code
    And I select continue
    Then I should be on the Categorisation "Check your category assessment answers for 1704909912" page
    When I click the SupplementaryUnit change link
    Then I should be on the check 'Goods Supplementary Unit' page
    And I select continue
    Then I should be on the Categorisation "Check your category assessment answers for 1704909912" page
    And The 'Supplementary Unit' has the value 12345.0432 litres
    When I select continue
    Then I should be on the 'Categorisation complete' with Category2 content page