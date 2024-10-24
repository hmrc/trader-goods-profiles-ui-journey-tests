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
import uk.gov.hmrc.test.ui.pages.Categorisation.CategorisationAssessmentPage

class CategorisationQuestionStepDef extends BaseStepDef {

  Then("""^(?:I )?should be on the 'Category assessment(.+) of (.+)' page$""") { (number: String, total: String) =>
    CategorisationAssessmentPage
      .assertPage(number, total)
  }

  Then("""^(?:I )?should be on the check 'Category assessment(.+) of (.+)' page$""") { (number: String, total: String) =>
    CategorisationAssessmentPage
      .assertCheckPage(number, total)
  }

  Then("""^(?:I )?should be on the 'Category assessment(.+) of (.+)' page for Longer Commodity code$""") { (number: String, total: String) =>
    CategorisationAssessmentPage
      .assertRecategorisePage(number, total)
  }

  Then("""^(?:I )?should be on the check 'Category assessment(.+) of (.+)' page for Longer Commodity code$""") {
    (number: String, total: String) =>
      CategorisationAssessmentPage
        .assertRecategoriseCheckPage(number, total)
  }

  Then("""^(?:I )?select (.+) option$""") { (option: String) =>
    clickRadioOpt(option)
    submitPage()
  }
}
