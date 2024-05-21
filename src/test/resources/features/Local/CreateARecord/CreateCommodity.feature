@AllLocal

Feature: Trader Goods Profiles Create Commodity code journey tests

  Background: As a user I want to input commodity code to create a TGP record
    Given I login to TGP Profile setup page with valid enrollments using authority wizard
    And I navigate to the 'commodity code' page
    Then I should be on the 'commodity code' page

  Scenario: I enter a valid commodity code in the commodity code page
    When I enter valid value of Commodity code in the free text field
    And I select continue
#    Then I should be on the 'nextpage' page

  Scenario: I enter an empty commodity code in the commodity code page
    When I enter empty value of Commodity code in the free text field
    And I select continue
    Then Error message 'Enter a commodity code' should be displayed

  Scenario: I enter an incorrect commodity code
    When I enter incorrect value of Commodity code in the free text field
    And I select continue
    Then Error message 'Enter a commodity code in the correct format' should be displayed