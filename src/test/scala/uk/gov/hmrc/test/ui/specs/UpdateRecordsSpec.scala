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

package uk.gov.hmrc.test.ui.specs

import org.scalatest.DoNotDiscover
import uk.gov.hmrc.test.ui.specsteps.Categorisation.GoodsSupplementaryUnitSteps
import uk.gov.hmrc.test.ui.specsteps.{CommonSteps, LoginSteps}
import uk.gov.hmrc.test.ui.specsteps.UpdateGoods.{GoodsProfileSteps, GoodsRecordSteps, RemovingRecordSteps, UpdateCommodityCodeSteps, UpdateCountryOfOriginSteps, UpdateGoodsDescriptionSteps, UpdateSupplementaryUnitSteps, UpdateTraderReferenceSteps}
import uk.gov.hmrc.test.ui.specsteps.*

@DoNotDiscover
class UpdateRecordsSpec extends BaseSpec {

  Feature("Trader Goods Profile - View or Update record journey") {

    Scenario("As a returning user, with historic data, View and update records") {
      Given("I login to TGP with EORI number GB123456789098")
        LoginSteps.loginToTGPEORINumber("GB123456789098")

      When("I click on the Manage your goods records link")
        CommonSteps.clickOnLink("Manage your goods records")

      Then("I should be on the Goods profile page 1 results")
        GoodsProfileSteps.shouldBeOnGoodsProfilePageResults("1")

      When("I click on the View link")
        CommonSteps.clickOnLink("View")

      Then("I should be on the Goods record page")
        GoodsRecordSteps.shouldBeOnGoodsRecordPage()

      When("I click the Product reference change link")
        CommonSteps.clickChangeLink("Product reference")

      Then("I should be on the Product reference update page")
        UpdateTraderReferenceSteps.shouldBeOnProductReferenceUpdatePage()

      And("I enter Unique Product reference update")
        UpdateTraderReferenceSteps.enterProductReferenceUpdate("Unique")

      When("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Product reference update CYA page")
        UpdateTraderReferenceSteps.shouldBeOnProductReferenceUpdateCYAPage()

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Goods record page")
        GoodsRecordSteps.shouldBeOnGoodsRecordPage()

      When("I click the Goods description change link")
        CommonSteps.clickChangeLink("Goods description")

      Then("I should be on the Goods description update page")
        UpdateGoodsDescriptionSteps.shouldBeOnGoodsDescriptionUpdatePage()

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Goods description CYA page")
        UpdateGoodsDescriptionSteps.shouldBeOnGoodsDescriptionCYAPage()

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Goods record page")
        GoodsRecordSteps.shouldBeOnGoodsRecordPage()

      When("I click the SupplementaryUnit change link")
        CommonSteps.clickChangeLink("SupplementaryUnit")

      Then("I should be on the Goods Supplementary Unit update page")
        UpdateSupplementaryUnitSteps.shouldBeOnGoodsSupplementaryUnitUpdatePage()

      When("I enter 54321.4302 in Goods Supplementary Unit")
        GoodsSupplementaryUnitSteps.enterInGoodsSupplementaryUnit("54321.4302")

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the update Supplementary Unit CYA page")
        UpdateSupplementaryUnitSteps.shouldBeOnUpdateSupplementaryUnitCYAPage()

      And("The SupplementaryUnit has the value 54321.4302 squares")
        CommonSteps.hasValue("SupplementaryUnit", "54321.4302 squares")

      And("I select continue")
        CommonSteps.selectContinue()

      When("I click the HasSupplementaryUnit change link")
        CommonSteps.clickChangeLink("HasSupplementaryUnit")

      Then("I should be on the Supplementary Unit update page")
        UpdateSupplementaryUnitSteps.shouldBeOnSupplementaryUnitUpdatePage()

      When("I select No for the boolean question")
        CommonSteps.selectBooleanQuestion("No")

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the update Supplementary Unit CYA page")
        UpdateSupplementaryUnitSteps.shouldBeOnUpdateSupplementaryUnitCYAPage()

      And("The HasSupplementaryUnit has the value No")
        CommonSteps.hasValue("HasSupplementaryUnit", "No")

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Goods record page")
        GoodsRecordSteps.shouldBeOnGoodsRecordPage()

      When("I click the Commodity code change link")
        CommonSteps.clickChangeLink("Commodity code")

      Then("I should be on the Goods record Commodity Code warning page")
        UpdateCommodityCodeSteps.shouldBeOnGoodsRecordCommodityCodeWarningPage()

      And("I select Yes for the boolean question")
        CommonSteps.selectBooleanQuestion("Yes")

      When("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the commodity code update page")
        UpdateCommodityCodeSteps.shouldBeOnCommodityCodeUpdatePage()

      And("I enter 1704909912 in the Commodity code text field")
        UpdateCommodityCodeSteps.enterInCommodityCodeTextField("1704909912")

      Then("I should be on the update commodity code result page")
        UpdateCommodityCodeSteps.shouldBeOnUpdateCommodityCodeResultPage()

      And("I select Yes for the boolean question")
        CommonSteps.selectBooleanQuestion("Yes")

      When("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Goods record page")
        GoodsRecordSteps.shouldBeOnGoodsRecordPage()

      When("I click the Country of origin change link")
        CommonSteps.clickChangeLink("Country of origin")

      Then("I should be on the Goods record Country Of Origin warning page")
        UpdateCountryOfOriginSteps.shouldBeOnGoodsRecordCountryOriginWarningPage()

      And("I select Yes for the boolean question")
        CommonSteps.selectBooleanQuestion("Yes")

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Country of origin update page")
        UpdateCountryOfOriginSteps.shouldBeOnCountryOriginUpdatePage()

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Country of origin CYA page")
        UpdateCountryOfOriginSteps.shouldBeOnCountryOriginCYAPage()

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Goods record page")
        GoodsRecordSteps.shouldBeOnGoodsRecordPage()

      When("I click on the Go back to goods profile link")
        CommonSteps.clickOnLink("Go back to goods profile")

      Then("I should be on the Goods profile page 1 results")
        GoodsProfileSteps.shouldBeOnGoodsProfilePageResults("1")

      When("I click on the Remove link")
        CommonSteps.clickOnLink("Remove")

      Then("I should be on the Removing goods record page")
        RemovingRecordSteps.shouldBeOnRemovingGoodsRecordPage()

      When("I select Yes for the boolean question")
        CommonSteps.selectBooleanQuestion("Yes")

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Goods profile page 1 results")
        GoodsProfileSteps.shouldBeOnGoodsProfilePageResults("1")
    }
  }
}
