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

package uk.gov.hmrc.test.ui.specsteps.Categorisation

import uk.gov.hmrc.test.ui.specpages.Categorisation.GoodsSupplementaryUnitPage

object GoodsSupplementaryUnitSteps {

  // ^(?:I )?should be on the 'Goods Supplementary Unit' page$
  def shouldBeOnGoodsSupplementaryUnitPage(): Unit = {
    GoodsSupplementaryUnitPage
          .assertPage()
  }

  // ^(?:I )?should be on the check 'Goods Supplementary Unit' page$
  def shouldBeOnCheckGoodsSupplementaryUnitPage(): Unit = {
    GoodsSupplementaryUnitPage
          .assertCheckPage()
  }

  // ^(?:I )?enter (.*) in Goods Supplementary Unit$
  def enterInGoodsSupplementaryUnit(Goodsunit: String): Unit = {
    Goodsunit match {
          case "invalid format" =>
            GoodsSupplementaryUnitPage
              .fillInput("value", "ABC543211")
          case "incorrect"      =>
            GoodsSupplementaryUnitPage
              .fillInput("value", "12345678901.0123456")
          case _                =>
            GoodsSupplementaryUnitPage
              .fillInput("value", Goodsunit)
        }
  }

}
