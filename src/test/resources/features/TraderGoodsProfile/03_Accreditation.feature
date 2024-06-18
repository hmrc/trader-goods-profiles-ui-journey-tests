@AllPipeline

Feature: Trader Goods Profile - Accreditation journey

  Scenario:As a returning user in Trader Goods profile I want to ask for HMRC advice
    Given I login to TGP Homepage with EORI number GB123456789098
    Then I should be on the 'Home' page
    And I click on the Ask for an opinion from HMRC if a commodity code is correct link
    Then I should be on the 'Asking HMRC for advice' page
    And I select continue
    Then I should be on the 'What is your name?' page
    When I enter valid name in the free text field
    Then I should be on the 'What is your email address?' page
    When I enter valid email in the free text field
    Then I should be on the 'Accreditation - Check Your Answers' page
    When I click the Name change link
    Then I should be on the 'What is your name?' page
    And The Name field should be prepopulated
    When I enter different name in the free text field
    Then I should be on the 'Accreditation - Check Your Answers' page
    And My 'Name' has the different valid value
    When I click the Email change link
    Then I should be on the 'What is your email address?' page
    And The Email field should be prepopulated
    And I select continue
    Then I should be on the 'Accreditation - Check Your Answers' page
    And My 'Email' has the same value
    When I select continue
    Then I should be on the 'Accreditation success' page



