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

package uk.gov.hmrc.test.ui.cucumber.stepdefs.CreateGoods

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.CreateGoods.TraderReferencePage

import java.util.UUID

class TraderReferenceStepDef extends BaseStepDef {

  Then("""^(?:I )?should be on the 'Trader reference' page$""") { () =>
    TraderReferencePage
      .assertPage()
  }

  Then("""^(?:I )?should be on the check 'Trader reference' page$""") { () =>
    TraderReferencePage
      .assertCheckPage()
  }

  var validUuid     = "EMPTY"
  var differentUuid = "EMPTY"

  Then("""^(?:I )?enter (.*) Trader reference in the text area$""") { (traderReference: String) =>
    traderReference match {
      case "Non unique" =>
        TraderReferencePage
          .fillInput("value", "ABC543211")
        submitPage()
      case "Unique"     =>
        validUuid = "Trader" + UUID.randomUUID().toString()
        TraderReferencePage
          .fillInput("value", validUuid)
        submitPage()
      case "different"  =>
        differentUuid = "different value" + UUID.randomUUID().toString()
        TraderReferencePage
          .fillInput("value", "different value")
        submitPage()
    }
  }

  Then("""^(?:The Trader reference field )?should be prepopulated $""") { () =>
    TraderReferencePage
      .findById("value")
      .getAttribute("value")
      .shouldEqual("Unique value")
  }

  Then("""^(?:The Trader reference field )?should be prepopulated with valid$""") { () =>
    TraderReferencePage
      .findById("value")
      .getAttribute("value")
      .shouldEqual(validUuid)
  }

  Then("""^(?:The Trader reference field )?should be prepopulated with different$""") { () =>
    TraderReferencePage
      .findById("value")
      .getAttribute("value")
      .shouldEqual(differentUuid)
  }
}
