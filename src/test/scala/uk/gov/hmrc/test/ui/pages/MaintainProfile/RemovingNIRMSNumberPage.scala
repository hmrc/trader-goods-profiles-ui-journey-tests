package uk.gov.hmrc.test.ui.pages.MaintainProfile

import uk.gov.hmrc.test.ui.pages.Base.Page

object RemovingNIRMSNumberPage extends Page {

  override def title(args: String*): String = "hasNirmsChange" // should be "Removing NIRMS details"
  override def h1(args: String*): String    = "Removing NIRMS details"
  override def url(args: String*): String   = "/update-profile/removing-niphls-number"

}
