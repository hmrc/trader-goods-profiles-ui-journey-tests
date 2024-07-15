package uk.gov.hmrc.test.ui.pages.MaintainProfile

import uk.gov.hmrc.test.ui.pages.Base.Page

object RemovingNIPHLNumberPage extends Page {

  override def title(args: String*): String = "hasNiphlsChange" // should be "Removing NIPHL number"
  override def h1(args: String*): String    = "Removing NIPHL number"
  override def url(args: String*): String   = "/update-profile/removing-niphls-number" // should be /removing-niphl-number

}
