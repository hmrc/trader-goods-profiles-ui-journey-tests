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

package uk.gov.hmrc.test.ui.cucumber.stepdefs.Categorisation

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Categorisation.SupplementaryUnitPage

class SupplementaryUnitStepDef extends BaseStepDef {
  And("""^(?:I )?navigate to the 'Supplementary Unit' page$""") { () =>
    SupplementaryUnitPage
      .navigateToPage()
  }

  Then("""^(?:I )?should be on the 'Supplementary Unit' page$""") { () =>
    SupplementaryUnitPage
      .assertPage()
  }

  Then("""^(?:I )?should be on the check 'Supplementary Unit' page$""") { () =>
    SupplementaryUnitPage
      .assertCheckPage()
  }
}
