@AllLocal

Feature: Trader Goods Categorisation - Create Record And Categorisation journey

  Scenario:As a returning user, I want to create a record and categorise
    Given I login to TGP Homepage with EORI number GB123456789098
    Then I should be on the 'Home' page
    When I click on the Create a new goods record link
    Then I should be on the 'Creating a goods record' page
    And I select continue
    Then I should be on the 'Trader reference' page
    And I select continue
    Then Error message 'Enter the trader reference' should be displayed
#    TODO - not yet implemented Non unique check
#    When I enter Non unique Trader reference in the text area
#    Then Error message 'This trader reference is already in your TGP. Enter a unique trader reference' should be displayed
    When I enter Unique Trader reference in the text area
    Then I should be on the 'Goods description' question page
    And I select continue
    Then Error message 'Confirm if you want to use your trader reference as the goods description' should be displayed
    When I select the back link
    Then I should be on the 'Goods description' question page
    When I select No for the Goods boolean question
    And I select continue
    Then I should be on the 'Goods description' page
    When I select continue
    Then Error message 'Enter the goods description' should be displayed
    When I select the back link
    Then I should be on the 'Goods description' page
    When I enter description in the Goods description text area
    Then I should be on the 'Country of origin' page
    And I select continue
    Then Error message 'Enter the country of origin' should be displayed
    When I select the back link
    Then I should be on the 'Country of origin' page
    When I enter Iraq in the country text field
    Then I should be on the 'commodity code' page
    And I select continue
    Then Error message 'Enter a commodity code' should be displayed
    When I enter invalid format value of Commodity code in the free text field
    Then Error message 'Enter a commodity code in the correct format' should be displayed
    When I enter incorrect value of Commodity code in the free text field
    Then Error message 'Enter a real commodity code' should be displayed
    When I select the back link
    Then I should be on the 'commodity code' page
    When I enter 9301900000 value of Commodity code in the free text field
    Then I should be on the "Results for 9301900000" page
    When I select Yes for the boolean question
    And I select continue
    Then I should be on the 'Create Record - Check Your Answers' page
    When I click the Trader Reference change link
    Then I should be on the check 'Trader reference' page
    And The Trader reference field should be prepopulated
    When I enter different Trader reference in the text area
    Then I should be on the 'Create Record - Check Your Answers' page
    And My 'Trader Reference' has the different valid value
    When I click the Goods Description Question change link
    And I select continue
    Then I should be on the 'Create Record - Check Your Answers' page
    And My 'Goods Description Question' has the same value
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
    Then I should be on the check "Results for 9301900000" page
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
    And I select First option
    Then I should be on the 'Category assessment 2' page
    And I select First option
    Then I should be on the 'Category assessment 3' page
    And I select First option
    Then I should be on the 'Category assessment 4' page
    And I select First option
    Then I should be on the 'Category assessment 5' page
    And I select First option
    Then I should be on the 'Category assessment 6' page
    And I select First option
    Then I should be on the 'Categorisation - Check Your Answers' page
    When I select continue
    Then I should be on the 'Categorisation complete' with Standard content page
    When I select the back link
    Then I should be on the 'Categorisation - Check Your Answers' page
    When I click the Category assessment 3 of 6 change link
    Then I should be on the check 'Category assessment 3' page
    And I select continue
    Then I should be on the 'Categorisation - Check Your Answers' page
    When I click the Category assessment 5 of 6 change link
    Then I should be on the check 'Category assessment 5' page
    And I select None of the above option
    Then I should be on the 'Categorisation - Check Your Answers' page
    And The 'Category assessment 5 of 6' has the value None selected
    When I select continue
    Then I should be on the 'Categorisation complete' with Category1 content page
    And I navigate to the 'Supplementary Unit' page
    Then I should be on the 'Supplementary Unit' page
    And I select Yes for the boolean question
    And I select continue
    Then I should be on the 'Goods Supplementary Unit' page
    When I select continue
    Then Error message 'Enter the goods supplementary unit' should be displayed
    When I enter invalid format value of Goods Supplementary Unit
    Then Error message 'Enter a supplementary unit in the correct format' should be displayed
    When I enter incorrect value of Goods Supplementary Unit
    Then Error message 'Enter a supplementary unit in the correct format' should be displayed
    When I select the back link
    Then I should be on the 'Goods Supplementary Unit' page
    And I enter 12345.0432 value of Goods Supplementary Unit
    Then I should be on the 'Categorisation - Check Your Answers' page
    When I click the 'Has Supplementary Unit' change link
    Then I should be on the check 'Supplementary Unit' page
    And I select continue
    Then I should be on the 'Categorisation - Check Your Answers' page
    And The 'Has Supplementary Unit' has the value Yes
    When I click the 'Supplementary Unit' change link
#    Then I should be on the check 'Goods Supplementary Unit' page
    And I select continue
    Then I should be on the 'Categorisation - Check Your Answers' page
    And The 'Supplementary Unit' has the value 12345.0432
    When I select continue
    Then I should be on the 'Categorisation complete' with Category1 content page
    When I click on the Go to homepage link
    Then I should be on the 'Home' page
    And I click on the Sign out link
    Then I should be on the 'Signed Out' page

  Scenario:As a returning user, I want to create a Category2 record and categorise
    Given I am on the 'Home' page
    When I click on the Create a new goods record link
    And I select continue
    Then I enter Unique Trader reference in the text area
    And I select Yes for the boolean question
    Then I select continue
    And I enter United Kingdom in the country text field
    When I enter 1601001011 value of Commodity code in the free text field
    Then I select Yes for the boolean question
    And I select continue
    Then I should be on the 'Create Record - Check Your Answers' page
    When I select continue
    And I click on the Categorise goods now link
    Then I select continue
    Then I should be on the 'Category assessment 1' page
    And I select First option
    Then I should be on the 'Category assessment 2' page
    And I select First option
    Then I should be on the 'Category assessment 3' page
    And I select None of the above option
    Then I should be on the 'Categorisation - Check Your Answers' page
    When I select continue
    Then I should be on the 'Categorisation complete' with Category2 content page
    When I click on the Go to homepage link
    And I click on the Sign out link
    Then I should be on the 'Signed Out' page