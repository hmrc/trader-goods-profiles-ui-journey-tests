@AllPipeline

Feature: Trader Goods Profile setup journeys

  Scenario: As a UKIMS authorised trader I log on to the trader goods profile service with NIRMS and NIPHL
    Given I login to TGP Profile setup page with valid enrollments using authority wizard
    When I select continue
    Then I should be on the 'UK internal scheme number' page
    When I enter valid value of my UKIMS Number in the free text field
    And I select continue
    Then I should be on the 'Northern Ireland Retail Movement Scheme' page
    When I select Yes for the boolean question
    And I select continue
    Then I should be on the 'Northern Ireland Retail Movement Scheme number' page
    When I enter valid value of my NIRMS Number in the free text field
    And I select continue
    Then I should be on the 'Northern Ireland plant health label' page
    When I select Yes for the boolean question
    And I select continue
    Then I should be on the 'NIPHL registration number' page
    When I enter valid value of my NIPHL Number in the free text field
    And I select continue
    Then I should be on the 'Check Your Answers' page with a NIRMS and NIPHL number
    When I select continue
    Then I should be on the 'Home' page

  Scenario: As a UKIMS authorised trader I log on to the trader goods profile service without NIRMS and with NIPHL
    Given I login to TGP Profile setup page with valid enrollments using authority wizard
    When I select continue
    Then I should be on the 'UK internal scheme number' page
    When I enter valid value of my UKIMS Number in the free text field
    And I select continue
    Then I should be on the 'Northern Ireland Retail Movement Scheme' page
    When I select No for the boolean question
    And I select continue
    Then I should be on the 'Northern Ireland plant health label' page
    When I select Yes for the boolean question
    And I select continue
    Then I should be on the 'NIPHL registration number' page
    When I enter valid value of my NIPHL Number in the free text field
    And I select continue
    Then I should be on the 'Check Your Answers' page without a NIRMS and with a NIPHL number
    When I select continue
    Then I should be on the 'Home' page

  Scenario: As a UKIMS authorised trader I log on to the trader goods profile service with NIRMS and without NIPHL
    Given I login to TGP Profile setup page with valid enrollments using authority wizard
    When I select continue
    Then I should be on the 'UK internal scheme number' page
    When I enter valid value of my UKIMS Number in the free text field
    And I select continue
    Then I should be on the 'Northern Ireland Retail Movement Scheme' page
    When I select Yes for the boolean question
    And I select continue
    Then I should be on the 'Northern Ireland Retail Movement Scheme number' page
    When I enter valid value of my NIRMS Number in the free text field
    And I select continue
    Then I should be on the 'Northern Ireland plant health label' page
    When I select No for the boolean question
    And I select continue
    Then I should be on the 'Check Your Answers' page with a NIRMS and without a NIPHL number
    When I select continue
    Then I should be on the 'Home' page

  Scenario: As a UKIMS authorised trader I log on to the trader goods profile service without NIRMS and NIPHL
    Given I login to TGP Profile setup page with valid enrollments using authority wizard
    When I select continue
    Then I should be on the 'UK internal scheme number' page
    When I enter valid value of my UKIMS Number in the free text field
    And I select continue
    Then I should be on the 'Northern Ireland Retail Movement Scheme' page
    When I select No for the boolean question
    And I select continue
    Then I should be on the 'Northern Ireland plant health label' page
    When I select No for the boolean question
    And I select continue
    Then I should be on the 'Check Your Answers' page without a NIRMS or NIPHL number
    When I select continue
    Then I should be on the 'Home' page