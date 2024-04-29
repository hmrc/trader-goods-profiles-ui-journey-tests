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

import org.openqa.selenium.support.ui.{ExpectedConditions, FluentWait}
import org.openqa.selenium.{By, JavascriptExecutor, WebDriver, WebElement}
import org.scalatest.matchers.should.Matchers
import uk.gov.hmrc.test.ui.conf.TestConfiguration.config
import uk.gov.hmrc.test.ui.driver.BrowserDriver

import java.time.Duration

trait BasePage extends BrowserDriver with Matchers {

  private lazy val fluentWait: FluentWait[WebDriver] = new FluentWait[WebDriver](driver)
    .withTimeout(Duration.ofSeconds(config.getInt("wait.timeout.seconds")))
    .pollingEvery(Duration.ofMillis(config.getInt("wait.poll.seconds")))
    .ignoring(classOf[Exception])

  private lazy val jse: JavascriptExecutor = driver.asInstanceOf[JavascriptExecutor]

  def findSiblingByText(text: String): WebElement =
    driver.findElement(By.xpath(s"//td[contains(.,'$text')]//following-sibling::td[2]"))

  def deleteCookies(): Unit = {
    println("============================Clearing cookies")
    driver.manage().deleteAllCookies()
  }

  def findBy(by: By): WebElement = fluentWait.until(ExpectedConditions.presenceOfElementLocated(by))

  def findById(id: String): WebElement = findBy(By.id(id))

  def click(by: By): Unit = bringIntoView(by, _.click)

  def clickById(id: String): Unit = click(By.id(id))

  def clickByClassName(className: String): Unit = click(By.className(className))

  def clickByPartialLinkText(linkText: String): Unit = click(By.partialLinkText(linkText))

  def submitPage(): Unit = clickByClassName("govuk-button")

  def clickBackLink(): Unit = clickByClassName("govuk-back-link")

  private def bringIntoView(by: By, action: WebElement => Unit): Unit = {
    val element = findBy(by)
    jse.executeScript("arguments[0].scrollIntoView()", element)
    action(element)
  }

  def checkForContent(content: String): Unit =
    findBy(By.id("main-content")).getText.contains(content)
}

case class PageNotFoundException(s: String) extends Exception(s)

case class InvalidTitleArgsException(s: String) extends Exception(s)
