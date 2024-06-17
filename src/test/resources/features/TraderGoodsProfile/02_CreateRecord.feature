@AllPipeline

Feature: Trader Goods Profile - Create Record journey

  Scenario:As a returning user in Trader Goods profile I want to create a record
    Given I am on the 'Home' page
    And I click on the Sign out link
    Then I should be on the 'Signed Out' page
    When I login to TGP Homepage with EORI number GB123456789123
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
    When I enter CN in the country text field
    Then I should be on the 'commodity code' page
    When I enter 0702000007 value of Commodity code in the free text field
    Then I should be on the "Results for 0702000007" page
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
    And I click on the Sign out link
    Then I should be on the 'Signed Out' page