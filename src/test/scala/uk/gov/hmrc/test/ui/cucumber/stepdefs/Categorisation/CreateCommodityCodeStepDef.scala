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
import uk.gov.hmrc.test.ui.pages.Categorisation.CreateCommodityCodePage
import uk.gov.hmrc.test.ui.pages.NIOTTPage

class CreateCommodityCodeStepDef extends BaseStepDef {
  And("""^(?:I )?navigate to the 'commodity code' page$""") { () =>
    CreateCommodityCodePage
      .navigateToPage()
  }
  Then("""^(?:I )?should be on the 'commodity code' page$""") { () =>
    CreateCommodityCodePage
      .assertPage()
  }

  Then("""^(?:I )?enter (.*) value of Commodity code in the free text field$""") { (commodityCodeValidation: String) =>
    commodityCodeValidation match {
      case "invalid format" =>
        CreateCommodityCodePage
          .fillInput("value", "ABC543211")
        submitPage()
      case "incorrect"      =>
        CreateCommodityCodePage
          .fillInput("value", "1234567892")
        submitPage()
      case "valid"          =>
        CreateCommodityCodePage
          .fillInput("value", "1234567890")
        submitPage()
    }
  }

  Then("""^(?:I )?should be on the 'Northern Ireland Online Tariff' page$""") { () =>
    NIOTTPage
      .assertPage()
  }
}
