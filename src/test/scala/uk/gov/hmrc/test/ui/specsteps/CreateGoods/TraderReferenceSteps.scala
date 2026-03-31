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

import uk.gov.hmrc.test.ui.specpages.Base.BasePage
import uk.gov.hmrc.test.ui.specpages.CreateGoods.TraderReferencePage
import java.util.UUID

object TraderReferenceSteps extends BasePage {

  // ^(?:I )?should be on the 'Product reference' page$
  def shouldBeOnProductReferencePage(): Unit = {
    TraderReferencePage
          .assertPage()
  }

  // ^(?:I )?should be on the check 'Product reference' page$
  def shouldBeOnCheckProductReferencePage(): Unit = {
    TraderReferencePage
          .assertCheckPage()
  }

  // ^(?:I )?enter (.*) Product reference$
  def enterProductReference(traderReference: String): Unit = {
    traderReference match {
          case "none unique" =>
            TraderReferencePage
              .fillInput("value", "not a unique reference")
          case "long"        =>
            TraderReferencePage
              .fillInput(
                "value",
                "This is a really looooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooong text input."
              )
          case "unique"      =>
            val validUuid = "Trader" + UUID.randomUUID().toString
            TraderReferencePage
              .fillInput("value", validUuid)
          case "different"   =>
            TraderReferencePage
              .fillInput("value", "different value")
        }
  }

}
