@AllTest

Feature: Trader Goods Profile setup - CYA page

# UKIMS Number
  Scenario: I should see my prepopulated UKIMS Number after navigating from the CYA page
    Given I am on the 'Check Your Answers' page without a NIRMS or NIPHL number
    And I click the UKIMS Number change link
    Then I should be on the 'UK internal scheme number' page
    And The UKIMS Number field should be prepopulated

  Scenario: I do not change the UKIMS Number
    Given I am on the 'Check Your Answers' page without a NIRMS or NIPHL number
    And I click the UKIMS Number change link
    And I select continue
    Then I should be on the 'Check Your Answers' page without a NIRMS or NIPHL number
    And My 'UKIMS Number' has the same valid value

  Scenario: I enter a different valid UKIMS Number
    Given I am on the 'Check Your Answers' page without a NIRMS or NIPHL number
    And I click the UKIMS Number change link
    When I enter different value of my UKIMS Number in the free text field
    And I select continue
    Then I should be on the 'Check Your Answers' page without a NIRMS or NIPHL number
    And My 'UKIMS Number' has the different valid value

# NIRMS Question
  Scenario: I should see my prepopulated NIRMS Question after navigating from the CYA page
    Given I am on the 'Check Your Answers' page with a NIRMS and without a NIPHL number
    And I click the NIRMS Question change link
    Then I should be on the 'Northern Ireland Retail Movement Scheme' page
    And The radio button field should be prepopulated

  Scenario: I do not change my answer to the NIRMS question
    Given I am on the 'Check Your Answers' page with a NIRMS and without a NIPHL number
    And I click the NIRMS Question change link
    And I select continue
    Then I should be on the 'Check Your Answers' page with a NIRMS and without a NIPHL number
    And My 'NIRMS Question' has the same value

  Scenario: I change my answer to the NIRMS question
    Given I am on the 'Check Your Answers' page with a NIRMS and without a NIPHL number
    And I click the NIRMS Question change link
    When I select No for the boolean question
    And I select continue
    Then I should be on the 'Check Your Answers' page without a NIRMS or NIPHL number
    And My 'NIRMS Question' has the different value

# NIRMS Number
  Scenario: I should see my prepopulated NIRMS Number after navigating from the CYA page
    Given I am on the 'Check Your Answers' page with a NIRMS and without a NIPHL number
    And I click the NIRMS Number change link
    Then I should be on the 'Northern Ireland Retail Movement Scheme number' page
    And The NIRMS Number field should be prepopulated

  Scenario: I do not change the NIRMS Number
    Given I am on the 'Check Your Answers' page with a NIRMS and without a NIPHL number
    And I click the NIRMS Number change link
    And I select continue
    Then I should be on the 'Check Your Answers' page with a NIRMS and without a NIPHL number
    And My 'NIRMS Number' has the same valid value

  Scenario: I enter a different valid NIRMS Number
    Given I am on the 'Check Your Answers' page with a NIRMS and without a NIPHL number
    And I click the NIRMS Number change link
    When I enter different value of my NIRMS Number in the free text field
    And I select continue
    Then I should be on the 'Check Your Answers' page with a NIRMS and without a NIPHL number
    And My 'NIRMS Number' has the different valid value

# NIPHL Question
  Scenario: I should see my prepopulated NIPHL Question answer after navigating from the CYA page
    Given I am on the 'Check Your Answers' page without a NIRMS and with a NIPHL number
    And I click the NIPHL Question change link
    Then I should be on the 'Northern Ireland plant health label' page
    And The radio button field should be prepopulated

  Scenario: I do not change my answer to the NIPHL question
    Given I am on the 'Check Your Answers' page without a NIRMS and with a NIPHL number
    And I click the NIPHL Question change link
    And I select continue
    Then I should be on the 'Check Your Answers' page without a NIRMS and with a NIPHL number
    And My 'NIPHL Question' has the same value

  Scenario: I change my answer to the NIPHL question
    Given I am on the 'Check Your Answers' page without a NIRMS and with a NIPHL number
    And I click the NIPHL Question change link
    When I select No for the boolean question
    And I select continue
    Then I should be on the 'Check Your Answers' page without a NIRMS or NIPHL number
    And My 'NIPHL Question' has the different value

#    NIPHL Number
  Scenario: I should see my prepopulated NIPHL Number after navigating from the CYA page
    Given I am on the 'Check Your Answers' page without a NIRMS and with a NIPHL number
    And I click the NIPHL Number change link
    Then I should be on the 'NIPHL registration number' page
    And The NIPHL Number field should be prepopulated

  Scenario: I do not change the NIPHL Number
    Given I am on the 'Check Your Answers' page without a NIRMS and with a NIPHL number
    And I click the NIPHL Number change link
    And I select continue
    Then I should be on the 'Check Your Answers' page without a NIRMS and with a NIPHL number
    And My 'NIPHL Number' has the same valid value

  Scenario: I enter a different valid NIPHL Number
    Given I am on the 'Check Your Answers' page without a NIRMS and with a NIPHL number
    And I click the NIPHL Number change link
    When I enter different value of my NIPHL Number in the free text field
    And I select continue
    Then I should be on the 'Check Your Answers' page without a NIRMS and with a NIPHL number
    And My 'NIPHL Number' has the different valid value