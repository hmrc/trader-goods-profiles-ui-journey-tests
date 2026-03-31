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

package uk.gov.hmrc.test.ui.specsteps.CreateGoods

import uk.gov.hmrc.test.ui.specpages.CreateGoods.CreateCommodityCodePage
import uk.gov.hmrc.test.ui.specpages.NIOTTPage

object CreateCommodityCodeSteps {

  // ^(?:I )?should be on the 'commodity code' page$
  def shouldBeOnCommodityCodePage(): Unit = {
    CreateCommodityCodePage
          .assertPage()
  }

  // ^(?:I )?should be on the check 'commodity code' page$
  def shouldBeOnCheckCommodityCodePage(): Unit = {
    CreateCommodityCodePage
          .assertCheckPage()
  }

  // ^(?:I )?enter (.*) Commodity code$
  def enterCommodityCode(commodityCodeValidation: String): Unit = {
    commodityCodeValidation match {
          case "invalid format" =>
            CreateCommodityCodePage
              .fillInput("value", "ABC543211")
          case "incorrect"      =>
            CreateCommodityCodePage
              .fillInput("value", "1234567892")
          case _                =>
            CreateCommodityCodePage
              .fillInput("value", commodityCodeValidation)
        }
  }

  // ^(?:I )?should be on the 'Northern Ireland Online Tariff' page$
  def shouldBeOnNorthernIrelandOnlineTariffPage(): Unit = {
    NIOTTPage
          .assertPage()
  }

}
