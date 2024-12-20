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

import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.pages.Base.BasePage

object NIRMSProductEligibilityPage extends BasePage {

  def title(): String = "Northern Ireland Retail Movement Scheme: how the scheme will work"

  def assertPage(): this.type = {
    verifyTitle(title())
    verifyHeader(title())
    this
  }

  private def verifyTitle(pageTitle: String): Unit =
    if (driver.getTitle != s"$pageTitle - GOV.UK")
      throw PageNotFoundException(
        s"Expected '$pageTitle' page, but found '${driver.getTitle}' page."
      )

  def verifyHeader(h1: String): this.type = {
    findBy(By.className("govuk-heading-xl")).getText.shouldEqual(h1)
    this
  }
}
