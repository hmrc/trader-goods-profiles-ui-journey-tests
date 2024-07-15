package uk.gov.hmrc.test.ui.cucumber.stepdefs.MaintainProfile

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.MaintainProfile.RemovingNIPHLNumberPage

class RemovingNIPHLNumberStepDef extends BaseStepDef {

  Then("""^(?:I )?should be on the 'Removing NIPHL details' page$""") { () =>
    RemovingNIPHLNumberPage
      .assertPage()
  }
}
