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
import uk.gov.hmrc.test.ui.pages.CreateGoods.CreateRecordCYAPage

class CreateRecordCYAStepDef extends BaseStepDef {

  Then("""^(?:I )?should be on the 'Create Record - Check Your Answers' page$""") { () =>
    CreateRecordCYAPage
      .assertPage()
  }

  Then("""^(?:I )?click the Trader Reference change link$""") { () =>
    CreateRecordCYAPage
      .clickChangeLink("1")
  }

  Then("""^(?:I )?click the Goods Description Question change link$""") { () =>
    CreateRecordCYAPage
      .clickChangeLink("2")
  }

  Then("""^(?:I )?click the Goods Description change link$""") { () =>
    CreateRecordCYAPage
      .clickChangeLink("3")
  }

  Then("""^(?:I )?click the Country Of Origin change link$""") { () =>
    CreateRecordCYAPage
      .clickChangeLink("4")
  }

  Then("""^(?:I )?click the Commodity Code change link$""") { () =>
    CreateRecordCYAPage
      .clickChangeLink("5")
  }

  Then("""^(?:My )?'Trader Reference' has the same value$""") { () =>
    CreateRecordCYAPage
      .verifyInput("traderReference", "not a unique reference")
  }

  Then("""^(?:My )?'Goods Description Question' has the (.*) value$""") { (key: String) =>
    key match {
      case "same"      =>
        CreateRecordCYAPage
          .verifyInput("goodsDescriptionQuestion", "No, I want to enter a different goods description")
      case "different" =>
        CreateRecordCYAPage
          .verifyInput("goodsDescriptionQuestion", "Yes, use my trader reference as my goods description")
    }
  }

  Then("""^(?:My )?'Goods Description' has the (.*) valid value$""") { (key: String) =>
    key match {
      case "same"      =>
        CreateRecordCYAPage
          .verifyInput("goodsDescription", "description")
      case "different" =>
        CreateRecordCYAPage
          .verifyInput("goodsDescription", "different")
    }
  }

  Then("""^(?:My )?'Country Of Origin' has the (.*) value$""") { (key: String) =>
    key match {
      case "same"      =>
        CreateRecordCYAPage
          .verifyInput("countryOfOrigin", "Iraq")
      case "different" =>
        CreateRecordCYAPage
          .verifyInput("countryOfOrigin", "Other")
    }
  }

  Then("""^(?:My )?'Commodity Code' has the (.*) valid value$""") { (key: String) =>
    key match {
      case "same"      =>
        CreateRecordCYAPage
          .verifyInput("commodityCode", "170490")
      case "different" =>
        CreateRecordCYAPage
          .verifyInput("commodityCode", "0987654321")
    }
  }
}
