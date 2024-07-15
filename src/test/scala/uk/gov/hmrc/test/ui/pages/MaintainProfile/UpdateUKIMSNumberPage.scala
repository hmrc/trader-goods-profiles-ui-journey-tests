package uk.gov.hmrc.test.ui.pages.MaintainProfile

import uk.gov.hmrc.test.ui.pages.Base.Page

object UpdateUKIMSNumberPage extends Page {

  override def title(args: String*): String = "UK Internal Market Scheme (UKIMS) number"
  override def h1(args: String*): String    = "UK Internal Market Scheme (UKIMS) number"
  override def url(args: String*): String   = "/update-profile/ukims-number"
}
