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

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.support.ui.ExpectedConditions
import uk.gov.hmrc.test.ui.pages.Base.BasePage

object NIRMSPage extends BasePage {

  def title(): String =
    "Northern Ireland Retail Movement Scheme: how to register and seal consignments"

  def assertPage(): this.type = {
    verifyTitle(title())
    verifyHeader(title())
    this
  }

  private def verifyTitle(pageTitle: String): Unit =
    fluentWait.until(ExpectedConditions.titleContains(s"$pageTitle - GOV.UK"))
    if (driver.getTitle != s"$pageTitle - GOV.UK")
      throw PageNotFoundException(
        s"Expected '$pageTitle' page, but found '${driver.getTitle}' page."
      )

  def verifyHeader(h1: String): this.type = {
    checkHeader(h1)
    this
  }
}
