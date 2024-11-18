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

import org.openqa.selenium.{By, WebElement}
import uk.gov.hmrc.test.ui.conf.TestConfiguration
import uk.gov.hmrc.test.ui.pages.Base.BasePage

object AuthorityWizard extends BasePage {

  def validLogin(eorinumber: String, url: String): this.type = {
    verifyPageTitle()
    fillInputs(eorinumber, url)
    submitPage()
    this
  }

  def invalidLogin(): this.type = {
    verifyPageTitle()
    fillInvalidInputs()
    submitPage()
    this
  }

  def verifyPageTitle(): this.type = {
    val url: String = TestConfiguration.url("auth-login-stub")
    driver.navigate().to(url)
    this
  }

  def navigateTo(url: String): Unit     = driver.navigate().to(url)
  def findElementBy(by: By): WebElement = driver.findElement(by)

  def fillInputs(eoriNumber: String, url: String): this.type = {

    findById("redirectionUrl").sendKeys(url)
    findById("enrolment[0].name").sendKeys("HMRC-CUS-ORG")
    findById("input-0-0-name").sendKeys("EORINumber")
    findById("input-0-0-value").sendKeys(eoriNumber)
    this
  }

  def fillInvalidInputs(): this.type = {
    val redirectionUrl = TestConfiguration.authorise("trader-goods-profiles")
    findById("redirectionUrl").sendKeys(redirectionUrl)
    findById("enrolment[0].name").sendKeys("Invalid-name")
    findById("input-0-0-name").sendKeys("Invalid-identifier")
    this
  }
}
