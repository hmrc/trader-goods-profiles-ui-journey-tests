package uk.gov.hmrc.test.ui.pages.MaintainProfile

import uk.gov.hmrc.test.ui.pages.Base.Page

object UpdateNIPHLQuestionPage extends Page {

  override def title(args: String*): String = "Northern Ireland plant health label (NIPHL)"
  override def h1(args: String*): String    = "Northern Ireland plant health label (NIPHL)"
  override def url(args: String*): String   = "/update-profile/niphl-question"
}
