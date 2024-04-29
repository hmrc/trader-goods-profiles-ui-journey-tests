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

import org.openqa.selenium.By

class CommonStepDef extends BaseStepDef {

  And("""^(?:I )?refresh the page$""") { () =>
    driver.navigate().refresh()
  }

  And("""^(?:I )?select continue$""") { () =>
    driver.findElement(By.className("govuk-button")).click()
  }

  And("""^(?:I )?select the back button$""") { () =>
    driver.findElement(By.className("govuk-back-link")).click()
  }
}
