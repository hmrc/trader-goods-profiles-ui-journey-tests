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
import uk.gov.hmrc.test.ui.pages.ProfileSetup.{NIRMSNumberPage, NIRMSQuestionPage, UKIMSNumberPage}

class NIRMSNumberStepDef extends BaseStepDef {

  Then("""^(?:I )?(am|should be) on the 'Northern Ireland Retail Movement Scheme number' page$""") {
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
            .assertPage()
        case "should be" =>
          NIRMSNumberPage
            .assertPage()
      }
  }

  Then("""^(?:I )?enter (.*) value of my NIRMS Number in the free text field$""") { (nrimsNumberValidation: String) =>
    nrimsNumberValidation match {
      case "incorrect" =>
        NIRMSNumberPage
          .fillInput("nirmsNumber", "Rms-gb-123456")
      case "different" =>
        NIRMSNumberPage
          .fillInput("nirmsNumber", "RMS-GB-654321")
      case "valid"     =>
        NIRMSNumberPage
          .fillInput("nirmsNumber", "RMS-GB-123456")
      case "empty"     =>
        NIRMSNumberPage
          .fillInput("nirmsNumber", "")
    }
  }

  Then("""^(?:The NIRMS Number field )?should be prepopulated$""") { () =>
    UKIMSNumberPage
      .findById("nirmsNumber")
      .getAttribute("value")
      .shouldEqual("RMS-GB-123456")
  }
}
