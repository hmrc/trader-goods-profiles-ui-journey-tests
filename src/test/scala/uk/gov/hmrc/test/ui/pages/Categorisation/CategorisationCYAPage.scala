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
import uk.gov.hmrc.test.ui.conf.TestConfiguration
import uk.gov.hmrc.test.ui.pages.Base.BasePage

object CategorisationCYAPage extends BasePage {
  var Cdl: Int = 2
  var Sdl: Int = Cdl + 2
  var Ldl: Int = Sdl + 2

  def url: String =
    "/update-record/" + recordId + "/categorisation/check-your-answers"

  def assertPage(title: String): this.type         = {
    getRecordId()
    verifyTitle(title)
    verifyHeader(title)
    validateUrl(url)
    this
  }
  val serviceName: String                          = "Trader Goods Profile"
  private def verifyTitle(pageTitle: String): Unit =
    if (driver.getTitle != s"$pageTitle - $serviceName - GOV.UK")
      throw PageNotFoundException(
        s"Expected '$pageTitle' page, but found '${driver.getTitle}' page."
      )

  def verifyHeader(h1: String): this.type = {
    checkHeader(h1)
    this
  }

  def validateUrl(url: String): this.type                         = {
    checkURL(TestConfiguration.url("trader-goods-profiles-frontend") + url)
    this
  }
  def clickConditionsChangeLink(ChangelinkNumber: Int): this.type = {

    click(
      By.cssSelector(
        s"dl:nth-child($Cdl) > div:nth-child(" + ChangelinkNumber + ") > dd.govuk-summary-list__actions > a"
      )
    )

    this
  }

  def clickSupplementaryUnitChangeLink(ChangelinkNumber: Int): this.type = {

    click(
      By.cssSelector(
        s"dl:nth-child($Sdl) > div:nth-child(" + ChangelinkNumber + ") > dd.govuk-summary-list__actions > a"
      )
    )

    this
  }

  def clickLongerCommodityCodeChangeLink(ChangelinkNumber: Int): this.type = {

    click(
      By.cssSelector(
        s"dl:nth-child($Ldl) > div:nth-child(" + ChangelinkNumber + ") > dd.govuk-summary-list__actions > a"
      )
    )

    this
  }

  def verifyConditionsInput(field: String, expected: String): this.type = {
    val actual = field match {
      case "Category assessment 1 of 6" =>
        findBy(By.cssSelector(s"dl:nth-child($Cdl) > div:nth-child(1) > dd.govuk-summary-list__value")).getText
      case "Category assessment 2 of 6" =>
        findBy(By.cssSelector(s"dl:nth-child($Cdl) > div:nth-child(2) > dd.govuk-summary-list__value")).getText
      case "Category assessment 3 of 6" =>
        findBy(By.cssSelector(s"dl:nth-child($Cdl) > div:nth-child(3) > dd.govuk-summary-list__value")).getText
      case "Category assessment 4 of 6" =>
        findBy(By.cssSelector(s"dl:nth-child($Cdl) > div:nth-child(4) > dd.govuk-summary-list__value")).getText
      case "Category assessment 5 of 6" =>
        findBy(By.cssSelector(s"dl:nth-child($Cdl) > div:nth-child(5) > dd.govuk-summary-list__value")).getText
      case "Category assessment 6 of 6" =>
        findBy(By.cssSelector(s"dl:nth-child($Cdl) > div:nth-child(6) > dd.govuk-summary-list__value")).getText
    }

    Assert.assertEquals("Expected " + expected + " value but found " + actual + " instead.", expected, actual)
    this
  }

  def verifySupplementaryUnitInput(field: String, expected: String): this.type = {
    val actual = field match {
      case "Has Supplementary Unit" =>
        findBy(By.cssSelector(s"dl:nth-child($Sdl) > div:nth-child(1) > dd.govuk-summary-list__value")).getText
      case "Supplementary Unit"     =>
        findBy(By.cssSelector(s"dl:nth-child($Sdl) > div:nth-child(2) > dd.govuk-summary-list__value")).getText
    }

    Assert.assertEquals("Expected " + expected + " value but found " + actual + " instead.", expected, actual)
    this
  }

  def verifyLongerCommodityCodeInput(expected: String): this.type = {
    val actual = findBy(By.cssSelector(s"dl:nth-child($Ldl) > div:nth-child(1) > dd.govuk-summary-list__value")).getText

    Assert.assertEquals("Expected " + expected + " value but found " + actual + " instead.", expected, actual)
    this
  }
}
