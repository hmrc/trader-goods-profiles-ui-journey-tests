package uk.gov.hmrc.test.ui.cucumber.stepdefs.MaintainProfile

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.MaintainProfile.UpdateNIPHLNumberPage

class UpdateNIPHLNumberStepDef extends BaseStepDef {

  Then("""^(?:I )?should be on the update 'NIPHL registration number' page$""") { () =>
    UpdateNIPHLNumberPage
      .assertPage()
  }
}
