package uk.gov.hmrc.test.ui.cucumber.stepdefs.MaintainProfile

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.MaintainProfile.ProfileDetailsPage

class ProfileDetailsStepDef extends BaseStepDef {

  Then("""^(?:I )?should be on the 'Profile details' page$""") { () =>
    ProfileDetailsPage
      .assertPage()
  }

  Then("""^(?:My )?'(.*)' has the value (.*)$""") { (key1: String, key2: String) =>
    key1 match {
      case "UKIMS Number" =>
        ProfileDetailsPage
          .verifyInput("ukimsNumber", key2)
      case "NIPHL Question" =>
        ProfileDetailsPage
          .verifyInput("niphlQuestion", key2)
      case "NIRMS Question" =>
        ProfileDetailsPage
          .verifyInput("nirmsQuestion", key2)
      case "NIPHL Number" =>
        ProfileDetailsPage
          .verifyInput("niphlNumber", key2)
      case "NIRMS Number" =>
        ProfileDetailsPage
          .verifyInput("nirmsNumber", key2)
    }
  }

//  Then("""^(?:My )?'UKIMS Number' has the value (.*)$""") { (key: String) =>
//    ProfileDetailsPage
//      .verifyInput("ukimsNumber", key)
//  }
//
//  Then("""^(?:My )?'NIPHL Question' has the value (.*)$""") { (key: String) =>
//    ProfileDetailsPage
//      .verifyInput("niphlQuestion", key)
//  }
//
//  Then("""^(?:My )?'NIRMS Question' has the value (.*)$""") { (key: String) =>
//    ProfileDetailsPage
//      .verifyInput("nirmsQuestion", key)
//  }
//
//  Then("""^(?:My )?'NIPHL Number' has the value (.*)$""") { (key: String) =>
//    ProfileDetailsPage
//      .verifyInput("niphlNumber", key)
//  }
//
//  Then("""^(?:My )?'NIRMS Number' has the value (.*)$""") { (key: String) =>
//    ProfileDetailsPage
//      .verifyInput("nirmsNumber", key)
//  }
}
