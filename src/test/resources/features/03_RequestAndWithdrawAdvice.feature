@AllPipeline

Feature: Trader Goods Profile - Request and Withdraw Advice journey

  Scenario:As a returning user, I can request/withdraw HMRC advice
    Given I login to TGP with EORI number GB123456789098
    When I click on the View or update your goods records link
    Then I should be on the 'Previous movement records' page
    And I select continue
    Then I should be on the 'Goods profile' page 1 results
    When I click on the View link
    Then I should be on the 'Goods record' page
    And I click on the Ask for advice link
    Then I should be on the 'Asking HMRC for advice' page
    And I select continue
    Then I should be on the 'What is your name?' page
    When I enter valid name
    And I select continue
    Then I should be on the 'What is your email address?' page
    And I enter valid email
    And I select continue
    Then I should be on the 'Request Advice - Check Your Answers' page
    When I click the Name change link
    Then I should be on the check 'What is your name?' page
    When I enter different name
    And I select continue
    Then I should be on the 'Request Advice - Check Your Answers' page
    And My 'Name' has the different valid value
    When I click the Email change link
    Then I should be on the check 'What is your email address?' page
    And The Email field should be prepopulated
    When I select continue
    Then I should be on the 'Request Advice - Check Your Answers' page
    And My 'Email' has the same value
    When I select continue
    Then I should be on the 'Request Advice success' page
    And I click on the Go back to goods profile link
    Then I should be on the 'Goods profile' page 1 results
    When I search for Locked goods record
    And I click on the View link
    Then I should be on the 'Goods record' page
    When I click on the Withdraw request link
    Then I should be on the 'Withdrawing your request' page
    When I select Yes for the boolean question
    And I select continue
    Then I should be on the 'Can you tell us why you're withdrawing your request for advice' page
    When I enter Valid reason
    And I select continue
    Then I should be on the 'Request for advice withdrawn' page