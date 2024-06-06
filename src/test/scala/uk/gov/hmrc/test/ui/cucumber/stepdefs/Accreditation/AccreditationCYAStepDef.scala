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
import uk.gov.hmrc.test.ui.pages.Accreditation.AccreditationCYAPage

class AccreditationCYAStepDef extends BaseStepDef {

  Then("""^(?:I )?should be on the 'Accreditation - Check Your Answers' page$""") { () =>
    AccreditationCYAPage
      .assertPage()
  }

  Then("""^(?:I )?click the Name change link$""") { () =>
    AccreditationCYAPage
      .clickChangeLink("1")
  }

  Then("""^(?:I )?click the Email change link$""") { () =>
    AccreditationCYAPage
      .clickChangeLink("2")
  }

  Then("""^(?:My )?'Name' has the (.*) valid value$""") { (key: String) =>
    key match {
      case "same"      =>
        AccreditationCYAPage
          .verifyInput("Name", "Testfirstname Testlastname")
      case "different" =>
        AccreditationCYAPage
          .verifyInput("Name", "different name")
    }
  }

  Then("""^(?:My )?'Email' has the (.*) value$""") { (key: String) =>
    key match {
      case "same"      =>
        AccreditationCYAPage
          .verifyInput("Email", "test@test.com")
      case "different" =>
        AccreditationCYAPage
          .verifyInput("Email", "different@test.com")
    }
  }
}
