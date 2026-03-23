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
class RequestAndWithdrawAdviceSpec extends BaseSpec {

  Feature("Trader Goods Profile - Request and Withdraw Advice journey") {

    Scenario("As a returning user, I can request/withdraw HMRC advice") {
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

      And("I click on the Ask for advice link")
        CommonSteps.clickOnLink("Ask for advice")

      Then("I should be on the Asking HMRC for advice page")
        AdviceStartSteps.shouldBeOnAskingHMRCAdvicePage()

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the What is your name? page")
        AskNameSteps.shouldBeOnWhatNamePage()

      When("I enter valid name")
        AskNameSteps.enterName("valid")

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the What is your email address? page")
        AskEmailSteps.shouldBeOnWhatEmailAddressPage()

      And("I enter valid email")
        AskEmailSteps.enterEmail("valid")

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Request Advice - Check Your Answers page")
        RequestAdviceCYASteps.shouldBeOnRequestAdviceCheckAnswersPage()

      When("I click the Name change link")
        CommonSteps.clickChangeLink("Name")

      Then("I should be on the check What is your name? page")
        AskNameSteps.shouldBeOnCheckWhatNamePage()

      When("I enter different name")
        AskNameSteps.enterName("different")

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Request Advice - Check Your Answers page")
        RequestAdviceCYASteps.shouldBeOnRequestAdviceCheckAnswersPage()

      And("My Name has the different valid value")
        RequestAdviceCYASteps.nameHasValidValue("different")

      When("I click the Email change link")
        CommonSteps.clickChangeLink("Email")

      Then("I should be on the check What is your email address? page")
        AskEmailSteps.shouldBeOnCheckWhatEmailAddressPage()

      And("The Email field should be prepopulated")
        AskEmailSteps.emailFieldShouldBePrepopulated()

      When("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Request Advice - Check Your Answers page")
        RequestAdviceCYASteps.shouldBeOnRequestAdviceCheckAnswersPage()

      And("My Email has the same value")
        RequestAdviceCYASteps.emailHasValue("same")

      When("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Request Advice success page")
        RequestAdviceSuccessSteps.shouldBeOnRequestAdviceSuccessPage()

      And("I click on the Go back to goods profile link")
        CommonSteps.clickOnLink("Go back to goods profile")

      Then("I should be on the Goods profile page 1 results")
        GoodsProfileSteps.shouldBeOnGoodsProfilePageResults("1")

      When("I search for Locked goods record")
        GoodsProfileSteps.searchGoodsRecord("Locked")

      And("I click on the View link")
        CommonSteps.clickOnLink("View")

      Then("I should be on the Goods record page")
        GoodsRecordSteps.shouldBeOnGoodsRecordPage()

      When("I click on the Withdraw request link")
        CommonSteps.clickOnLink("Withdraw request")

      Then("I should be on the Withdrawing your request page")
        WithdrawRequestSteps.shouldBeOnWithdrawingRequestPage()

      When("I select Yes for the boolean question")
        CommonSteps.selectBooleanQuestion("Yes")

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Can you tell us why you are withdrawing your request for advice page")
        WithdrawRequestReasonSteps.shouldBeOnCanYouTellUsWhyYoureWithdrawingRequestAdvicePage()

      When("I enter Valid reason")
        WithdrawRequestReasonSteps.enterReason("Valid")

      And("I select continue")
        CommonSteps.selectContinue()

      Then("I should be on the Request for advice withdrawn page")
        WithdrawRequestSuccessSteps.shouldBeOnRequestAdviceWithdrawnPage()
    }
  }
}
