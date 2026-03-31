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
import uk.gov.hmrc.test.ui.specsteps.{CommonSteps, LoginSteps}
import uk.gov.hmrc.test.ui.specsteps.MaintainProfile.{ProfileDetailsSteps, RemovingNIRMSNumberSteps, UpdateNIRMSQuestionCYASteps, UpdateNIRMSQuestionSteps, UpdateUKIMSCYASteps, UpdateUKIMSNumberSteps}
import uk.gov.hmrc.test.ui.specsteps.NewUkims.{NewUKIMSNumberSteps, NewUkimsCYASteps, UkimsNumberChangeSteps}
import uk.gov.hmrc.test.ui.specsteps.ProfileSetup.{ExistingUKIMSNumberSteps, HomepageSteps, NIPHLNumberSteps, NIPHLQuestionSteps, NIRMSNumberSteps, NIRMSQuestionSteps, ProfileSetupCYASteps, ProfileSetupSteps, ProfileSuccessSteps, UKIMSNumberSteps}
import uk.gov.hmrc.test.ui.specsteps.*

@DoNotDiscover
class ProfileSetupAndMaintainSpec extends BaseSpec {

  Feature("Trader Goods Profile - Profile setup and Maintain profile journey") {

    Scenario("As a UKIMS authorised trader, I can setup and maintain Trader Goods Profile") {
      When("I login to TGP with EORI number GB123456789098")
        LoginSteps.loginToTGPEORINumber("GB123456789098")

      Then("I am on the Setting up your profile page")
        ProfileSetupSteps.amOnSettingUpProfilePage()

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the existing UK internal scheme number page")
        ExistingUKIMSNumberSteps.shouldBeOnExistingUKInternalSchemeNumberPage()

      When("I select No for the boolean question")
        CommonSteps.selectBooleanQuestion("No")

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the UK internal scheme number page")
        UKIMSNumberSteps.shouldBeOnUKInternalSchemeNumberPage()

      And("I enter valid value of my UKIMS Number")
        UKIMSNumberSteps.enterValueUKIMSNumber("valid")

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Northern Ireland Retail Movement Scheme page")
        NIRMSQuestionSteps.shouldBeOnNorthernIrelandRetailMovementSchemePage()

      When("I select Yes for the boolean question")
        CommonSteps.selectBooleanQuestion("Yes")

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the What is your NIRMS number? page")
        NIRMSNumberSteps.shouldBeOnWhatNIRMSNumberPage()

      When("I enter valid value of my NIRMS Number")
        NIRMSNumberSteps.enterValueNIRMSNumber("valid")

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Northern Ireland plant health label page")
        NIPHLQuestionSteps.shouldBeOnNorthernIrelandPlantHealthLabelPage()

      When("I select Yes for the boolean question")
        CommonSteps.selectBooleanQuestion("Yes")

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the NIPHL registration number page")
        NIPHLNumberSteps.shouldBeOnNIPHLRegistrationNumberPage()

      When("I enter valid value of my NIPHL Number")
        NIPHLNumberSteps.enterValueNIPHLNumber("valid")

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Check Your Answers page")
        ProfileSetupCYASteps.shouldBeOnCheckAnswersPage()

      When("I click the UKIMS number change link")
        CommonSteps.clickChangeLink("UKIMS number")

      Then("I should be on the check UK internal scheme number page")
        UKIMSNumberSteps.shouldBeOnCheckUKInternalSchemeNumberPage()

      And("The UKIMS Number field should be prepopulated")
        UKIMSNumberSteps.uKIMSNumberFieldShouldBePrepopulated()

      When("I enter different value of my UKIMS Number")
        UKIMSNumberSteps.enterValueUKIMSNumber("different")

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Check Your Answers page")
        ProfileSetupCYASteps.shouldBeOnCheckAnswersPage()

      And("The UKIMS number has the value XIUKIM47699357400020231115081801")
        CommonSteps.hasValue("UKIMS number", "XIUKIM47699357400020231115081801")

      When("I click the NIRMS registered change link")
        CommonSteps.clickChangeLink("NIRMS registered")

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Check Your Answers page")
        ProfileSetupCYASteps.shouldBeOnCheckAnswersPage()

      And("The NIRMS registered has the value Yes")
        CommonSteps.hasValue("NIRMS registered", "Yes")

      When("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Create Profile Success page")
        ProfileSuccessSteps.shouldBeOnCreateProfileSuccessPage()

      And("I click on the Go to homepage link")
        CommonSteps.clickOnLink("Go to homepage")

      Then("I should be on the Home page")
        HomepageSteps.shouldBeOnHomePage()

      When("I click on the Manage your profile link")
        CommonSteps.clickOnLink("Manage your profile")

      Then("I should be on the Profile details page")
        ProfileDetailsSteps.shouldBeOnProfileDetailsPage()

      When("I click the UKIMS number change link")
        CommonSteps.clickChangeLink("UKIMS number")

      Then("I should be on the update UK internal scheme number page")
        UpdateUKIMSNumberSteps.shouldBeOnUpdateUKInternalSchemeNumberPage()

      And("The update UKIMS Number field should be prepopulated")
        UpdateUKIMSNumberSteps.updateUKIMSNumberFieldShouldBePrepopulated()

      When("I update value of my UKIMS Number")
        UpdateUKIMSNumberSteps.updateValueUKIMSNumber()

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the update UKIMS Check your answers page")
        UpdateUKIMSCYASteps.shouldBeOnUpdateUKIMSCheckAnswersPage()

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Profile details page")
        ProfileDetailsSteps.shouldBeOnProfileDetailsPage()

      And("The UKIMS number has the value XIUKIM47699357400020231115081800")
        CommonSteps.hasValue("UKIMS number", "XIUKIM47699357400020231115081800")

      When("I click the NIRMS registered change link")
        CommonSteps.clickChangeLink("NIRMS registered")

      Then("I should be on the update Northern Ireland Retail Movement Scheme page")
        UpdateNIRMSQuestionSteps.shouldBeOnUpdateNorthernIrelandRetailMovementSchemePage()

      When("I select No for the boolean question")
        CommonSteps.selectBooleanQuestion("No")

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Removing NIRMS details page")
        RemovingNIRMSNumberSteps.shouldBeOnRemovingNIRMSDetailsPage()

      When("I select Yes for the boolean question")
        CommonSteps.selectBooleanQuestion("Yes")

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the update NIRMS Question Check your answers page")
        UpdateNIRMSQuestionCYASteps.shouldBeOnUpdateNIRMSQuestionCheckAnswersPage()

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Profile details page")
        ProfileDetailsSteps.shouldBeOnProfileDetailsPage()

      And("The NIRMS registered has the value No")
        CommonSteps.hasValue("NIRMS registered", "No")
    }

    Scenario("As a UKIMS authorised trader, I can change my UKIMS when my EORI changes") {
      When("I login to TGP with EORI number GB123456789555")
        LoginSteps.loginToTGPEORINumber("GB123456789555")

      Then("I am on the UKIMS change page")
        UkimsNumberChangeSteps.amOnUKIMSChangePage()

      And("I select Update UKIMS number")
        UkimsNumberChangeSteps.selectUpdateUKIMSNumber()

      Then("I should be on the New UK internal scheme number page")
        NewUKIMSNumberSteps.shouldBeOnNewUKInternalSchemeNumberPage()

      And("I enter valid value of my UKIMS Number")
        UKIMSNumberSteps.enterValueUKIMSNumber("valid")

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the New Ukims Check Your Answers page")
        NewUkimsCYASteps.shouldBeOnNewUkimsCheckAnswersPage()

      When("I click the UKIMS number change link")
        CommonSteps.clickChangeLink("UKIMS number")

      Then("I should be on the check New UK internal scheme number page")
        NewUKIMSNumberSteps.shouldBeOnCheckNewUKInternalSchemeNumberPage()

      And("The New UKIMS Number field should be prepopulated")
        NewUKIMSNumberSteps.newUKIMSNumberFieldShouldBePrepopulated()

      When("I enter different value of my New UKIMS Number")
        NewUKIMSNumberSteps.enterValueNewUKIMSNumber("different")

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the New Ukims Check Your Answers page")
        NewUkimsCYASteps.shouldBeOnNewUkimsCheckAnswersPage()

      And("The UKIMS number has the value XIUKIM47699357400020231115081801")
        CommonSteps.hasValue("UKIMS number", "XIUKIM47699357400020231115081801")

      When("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Home page")
        HomepageSteps.shouldBeOnHomePage()
    }
  }
}
