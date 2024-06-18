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

package uk.gov.hmrc.test.ui.cucumber.stepdefs.CreateGoods

import uk.gov.hmrc.test.ui.conf.TestConfiguration
import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.AuthorityWizard
import uk.gov.hmrc.test.ui.pages.CreateGoods.{CountryOfOriginPage, CreateCommodityCodePage, CreateRecordSuccessPage, TraderReferencePage}

class CreateRecordSuccessStepDef extends BaseStepDef {

  Then("""^(?:I )?(am|should be) on the 'Create record success' page$""") { (amShould: String) =>
    amShould match {
      case "am"        =>
        CreateRecordSuccessPage
          .assertPage()
      case "should be" =>
        CreateRecordSuccessPage
          .assertPage()
    }
  }
}
