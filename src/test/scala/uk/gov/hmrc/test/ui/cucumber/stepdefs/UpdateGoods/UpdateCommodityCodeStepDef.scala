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
import uk.gov.hmrc.test.ui.pages.UpdateGoods.{UpdateCommodityCodePage, UpdateCommodityCodeResultPage, UpdateCommodityCodeWarningPage, UpdatedCommodityCodePage}

class UpdateCommodityCodeStepDef extends BaseStepDef {
  Then("""^(?:I )?should be on the 'commodity code' update page$""") { () =>
    UpdateCommodityCodePage
      .assertPage()
  }

  Then("""^(?:I )?enter (.*) in the Commodity code text field$""") { (commodityCode: String) =>
    UpdateCommodityCodePage
      .fillInput("value", commodityCode)
    submitPage()
  }

  Then("""^(?:I )?should be on the Goods record Commodity Code warning page$""") { () =>
    UpdateCommodityCodeWarningPage
      .assertPage()
  }

  Then("""^(?:I )?should be on the update 'commodity code' result page$""") { () =>
    UpdateCommodityCodeResultPage
      .assertPage()
  }

  Then("""^(?:I )?should be on the update 'commodity code updated' page$""") { () =>
    UpdatedCommodityCodePage
      .assertPage()
  }

}
