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
import uk.gov.hmrc.test.ui.pages.ProfileSetup.{NIPHLNumberPage, UKIMSNumberPage}

class NIPHLNumberStepDef extends BaseStepDef {

  Then("""^(?:I )?should be on the 'NIPHL registration number' page$""") { () =>
    NIPHLNumberPage
      .assertPage()
    submitPage()
  }

  Then("""^(?:I )?enter (.*) value of my NIPHL Number in the free text field$""") { (niphlNumberValidation: String) =>
    niphlNumberValidation match {
      case "incorrect" =>
        NIPHLNumberPage
          .fillInput("value", "SN123452")
        submitPage()
      case "different" =>
        NIPHLNumberPage
          .fillInput("value", "SN54321")
        submitPage()
      case "valid"     =>
        NIPHLNumberPage
          .fillInput("value", "SN12345")
        submitPage()
      case "empty"     =>
        NIPHLNumberPage
          .fillInput("value", "")
        submitPage()
    }
  }

  Then("""^(?:The NIPHL Number field )?should be prepopulated$""") { () =>
    UKIMSNumberPage
      .findById("value")
      .getAttribute("value")
      .shouldEqual("SN12345")
  }
}
