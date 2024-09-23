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
import uk.gov.hmrc.test.ui.pages.ProfileSetup.NIRMSNumberPage

class NIRMSNumberStepDef extends BaseStepDef {

  Then("""^(?:I )?should be on the 'What is your NIRMS number\?' page$""") { () =>
    NIRMSNumberPage
      .assertPage()
  }

  Then("""^(?:I )?should be on the check 'What is your NIRMS number\?' page$""") { () =>
    NIRMSNumberPage
      .assertCheckPage()
  }

  Then("""^(?:I )?enter (.*) value of my NIRMS Number in the free text field$""") { (nrimsNumberValidation: String) =>
    nrimsNumberValidation match {
      case "incorrect" =>
        NIRMSNumberPage
          .fillInput("value", "Rms-gb-123")
        submitPage()
      case "different" =>
        NIRMSNumberPage
          .fillInput("value", "RMS   -GB------654321")
        submitPage()
      case "valid"     =>
        NIRMSNumberPage
          .fillInput("value", "R  M  S-G  B-123  45  6")
        submitPage()
      case "empty"     =>
        NIRMSNumberPage
          .fillInput("value", "")
        submitPage()
    }
  }

  Then("""^(?:The NIRMS Number field )?should be prepopulated$""") { () =>
    NIRMSNumberPage
      .findById("value")
      .getAttribute("value")
      .shouldEqual("RMS-GB-123456")
  }
}
