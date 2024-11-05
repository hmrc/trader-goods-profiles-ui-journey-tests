@AllPipeline

Feature: Trader Goods Profile - Download data journey

  Scenario: As a UKIMS authorised trader, I can download and request my TGP data
   Given I login to TGP Homepage with EORI number GB123456789098
    Then I should be on the 'Home' page
    When I click on the Go to the TGP records file page to download the file link
    Then I should be on the 'File Management' page
    And the Download file link should have the correct url
    When I click on the Go back to homepage link
    Then I should be on the 'Home' page
    When I click on the Get or download your TGP records file link
    Then I should be on the 'File Management' page
    When I click on the Get a new TGP records file link
    Then I should be on the 'Request File' page
    When I select Get TGP records file
    Then I should be on the 'Request Received' page
    When I click on the download TGP data page link
    Then I should be on the 'File Management' page
    When I select the back link
    Then I should be on the 'Request Received' page
    When I click on the Go to TGP records files link
    Then I should be on the 'File Management' page
    When I select the back link
    Then I should be on the 'Request Received' page
    When I click on the Go back to homepage link
    Then I should be on the 'Home' page