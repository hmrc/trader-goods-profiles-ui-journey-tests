package uk.gov.hmrc.test.ui.cucumber.stepdefs.MaintainProfile

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.MaintainProfile.RemovingNIRMSNumberPage

class RemovingNIRMSNumberStepDef extends BaseStepDef {

  Then("""^(?:I )?should be on the 'Removing NIRMS details' page$""") { () =>
    RemovingNIRMSNumberPage
      .assertPage()
  }
}
