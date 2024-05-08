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
import uk.gov.hmrc.test.ui.pages.ProfileSetup.{CYAPage, NIPHLNumberPage, NIPHLQuestionPage, NIRMSNumberPage, NIRMSQuestionPage, UKIMSNumberPage}

class CYAStepDef extends BaseStepDef {
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
          CYAPage
            .assertPage()
        case "should be" =>
          CYAPage
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
            .fillInput("nirmsNumber", "RMS-GB-123456")
          submitPage()
          NIPHLQuestionPage
            .assertPage()
          clickRadioBtn("No")
          submitPage()
          CYAPage
            .assertPage()
        case "should be" =>
          CYAPage
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
          CYAPage
            .assertPage()
        case "should be" =>
          CYAPage
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
            .fillInput("nirmsNumber", "RMS-GB-123456")
          submitPage()
          NIPHLQuestionPage
            .assertPage()
          clickRadioBtn("Yes")
          submitPage()
          NIPHLNumberPage
            .fillInput("value", "SN12345")
          submitPage()
          CYAPage
            .assertPage()
        case "should be" =>
          CYAPage
            .assertPage()
      }
  }

  Then("""^(?:I )?click the UKIMS Number change link$""") { () =>
    CYAPage
      .clickChangeLink("1")
  }

  Then("""^(?:I )?click the NIRMS Question change link$""") { () =>
    CYAPage
      .clickChangeLink("2")
  }

  Then("""^(?:I )?click the NIRMS Number change link$""") { () =>
    CYAPage
      .clickChangeLink("3")
  }

  Then("""^(?:I )?click the NIPHL Question change link$""") { () =>
    CYAPage
      .clickChangeLink("3")
  }

  Then("""^(?:I )?click the NIPHL Number change link$""") { () =>
    CYAPage
      .clickChangeLink("4")
  }

  Then("""^(?:My )?'UKIMS Number' has the (.*) valid value$""") { (key: String) =>
    key match {
      case "same"      =>
        CYAPage
          .verifyInput("ukimsNumber", "XI47699357400020231115081800")
      case "different" =>
        CYAPage
          .verifyInput("ukimsNumber", "XI47699357400020231115081801")
    }
  }

  Then("""^(?:My )?'NIRMS Question' has the (.*) value$""") { (key: String) =>
    key match {
      case "same"      =>
        CYAPage
          .verifyInput("nirmsQuestion", "Yes")
      case "different" =>
        CYAPage
          .verifyInput("nirmsQuestion", "No")
    }
  }

  Then("""^(?:My )?'NIRMS Number' has the (.*) valid value$""") { (key: String) =>
    key match {
      case "same"      =>
        CYAPage
          .verifyInput("nirmsNumber", "RMS-GB-123456")
      case "different" =>
        CYAPage
          .verifyInput("nirmsNumber", "RMS-GB-654321")
    }
  }
}
