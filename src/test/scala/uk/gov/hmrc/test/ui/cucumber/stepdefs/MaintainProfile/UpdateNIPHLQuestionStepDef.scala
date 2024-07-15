package uk.gov.hmrc.test.ui.cucumber.stepdefs.MaintainProfile

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.MaintainProfile.UpdateNIPHLQuestionPage

class UpdateNIPHLQuestionStepDef extends BaseStepDef {

  Then("""^(?:I )?should be on the update 'Northern Ireland plant health label' page$""") { () =>
    UpdateNIPHLQuestionPage
      .assertPage()
  }
}
