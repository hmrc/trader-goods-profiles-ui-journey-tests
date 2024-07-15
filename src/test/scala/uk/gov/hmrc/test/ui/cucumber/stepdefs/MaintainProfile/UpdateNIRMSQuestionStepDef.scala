package uk.gov.hmrc.test.ui.cucumber.stepdefs.MaintainProfile

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.MaintainProfile.UpdateNIRMSQuestionPage

class UpdateNIRMSQuestionStepDef extends BaseStepDef {

  Then("""^(?:I )?should be on the update 'Northern Ireland Retail Movement Scheme' page$""") { () =>
    UpdateNIRMSQuestionPage
      .assertPage()
  }
}
