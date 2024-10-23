@AllLocal

Feature: Trader Goods Categorisation - Create Record And Categorisation journey

  Scenario:As a returning user, I want to create a record and categorise
    Given I login to TGP Homepage with EORI number GB123456789098
    When I click on the Create a new goods record link
    Then I should be on the 'Creating a goods record' page
    And I select continue
    Then I should be on the 'Trader reference' page
    When I select continue
    Then Error message 'Enter the trader reference' should be displayed
    When I select the back link
    Then I should be on the 'Trader reference' page
    When I enter long Trader reference
    And I select continue
    Then Error message 'Trader reference must be 512 characters or less' should be displayed
    When I enter none unique Trader reference
    And I select continue
    Then I should be on the 'Goods description' page
    When I select continue
    Then Error message 'Enter the goods description' should be displayed
    When I select the back link
    Then I should be on the 'Goods description' page
    When I enter long text in Goods description
    And I select continue
    Then Error message 'The goods description must be 512 characters or less' should be displayed
    When I enter description in Goods description
    And I select continue
    Then I should be on the 'Country of origin' page
    And I select continue
    Then Error message 'Enter the country of origin' should be displayed
    When I select the back link
    Then I should be on the 'Country of origin' page
    When I enter Iraq in country
    And I select continue
    Then I should be on the 'commodity code' page
    And I select continue
    Then Error message 'Enter a commodity code' should be displayed
    When I enter invalid format Commodity code
    And I select continue
    Then Error message 'Enter a commodity code in the correct format' should be displayed
    When I enter incorrect Commodity code
    And I select continue
    Then Error message 'Enter a real commodity code' should be displayed
    When I select the back link
    Then I should be on the 'commodity code' page
    When I enter 170490 Commodity code
    And I select continue
    Then I should be on the "Results for 170490" page
    When I select continue
    Then Error message 'Select if these are the correct goods' should be displayed
    When I select the back link
    Then I should be on the "Results for 170490" page
    When I select No for the boolean question
    And I select continue
    Then I should be on the 'commodity code' page
    And The commodity code field should be prepopulated with 170490
    When I select continue
    And I select Yes for the boolean question
    And I select continue
    Then I should be on the 'Create Record - Check Your Answers' page
    When I click the Trader Reference change link
    Then I should be on the check 'Trader reference' page
    And The Trader reference field should be prepopulated
    When I select continue
    Then I should be on the 'Create Record - Check Your Answers' page
    And My 'Trader Reference' has the same value
    When I click the Goods Description change link
    And I select continue
    Then I should be on the 'Create Record - Check Your Answers' page
    And My 'Goods Description' has the same valid value
    When I click the Country Of Origin change link
    And I select continue
    Then I should be on the 'Create Record - Check Your Answers' page
    And My 'Country Of Origin' has the same value
    When I click the Commodity Code change link
    And I select continue
    Then I should be on the check "Results for 170490" page
    When I select Yes for the boolean question
    And I select continue
    Then I should be on the 'Create Record - Check Your Answers' page
    And My 'Commodity Code' has the same valid value
    When I select continue
    Then I should be on the 'Create record success' page
    When I click on the Categorise goods now link
    Then I should be on the 'Categorisation Information' page
    And I select continue
    Then I should be on the 'Category assessment 1' page
    When I select continue
    Then Error message 'Select yes if you meet the exclusion' should be displayed
    When I select the back link
    Then I should be on the 'Category assessment 1' page
    And I select Yes for the boolean question
    And I select continue
    Then I should be on the 'Category assessment 2' page
    And I select Yes for the boolean question
    And I select continue
    Then I should be on the 'Category assessment 3' page
    When I select continue
    Then Error message 'Select yes if you meet any of the exclusions' should be displayed
    When I select the back link
    Then I should be on the 'Category assessment 3' page
    And I select Yes for the boolean question
    And I select continue
    Then I should be on the 'Category assessment 4' page
    And I select Yes for the boolean question
    And I select continue
    Then I should be on the 'Category assessment 5' page
    And I select Yes for the boolean question
    And I select continue
    Then I should be on the 'Category assessment 6' page
    And I select Yes for the boolean question
    And I select continue
    Then I should be on the Categorisation "Check your category assessment answers for 170490" page
    When I click the Category assessment 2 of 6 change link
    Then I should be on the check 'Category assessment 2' page
    When I select No for the boolean question
    And I select continue
    Then I should be on the Categorisation "Check your category assessment answers for 170490" page
#    TODO - uncomment after TGP-2725
#    And The 'Category assessment 2 of 6' has the value No
    When I select continue
    Then I should be on the 'Categorisation complete' with Category1 content page
    When I click on the Go back to homepage link
    Then I should be on the 'Home' page
    And I click on the Sign out link
    Then I should be on the 'Signed Out' page

  Scenario:As a returning user, I want to create a record with a longer commodity code and add supplementary units
    Given I am on the 'Home' page with EORI GB123456789088
    Then I should be on the 'Home' page
    When I click on the Create a new goods record link
    And I select continue
    Then I should be on the 'Trader reference' page
    When I enter unique Trader reference
    And I select continue
    Then I should be on the 'Goods description' page
    When I enter description in Goods description
    And I select continue
    And I enter Iraq in country
    And I select continue
    And I enter 170490 Commodity code
    And I select continue
    When I select Yes for the boolean question
    And I select continue
    Then I should be on the 'Create Record - Check Your Answers' page
    When I select continue
    And I click on the Categorise goods now link
    And I select continue
    And I select Yes for the boolean question
    And I select continue
    And I select Yes for the boolean question
    And I select continue
    And I select No for the boolean question
    And I select continue
    Then I should be on the 'Longer commodity code' page
    When I select continue
    Then Error message 'Enter 2 or 4 digits' should be displayed
    When I select the back link
    Then I should be on the 'Longer commodity code' page
    When I enter invalid format 'Longer Commodity code'
    And I select continue
    Then Error message 'Enter a commodity code in the correct format' should be displayed
    When I enter incorrect 'Longer Commodity code'
    And I select continue
    Then Error message 'Enter a real commodity code' should be displayed
    When I enter 99 'Longer Commodity code'
    And I select continue
    Then I should be on the Longer Commodity "Results for 17049099" page
    When I select continue
    Then Error message 'Select if these are the correct goods' should be displayed
    When I select the back link
    Then I should be on the Longer Commodity "Results for 17049099" page
    When I select No for the boolean question
    And I select continue
    Then I should be on the 'Longer commodity code' page
    And The longer commodity code field should be prepopulated
    When I select continue
    And I select Yes for the boolean question
    And I select continue
    Then I should be on the 'Supplementary Unit' page
    When I select continue
    Then Error message 'Select yes if you want to add the supplementary unit' should be displayed
    When I select the back link
    Then I should be on the 'Supplementary Unit' page
    When I select Yes for the boolean question
    And I select continue
    Then I should be on the 'Goods Supplementary Unit' page
    When I select continue
    Then Error message 'Enter the goods supplementary unit' should be displayed
    When I enter invalid format in Goods Supplementary Unit
    And I select continue
    Then Error message 'Enter a supplementary unit in the correct format' should be displayed
    When I enter incorrect in Goods Supplementary Unit
    And I select continue
    Then Error message 'Enter a supplementary unit in the correct format' should be displayed
    When I select the back link
    Then I should be on the 'Goods Supplementary Unit' page
    And I enter 12345.0432 in Goods Supplementary Unit
    And I select continue
    Then I should be on the Categorisation "Check your category assessment answers for 17049099" page
    When I click the 'Supplementary Unit' change link
    Then I should be on the check 'Goods Supplementary Unit' page
    And I select continue
    Then I should be on the Categorisation "Check your category assessment answers for 17049099" page
    And The 'Supplementary Unit' has the value 12345.0432 litres
    When I click the 'Has Supplementary Unit' change link
    Then I should be on the check 'Supplementary Unit' page
    And I select No for the boolean question
    And I select continue
    Then I should be on the Categorisation "Check your category assessment answers for 17049099" page
    And The 'Has Supplementary Unit' has the value No
    When I select continue
    Then I should be on the 'Categorisation complete' with Category2 content page

  Scenario:As a returning user, I want to create a Category2 record and categorise
    Given I am on the 'Home' page with EORI GB990000000008
    When I click on the Create a new goods record link
    And I select continue
    Then I enter unique Trader reference
    And I select continue
    When I enter description in Goods description
    And I select continue
    And I enter United Kingdom in country
    And I select continue
    When I enter 1601001011 Commodity code
    And I select continue
    Then I select Yes for the boolean question
    And I select continue
    Then I should be on the 'Create Record - Check Your Answers' page
    When I select continue
    And I click on the Categorise goods now link
    Then I select continue
    Then I should be on the 'Category assessment 1' page
    Then I select Yes for the boolean question
    And I select continue
    Then I should be on the 'Category assessment 2' page
    Then I select Yes for the boolean question
    And I select continue
    Then I should be on the Categorisation "Check your category assessment answers for 1601001011" page
    When I select continue
    Then I should be on the 'Categorisation complete' with Category2 content page
    When I click on the Go back to homepage link
    And I click on the Sign out link
    Then I should be on the 'Signed Out' page

  Scenario:As a returning user, I want to create a Category 3 Goods with no assessments and categorise
    Given I login to TGP Homepage with EORI number GB123456789098
    When I click on the Create a new goods record link
    And I select continue
    When I enter none unique Trader reference
    And I select continue
    Then Error message 'This trader reference is already in your TGP. Enter a unique trader reference.' should be displayed
    When I enter unique Trader reference
    And I select continue
    Then I should be on the 'Goods description' page
    When I enter description in Goods description
    And I select continue
    And I enter France in country
    And I select continue
    When I enter 6321323000 Commodity code
    And I select continue
    Then I select Yes for the boolean question
    And I select continue
    Then I should be on the 'Create Record - Check Your Answers' page
    When I select continue
    And I click on the Categorise goods now link
    Then I should be on the 'Categorisation complete' with standard-no-assessments content page

  Scenario:As a returning user, I want to create Goods with no Exemptions and categorise
    Given I am on the 'Home' page with EORI GB992000000008
    When I click on the Create a new goods record link
    And I select continue
    Then I enter unique Trader reference
    And I select continue
    Then I should be on the 'Goods description' page
    When I enter description in Goods description
    And I select continue
    And I enter France in country
    And I select continue
    When I enter 0208402002 Commodity code
    And I select continue
    Then I select Yes for the boolean question
    And I select continue
    Then I should be on the 'Create Record - Check Your Answers' page
    When I select continue
    And I click on the Categorise goods now link
    Then I should be on the 'Categorisation complete' with category-1-no-exemptions content page