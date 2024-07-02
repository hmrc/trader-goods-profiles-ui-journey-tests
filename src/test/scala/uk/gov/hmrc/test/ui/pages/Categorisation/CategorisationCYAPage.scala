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

package uk.gov.hmrc.test.ui.pages.Categorisation

import org.junit.Assert
import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.pages.Base.Page

object CategorisationCYAPage extends Page {

  override def title(args: String*): String = "Check your answers"
  override def h1(args: String*): String    = "Check your answers"
  override def url(args: String*): String   =
    "/update-record/b2fa315b-2d31-4629-90fc-a7b1a5119873/categorisation/check-your-answers"

  def clickConditionsChangeLink(ChangelinkNumber: Int): this.type = {

    click(
      By.cssSelector("dl:nth-child(3) > div:nth-child(" + ChangelinkNumber + ") > dd.govuk-summary-list__actions > a")
    )

    this
  }

  def clickSupplementaryUnitChangeLink(ChangelinkNumber: Int): this.type = {

    click(
      By.cssSelector("dl:nth-child(5) > div:nth-child(" + ChangelinkNumber + ") > dd.govuk-summary-list__actions > a")
    )

    this
  }

  def clickLongerCommodityCodeChangeLink(ChangelinkNumber: Int): this.type = {

    click(
      By.cssSelector("dl:nth-child(7) > div:nth-child(" + ChangelinkNumber + ") > dd.govuk-summary-list__actions > a")
    )

    this
  }

  def verifyConditionsInput(field: String, expected: String): this.type = {
    val actual = field match {
      case "Category assessment 1 of 6" =>
        findBy(By.cssSelector("dl:nth-child(3) > div:nth-child(1) > dd.govuk-summary-list__value")).getText
      case "Category assessment 2 of 6" =>
        findBy(By.cssSelector("dl:nth-child(3) > div:nth-child(2) > dd.govuk-summary-list__value")).getText
      case "Category assessment 3 of 6" =>
        findBy(By.cssSelector("dl:nth-child(3) > div:nth-child(3) > dd.govuk-summary-list__value")).getText
      case "Category assessment 4 of 6" =>
        findBy(By.cssSelector("dl:nth-child(3) > div:nth-child(4) > dd.govuk-summary-list__value")).getText
      case "Category assessment 5 of 6" =>
        findBy(By.cssSelector("dl:nth-child(3) > div:nth-child(5) > dd.govuk-summary-list__value")).getText
      case "Category assessment 6 of 6" =>
        findBy(By.cssSelector("dl:nth-child(3) > div:nth-child(6) > dd.govuk-summary-list__value")).getText
    }

    Assert.assertEquals("Expected " + expected + " value but found " + actual + " instead.", expected, actual)
    this
  }

  def verifySupplementaryUnitInput(field: String, expected: String): this.type = {
    val actual = field match {
      case "Has Supplementary Unit" =>
        findBy(By.cssSelector("dl:nth-child(5) > div:nth-child(1) > dd.govuk-summary-list__value")).getText
      case "Supplementary Unit"     =>
        findBy(By.cssSelector("dl:nth-child(5) > div:nth-child(2) > dd.govuk-summary-list__value")).getText
    }

    Assert.assertEquals("Expected " + expected + " value but found " + actual + " instead.", expected, actual)
    this
  }

  def verifyLongerCommodityCodeInput(expected: String): this.type = {
    val actual = findBy(By.cssSelector("dl:nth-child(7) > div:nth-child(1) > dd.govuk-summary-list__value")).getText

    Assert.assertEquals("Expected " + expected + " value but found " + actual + " instead.", expected, actual)
    this
  }
}
