package uk.gov.hmrc.test.ui.pages.MaintainProfile

import org.junit.Assert
import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.pages.Base.Page

object ProfileDetailsPage extends Page {

  override def title(args: String*): String = "Profile details"
  override def h1(args: String*): String    = "Profile details"
  override def url(args: String*): String   = "/update-profile/profile-information"

  def verifyInput(field: String, expected: String): this.type = {
    val actual = field match {
      case "ukimsNumber" => findBy(By.cssSelector("div:nth-child(1) > dd.govuk-summary-list__value")).getText
      case "nirmsQuestion" => findBy(By.cssSelector("div:nth-child(2) > dd.govuk-summary-list__value")).getText
      case "nirmsNumber" => findBy(By.cssSelector("div:nth-child(3) > dd.govuk-summary-list__value")).getText
      case "niphlQuestion" => findBy(By.cssSelector("div:nth-child(4) > dd.govuk-summary-list__value")).getText
      case "niphlNumber" => findBy(By.cssSelector("div:nth-child(5) > dd.govuk-summary-list__value")).getText
    }
    Assert.assertEquals("Expected " + expected + " value but found " + actual + " instead.", expected, actual)
    this
  }
}
