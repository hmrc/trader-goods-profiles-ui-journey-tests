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

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import uk.gov.hmrc.test.ui.pages._

class UKIMSNumberStepDef extends BaseStepDef {

  Then("""^(?:I )?should be on the 'UK internal scheme number' page$""") { () =>
    UKIMSNumberPage
      .loadPage()
  }

  Then("""^(?:I )?enter (.*) format of my UKIMS Number in the free text field$""") { (ukimsNumberValidation: String) =>
    ukimsNumberValidation match {
      case "an invalid"     =>
        // enter invalid UKIMS
      case "a valid"        =>
        // enter valid UKIMS
    }
  }

  Then("""^(?:I )?leave UKIMS Number field blank$""") { () =>
    UKIMSNumberPage
      .loadPage() // WIP
  }

  Then("""^Error message '(.*)' should be displayed$""") { (errorMessage: String) =>
    UKIMSNumberPage
      .loadPage(errorMessage) // WIP
  }
}
