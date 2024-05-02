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

import uk.gov.hmrc.test.ui.pages.Base.BasePage

object NIPHLPage extends BasePage {

  def title(): String =
    "Moving plants from Great Britain to Northern Ireland"

  def verifyPageTitle(): this.type = {
    onPage(title())
    this
  }

  private def onPage(pageTitle: String): Unit =
    if (driver.getTitle != s"$pageTitle - GOV.UK")
      throw PageNotFoundException(
        s"Expected '$pageTitle' page, but found '${driver.getTitle}' page."
      )

}
