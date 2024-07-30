@AllLocal

Feature: Trader Goods Profile - View or Update record journey

  Scenario:As a new user, with no historic records, I want to view my goods profile
    Given I am on the 'Home' page with EORI GB123456783010
    When I click on the View or update your goods records link
    Then I should be on the 'Goods profile' page

  Scenario: As a returning user, with historic data, I want to view and update records
    Given I login to TGP Homepage with EORI number GB123456789098
    When I click on the View or update your goods records link
#    Then I should be on the 'Previous movement records' page
#    When I select continue
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
    When I click the Goods record Goods Description change link
    Then I should be on the Goods record Goods Description warning page
    And I select continue
    Then Error message 'Select if you want to change the goods description' should be displayed
    When I select the back link
    Then I should be on the Goods record Goods Description warning page
    And I select Yes for the boolean question
    When I select continue
    Then I should be on the 'Goods description' update page
    When I enter long text in the Goods description text area
    Then Error message 'The goods description must be 512 characters or less' should be displayed
    When I select the back link
    Then I should be on the 'Goods description' update page
    When I enter different in the Goods description text area
    Then I should be on the 'Goods description' CYA page
    And I select continue
    Then I should be on the 'Goods record' page
    When I click on the Go to goods profile link
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
#    When I click on the 'Go to homepage' link
#    Then I should be on the 'Home' page
    And I click on the Sign out link
    Then I should be on the 'Signed Out' page