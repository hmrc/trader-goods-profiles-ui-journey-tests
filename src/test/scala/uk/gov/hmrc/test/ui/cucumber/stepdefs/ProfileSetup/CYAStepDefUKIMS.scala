/*
 * Copyright 2024 HM Revenue & Customs
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

package uk.gov.hmrc.test.ui.cucumber.stepdefs.ProfileSetup

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.AuthorityWizard
import uk.gov.hmrc.test.ui.pages.ProfileSetup.{CYAPageUKIMS, NIPHLNumberPage, NIPHLQuestionPage, NIRMSNumberPage, NIRMSQuestionPage, UKIMSNumberPage}

class CYAStepDefUKIMS extends BaseStepDef {
  Then("""^(?:I )?(am|should be) on the 'Check Your Answers' page without a NIRMS or NIPHL number$""") {
    (amShould: String) =>
      amShould match {
        case "am"        =>
          AuthorityWizard
            .validLogin()
          submitPage()
          UKIMSNumberPage
            .assertPage()
          UKIMSNumberPage
            .fillInput("ukimsNumber", "XI47699357400020231115081800")
          submitPage()
          NIRMSQuestionPage
            .assertPage()
          clickRadioBtn("No")
          submitPage()
          NIPHLQuestionPage
            .assertPage()
          clickRadioBtn("No")
          submitPage()
          CYAPageUKIMS
            .assertPage()
        case "should be" =>
          CYAPageUKIMS
            .assertPage()
      }
  }

  Then("""^(?:I )?(am|should be) on the 'Check Your Answers' page with a NIRMS and without a NIPHL number$""") {
    (amShould: String) =>
      amShould match {
        case "am"        =>
          AuthorityWizard
            .validLogin()
          submitPage()
          UKIMSNumberPage
            .assertPage()
          UKIMSNumberPage
            .fillInput("ukimsNumber", "XI47699357400020231115081800")
          submitPage()
          NIRMSQuestionPage
            .assertPage()
          clickRadioBtn("Yes")
          submitPage()
          NIRMSNumberPage
            .fillInput("value", "RMS-GB-123456")
          submitPage()
          NIPHLQuestionPage
            .assertPage()
          clickRadioBtn("No")
          submitPage()
          CYAPageUKIMS
            .assertPage()
        case "should be" =>
          CYAPageUKIMS
            .assertPage()
      }
  }

  Then("""^(?:I )?(am|should be) on the 'Check Your Answers' page without a NIRMS and with a NIPHL number$""") {
    (amShould: String) =>
      amShould match {
        case "am"        =>
          AuthorityWizard
            .validLogin()
          submitPage()
          UKIMSNumberPage
            .assertPage()
          UKIMSNumberPage
            .fillInput("ukimsNumber", "XI47699357400020231115081800")
          submitPage()
          NIRMSQuestionPage
            .assertPage()
          clickRadioBtn("No")
          submitPage()
          NIPHLQuestionPage
            .assertPage()
          clickRadioBtn("Yes")
          submitPage()
          NIPHLNumberPage
            .fillInput("value", "SN12345")
          submitPage()
          CYAPageUKIMS
            .assertPage()
        case "should be" =>
          CYAPageUKIMS
            .assertPage()
      }
  }

  Then("""^(?:I )?(am|should be) on the 'Check Your Answers' page with a NIRMS and NIPHL number$""") {
    (amShould: String) =>
      amShould match {
        case "am"        =>
          AuthorityWizard
            .validLogin()
          submitPage()
          UKIMSNumberPage
            .assertPage()
          UKIMSNumberPage
            .fillInput("ukimsNumber", "XI47699357400020231115081800")
          submitPage()
          NIRMSQuestionPage
            .assertPage()
          clickRadioBtn("Yes")
          submitPage()
          NIRMSNumberPage
            .fillInput("value", "RMS-GB-123456")
          submitPage()
          NIPHLQuestionPage
            .assertPage()
          clickRadioBtn("Yes")
          submitPage()
          NIPHLNumberPage
            .fillInput("value", "SN12345")
          submitPage()
          CYAPageUKIMS
            .assertPage()
        case "should be" =>
          CYAPageUKIMS
            .assertPage()
      }
  }

  Then("""^(?:I )?click the (.*) change link$""") { (key: String) =>
    key match {
      case "first"  =>
        CYAPageUKIMS
          .clickChangeLink("1")
      case "second" =>
        CYAPageUKIMS
          .clickChangeLink("2")
      case "third"  =>
        CYAPageUKIMS
          .clickChangeLink("3")
      case "fourth" =>
        CYAPageUKIMS
          .clickChangeLink("4")
      case "fifth"  =>
        CYAPageUKIMS
          .clickChangeLink("5")
    }
  }
}
