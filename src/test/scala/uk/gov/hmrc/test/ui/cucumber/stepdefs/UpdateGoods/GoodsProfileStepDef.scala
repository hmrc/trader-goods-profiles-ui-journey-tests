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
import uk.gov.hmrc.test.ui.pages.UpdateGoods.{GoodsProfileNoRecordsPage, GoodsProfileQueryPage}

class GoodsProfileStepDef extends BaseStepDef {

  Then("""^(?:I )?should be on the 'Goods profile' page$""") { () =>
    GoodsProfileNoRecordsPage
      .assertPage()
  }

  Then("""^(?:I )?should be on the 'Goods profile' page (.*) results$""") { (pageNumber: String) =>
    GoodsProfileQueryPage
      .assertQueryPage(pageNumber.trim)
  }

  Then("""^(?:I )?search for (.*) goods record$""") { (search: String) =>
    search match {
      case "Locked" =>
        GoodsProfileNoRecordsPage
          .fillInput("searchTerm", "GB - 22030001 - In bottles 2")
          .submitPage()
    }
  }
}
