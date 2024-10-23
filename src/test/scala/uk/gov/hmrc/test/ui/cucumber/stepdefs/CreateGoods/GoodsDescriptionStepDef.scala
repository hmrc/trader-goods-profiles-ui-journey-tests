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

package uk.gov.hmrc.test.ui.cucumber.stepdefs.CreateGoods

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.CreateGoods.{GoodsDescriptionPage, GoodsDescriptionQuestionPage}

class GoodsDescriptionStepDef extends BaseStepDef {

  Then("""^(?:I )?should be on the 'Goods description' page$""") { () =>
    GoodsDescriptionPage
      .assertPage()
  }

  Then("""^(?:I )?should be on the check 'Goods description' page$""") { () =>
    GoodsDescriptionPage
      .assertCheckPage()
  }

  Then("""^(?:I )?should be on the 'Goods description' question page$""") { () =>
    GoodsDescriptionQuestionPage
      .assertPage()
  }

  Then("""^(?:I )?should be on the check 'Goods description' question page$""") { () =>
    GoodsDescriptionQuestionPage
      .assertCheckPage()
  }

  Then("""^(?:I )?enter (.*) in Goods description and select Continue$""") { (description: String) =>
    description match {
      case "description" =>
        GoodsDescriptionPage
          .fillInput("value", description)
        submitPage()
      case "different"   =>
        GoodsDescriptionPage
          .fillInput("value", "different")
        submitPage()
      case "long text"   =>
        GoodsDescriptionPage
          .fillInput(
            "value",
            "This is a really looooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooong text input."
          )
        submitPage()
    }
  }

}
