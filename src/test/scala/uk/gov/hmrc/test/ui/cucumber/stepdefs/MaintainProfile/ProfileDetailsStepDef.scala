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
import uk.gov.hmrc.test.ui.pages.MaintainProfile.ProfileDetailsPage

class ProfileDetailsStepDef extends BaseStepDef {

  Then("""^(?:I )?should be on the 'Profile details' page$""") { () =>
    ProfileDetailsPage
      .assertPage()
  }

  Then("""^(?:My )?'(.*)' has the value (.*)$""") { (key: String, value: String) =>
    key match {
      case "UKIMS Number"   =>
        ProfileDetailsPage
          .verifyInput("ukimsNumber", value)
      case "NIPHL Question" =>
        ProfileDetailsPage
          .verifyInput("niphlQuestion", value)
      case "NIRMS Question" =>
        ProfileDetailsPage
          .verifyInput("nirmsQuestion", value)
      case "NIPHL Number"   =>
        ProfileDetailsPage
          .verifyInput("niphlNumber", value)
      case "NIRMS Number"   =>
        ProfileDetailsPage
          .verifyInput("nirmsNumber", value)
    }
  }

  Then("""^(?:I )?select the (.+) option of two$""") { (option: String) =>
    clickRadioBtn(option)
    submitPage()
  }
}
