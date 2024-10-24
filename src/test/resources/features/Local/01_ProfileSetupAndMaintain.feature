@AllLocal

Feature: Trader Goods Profile setup and Previous movement records journey

  Scenario: As a UKIMS authorised trader I log on to the trader goods profile service with NIRMS and NIPHL
    Given I login to TGP with Invalid details
    Then I should be on the 'There is a Problem' page
    When I login to TGP Profile setup with EORI number GB123456789098
    Then I am on the 'Setting up your profile' page
    And I select continue
    And I should be on the 'UK internal scheme number' page
    When I navigate to the 'Incorrect' page
    Then I should be on the 'Page not found' page
    And I select the back link
    Then I should be on the 'UK internal scheme number' page
    When I click on the I am not UKIMS registered link
    Then I should be on the 'UKIMS kick out' page
    When I select the back link
    Then I should be on the 'UK internal scheme number' page
    And I select continue
    Then Error message 'Enter your UKIMS number' should be displayed
    When I enter incorrect value of my UKIMS Number
    And I select continue
    Then Error message 'Enter your UKIMS number in the correct format' should be displayed
    When I select the back link
    Then I should be on the 'UK internal scheme number' page
    When I enter valid value of my UKIMS Number
    And I select continue
    Then I should be on the 'Northern Ireland Retail Movement Scheme' page
    And I select continue
    Then Error message 'Select yes, if you are Northern Ireland Retail Movement Scheme registered' should be displayed
    When I select the back link
    Then I should be on the 'Northern Ireland Retail Movement Scheme' page
    When I select Yes for the boolean question
    And I select continue
    Then I should be on the 'What is your NIRMS number?' page
    And I select continue
    Then Error message 'Enter your NIRMS number' should be displayed
    When I enter incorrect value of my NIRMS Number
    And I select continue
    Then Error message 'Enter your NIRMS number in the correct format' should be displayed
    When I select the back link
    Then I should be on the 'What is your NIRMS number?' page
    When I enter valid value of my NIRMS Number
    And I select continue
    Then I should be on the 'Northern Ireland plant health label' page
    And I select continue
    Then Error message 'Select if you are NIPHL registered' should be displayed
    When I select Yes for the boolean question
    And I select continue
    Then I should be on the 'NIPHL registration number' page
    And I select continue
    Then Error message 'Enter your NIPHL registration number' should be displayed
    When I enter incorrect value of my NIPHL Number
    And I select continue
    Then Error message 'Enter your NIPHL registration number in the correct format' should be displayed
    And I select the back link
    Then I should be on the 'NIPHL registration number' page
    When I enter valid value of my NIPHL Number
    And I select continue
    Then I should be on the 'Check Your Answers' page
    When I click the UKIMS Number change link
    Then I should be on the check 'UK internal scheme number' page
    And The UKIMS Number field should be prepopulated
    When I enter different value of my UKIMS Number
    And I select continue
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
    Then I should be on the 'Create Profile Success' page
    And I click on the Go to homepage link
    Then I should be on the 'Home' page
    When I click on the View or update your goods records link
    Then I should be on the 'Previous movement records' page
    And I select continue
    Then I should be on the 'Goods profile' page 1 results
    And I select the back link
    Then I should be on the 'Previous movement records' page
    And I select the back link
    Then I should be on the 'Home' page
    And I click on the Sign out link
    Then I should be on the 'Signed Out' page

  Scenario: As a UKIMS authorised trader I log on to the trader goods profile service without NIRMS and with NIPHL
    Given I login to TGP Profile setup with EORI number GB123456789122
    Then I am on the 'Setting up your profile' page
    And I select continue
    And I should be on the 'UK internal scheme number' page
    When I enter valid value of my UKIMS Number
    And I select continue
    Then I should be on the 'Northern Ireland Retail Movement Scheme' page
    When I select No for the boolean question
    And I select continue
    Then I should be on the 'Northern Ireland plant health label' page
    When I select Yes for the boolean question
    And I select continue
    Then I should be on the 'NIPHL registration number' page
    When I enter valid value of my NIPHL Number
    And I select continue
    Then I should be on the 'Check Your Answers' page
    And I select continue
    Then I should be on the 'Create Profile Success' page
    And I click on the Go to homepage link
    Then I should be on the 'Home' page
    And I click on the Sign out link
    Then I should be on the 'Signed Out' page

  Scenario: As a UKIMS authorised trader I log on to the trader goods profile service with NIRMS and without NIPHL
    Given I login to TGP Profile setup with EORI number GB123456789123
    Then I am on the 'Setting up your profile' page
    And I select continue
    And I should be on the 'UK internal scheme number' page
    When I enter valid value of my UKIMS Number
    And I select continue
    Then I should be on the 'Northern Ireland Retail Movement Scheme' page
    When I select Yes for the boolean question
    And I select continue
    Then I should be on the 'What is your NIRMS number?' page
    When I enter valid value of my NIRMS Number
    And I select continue
    Then I should be on the 'Northern Ireland plant health label' page
    When I select No for the boolean question
    And I select continue
    Then I should be on the 'Check Your Answers' page
    And I select continue
    Then I should be on the 'Create Profile Success' page
    And I click on the Go to homepage link
    Then I should be on the 'Home' page
    And I click on the Sign out link
    Then I should be on the 'Signed Out' page

  Scenario: As a UKIMS authorised trader who already has a UKIMS number, I log into TGP and can confirm my UKIMS details
    When I login to TGP Profile setup with EORI number GB000012340002
    And I am on the 'Setting up your profile' page
    And I select continue
    Then I should be on the existing 'UK internal scheme number' page
    When I select continue
    Then Error message 'Select if this is the correct UKIMS number' should be displayed
    When I select the back link
    Then I should be on the existing 'UK internal scheme number' page
    And The existing UKIMS Number should be XIUKIM00001234000220240207140148
    When I select Yes for the boolean question
    And I select continue
    Then I should be on the 'Northern Ireland Retail Movement Scheme' page
    When I select the back link
    And I select No for the boolean question
    And I select continue
    Then I should be on the 'UK internal scheme number' page

  Scenario: As a returning user, I want to update my user profile to reflect changes
    Given I login to TGP Homepage with EORI number GB123456789098
    Then I should be on the 'Home' page
    When I click on the Manage your profile details link
    Then I should be on the 'Profile details' page
    When I click the UKIMS Number change link
    Then I should be on the update 'UK internal scheme number' page
    And The update UKIMS Number field should be prepopulated
    When I enter empty value of my UKIMS Number
    And I select continue
    Then Error message 'Enter your UKIMS number' should be displayed
    When I enter incorrect value of my UKIMS Number
    And I select continue
    Then Error message 'Enter your UKIMS number in the correct format' should be displayed
    When I select the back link
    Then I should be on the update 'UK internal scheme number' page
    When I enter different value of my UKIMS Number
    And I select continue
    Then I should be on the update 'UKIMS Check your answers' page
    And I select continue
    Then I should be on the 'Profile details' page
    And My 'UKIMS Number' has the value XIUKIM47699357400020231115081801
    When I click the NIRMS Question change link
    Then I should be on the update 'Northern Ireland Retail Movement Scheme' page
    When I select No for the boolean question
    And I select continue
    Then I should be on the 'Removing NIRMS details' page
    When I select continue
    Then Error message 'Confirm if you want to remove your NIRMS details' should be displayed
    When I select the back link
    Then I should be on the 'Removing NIRMS details' page
    When I select No for the boolean question
    And I select continue
    And I select continue
    Then I should be on the 'Profile details' page
    And My 'NIRMS Question' has the value Yes
    And My 'NIRMS Number' has the value RMS-GB-123456
    When I click the NIRMS Question change link
    And I select No for the boolean question
    And I select continue
    Then I should be on the 'Removing NIRMS details' page
    When I select Yes for the boolean question
    And I select continue
    Then I should be on the update 'NIRMS Question Check your answers' page
    When I click the NIRMS registered change link
    Then I should be on the update 'Northern Ireland Retail Movement Scheme' check page
    And I select continue
    And I select continue
    Then I should be on the update 'NIRMS Question Check your answers' page
    And My 'NIRMS Question CYA' has the No value
    And I select continue
    Then I should be on the 'Profile details' page
    And My 'NIRMS Question' has the value No
    When I click the NIRMS Question change link
    Then I should be on the update 'Northern Ireland Retail Movement Scheme' page
    When I select Yes for the boolean question
    And I select continue
    Then I should be on the update 'What is your NIRMS number?' page
    When I select continue
    Then Error message 'Enter your NIRMS number' should be displayed
    When I enter incorrect value of my NIRMS Number
    And I select continue
    Then Error message 'Enter your NIRMS number in the correct format' should be displayed
    When I enter valid value of my NIRMS Number
    And I select continue
    Then I should be on the update 'NIRMS number Check your answers' page
    And My 'NIRMS number' has the valid value
    When I click the NIRMS Number change link in the summary list
    Then I should be on the check update 'What is your NIRMS number?' page
    And I enter valid value of my NIRMS Number
    And I select continue
    Then I should be on the update 'NIRMS number Check your answers' page
    And My 'NIRMS number' has the valid value
    And I select continue
    Then I should be on the 'Profile details' page
    And My 'NIRMS Question' has the value Yes
    And My 'NIRMS Number' has the value RMS-GB-123456
    When I click the NIRMS Number change link
    Then I should be on the update 'What is your NIRMS number?' page
    And The update NIRMS Number field should be prepopulated
    When I enter different value of my NIRMS Number
    And I select continue
    And I select continue
    Then My 'NIRMS Number' has the value RMS-GB-654321
    When I click the NIPHL Question change link
    And I select continue
    And I select continue
    Then I should be on the update 'NIPHL registration number Check your answers' page
    And I select continue
    Then I should be on the 'Profile details' page
    And My 'NIPHL Question' has the value Yes
    And My 'NIPHL Number' has the value SN12345
    When I click the NIPHL Question change link
    And I select No for the boolean question
    And I select continue
    Then I should be on the 'Removing NIPHL details' page
    When I select continue
    Then Error message 'Confirm if you want to remove your NIPHL details' should be displayed
    When I select the back link
    Then I should be on the 'Removing NIPHL details' page
    When I select No for the boolean question
    And I select continue
    Then I should be on the update 'NIPHL registration number Check your answers' page
    And I select continue
    Then I should be on the 'Profile details' page
    And My 'NIPHL Question' has the value Yes
    And My 'NIPHL Number' has the value SN12345
    When I click the NIPHL Number change link
    Then I should be on the update 'NIPHL registration number' page
    And The update NIPHL Number field should be prepopulated
    When I enter empty value of my NIPHL Number
    And I select continue
    Then Error message 'Enter your NIPHL registration number' should be displayed
    When I enter incorrect value of my NIPHL Number
    And I select continue
    Then Error message 'Enter your NIPHL registration number in the correct format' should be displayed
    When I select the back link
    Then I should be on the update 'NIPHL registration number' page
    When I enter different value of my NIPHL Number
    And I select continue
    Then I should be on the update 'NIPHL registration number Check your answers' page
    And My 'NIPHL Number CYA' has the different value
    And I select continue
    Then I should be on the 'Profile details' page
    And My 'NIPHL Number' has the value SN54321
    When I click the NIPHL Question change link
    And I select No for the boolean question
    And I select continue
    Then I should be on the 'Removing NIPHL details' page
    When I select Yes for the boolean question
    And I select continue
    Then I should be on the update 'NIPHL Question Check your answers' page
    When I click the NIPHL registered change link
    Then I should be on the update 'Northern Ireland plant health label' check page
    And I select continue
    And I select continue
    Then I should be on the update 'NIPHL Question Check your answers' page
    And My 'NIPHL Question CYA' has the No value
    And I select continue
    Then I should be on the 'Profile details' page
    And My 'NIPHL Question' has the value No
    And I click on the Back to homepage link
    Then I should be on the 'Home' page
    And I click on the Sign out link
    Then I should be on the 'Signed Out' page