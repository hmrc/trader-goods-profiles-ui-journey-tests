@AllPipeline

Feature: Trader Goods Profile - Accreditation journey

  Scenario:As a returning user in Trader Goods profile I want to ask for HMRC advice
    Given I login to TGP Homepage with EORI number GB123456789098
    Then I should be on the 'Home' page
    When I click on the View or update your goods records link
    Then I should be on the 'Goods profile' page




