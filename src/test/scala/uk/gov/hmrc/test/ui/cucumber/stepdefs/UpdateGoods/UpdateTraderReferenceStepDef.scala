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

package uk.gov.hmrc.test.ui.cucumber.stepdefs.UpdateGoods

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.UpdateGoods.{UpdateTraderReferenceCYAPage, UpdateTraderReferencePage}

import java.util.UUID

class UpdateTraderReferenceStepDef extends BaseStepDef {

  Then("""^(?:I )?should be on the 'Trader reference' update page$""") { () =>
    UpdateTraderReferencePage
      .assertPage()
  }

  Then("""^(?:I )?should be on the 'Trader reference' update CYA page$""") { () =>
    UpdateTraderReferenceCYAPage
      .assertPage()
  }

  Then("""^(?:I )?enter (.*) Trader reference in update text area$""") { (traderReference: String) =>
    traderReference match {
      case "Non unique" =>
        UpdateTraderReferenceCYAPage
          .fillInput("value", "ABC543211")
        submitPage()
      case "Unique" =>
        UpdateTraderReferenceCYAPage
          .fillInput("value", "Trader" + UUID.randomUUID().toString())
        submitPage()
      case "different" =>
        UpdateTraderReferenceCYAPage
          .fillInput("value", "different value")
        submitPage()
    }
  }
}
