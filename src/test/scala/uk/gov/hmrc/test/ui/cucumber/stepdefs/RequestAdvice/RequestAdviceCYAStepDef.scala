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

package uk.gov.hmrc.test.ui.cucumber.stepdefs.RequestAdvice

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.RequestAdvice.RequestAdviceCYAPage

class RequestAdviceCYAStepDef extends BaseStepDef {

  Then("""^(?:I )?should be on the 'Request Advice - Check Your Answers' page$""") { () =>
    RequestAdviceCYAPage
      .assertPage()
  }

  Then("""^(?:My )?'Name' has the (.*) valid value$""") { (key: String) =>
    key match {
      case "same"      =>
        RequestAdviceCYAPage
          .verifyInput("Name", "Testfirstname Testlastname")
      case "different" =>
        RequestAdviceCYAPage
          .verifyInput("Name", "different name")
    }
  }

  Then("""^(?:My )?'Email' has the (.*) value$""") { (key: String) =>
    key match {
      case "same"      =>
        RequestAdviceCYAPage
          .verifyInput("Email", "test@test.com")
      case "different" =>
        RequestAdviceCYAPage
          .verifyInput("Email", "different@test.com")
    }
  }
}
