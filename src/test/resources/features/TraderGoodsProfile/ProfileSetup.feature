@AllPipeline

Feature: Trader Goods Profile setup journeys

  Scenario: As a UKIMS authorised trader I log on to the trader goods profile service with NIRMS and NIPHL
    Given I login to TGP with Invalid details
    Then I should be on the 'There is a Problem' page
    When I login to TGP Profile setup with EORI number GB123456789123
    Then I should be on the 'Setting up your profile' page and click Continue
    And I should be on the 'UK internal scheme number' page
    And I select continue
    Then Error message 'Enter your UKIMS number' should be displayed
    When I enter incorrect value of my UKIMS Number in the free text field
    Then Error message 'Enter your UKIMS number in the correct format' should be displayed
    When I select the back link
    Then I should be on the 'UK internal scheme number' page
    When I enter valid value of my UKIMS Number in the free text field
    Then I should be on the 'Northern Ireland Retail Movement Scheme' page
    And I select continue
    Then Error message 'Select if you are NIRMS registered' should be displayed
    When I select the back link
    Then I should be on the 'Northern Ireland Retail Movement Scheme' page
    When I select Yes for the boolean question
    And I select continue
    Then I should be on the 'Northern Ireland Retail Movement Scheme number' page
    And I select continue
    Then Error message 'Enter your NIRMS number' should be displayed
    When I enter incorrect value of my NIRMS Number in the free text field
    Then Error message 'Enter your NIRMS number in the correct format' should be displayed
    When I select the back link
    Then I should be on the 'Northern Ireland Retail Movement Scheme number' page
    When I enter valid value of my NIRMS Number in the free text field
    Then I should be on the 'Northern Ireland plant health label' page
    And I select continue
    Then Error message 'Select if you are NIPHL registered' should be displayed
    When I select Yes for the boolean question
    And I select continue
    Then I should be on the 'NIPHL registration number' page
    And I select continue
    Then Error message 'Enter your NIPHL registration number' should be displayed
    When I enter incorrect value of my NIPHL Number in the free text field
    Then Error message 'Enter your NIPHL registration number in the correct format' should be displayed
    And I select the back link
    Then I should be on the 'NIPHL registration number' page
    When I enter valid value of my NIPHL Number in the free text field
    Then I should be on the 'Check Your Answers' page
    When I click the UKIMS Number change link
    Then I should be on the 'UK internal scheme number' page
    And The UKIMS Number field should be prepopulated
    When I enter different value of my UKIMS Number in the free text field
    Then I should be on the 'Check Your Answers' page
    And My 'UKIMS Number' has the different valid value
    When I click the NIRMS Question change link
    And I select continue
    Then I should be on the 'Check Your Answers' page
    And My 'NIRMS Question' has the same value
    When I click the NIRMS Number change link
    And I select continue
    Then I should be on the 'Check Your Answers' page
    And My 'NIRMS Number' has the same valid value
    When I click the NIPHL Question change link
    And I select continue
    Then I should be on the 'Check Your Answers' page
    And My 'NIPHL Question' has the same value
    When I click the NIPHL Number change link
    And I select continue
    Then I should be on the 'Check Your Answers' page
    And My 'NIPHL Number' has the same valid value
    And I select continue
    Then I should be on the 'Home' page
    And I click on the Sign out link

  Scenario: As a UKIMS authorised trader I log on to the trader goods profile service without NIRMS and with NIPHL
      Given I login to TGP Profile setup with EORI number GB123456789123
    Then I should be on the 'Setting up your profile' page and click Continue
    And I should be on the 'UK internal scheme number' page
    When I enter valid value of my UKIMS Number in the free text field
    Then I should be on the 'Northern Ireland Retail Movement Scheme' page
    When I select No for the boolean question
    And I select continue
    Then I should be on the 'Northern Ireland plant health label' page
    When I select Yes for the boolean question
    And I select continue
    Then I should be on the 'NIPHL registration number' page
    When I enter valid value of my NIPHL Number in the free text field
    Then I should be on the 'Check Your Answers' page
    And I select continue
    Then I should be on the 'Home' page
    And I click on the Sign out link

  Scenario: As a UKIMS authorised trader I log on to the trader goods profile service with NIRMS and without NIPHL
    Given I login to TGP Profile setup with EORI number GB123456789123
    Then I should be on the 'Setting up your profile' page and click Continue
    And I should be on the 'UK internal scheme number' page
    When I enter valid value of my UKIMS Number in the free text field
    Then I should be on the 'Northern Ireland Retail Movement Scheme' page
    When I select Yes for the boolean question
    And I select continue
    Then I should be on the 'Northern Ireland Retail Movement Scheme number' page
    When I enter valid value of my NIRMS Number in the free text field
    Then I should be on the 'Northern Ireland plant health label' page
    When I select No for the boolean question
    And I select continue
    Then I should be on the 'Check Your Answers' page
    And I select continue
    Then I should be on the 'Home' page
    And I click on the Sign out link