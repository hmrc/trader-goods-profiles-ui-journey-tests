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
import uk.gov.hmrc.test.ui.pages.Categorisation.GoodsSupplementaryUnitPage

class GoodsSupplementaryUnitStepDef extends BaseStepDef {
  Then("""^(?:I )?should be on the 'Goods Supplementary Unit' page$""") { () =>
    GoodsSupplementaryUnitPage
      .assertPage()
  }

  Then("""^(?:I )?should be on the check 'Goods Supplementary Unit' page$""") { () =>
    GoodsSupplementaryUnitPage
      .assertCheckPage()
  }

  Then("""^(?:I )?enter (.*)  in Goods Supplementary Unit and select Continue$""") { (Goodsunit: String) =>
    Goodsunit match {
      case "invalid format" =>
        GoodsSupplementaryUnitPage
          .fillInput("value", "ABC543211")
        submitPage()
      case "incorrect"      =>
        GoodsSupplementaryUnitPage
          .fillInput("value", "12345678901.0123456")
        submitPage()
      case _                =>
        GoodsSupplementaryUnitPage
          .fillInput("value", Goodsunit)
        submitPage()
    }
  }
}
