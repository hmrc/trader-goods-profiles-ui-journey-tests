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

import org.mongodb.scala.{Document, MongoClient}
import org.openqa.selenium.support.ui.{ExpectedConditions, FluentWait}
import org.openqa.selenium._
import org.scalatest.matchers.should.Matchers
import uk.gov.hmrc.test.ui.conf.TestConfiguration.config
import uk.gov.hmrc.test.ui.driver.BrowserDriver

import java.time.temporal.ChronoUnit
import java.time.{Duration, Instant}
import java.util.Date
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
    dropCollection("trader-goods-profiles-data-store", "downloadDataSummary")
  }

  def loadTraderProfiles(): Unit = {
    println("============================Loading Goods Trader Profiles")

    Await.result(
      mongoClient
        .getDatabase("trader-goods-profiles-hawk-stub")
        .getCollection("traderProfiles")
        .insertMany(
          Seq(
            Document(
              "eori"        -> "GB000012340002",
              "actorId"     -> "GB000012340002",
              "ukimsNumber" -> "XIUKIM00001234000220240207140148",
              "lastUpdated" -> new Date()
            )
          )
        )
        .toFuture(),
      10 seconds
    )
  }

  def loadDownloadDataSummaries(): Unit = {
    println("============================Loading Download Data Summaries")

    val localDate    = Date.from(Instant.now)
    val newLocalDate = Date.from(Instant.now.plus(30, ChronoUnit.DAYS))

    Await.result(
      mongoClient
        .getDatabase("trader-goods-profiles-data-store")
        .getCollection("downloadDataSummary")
        .insertMany(
          Seq(
            Document(
              "summaryId" -> "3b1c50e6-3ae6-11ef-a2ec-325096b39f44",
              "eori"      -> "GB123456789098",
              "status"    -> "FileReadyUnseen",
              "createdAt" -> localDate,
              "expiresAt" -> newLocalDate,
              "fileInfo"  -> Document(
                "fileName"      -> "test",
                "fileSize"      -> 600,
                "retentionDays" -> "30"
              )
            )
          )
        )
        .toFuture(),
      10 seconds
    )
  }

  def loadGoodsItemRecords(): Unit = {
    println("============================Loading Goods Item Records")

    Await.result(
      mongoClient
        .getDatabase("trader-goods-profiles-hawk-stub")
        .getCollection("goodsItemRecords")
        .insertMany(
          Seq(
            Document(
              "recordId"  -> "3b1c50e6-3ae6-11ef-a2ec-325096b39f47",
              "goodsItem" -> Document(
                "eori"                     -> "GB123456789098",
                "actorId"                  -> "GB123456789098",
                "traderRef"                -> "GB - 22030001 - In bottles",
                "comcode"                  -> "22030001",
                "goodsDescription"         -> "In bottles",
                "countryOfOrigin"          -> "GB",
                "category"                 -> 1,
                "comcodeEffectiveFromDate" -> new Date(),
                "comcodeEffectiveToDate"   -> new Date()
              ),
              "metadata"  -> Document(
                "accreditationStatus" -> "Not Requested",
                "version"             -> 1,
                "active"              -> true,
                "locked"              -> false,
                "toReview"            -> false,
                "srcSystemName"       -> "MDTP",
                "createdDateTime"     -> new Date(),
                "updatedDateTime"     -> new Date()
              )
            ),
            Document(
              "recordId"  -> "3b1c50e6-3ae6-11ef-a2ec-325096b39f42",
              "goodsItem" -> Document(
                "eori"                     -> "GB123456789098",
                "actorId"                  -> "GB123456789098",
                "traderRef"                -> "GB - 22030001 - In bottles 2",
                "comcode"                  -> "22030001",
                "goodsDescription"         -> "In bottles",
                "countryOfOrigin"          -> "GB",
                "category"                 -> 1,
                "comcodeEffectiveFromDate" -> new Date(),
                "comcodeEffectiveToDate"   -> new Date()
              ),
              "metadata"  -> Document(
                "accreditationStatus" -> "Requested",
                "version"             -> 1,
                "active"              -> true,
                "locked"              -> false,
                "toReview"            -> false,
                "srcSystemName"       -> "MDTP",
                "createdDateTime"     -> new Date(),
                "updatedDateTime"     -> new Date()
              )
            ),
            Document(
              "recordId"  -> "3b1c558c-3ae6-11ef-a611-325096b39f45",
              "goodsItem" -> Document(
                "eori"                     -> "GB123456789099",
                "actorId"                  -> "GB123456789099",
                "traderRef"                -> "GB - 0101291000 - For slaughter",
                "comcode"                  -> "101291000",
                "goodsDescription"         -> "For slaughter",
                "countryOfOrigin"          -> "GB",
                "category"                 -> 1,
                "comcodeEffectiveFromDate" -> new Date(),
                "comcodeEffectiveToDate"   -> new Date()
              ),
              "metadata"  -> Document(
                "accreditationStatus" -> "In progress",
                "version"             -> 1,
                "active"              -> true,
                "locked"              -> false,
                "toReview"            -> false,
                "srcSystemName"       -> "MDTP",
                "createdDateTime"     -> new Date(),
                "updatedDateTime"     -> new Date()
              )
            ),
            Document(
              "recordId"  -> "3b1c5654-3ae6-11ef-9541-325096b39s90",
              "goodsItem" -> Document(
                "eori"                     -> "GB123456789099",
                "actorId"                  -> "GB123456789099",
                "traderRef"                -> "GB - 11032050 - Of rice",
                "comcode"                  -> "11032050",
                "goodsDescription"         -> "Of rice",
                "countryOfOrigin"          -> "GB",
                "category"                 -> 1,
                "comcodeEffectiveFromDate" -> new Date(),
                "comcodeEffectiveToDate"   -> new Date()
              ),
              "metadata"  -> Document(
                "accreditationStatus" -> "In progress",
                "version"             -> 1,
                "active"              -> true,
                "locked"              -> false,
                "toReview"            -> false,
                "srcSystemName"       -> "MDTP",
                "createdDateTime"     -> new Date(),
                "updatedDateTime"     -> new Date()
              )
            ),
            Document(
              "recordId"  -> "000c50e6-3ae6-11ef-a2ec-325096b39f47",
              "goodsItem" -> Document(
                "eori"                     -> "GB123456789098",
                "actorId"                  -> "GB123456789098",
                "traderRef"                -> "GB - Reason: measure - In bottles",
                "comcode"                  -> "22030001",
                "goodsDescription"         -> "In bottles",
                "countryOfOrigin"          -> "GB",
                "category"                 -> 1,
                "comcodeEffectiveFromDate" -> new Date(),
                "comcodeEffectiveToDate"   -> new Date()
              ),
              "metadata"  -> Document(
                "accreditationStatus" -> "Information Requested",
                "version"             -> 1,
                "active"              -> true,
                "locked"              -> false,
                "toReview"            -> true,
                "reviewReason"        -> "measure",
                "srcSystemName"       -> "MDTP",
                "createdDateTime"     -> new Date(),
                "updatedDateTime"     -> new Date()
              )
            ),
            Document(
              "recordId"  -> "001c50e6-3ae6-11ef-a2ec-325096b39f47",
              "goodsItem" -> Document(
                "eori"                     -> "GB123456789098",
                "actorId"                  -> "GB123456789098",
                "traderRef"                -> "GB - Reason: mismatch - In bottles",
                "comcode"                  -> "22030001",
                "goodsDescription"         -> "In bottles",
                "countryOfOrigin"          -> "GB",
                "category"                 -> 1,
                "comcodeEffectiveFromDate" -> new Date(),
                "comcodeEffectiveToDate"   -> new Date()
              ),
              "metadata"  -> Document(
                "accreditationStatus" -> "Withdrawn",
                "version"             -> 1,
                "active"              -> true,
                "locked"              -> false,
                "toReview"            -> true,
                "reviewReason"        -> "mismatch",
                "srcSystemName"       -> "MDTP",
                "createdDateTime"     -> new Date(),
                "updatedDateTime"     -> new Date()
              )
            ),
            Document(
              "recordId"  -> "002c50e6-3ae6-11ef-a2ec-325096b39f47",
              "goodsItem" -> Document(
                "eori"                     -> "GB123456789098",
                "actorId"                  -> "GB123456789098",
                "traderRef"                -> "GB - Reason: unclear - In bottles",
                "comcode"                  -> "22030001",
                "goodsDescription"         -> "In bottles",
                "countryOfOrigin"          -> "GB",
                "category"                 -> 1,
                "comcodeEffectiveFromDate" -> new Date(),
                "comcodeEffectiveToDate"   -> new Date()
              ),
              "metadata"  -> Document(
                "accreditationStatus" -> "Approved",
                "version"             -> 1,
                "active"              -> true,
                "locked"              -> false,
                "toReview"            -> true,
                "reviewReason"        -> "unclear",
                "srcSystemName"       -> "MDTP",
                "createdDateTime"     -> new Date(),
                "updatedDateTime"     -> new Date()
              )
            ),
            Document(
              "recordId"  -> "003c50e6-3ae6-11ef-a2ec-325096b39f47",
              "goodsItem" -> Document(
                "eori"                     -> "GB123456789098",
                "actorId"                  -> "GB123456789098",
                "traderRef"                -> "GB - Reason: inadequate - In bottles",
                "comcode"                  -> "22030001",
                "goodsDescription"         -> "In bottles",
                "countryOfOrigin"          -> "GB",
                "category"                 -> 1,
                "comcodeEffectiveFromDate" -> new Date(),
                "comcodeEffectiveToDate"   -> new Date()
              ),
              "metadata"  -> Document(
                "accreditationStatus" -> "Rejected",
                "version"             -> 1,
                "active"              -> true,
                "locked"              -> false,
                "toReview"            -> true,
                "reviewReason"        -> "inadequate",
                "srcSystemName"       -> "MDTP",
                "createdDateTime"     -> new Date(),
                "updatedDateTime"     -> new Date()
              )
            ),
            Document(
              "recordId"  -> "004c50e6-3ae6-11ef-a2ec-325096b39f47",
              "goodsItem" -> Document(
                "eori"                     -> "GB123456789098",
                "actorId"                  -> "GB123456789098",
                "traderRef"                -> "GB - Reason: commodity - In bottles",
                "comcode"                  -> "22030001",
                "goodsDescription"         -> "In bottles",
                "countryOfOrigin"          -> "GB",
                "category"                 -> 1,
                "comcodeEffectiveFromDate" -> new Date(),
                "comcodeEffectiveToDate"   -> new Date()
              ),
              "metadata"  -> Document(
                "accreditationStatus" -> "Not Requested",
                "version"             -> 1,
                "active"              -> true,
                "locked"              -> false,
                "toReview"            -> true,
                "reviewReason"        -> "commodity",
                "srcSystemName"       -> "MDTP",
                "createdDateTime"     -> new Date(),
                "updatedDateTime"     -> new Date()
              )
            )
          )
        )
        .toFuture(),
      10 seconds
    )
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

  def clickChangeLink(key: String): Unit =
    click(By.xpath(s"(//a[text()='Change'])[$key]"))

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

  def checkSecondaryHeader(content: String): Unit =
    findBy(By.className("govuk-label--l")).getText.shouldEqual(content)

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

  def clickFirstCheckboxItem(): this.type = {
    click(By.xpath("//input[@type='checkbox'][1]"))
    this
  }

  def clickLastCheckboxItem(): this.type = {
    click(By.xpath("(//input[@type='checkbox'])[last()]"))
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
