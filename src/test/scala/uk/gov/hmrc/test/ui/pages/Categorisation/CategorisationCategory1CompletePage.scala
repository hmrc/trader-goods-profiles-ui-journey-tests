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

import uk.gov.hmrc.test.ui.conf.TestConfiguration
import uk.gov.hmrc.test.ui.pages.Base.BasePage

object CategorisationCategory1CompletePage extends BasePage {

  def title: String = "Category 1"
  def h1: String    = "Category 1"
  def url: String   = "/update-record/" + recordId + "/categorisation/result/"

  def assertPage(Cat: String): this.type = {
    getRecordId()
    verifyTitle(title)
    verifyHeader(h1)
    validateUrl(url + Cat)
    this
  }

  val serviceName: String = "Trader Goods Profile"

  private def verifyTitle(pageTitle: String): Unit =
    if (driver.getTitle != s"$pageTitle - $serviceName - GOV.UK")
      throw PageNotFoundException(
        s"Expected '$pageTitle' page, but found '${driver.getTitle}' page."
      )

  def verifyHeader(h1: String): this.type = {
//    checkPanelHeader(h1)
    checkHeader(h1)
    this
  }

  def validateUrl(url: String): this.type = {
    checkURL(TestConfiguration.url("trader-goods-profiles-frontend") + url)
    this
  }
}
