/*
 * Copyright 2023 HM Revenue & Customs
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

package uk.gov.hmrc.ui.pages

import org.openqa.selenium.{By, WebDriver}
import org.scalatest.matchers.should.Matchers
import uk.gov.hmrc.ui.conf.TestConfiguration
import uk.gov.hmrc.ui.driver.BrowserDriver

trait BasePage extends BrowserDriver with Matchers {}

object BasePage {
  lazy val baseUrl    = TestConfiguration.environmentHost
  val URL_TGPHomePage = s"$baseUrl/trader-goods-profiles"

  def invokeURL(
    url: String
  )(implicit
    driver: WebDriver
  ): Unit = {
    driver.manage().deleteAllCookies()
    driver.navigate().to(url)
    val titlecheck = driver.getTitle
    if (titlecheck == "Authority Wizard") {
      driver.findElement(By.id("redirectionUrl")).clear()
      driver.findElement(By.id("redirectionUrl")).sendKeys(URL_TGPHomePage)
    }
  }
}
