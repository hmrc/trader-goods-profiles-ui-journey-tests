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

package uk.gov.hmrc.test.ui.cucumber.stepdefs.Accreditation

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Accreditation.AskNamePage

class AskNameStepDef extends BaseStepDef {

  Then("""^(?:I )?should be on the 'What is your name\?' page$""") { () =>
    AskNamePage
      .assertPage()
  }

  Then("""^(?:I )?enter (.*) name in the free text field$""") { (name: String) =>
    name match {
      case "long"      =>
        AskNamePage
          .fillInput("value", "Thisisaveryveryveryveryveryveryveryveryveryveryveryveryveryverylongname")
        submitPage()
      case "valid"     =>
        AskNamePage
          .fillInput("value", "Testfirstname Testlastname")
        submitPage()
      case "different" =>
        AskNamePage
          .fillInput("value", "different name")
        submitPage()
    }
  }

  Then("""^(?:The Name field )?should be prepopulated$""") { () =>
    AskNamePage
      .findById("value")
      .getAttribute("value")
      .shouldEqual("Testfirstname Testlastname")
  }
}
