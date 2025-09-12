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

package uk.gov.hmrc.test.ui.pages.Base

import uk.gov.hmrc.test.ui.conf.TestConfiguration

trait Page extends BasePage {

  def title(args: String*): String
  def h1(args: String*): String
  def url(args: String*): String

  def assertPage(args: String*): this.type = {
    getRecordId()
    verifyTitle(title(args: _*))
    verifyHeader(h1(args: _*))
    validateUrl(url(args: _*))
    this
  }

  def assertCheckPage(args: String*): this.type = {
    getRecordId()
    verifyTitle(title(args: _*))
    verifyHeader(h1(args: _*))
    validateUrl(url(args: _*) + "/check")
    this
  }

  def assertQueryPage(args: String*): this.type = {
    getRecordId()
    verifyTitle(title(args: _*))
    verifyHeader(h1(args: _*))
    validateUrl(url(args: _*) + args(0))
    this
  }

  val serviceName: String = "Trader Goods Profile"

  private def verifyTitle(pageTitle: String): Unit = {
    val expected = pageTitle + " - " + serviceName + " - GOV.UK"
    if (driver.getTitle != expected)
      throw PageNotFoundException(
        s"Expected '$expected' page, but found '${driver.getTitle}' page."
      )
  }

  def verifyHeader(h1: String): this.type = {
    checkHeader(h1)
    this
  }

  def validateUrl(url: String): this.type = {
    checkURL(TestConfiguration.url("trader-goods-profiles-frontend") + url)
    this
  }
}
