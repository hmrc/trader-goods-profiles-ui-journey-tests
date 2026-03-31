/*
 * Copyright 2026 HM Revenue & Customs
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

package uk.gov.hmrc.test.ui.specsteps.UpdateGoods

import uk.gov.hmrc.test.ui.specpages.Base.BasePage
import uk.gov.hmrc.test.ui.specpages.UpdateGoods.{UpdateCommodityCodePage, UpdateCommodityCodeResultPage, UpdateCommodityCodeWarningPage, UpdatedCommodityCodePage}

object UpdateCommodityCodeSteps extends BasePage {

  // ^(?:I )?should be on the 'commodity code' update page$
  def shouldBeOnCommodityCodeUpdatePage(): Unit = {
    UpdateCommodityCodePage
          .assertPage()
  }

  // ^(?:I )?enter (.*) in the Commodity code text field$
  def enterInCommodityCodeTextField(commodityCode: String): Unit = {
    UpdateCommodityCodePage
          .fillInput("value", commodityCode)
        submitPage()
  }

  // ^(?:I )?should be on the Goods record Commodity Code warning page$
  def shouldBeOnGoodsRecordCommodityCodeWarningPage(): Unit = {
    UpdateCommodityCodeWarningPage
          .assertPage()
  }

  // ^(?:I )?should be on the update 'commodity code' result page$
  def shouldBeOnUpdateCommodityCodeResultPage(): Unit = {
    UpdateCommodityCodeResultPage
          .assertPage()
  }

  // ^(?:I )?should be on the update 'commodity code updated' page$
  def shouldBeOnUpdateCommodityCodeUpdatedPage(): Unit = {
    UpdatedCommodityCodePage
          .assertPage()
  }

}
