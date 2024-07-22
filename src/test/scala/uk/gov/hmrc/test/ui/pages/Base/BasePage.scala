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

import org.mongodb.scala.MongoClient
import org.mongodb.scala.bson.collection.mutable.Document
import org.openqa.selenium.support.ui.{ExpectedConditions, FluentWait}
import org.openqa.selenium._
import org.scalatest.matchers.should.Matchers
import uk.gov.hmrc.test.ui.conf.TestConfiguration.config
import uk.gov.hmrc.test.ui.driver.BrowserDriver

import java.time.Duration
import scala.collection.mutable
import scala.concurrent.Await
import scala.concurrent.duration.DurationInt
import scala.jdk.CollectionConverters.CollectionHasAsScala
import scala.language.postfixOps

trait BasePage extends BrowserDriver with Matchers {
  var recordId = ""

  private lazy val mongoClient: MongoClient = MongoClient()

  def dropCollections(): Unit = {
    println("============================Dropping Collection")

    def dropCollection(dbName: String, collectionName: String): Unit =
      Await.result(
        mongoClient.getDatabase(dbName).getCollection(collectionName).drop().toFuture(),
        10 seconds
      )
    dropCollection("trader-goods-profiles-hawk-stub", "traderProfiles")
    dropCollection("trader-goods-profiles-hawk-stub", "goodsItemRecords")
    dropCollection("trader-goods-profiles-data-store", "profiles")
    dropCollection("trader-goods-profiles-data-store", "checkRecords")
    dropCollection("trader-goods-profiles-data-store", "goodsItemRecords")
  }

  def loadGoodsItemRecords(): Unit = {
    println("============================Loading Goods Item Records")

    val r: Runtime = Runtime.getRuntime()

    val command =
      "mongoimport --db trader-goods-profiles-hawk-stub --collection goodsItemRecords --file goods-item-records-setup.json --jsonArray"
    r.exec(command)
  }

  def loadTraderProfiles(): Unit = {
    println("============================Loading Trader Profiles")

    val r: Runtime = Runtime.getRuntime()

    val command =
      "mongoimport --db trader-goods-profiles-hawk-stub --collection traderProfiles --file trader-profiles-setup.json --jsonArray"
    r.exec(command)
  }

  def getRecordId(): Unit = {
    val recordIdPattern = """[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{12}""".r
    val url             = driver.getCurrentUrl
    recordIdPattern.findFirstIn(url) match {
      case Some(draft) =>
        recordId = draft
      case _           => None
    }
  }

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

  def verifyErrorMessage(message: String): Unit =
    findBy(By.className("govuk-error-message")).getText.shouldEqual(s"Error:\n" + message)

  def clickBackLink(): Unit = clickByClassName("govuk-back-link")

  private def bringIntoView(by: By, action: WebElement => Unit): Unit = {
    val element = findBy(by)
    jse.executeScript("arguments[0].scrollIntoView()", element)
    action(element)
  }

  def checkForContent(content: String): Unit =
    findBy(By.id("main-content")).getText.contains(content)

  def checkHeader(content: String): Unit =
    findBy(By.className("govuk-heading-l")).getText.shouldEqual(content)

  def checkURL(url: String): Unit =
    driver.getCurrentUrl.shouldEqual(url)

  def checkPanelHeader(content: String): Unit =
    findBy(By.className("govuk-panel__title")).getText.shouldEqual(content)

  def clickRadioBtn(answer: String): this.type = {
    answer match {
      case "Yes" => clickById("value")
      case "No"  => clickById("value-no")
    }
    this
  }

  def clickRadioOpt(Option: String): this.type = {
    Option match {
      case "First"             => clickById("value_0")
      case "Second"            => clickById("value_1")
      case "Third"             => clickById("value_2")
      case "Fourth"            => clickById("value_3")
      case "None of the above" => click(By.xpath("//input[@value=\"none\"]"))
    }
    this
  }

  def isRadioBtnSelected(answer: String): Boolean = {
    val selected: Boolean = answer match {
      case "Yes" => findById("value").isSelected
      case "No"  => findById("value-no").isSelected
    }
    selected
  }

  def fillInput(id: String, input: String): this.type = {
    fillInputById(id, input)
    this
  }

  def clearInput(input: WebElement): Unit = input.clear()

  def fillInputById(id: String, text: String): Unit = {
    val input = findBy(By.id(id))
    clearInput(input)
    input.sendKeys(text)
  }

  def randomAlphaNumericString(length: Int): String = {
    val chars = ('a' to 'z') ++ ('A' to 'Z') ++ ('0' to '9')

    def randomStringFromCharList(chars: Seq[Char]): String = {
      val sb = new mutable.StringBuilder
      for (_ <- 1 to length) {
        val randomNum = util.Random.nextInt(chars.length)
        sb.append(chars(randomNum))
      }
      sb.toString
    }

    randomStringFromCharList(chars)
  }
  def select(answer: String): this.type             = {
    selectValueFromDropDown(answer)
    this
  }

  protected def selectValueFromDropDown(valueOption: String, id: String = "value"): Unit = {
    findBy(By.id(id))
    fillInputById(id, valueOption)
    selectFirstValue(id)
  }

  def clearSelectInput(input: WebElement): Unit = {
    val length = findById("value-select")
      .findElements(By.tagName("option"))
      .asScala
      .find(_.isSelected)
      .map(_.getAttribute("innerText").length)
      .getOrElse(0)

    (0 until length).foreach(_ => input.sendKeys(Keys.BACK_SPACE))
  }

  protected def openDropdownAndSelectFirstValue(id: String): Unit = {
    clickById(id)
    selectFirstValue(id)
  }

  private def selectFirstValue(id: String): Unit =
    clickById(s"${id}__option--0")

  case class PageNotFoundException(s: String) extends Exception(s)

  case class InvalidTitleArgsException(s: String) extends Exception(s)
}
