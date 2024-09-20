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
import uk.gov.hmrc.test.ui.pages.MaintainProfile.{UpdateNIRMSNumberCheckPage, UpdateNIRMSNumberPage}

class UpdateNIRMSNumberStepDef extends BaseStepDef {

  Then("""^(?:I )?should be on the update 'Northern Ireland Retail Movement Scheme number' page$""") { () =>
    UpdateNIRMSNumberPage
      .assertPage()
  }

  Then("""^(?:I )?should be on the check update 'Northern Ireland Retail Movement Scheme number' page$""") { () =>
    UpdateNIRMSNumberCheckPage
      .assertPage()
  }

  Then("""^(?:The update NIRMS Number field )?should be prepopulated$""") { () =>
    UpdateNIRMSNumberPage
      .findById("value")
      .getAttribute("value")
      .shouldEqual("RMS-GB-123456")
  }
}
