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
import uk.gov.hmrc.test.ui.pages.MaintainProfile.UpdateNIPHLNumberCYAPage

class UpdateNIPHLNumberCYAStepDef extends BaseStepDef {
  Then("""^(?:I )?should be on the update 'NIPHL registration number Check your answers' page$""") { () =>
    UpdateNIPHLNumberCYAPage
      .assertPage()
  }

  Then("""^(?:I )?click the NIPHL Number change link in the summary list$""") { () =>
    UpdateNIPHLNumberCYAPage
      .clickChangeLink("2")
  }

  Then("""^(?:My )?'NIPHL Number CYA' has the (.*) value$""") { (key: String) =>
    key match {
      case "different" =>
        UpdateNIPHLNumberCYAPage
          .verifyInput("value", "SN54321")
      case "valid"     =>
        UpdateNIPHLNumberCYAPage
          .verifyInput("value", "SN12345")
    }
  }
}
