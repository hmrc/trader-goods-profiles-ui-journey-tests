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
import uk.gov.hmrc.test.ui.specsteps.DownloadData.{FileManagementSteps, RequestFileSteps, RequestReceivedSteps}
import uk.gov.hmrc.test.ui.specsteps.ProfileSetup.HomepageSteps
import uk.gov.hmrc.test.ui.specsteps.{CommonSteps, LoginSteps}
import uk.gov.hmrc.test.ui.specsteps.*

@DoNotDiscover
class DownloadDataSpec extends BaseSpec {

  Feature("Trader Goods Profile - Download data journey") {

    Scenario("As a UKIMS authorised trader, I can download or request my TGP data") {
      Given("I login to TGP with EORI number GB123456789098")
        LoginSteps.loginToTGPEORINumber("GB123456789098")

      Then("I should be on the Home page")
        HomepageSteps.shouldBeOnHomePage()

      When("I click on the Get or download your TGP records file link")
        CommonSteps.clickOnLink("Get or download your TGP records file")

      Then("I should be on the File Management page")
        FileManagementSteps.shouldBeOnFileManagementPage()

      When("I click on the Get a new TGP records file link")
        CommonSteps.clickOnLink("Get a new TGP records file")

      Then("I should be on the Request File page")
        RequestFileSteps.shouldBeOnRequestFilePage()

      When("I select Get TGP records file")
        RequestFileSteps.selectGetTGPRecordsFile()

      Then("I should be on the Request Received page")
        RequestReceivedSteps.shouldBeOnRequestReceivedPage()

      When("I click on the TGP records files page link")
        CommonSteps.clickOnLink("TGP records files page")

      Then("I should be on the File Management page")
        FileManagementSteps.shouldBeOnFileManagementPage()

      When("I select the back link")
        CommonSteps.selectBackLink()

      Then("I should be on the Request Received page")
        RequestReceivedSteps.shouldBeOnRequestReceivedPage()

      When("I click on the Go to TGP records files link")
        CommonSteps.clickOnLink("Go to TGP records files")

      Then("I should be on the File Management page")
        FileManagementSteps.shouldBeOnFileManagementPage()

      When("I select the back link")
        CommonSteps.selectBackLink()

      Then("I should be on the Request Received page")
        RequestReceivedSteps.shouldBeOnRequestReceivedPage()

      When("I click on the Go back to homepage link")
        CommonSteps.clickOnLink("Go back to homepage")

      Then("I should be on the Home page")
        HomepageSteps.shouldBeOnHomePage()

      When("I click on the Go to the TGP records file page to download the file link")
        CommonSteps.clickOnLink("Go to the TGP records file page to download the file")

      Then("I should be on the File Management page")
        FileManagementSteps.shouldBeOnFileManagementPage()

      And("the Download file link should have the correct url")
        FileManagementSteps.downloadFileLinkShouldHaveCorrectUrl()

      When("I click on the Go back to homepage link")
        CommonSteps.clickOnLink("Go back to homepage")

      Then("I should be on the Home page")
        HomepageSteps.shouldBeOnHomePage()

      And("I click on the Sign out link")
        CommonSteps.clickOnLink("Sign out")

      Then("I should be on the Give Feedback page")
        CommonSteps.shouldBeOnGiveFeedbackPage()
    }
  }
}
