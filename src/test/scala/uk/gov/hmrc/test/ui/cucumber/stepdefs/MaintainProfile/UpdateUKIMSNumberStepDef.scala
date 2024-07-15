package uk.gov.hmrc.test.ui.cucumber.stepdefs.MaintainProfile

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.MaintainProfile.UpdateUKIMSNumberPage

class UpdateUKIMSNumberStepDef extends BaseStepDef {

  Then("""^(?:I )?should be on the update 'UK internal scheme number' page$""") { () =>
    UpdateUKIMSNumberPage
      .assertPage()
  }
}
