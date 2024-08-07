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

package uk.gov.hmrc.test.ui.cucumber.stepdefs.ProfileSetup

import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.conf.TestConfiguration
import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.AuthorityWizard
import uk.gov.hmrc.test.ui.pages.ProfileSetup._

class HomepageStepDef extends BaseStepDef {

  Then("""^(?:I )?should be on the 'Home' page$""") { () =>
    HomePage
      .assertPage()
  }

  Then("""^(?:I )?am on the 'Home' page with EORI (.+)""") { (eoriNumber: String) =>
    AuthorityWizard
      .validLogin(eoriNumber, TestConfiguration.authorise("trader-goods-profiles-Profile-setup"))
    submitPage()
    UKIMSNumberPage
      .fillInput("value", "XIUKIM47699357400020231115081800")
    submitPage()
    clickRadioBtn("No")
    submitPage()
    clickRadioBtn("No")
    submitPage()
    submitPage()
    CreateProfileSuccessPage.assertPage()
    click(By.partialLinkText("Go to homepage"))
    HomePage
      .assertPage()
  }
}
