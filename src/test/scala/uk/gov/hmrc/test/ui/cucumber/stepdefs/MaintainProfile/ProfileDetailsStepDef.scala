package uk.gov.hmrc.test.ui.cucumber.stepdefs.MaintainProfile

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.MaintainProfile.ProfileDetailsPage

class ProfileDetailsStepDef extends BaseStepDef {

  Then("""^(?:I )?should be on the 'Profile details' page$""") { () =>
    ProfileDetailsPage
      .assertPage()
  }

  Then("""^(?:My )?'(.*)' has the value (.*)$""") { (key: String, value: String) =>
    key match {
      case "UKIMS Number" =>
        ProfileDetailsPage
          .verifyInput("ukimsNumber", value)
      case "NIPHL Question" =>
        ProfileDetailsPage
          .verifyInput("niphlQuestion", value)
      case "NIRMS Question" =>
        ProfileDetailsPage
          .verifyInput("nirmsQuestion", value)
      case "NIPHL Number" =>
        ProfileDetailsPage
          .verifyInput("niphlNumber", value)
      case "NIRMS Number" =>
        ProfileDetailsPage
          .verifyInput("nirmsNumber", value)
    }
  }
}
