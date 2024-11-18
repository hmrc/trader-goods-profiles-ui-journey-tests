@AllPipeline

Feature: Trader Goods Profile - Profile setup and Maintain profile journey

  Scenario: As a UKIMS authorised trader, I can setup and maintain Trader Goods Profile
    Given I login to TGP with Invalid details
    Then I should be on the 'There is a Problem' page
    When I login to TGP with EORI number GB123456789098
    Then I am on the 'Setting up your profile' page
    And I select continue
    Then I should be on the existing 'UK internal scheme number' page
    When I select No for the boolean question
    And I select continue
    Then I should be on the 'UK internal scheme number' page
    And I enter valid value of my UKIMS Number
    And I select continue
    Then I should be on the 'Northern Ireland Retail Movement Scheme' page
    When I select Yes for the boolean question
    And I select continue
    Then I should be on the 'What is your NIRMS number?' page
    When I enter valid value of my NIRMS Number
    And I select continue
    Then I should be on the 'Northern Ireland plant health label' page
    When I select Yes for the boolean question
    And I select continue
    Then I should be on the 'NIPHL registration number' page
    When I enter valid value of my NIPHL Number
    And I select continue
    Then I should be on the 'Check Your Answers' page
    When I click the UKIMS number change link
    Then I should be on the check 'UK internal scheme number' page
    And The UKIMS Number field should be prepopulated
    When I enter different value of my UKIMS Number
    And I select continue
    Then I should be on the 'Check Your Answers' page
    And My 'UKIMS Number' has the different valid value
    When I click the NIRMS registered change link
    And I select continue
    Then I should be on the 'Check Your Answers' page
    And My 'NIRMS Question' has the same value
    When I select continue
    Then I should be on the 'Create Profile Success' page
    And I click on the Go to homepage link
    Then I should be on the 'Home' page
    When I click on the Manage your profile details link
    Then I should be on the 'Profile details' page
    When I click the UKIMS number change link
    Then I should be on the update 'UK internal scheme number' page
    And The update UKIMS Number field should be prepopulated
    When I update value of my UKIMS Number
    And I select continue
    Then I should be on the update 'UKIMS Check your answers' page
    And I select continue
    Then I should be on the 'Profile details' page
    And The 'UKIMS number' has the value XIUKIM47699357400020231115081800
    When I click the NIRMS registered change link
    Then I should be on the update 'Northern Ireland Retail Movement Scheme' page
    When I select No for the boolean question
    And I select continue
    Then I should be on the 'Removing NIRMS details' page
    When I select Yes for the boolean question
    And I select continue
    Then I should be on the update 'NIRMS Question Check your answers' page
    And I select continue
    Then I should be on the 'Profile details' page
    And The 'NIRMS registered' has the value No