@AllPipeline

Feature: Trader Goods Profile - Create Record And Categorisation with longer commodity and supplementary unit journey

  Scenario:As a returning user, I want to create a record and categorise
    Given I am on the 'Home' page with EORI GB123456789085
    When I click on the Create a new goods record link
    Then I should be on the 'Creating a goods record' page
    And I select continue
    Then I should be on the 'Trader reference' page
    When I enter unique Trader reference in the text area
    Then I should be on the 'Goods description' question page
    When I select No for the boolean question
    And I select continue
    Then I should be on the 'Goods description' page
    When I enter description in the Goods description text area
    Then I should be on the 'Country of origin' page
    When I enter Germany in the country text field
    Then I should be on the 'commodity code' page
    When I enter 170490 value of Commodity code in the free text field
    Then I should be on the "Results for 1704900000" page
    When I select Yes for the boolean question
    And I select continue
    Then I should be on the 'Create Record - Check Your Answers' page
    When I click the Trader Reference change link
    Then I should be on the check 'Trader reference' page
    When I enter different Trader reference in the text area
    Then I should be on the 'Create Record - Check Your Answers' page
    When I click the Goods Description Question change link
    And I select continue
    Then I should be on the 'Create Record - Check Your Answers' page
    And My 'Goods Description Question' has the same value
    When I select continue
    Then I should be on the 'Create record success' page
    When I click on the Categorise goods now link
    Then I should be on the 'Categorisation Information' page
    And I select continue
    Then I should be on the 'Category assessment 1' page
    And I select Yes for the boolean question
    And I select continue
    Then I should be on the 'Category assessment 2' page
    And I select Yes for the boolean question
    And I select continue
    Then I should be on the 'Category assessment 3' page
    And I select No for the boolean question
    And I select continue
    Then I should be on the 'Longer commodity code' page
    And I enter 99 value of Longer Commodity code in the free text field
    Then I should be on the Longer Commodity "Results for 1704909900" page
    When I select Yes for the boolean question
    And I select continue
    Then I should be on the 'Supplementary Unit' page
    And I select Yes for the boolean question
    When I select continue
    Then I should be on the 'Goods Supplementary Unit' page
    And I enter 12345.0432 value of Goods Supplementary Unit
    Then I should be on the 'Categorisation - Check Your Answers' page
    When I click the Category assessment 3 of 6 change link
    Then I should be on the check 'Category assessment 3' page
    And I select continue
    Then I should be on the check 'Supplementary Unit' page
    And I select continue
    Then I should be on the 'Categorisation - Check Your Answers' page
    When I click the 'Supplementary Unit' change link
    Then I should be on the check 'Goods Supplementary Unit' page
    And I select continue
    Then I should be on the 'Categorisation - Check Your Answers' page
    And The 'Supplementary Unit' has the value 12345.0432 grams
    When I select continue
    Then I should be on the 'Categorisation complete' with Category2 content page
    When I click on the Go to homepage link
    Then I should be on the 'Home' page
    And I click on the Sign out link
    Then I should be on the 'Signed Out' page