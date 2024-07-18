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

package uk.gov.hmrc.test.ui.cucumber.stepdefs.MaintainProfile

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.MaintainProfile.UpdateUKIMSNumberPage

class UpdateUKIMSNumberStepDef extends BaseStepDef {

  Then("""^(?:I )?should be on the update 'UK internal scheme number' page$""") { () =>
    UpdateUKIMSNumberPage
      .assertPage()
  }

  Then("""^(?:I )?update value of my UKIMS Number in the free text field$""") { () =>
    UpdateUKIMSNumberPage
      .fillInput("value", "XIUKIM47699357400020231115081800")
    submitPage()
  }

  Then("""^(?:The update UKIMS Number field )?should be prepopulated$""") { () =>
    UpdateUKIMSNumberPage
      .findById("value")
      .getAttribute("value")
      .shouldEqual("XIUKIM47699357400020231115081801")
  }
}
