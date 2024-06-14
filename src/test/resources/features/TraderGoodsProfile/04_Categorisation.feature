@AllPipeline

Feature: Trader Goods Categorisation - Categorisation journey

  Scenario:As a user, I want to categorise goods using EORI-GB123456789098, Country-IQ and Commodity-9301900000
    Given I am on the 'Create record success' page
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


