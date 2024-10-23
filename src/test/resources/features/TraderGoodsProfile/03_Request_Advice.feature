@AllPipeline

Feature: Trader Goods Profile - Request Advice journey

  Scenario:As a returning user, I can request for HMRC advice
    Given I login to TGP Homepage with EORI number GB123456789085
    When I click on the View or update your goods records link
    Then I should be on the 'Previous movement records' page
    And I select continue
    Then I should be on the 'Goods profile' page 1 results
    When I click on the Change link
    Then I should be on the 'Goods record' page
    And I click on the Ask for advice link
    Then I should be on the 'Asking HMRC for advice' page
    And I select continue
    Then I should be on the 'What is your name?' page
    When I enter valid name and select Continue
    Then I should be on the 'What is your email address?' page
    And I enter valid email and select Continue
    Then I should be on the 'Request Advice - Check Your Answers' page
    When I click the Name change link
    Then I should be on the check 'What is your name?' page
    And The Name field should be prepopulated
    When I enter different name and select Continue
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



