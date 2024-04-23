package uk.gov.hmrc.ui

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

package object pages {
  implicit class ByExtension(val by: By) extends AnyVal {
    def find(implicit driver: WebDriver): WebElement = driver.findElement(by)
  }

  implicit class WebElementExtension(val element: WebElement) extends AnyVal {
    def click(): Unit = element.click()

    def enterText(text: String): WebElement = {
      element.clear()
      element.sendKeys(text)
      element
    }
  }
}
