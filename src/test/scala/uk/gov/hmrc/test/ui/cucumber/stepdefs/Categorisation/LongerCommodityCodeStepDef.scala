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

package uk.gov.hmrc.test.ui.cucumber.stepdefs.Categorisation

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Categorisation.LongerCommodityCodePage

class LongerCommodityCodeStepDef extends BaseStepDef {

  Then("""^(?:I )?should be on the 'Longer commodity code' page$""") { () =>
    LongerCommodityCodePage
      .assertPage()
  }

  Then("""^(?:I )?enter (.*) 'Longer Commodity code'$""") { (commodityCodeValidation: String) =>
    commodityCodeValidation match {
      case "invalid format" =>
        LongerCommodityCodePage
          .fillInput("value", "123AB")
      case "incorrect"      =>
        LongerCommodityCodePage
          .fillInput("value", "22")
      case _                =>
        LongerCommodityCodePage
          .fillInput("value", commodityCodeValidation)
    }
  }

  Then("""^(?:I )?should be on the check 'Longer commodity code' page$""") { () =>
    LongerCommodityCodePage
      .assertCheckPage()
  }
}
