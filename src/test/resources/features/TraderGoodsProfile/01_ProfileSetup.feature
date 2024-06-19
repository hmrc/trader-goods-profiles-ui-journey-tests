@AllPipeline

Feature: Trader Goods Profile - Profile setup journeys

  Scenario: As a UKIMS authorised trader I log on to the trader goods profile service with NIRMS and NIPHL
    Given I login to TGP Profile setup with EORI number GB123456789098
    Then I should be on the 'Setting up your profile' page and click Continue
    And I should be on the 'UK internal scheme number' page
    When I click on the I am not UKIMS registered link
    Then I should be on the 'UKIMS kick out' page
    When I select the back link
    Then I should be on the 'UK internal scheme number' page
    When I enter valid value of my UKIMS Number in the free text field
    Then I should be on the 'Northern Ireland Retail Movement Scheme' page
    When I select No for the boolean question
    And I select continue
    Then I should be on the 'Northern Ireland plant health label' page
    When I select the back link
    Then I should be on the 'Northern Ireland Retail Movement Scheme' page
    When I select Yes for the boolean question
    And I select continue
    Then I should be on the 'Northern Ireland Retail Movement Scheme number' page
    When I enter valid value of my NIRMS Number in the free text field
    Then I should be on the 'Northern Ireland plant health label' page
    When I select No for the boolean question
    And I select continue
    Then I should be on the 'Check Your Answers' page
#    TODO - enable the below steps when NIPHL format validation updated
#    When I select the back link
#    Then I should be on the 'Northern Ireland plant health label' page
#    When I select Yes for the boolean question
#    And I select continue
#    Then I should be on the 'NIPHL registration number' page
#    When I enter valid value of my NIPHL Number in the free text field
#    Then I should be on the 'Check Your Answers' page
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
    And I select continue
    Then I should be on the 'Home' page
    And I click on the Sign out link
    Then I should be on the 'Signed Out' page