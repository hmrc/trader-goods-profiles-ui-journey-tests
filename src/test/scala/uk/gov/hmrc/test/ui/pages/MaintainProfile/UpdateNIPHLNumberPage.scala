package uk.gov.hmrc.test.ui.pages.MaintainProfile

import uk.gov.hmrc.test.ui.pages.Base.Page

object UpdateNIPHLNumberPage extends Page {

  override def title(args: String*): String = "NIPHL registration number"
  override def h1(args: String*): String    = "NIPHL registration number"
  override def url(args: String*): String   = "/update-profile/niphl-number"
}
