@AllPipeline

Feature: Trader Goods Categorisation - Create Record journey

  Scenario:As a returning user in Trader Goods profile I want to create a record
    Given I login to TGP Homepage with EORI number GB123456789123
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
    Then I should be on the 'Goods description' page
    And I select continue
    Then Error message 'Confirm if you want to use your trader reference as the goods description' should be displayed
    When I select the back link
    Then I should be on the 'Goods description' page
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
    When I enter Sweden in the country text field
    Then I should be on the 'commodity code' page
    And I select continue
    Then Error message 'Enter a commodity code' should be displayed
    When I enter invalid format value of Commodity code in the free text field
    Then Error message 'Enter a commodity code in the correct format' should be displayed
    When I enter incorrect value of Commodity code in the free text field
    Then Error message 'Enter a real commodity code' should be displayed
    When I select the back link
    Then I should be on the 'commodity code' page
    When I enter valid value of Commodity code in the free text field
    Then I should be on the 'commodity code result' page
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
    When I click the Goods Description change link
    And I select continue
    Then I should be on the 'Create Record - Check Your Answers' page
    And My 'Goods Description' has the same valid value
    When I click the Country Of Origin change link
    And I select continue
    Then I should be on the 'Create Record - Check Your Answers' page
    And My 'Country Of Origin' has the same value
#  TODO To be tested on real commodity
#    When I click the Commodity Code change link
#    And I select continue
#    Then I should be on the 'Create Record - Check Your Answers' page
#    And My 'Commodity Code' has the same valid value
#    And I select continue
#    Then I should be on the 'Home' page



