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

package uk.gov.hmrc.test.ui.cucumber.stepdefs.NewUkims

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.NewUkims.NewUKIMSNumberPage

class NewUKIMSNumberStepDef extends BaseStepDef {

  Then("""^(?:I )?should be on the 'New UK internal scheme number' page$""") { () =>
    NewUKIMSNumberPage
      .assertPage()
  }

  Then("""^(?:I )?should be on the check 'New UK internal scheme number' page$""") { () =>
    NewUKIMSNumberPage
      .assertCheckPage()
  }

  Then("""^(?:I )?enter (.*) value of my New UKIMS Number$""") { (ukimsNumberValidation: String) =>
    ukimsNumberValidation match {
      case "incorrect" =>
        NewUKIMSNumberPage
          .fillInput("value", "INVALID")
      case "different" =>
        NewUKIMSNumberPage
          .fillInput("value", "XIUKIM 47699357400020231115081801")
      case "valid"     =>
        NewUKIMSNumberPage
          .fillInput("value", "XIUKIM-47699357400020231115081800")
      case "empty"     =>
        NewUKIMSNumberPage
          .fillInput("value", "")
    }
  }

  Then("""^(?:The New UKIMS Number field )?should be prepopulated$""") { () =>
    NewUKIMSNumberPage
      .findById("value")
      .getAttribute("value")
      .shouldEqual("XIUKIM47699357400020231115081800")
  }
}
