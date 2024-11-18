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

import uk.gov.hmrc.test.ui.pages.SignedOutPage

class CommonStepDef extends BaseStepDef {

  And("""^(?:I )?select continue$""") { () =>
    submitPage()
  }

  And("""^(?:I )?select the back link$""") { () =>
    clickBackLink()
  }

  Then("""^(?:I )?click the (.+) change link$""") { (link: String) =>
    clickChangeLink(link)
  }

  Then("""^(?:The )?'(.+)' has the value (.*)$""") { (field: String, value: String) =>
    verifyCyaInput(field, value)
  }

  Then("""^Error message '(.*)' should be displayed$""") { (errorMessage: String) =>
    verifyErrorMessage(errorMessage)
  }

  When("""^(?:I )?click on the (.+) link$""") { (link: String) =>
    clickByPartialLinkText(link)
  }

  When("""^(?:I )?select (.+) for the boolean question""") { (option: String) =>
    clickRadioBtn(option)
  }

  When("""^(?:I )?check the first box of the checkbox question""") { () =>
    clickFirstCheckboxItem()
  }

  When("""^(?:I )?check none of the above for the checkbox question""") { () =>
    clickLastCheckboxItem()
  }

  Then("""^(?:The radio button field )?should be prepopulated$""") { () =>
    isRadioBtnSelected("Yes").shouldEqual(true)
  }

  Then("""^(?:I )?should be on the 'Signed Out' page$""") { () =>
    SignedOutPage
      .assertPage()
  }
}
