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
import uk.gov.hmrc.test.ui.pages.Categorisation.{CategorisationCategory1CompletePage, CategorisationCategory2CompletePage, CategorisationStandardGoodsCompletePage}

class CategorisationCompleteStepDef extends BaseStepDef {

  Then("""^(?:I )?should be on the 'Categorisation complete' with (.+) page$""") { (panelBody: String) =>
    panelBody match {
      case "standard content"                 =>
        CategorisationStandardGoodsCompletePage
          .assertPage("standard")
          .checkForContent(
            "Your goods have been categorised and are eligible for Simplified Process for Internal Market Movements (SPIMM)."
          )
      case "Category1 content"                =>
        CategorisationCategory1CompletePage
          .assertPage("category-1")
          .checkForContent(
            "Your goods have been categorised and are not eligible for Simplified Process for Internal Market Movements (SPIMM)."
          )
      case "Category2 content"                =>
        CategorisationCategory2CompletePage
          .assertPage("category-2")
          .checkForContent(
            "Your goods have been categorised and are eligible for Simplified Process for Internal Market Movements (SPIMM)."
          )
    }
  }
}
