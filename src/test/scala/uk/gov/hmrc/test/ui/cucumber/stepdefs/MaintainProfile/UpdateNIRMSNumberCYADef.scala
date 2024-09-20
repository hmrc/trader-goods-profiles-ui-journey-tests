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
import uk.gov.hmrc.test.ui.pages.MaintainProfile.UpdateNIRMSNumberCYAPage

class UpdateNIRMSNumberCYADef extends BaseStepDef {
  Then("""^(?:I )?should be on the update 'NIRMS number Check your answers' page$""") { () =>
    UpdateNIRMSNumberCYAPage
      .assertPage()
  }

  Then("""^(?:I )?click the NIRMS Number change link in the summary list$""") { () =>
    UpdateNIRMSNumberCYAPage
      .clickChangeLink("2")
  }

  Then("""^(?:My )?'NIRMS number' has the (.*) value""") { (key: String) =>
    key match {
      case "different" =>
        UpdateNIRMSNumberCYAPage
          .verifyInput("value", "RMS-GB-654321")
      case "valid"     =>
        UpdateNIRMSNumberCYAPage
          .verifyInput("value", "RMS-GB-123456")
    }
  }
}
