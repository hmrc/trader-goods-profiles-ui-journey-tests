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

import uk.gov.hmrc.test.ui.specpages.CreateGoods.{GoodsDescriptionPage, GoodsDescriptionQuestionPage}

object GoodsDescriptionSteps {

  // ^(?:I )?should be on the 'Goods description' page$
  def shouldBeOnGoodsDescriptionPage(): Unit = {
    GoodsDescriptionPage
          .assertPage()
  }

  // ^(?:I )?should be on the check 'Goods description' page$
  def shouldBeOnCheckGoodsDescriptionPage(): Unit = {
    GoodsDescriptionPage
          .assertCheckPage()
  }

  // ^(?:I )?should be on the 'Goods description' question page$
  def shouldBeOnGoodsDescriptionQuestionPage(): Unit = {
    GoodsDescriptionQuestionPage
          .assertPage()
  }

  // ^(?:I )?should be on the check 'Goods description' question page$
  def shouldBeOnCheckGoodsDescriptionQuestionPage(): Unit = {
    GoodsDescriptionQuestionPage
          .assertCheckPage()
  }

  // ^(?:I )?enter (.*) in Goods description$
  def enterInGoodsDescription(description: String): Unit = {
    description match {
          case "description" =>
            GoodsDescriptionPage
              .fillInput("value", description)
          case "different"   =>
            GoodsDescriptionPage
              .fillInput("value", "different")
          case "long text"   =>
            GoodsDescriptionPage
              .fillInput(
                "value",
                "This is a really looooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooong text input."
              )
        }
  }

}
