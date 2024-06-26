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

package uk.gov.hmrc.test.ui.pages.CreateGoods

import org.junit.Assert
import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.pages.Base.Page

object CreateRecordCYAPage extends Page {

  override def title(args: String*): String = "Check your answers"
  override def h1(args: String*): String    = "Check your answers"
  override def url(args: String*): String    = "/create-record/cya-create-record"

  def clickChangeLink(key: String): this.type = {

    click(By.cssSelector("div:nth-child(" + key + ") > dd.govuk-summary-list__actions > a"))

    this
  }

  def verifyInput(field: String, expected: String): this.type = {
    val actual = field match {
      case "traderReference"          => findBy(By.cssSelector("div:nth-child(1) > dd.govuk-summary-list__value")).getText
      case "goodsDescriptionQuestion" =>
        findBy(By.cssSelector("div:nth-child(2) > dd.govuk-summary-list__value")).getText
      case "goodsDescription"         => findBy(By.cssSelector("div:nth-child(3) > dd.govuk-summary-list__value")).getText.trim
      case "countryOfOrigin"          => findBy(By.cssSelector("div:nth-child(4) > dd.govuk-summary-list__value")).getText
      case "commodityCode"            => findBy(By.cssSelector("div:nth-child(5) > dd.govuk-summary-list__value")).getText
    }

    Assert.assertEquals("Expected " + expected + " value but found " + actual + " instead.", expected, actual)
    this
  }
}
