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

object CategorisationResultPage extends Page {

  override def title(args: String*): String = "Categorisation complete"
  override def h1(args: String*): String    = "Categorisation complete"

  override def assertPage(args: String*): this.type = {
    verifyTitle(title())
    checkPanelHeader(h1())
    this
  }

  private def verifyTitle(pageTitle: String): Unit =
    if (driver.getTitle != s"$pageTitle - $serviceName - GOV.UK")
      throw PageNotFoundException(
        s"Expected '$pageTitle' page, but found '${driver.getTitle}' page."
      )

  def verifyResult(expected: String): this.type = {
    val actual: String = findBy(By.cssSelector("div.govuk-panel.govuk-panel--confirmation > div > p")).getText

    Assert.assertEquals("Expected " + expected + " but found " + actual + " instead.", expected, actual)

    this
  }
}
