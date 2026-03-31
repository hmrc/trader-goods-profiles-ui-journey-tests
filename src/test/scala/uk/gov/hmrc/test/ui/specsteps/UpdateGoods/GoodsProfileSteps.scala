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
import uk.gov.hmrc.test.ui.specpages.UpdateGoods.{GoodsProfileNoRecordsPage, GoodsProfileQueryPage}

object GoodsProfileSteps extends BasePage {

  // ^(?:I )?should be on the 'Goods profile' page$
  def shouldBeOnGoodsProfilePage(): Unit = {
    GoodsProfileNoRecordsPage
          .assertPage()
  }

  // ^(?:I )?should be on the 'Goods profile' page (.*) results$
  def shouldBeOnGoodsProfilePageResults(pageNumber: String): Unit = {
    GoodsProfileQueryPage
          .assertQueryPage(pageNumber.trim)
  }

  // ^(?:I )?search for (.*) goods record$
  def searchGoodsRecord(search: String): Unit = {
    search match {
          case "Locked" =>
            GoodsProfileNoRecordsPage
              .fillInput("searchTerm", "GB - 22030001 - In bottles 2")
              .submitPage()
        }
  }

}
