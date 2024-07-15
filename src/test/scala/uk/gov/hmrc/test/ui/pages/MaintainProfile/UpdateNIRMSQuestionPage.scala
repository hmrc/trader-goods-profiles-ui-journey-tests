package uk.gov.hmrc.test.ui.pages.MaintainProfile

import uk.gov.hmrc.test.ui.pages.Base.Page

object UpdateNIRMSQuestionPage extends Page {

  override def title(args: String*): String = "Northern Ireland Retail Movement Scheme (NIRMS)"
  override def h1(args: String*): String    = "Northern Ireland Retail Movement Scheme (NIRMS)"
  override def url(args: String*): String   = "/update-profile/nirms-question"
}
