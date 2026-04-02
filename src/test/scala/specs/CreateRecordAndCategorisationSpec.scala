/*
 * Copyright 2025 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.ui.specs

import org.scalatest.DoNotDiscover
import uk.gov.hmrc.ui.steps._

@DoNotDiscover
class CreateRecordAndCategorisationSpec extends BaseSpec {

  Feature("Trader Goods Profile - Create Record and Categorisation journeys") {

    Scenario("As a returning user, I want to create a record and categorise Standard goods, Category-1 goods and Category-2(longer commodity and supplementary unit)") {
      Given("I login to TGP with EORI number GB123456789098")
        LoginSteps.loginToTGPEORINumber("GB123456789098")

      When("I click on the Create a new goods record link")
        CommonSteps.clickOnLink("Create a new goods record")

      Then("I should be on the Creating a goods record page")
        CreatingGoodsRecordSteps.shouldBeOnCreatingGoodsRecordPage()

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Product reference page")
        TraderReferenceSteps.shouldBeOnProductReferencePage()

      When("I enter unique Product reference")
        TraderReferenceSteps.enterProductReference("unique")

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Goods description page")
        GoodsDescriptionSteps.shouldBeOnGoodsDescriptionPage()

      When("I enter description in Goods description")
        GoodsDescriptionSteps.enterInGoodsDescription("description")

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Country of origin page")
        CountryOfOriginSteps.shouldBeOnCountryOriginPage()

      When("I enter Germany in country")
        CountryOfOriginSteps.enterInCountry("Germany")

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the commodity code page")
        CreateCommodityCodeSteps.shouldBeOnCommodityCodePage()

      When("I enter 170490 Commodity code")
        CreateCommodityCodeSteps.enterCommodityCode("170490")

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Results for the commodity code 170490 page")
        CommodityCodeResultSteps.shouldBeOnPage("Results for the commodity code 170490")

      When("I select Yes for the boolean question")
        CommonSteps.selectBooleanQuestion("Yes")

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Create Record - Check Your Answers page")
        CreateRecordCYASteps.shouldBeOnCreateRecordCheckAnswersPage()

      When("I click the Product reference change link")
        CommonSteps.clickChangeLink("Product reference")

      Then("I should be on the check Product reference page")
        TraderReferenceSteps.shouldBeOnCheckProductReferencePage()

      And("I enter different Product reference")
        TraderReferenceSteps.enterProductReference("different")

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Create Record - Check Your Answers page")
        CreateRecordCYASteps.shouldBeOnCreateRecordCheckAnswersPage()

      When("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Create record success page")
        CreateRecordSuccessSteps.shouldBeOnCreateRecordSuccessPage()

      And("I click on the Categorise goods now link")
        CommonSteps.clickOnLink("Categorise goods now")

      Then("I should be on the Categorisation Information page")
        CategorisationInformationSteps.shouldBeOnCategorisationInformationPage()

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Category assessment 1 page")
        CategorisationQuestionSteps.shouldBeOnCategoryAssessmentPage(" 1")

      When("I check none of the above for the checkbox question")
        CommonSteps.checkNoneAboveCheckboxQuestion()

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Categorisation Check your category assessment answers for 170490 page")
        CategorisationCYASteps.shouldBeOnCategorisationPage("Check your category assessment answers for 170490")

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Categorisation complete with Category1 content page")
        CategorisationCompleteSteps.shouldBeOnCategorisationCompletePage("Category1 content")

      And("I click on the Go back to goods record link")
        CommonSteps.clickOnLink("Go back to goods record")

      Then("I should be on the Goods record page")
        GoodsRecordSteps.shouldBeOnGoodsRecordPage()

      When("I click the Category change link")
        CommonSteps.clickChangeLink("Category")

      Then("I should be on the Categorisation Information page")
        CategorisationInformationSteps.shouldBeOnCategorisationInformationPage()

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Category assessment 1 page")
        CategorisationQuestionSteps.shouldBeOnCategoryAssessmentPage(" 1")

      When("I check the first box of the checkbox question")
        CommonSteps.checkFirstBoxCheckboxQuestion()

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Category assessment 2 page")
        CategorisationQuestionSteps.shouldBeOnCategoryAssessmentPage(" 2")

      When("I check the first box of the checkbox question")
        CommonSteps.checkFirstBoxCheckboxQuestion()

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Category assessment 3 page")
        CategorisationQuestionSteps.shouldBeOnCategoryAssessmentPage(" 3")

      When("I check the first box of the checkbox question")
        CommonSteps.checkFirstBoxCheckboxQuestion()

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Category assessment 4 page")
        CategorisationQuestionSteps.shouldBeOnCategoryAssessmentPage(" 4")

      When("I check the first box of the checkbox question")
        CommonSteps.checkFirstBoxCheckboxQuestion()

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Category assessment 5 page")
        CategorisationQuestionSteps.shouldBeOnCategoryAssessmentPage(" 5")

      When("I check the first box of the checkbox question")
        CommonSteps.checkFirstBoxCheckboxQuestion()

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Category assessment 6 page")
        CategorisationQuestionSteps.shouldBeOnCategoryAssessmentPage(" 6")

      When("I check the first box of the checkbox question")
        CommonSteps.checkFirstBoxCheckboxQuestion()

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Category assessment 7 page")
        CategorisationQuestionSteps.shouldBeOnCategoryAssessmentPage(" 7")

      When("I check the first box of the checkbox question")
        CommonSteps.checkFirstBoxCheckboxQuestion()

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Categorisation Check your category assessment answers for 170490 page")
        CategorisationCYASteps.shouldBeOnCategorisationPage("Check your category assessment answers for 170490")

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Categorisation complete with standard content page")
        CategorisationCompleteSteps.shouldBeOnCategorisationCompletePage("standard content")

      And("I click on the Go back to goods record link")
        CommonSteps.clickOnLink("Go back to goods record")

      Then("I should be on the Goods record page")
        GoodsRecordSteps.shouldBeOnGoodsRecordPage()

      When("I click the Category change link")
        CommonSteps.clickChangeLink("Category")

      Then("I should be on the Categorisation Information page")
        CategorisationInformationSteps.shouldBeOnCategorisationInformationPage()

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Category assessment 1 page")
        CategorisationQuestionSteps.shouldBeOnCategoryAssessmentPage(" 1")

      When("I check the first box of the checkbox question")
        CommonSteps.checkFirstBoxCheckboxQuestion()

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Category assessment 2 page")
        CategorisationQuestionSteps.shouldBeOnCategoryAssessmentPage(" 2")

      When("I check the first box of the checkbox question")
        CommonSteps.checkFirstBoxCheckboxQuestion()

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Category assessment 3 page")
        CategorisationQuestionSteps.shouldBeOnCategoryAssessmentPage(" 3")

      And("I check none of the above for the checkbox question")
        CommonSteps.checkNoneAboveCheckboxQuestion()

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Longer commodity code page")
        LongerCommodityCodeSteps.shouldBeOnLongerCommodityCodePage()

      And("I enter 9912 Longer Commodity code")
        LongerCommodityCodeSteps.enterLongerCommodityCode("9912")

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Longer Commodity Results for the commodity code 1704909912 page")
        LongerCommodityCodeResultSteps.shouldBeOnLongerCommodityPage("Results for the commodity code 1704909912")

      When("I select Yes for the boolean question")
        CommonSteps.selectBooleanQuestion("Yes")

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Supplementary Unit page")
        SupplementaryUnitSteps.shouldBeOnSupplementaryUnitPage()

      When("I select Yes for the boolean question")
        CommonSteps.selectBooleanQuestion("Yes")

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Goods Supplementary Unit page")
        GoodsSupplementaryUnitSteps.shouldBeOnGoodsSupplementaryUnitPage()

      And("I enter 12345.0432 in Goods Supplementary Unit")
        GoodsSupplementaryUnitSteps.enterInGoodsSupplementaryUnit("12345.0432")

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Categorisation Check your category assessment answers for 1704909912 page")
        CategorisationCYASteps.shouldBeOnCategorisationPage("Check your category assessment answers for 1704909912")

      When("I click the Category assessment 3 change link")
        CommonSteps.clickChangeLink("Category assessment 3")

      Then("I should be on the check Category assessment 3 page for Longer Commodity code")
        CategorisationQuestionSteps.shouldBeOnCheckCategoryAssessmentPageLongerCommodityCode(" 3")

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Categorisation Check your category assessment answers for 1704909912 page")
        CategorisationCYASteps.shouldBeOnCategorisationPage("Check your category assessment answers for 1704909912")

      When("I click the SupplementaryUnit change link")
        CommonSteps.clickChangeLink("SupplementaryUnit")

      Then("I should be on the check Goods Supplementary Unit page")
        GoodsSupplementaryUnitSteps.shouldBeOnCheckGoodsSupplementaryUnitPage()

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Categorisation Check your category assessment answers for 1704909912 page")
        CategorisationCYASteps.shouldBeOnCategorisationPage("Check your category assessment answers for 1704909912")

      And("The SupplementaryUnit has the value 12345.0432 litres")
        CommonSteps.hasValue("SupplementaryUnit", "12345.0432 litres")

      When("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Categorisation complete with Category2 content page")
        CategorisationCompleteSteps.shouldBeOnCategorisationCompletePage("Category2 content")
    }
  }
}
