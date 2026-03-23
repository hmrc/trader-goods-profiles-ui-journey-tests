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

package uk.gov.hmrc.ui.steps

import uk.gov.hmrc.test.ui.pages.UpdateGoods.{UpdateGoodsSupplementaryUnitPage, UpdateSupplementaryUnitCYAPage, UpdateSupplementaryUnitPage}

object UpdateSupplementaryUnitSteps {

  // ^(?:I )?should be on the 'Goods Supplementary Unit' update page$
  def shouldBeOnGoodsSupplementaryUnitUpdatePage(): Unit = {
    UpdateGoodsSupplementaryUnitPage
          .assertPage()
  }

  // ^(?:I )?should be on the update 'Supplementary Unit' CYA page$
  def shouldBeOnUpdateSupplementaryUnitCYAPage(): Unit = {
    UpdateSupplementaryUnitCYAPage
          .assertPage()
  }

  // ^(?:I )?should be on the 'Supplementary Unit' update page$
  def shouldBeOnSupplementaryUnitUpdatePage(): Unit = {
    UpdateSupplementaryUnitPage
          .assertPage()
  }

}
