/*
 * Copyright 2024 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import uk.gov.hmrc.test.ui.conf.TestConfiguration
import uk.gov.hmrc.test.ui.pages.AuthorityWizard

class LoginStepDef extends BaseStepDef {

  And("""^I login to TGP with EORI number (.*)$""") { (EORINumber: String) =>
    AuthorityWizard
      .validLogin(EORINumber, TestConfiguration.authorise("trader-goods-profiles"))
  }

  And("I login to TGP with Invalid details") { () =>
    AuthorityWizard
      .invalidLogin()
  }
}
