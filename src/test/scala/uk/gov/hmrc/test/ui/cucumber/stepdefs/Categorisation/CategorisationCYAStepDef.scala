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
import uk.gov.hmrc.test.ui.pages.Categorisation.CategorisationCYAPage

class CategorisationCYAStepDef extends BaseStepDef {

  Then("""^(?:I )?should be on the 'Categorisation - Check Your Answers' page$""") { () =>
    CategorisationCYAPage
      .assertPage()
  }

  Then("""^(?:I )?click the Category assessment 1 of 6 change link$""") { () =>
    CategorisationCYAPage
      .clickConditionsChangeLink(1)
  }

  Then("""^(?:I )?click the Category assessment 2 of 6 change link$""") { () =>
    CategorisationCYAPage
      .clickConditionsChangeLink(2)
  }

  Then("""^(?:I )?click the Category assessment 3 of 6 change link$""") { () =>
    CategorisationCYAPage
      .clickConditionsChangeLink(3)
  }

  Then("""^(?:I )?click the Category assessment 4 of 6 change link$""") { () =>
    CategorisationCYAPage
      .clickConditionsChangeLink(4)
  }

  Then("""^(?:I )?click the Category assessment 5 of 6 change link$""") { () =>
    CategorisationCYAPage
      .clickConditionsChangeLink(5)
  }

  Then("""^(?:I )?click the Category assessment 6 of 6 change link$""") { () =>
    CategorisationCYAPage
      .clickConditionsChangeLink(6)
  }

  Then("""^(?:The )?'Category assessment 5 of 6' has the value (.*)$""") { (value: String) =>
    CategorisationCYAPage
      .verifyConditionsInput("Category assessment 5 of 6", value)
  }
}
