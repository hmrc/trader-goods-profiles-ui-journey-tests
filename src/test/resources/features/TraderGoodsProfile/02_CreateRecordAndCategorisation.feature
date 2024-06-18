@AllPipeline

Feature: Trader Goods Profile - Create Record And Categorise journey

  Scenario:As a returning user in Trader Goods profile I want to create a record
    Given I login to TGP Homepage with EORI number GB123456789098
    Then I should be on the 'Home' page
    When I click on the Create a new goods record link
    Then I should be on the 'Creating a goods record' page
    And I select continue
    Then I should be on the 'Trader reference' page
    When I enter Unique Trader reference in the text area
    Then I should be on the 'Goods description' page
    When I select No for the Goods boolean question
    And I select continue
    Then I should be on the 'Goods description' page
    When I enter description in the Goods description text area
    Then I should be on the 'Country of origin' page
    When I enter IQ in the country text field
    Then I should be on the 'commodity code' page
    When I enter 9301900000 value of Commodity code in the free text field
    Then I should be on the "Results for 9301900000" page
    When I select Yes for the boolean question
    And I select continue
    Then I should be on the 'Create Record - Check Your Answers' page
    When I click the Trader Reference change link
    Then I should be on the 'Trader reference' page
    And The Trader reference field should be prepopulated
    When I enter different Trader reference in the text area
    Then I should be on the 'Create Record - Check Your Answers' page
    And My 'Trader Reference' has the different valid value
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
    And I select None of the above option
    Then I should be on the 'Categorisation - Check Your Answers' page
    When I click the Category assessment 3 of 6 change link
    Then I should be on the 'Category assessment 3' page
    And I select continue
    Then I should be on the 'Categorisation - Check Your Answers' page
    When I click the Category assessment 5 of 6 change link
    Then I should be on the 'Category assessment 5' page
    And I select None of the above option
    Then I should be on the 'Categorisation - Check Your Answers' page
    And The 'Category assessment 5 of 6' has the value None selected
    When I select continue
    Then I should be on the 'Categorisation Result' page
    And I should have Category 1 goods and not be eligible for SPIMM
    And I select the back link
    When I click the Category assessment 5 of 6 change link
    Then I should be on the 'Category assessment 5' page
    And I select First option
    Then I should be on the 'Category assessment 6' page
    And I select First option
    Then I should be on the 'Categorisation - Check Your Answers' page
    And I select continue
    Then I should be on the 'Categorisation Result' page
    And I should have standard goods and be eligible for SPIMM