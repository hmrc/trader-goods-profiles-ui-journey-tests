package uk.gov.hmrc.test.ui.pages.MaintainProfile

import uk.gov.hmrc.test.ui.pages.Base.Page

object UpdateNIRMSNumberPage extends Page {

  override def title(args: String*): String = "Northern Ireland Retail Movement Scheme number"
  override def h1(args: String*): String    = "What is your NIRMS number?"
  override def url(args: String*): String   = "/update-profile/nirms-number"
}
