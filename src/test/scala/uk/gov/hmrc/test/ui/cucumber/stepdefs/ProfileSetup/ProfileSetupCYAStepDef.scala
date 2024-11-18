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

package uk.gov.hmrc.test.ui.cucumber.stepdefs.ProfileSetup

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.ProfileSetup.ProfileSetupCYAPage

class ProfileSetupCYAStepDef extends BaseStepDef {

  Then("""^(?:I )?should be on the 'Check Your Answers' page$""") { () =>
    ProfileSetupCYAPage
      .assertPage()
  }

  Then("""^(?:My )?'UKIMS Number' has the (.*) valid value$""") { (key: String) =>
    key match {
      case "same"      =>
        ProfileSetupCYAPage
          .verifyInput("ukimsNumber", "XIUKIM47699357400020231115081800")
      case "different" =>
        ProfileSetupCYAPage
          .verifyInput("ukimsNumber", "XIUKIM47699357400020231115081801")
    }
  }

  Then("""^(?:My )?'NIRMS Question' has the (.*) value$""") { (key: String) =>
    key match {
      case "same"      =>
        ProfileSetupCYAPage
          .verifyInput("nirmsQuestion", "Yes")
      case "different" =>
        ProfileSetupCYAPage
          .verifyInput("nirmsQuestion", "No")
    }
  }

/*  Then("""^(?:My )?'NIRMS Number' has the (.*) valid value$""") { (key: String) =>
    key match {
      case "same"      =>
        ProfileSetupCYAPage
          .verifyInput("nirmsNumber", "RMS-GB-123456")
      case "different" =>
        ProfileSetupCYAPage
          .verifyInput("nirmsNumber", "RMS-GB-654321")
    }
  }*/

  Then("""^(?:My )?'NIPHL Question' has the (.*) value$""") { (key: String) =>
    key match {
      case "same"      =>
        ProfileSetupCYAPage
          .verifyInput("niphlQuestion", "Yes")
      case "different" =>
        ProfileSetupCYAPage
          .verifyInput("niphlQuestion", "No")
    }
  }

  Then("""^(?:My )?'NIPHL Number' has the (.*) valid value$""") { (key: String) =>
    key match {
      case "same"      =>
        ProfileSetupCYAPage
          .verifyInput("niphlNumber", "SN12345")
      case "different" =>
        ProfileSetupCYAPage
          .verifyInput("niphlNumber", "SN54321")
    }
  }
}
