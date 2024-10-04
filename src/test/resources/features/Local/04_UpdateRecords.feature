@AllLocal

Feature: Trader Goods Profile - View or Update record journey

  Scenario: As a returning user, with historic data, I want to view and update records
    Given I login to TGP Homepage with EORI number GB123456789088
    When I click on the View or update your goods records link
    Then I should be on the 'Previous movement records' page
    And I select continue
    Then I should be on the 'Goods profile' page 1 results
    When I click on the Change link
    Then I should be on the 'Goods record' page
    When I click the Goods record Trader Reference change link
    Then I should be on the 'Trader reference' update page
    When I enter long Trader reference in the text area
    Then Error message 'Trader reference must be 512 characters or less' should be displayed
    When I enter Unique Trader reference in update text area
    Then I should be on the 'Trader reference' update CYA page
    And I select continue
    Then I should be on the 'Goods record' page
    When I click on the Back to goods profile link
    Then I should be on the 'Goods profile' page 1 results
    And I select the back link
    Then I should be on the 'Goods record' page
    When I click the Goods record Goods Description change link
    Then I should be on the 'Goods description' update page
    When I enter long text in the Goods description text area
    Then Error message 'The goods description must be 512 characters or less' should be displayed
    When I select the back link
    Then I should be on the 'Goods description' update page
    When I enter different in the Goods description text area
    Then I should be on the 'Goods description' CYA page
    And I select continue
    Then I should be on the 'Goods record' page
    When I click the Goods record 'Supplementary Unit Question' change link
    Then I should be on the 'Supplementary Unit' update page
    When I select Yes for the boolean question
    And I select continue
    Then I should be on the 'Goods Supplementary Unit' update page
    When I select continue
    Then Error message 'Enter the goods supplementary unit' should be displayed
    When I select the back link
    Then I should be on the 'Goods Supplementary Unit' update page
    When I enter invalid format value of Goods Supplementary Unit
    Then Error message 'Enter a supplementary unit in the correct format' should be displayed
    When I enter 54321.4302 value of Goods Supplementary Unit
    Then I should be on the update 'Supplementary Unit' CYA page
    And My 'Supplementary Unit with question' has the updated value 54321.4302 grams
    And I select continue
    When I click the Goods record 'Supplementary Unit Question' change link
    Then I should be on the 'Supplementary Unit' update page
    When I select No for the boolean question
    And I select continue
    Then I should be on the update 'Supplementary Unit' CYA page
    And My 'Supplementary Unit' has the updated value No
    And I select continue
    Then I should be on the 'Goods record' page
    When I click the Goods record Country Of Origin change link
    Then I should be on the Goods record Country Of Origin warning page
    And I select Yes for the boolean question
    When I select continue
    Then I should be on the 'Country of origin' update page
    And I select continue
    Then I should be on the 'Country of origin' CYA page
    And I select continue
    Then I should be on the 'Goods record' page
    When I click on the Go back to goods profile link
    Then I should be on the 'Goods profile' page 1 results
    When I click on the Remove link
    Then I should be on the 'Removing goods record' page
    And I select continue
    Then Error message 'Select yes if you want to remove this goods record' should be displayed
    When I select No for the boolean question
    And I select continue
    Then I should be on the 'Goods profile' page 1 results
    When I click on the Remove link
    And I select Yes for the boolean question
    And I select continue
    Then I should be on the 'Goods profile' page 1 results
    And I click on the Sign out link
    Then I should be on the 'Signed Out' page

  Scenario: As a returning user, I want to create a goods record and begin editing the record and categorising from the goods profile
    Given I am on the 'Home' page with EORI GB999000000009
    When I click on the Create a new goods record link
    And I select continue
    Then I enter unique Trader reference in the text area
    Then I should be on the 'Goods description' page
    When I enter description in the Goods description text area
    And I enter United Kingdom in the country text field
    When I enter 1601001011 value of Commodity code in the free text field
    Then I select Yes for the boolean question
    And I select continue
    Then I should be on the 'Create Record - Check Your Answers' page
    When I select continue
    And I click on the Go back to goods profile link
    Then I should be on the 'Goods profile' page 1 results
    When I click on the Change link
    Then I should be on the 'Goods record' page
    When I click the Goods record Country Of Origin change link
    Then I should be on the 'Country of origin' update page
    And I select continue
    Then I should be on the 'Country of origin' CYA page
    And I select continue
    Then I should be on the 'Goods record' page
    When I click the Goods record Commodity Code change link
    Then I should be on the 'commodity code' update page
    And I select continue
    And I select Yes for the boolean question
    And I select continue
    Then I should be on the update 'commodity code' CYA page
    And I select continue
    Then I should be on the 'Goods record' page
    When I click on the Categorise this good link
    Then I should be on the 'Categorisation Information' page
    And I select the back link
    Then I should be on the 'Goods record' page
