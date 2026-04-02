/*
 * Copyright 2026 HM Revenue & Customs
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

package uk.gov.hmrc.ui.steps
import uk.gov.hmrc.test.ui.pages.Base.BasePage

import uk.gov.hmrc.test.ui.pages.{FeedbackPage, SignedOutPage}

object CommonSteps extends BasePage {

  // ^(?:I )?select continue$
  def selectContinue(): Unit = {
    submitPage()
  }

  // ^(?:I )?select the back link$
  def selectBackLink(): Unit = {
    clickBackLink()
  }

  // ^(?:The )?'(.+)' has the value (.*)$
  def hasValue(field: String, value: String): Unit = {
    verifyCyaInput(field, value)
  }

  // ^Error message '(.*)' should be displayed$
  def errorMessageShouldBeDisplayed(errorMessage: String): Unit = {
    verifyErrorMessage(errorMessage)
  }

  // ^(?:I )?click on the (.+) link$
  def clickOnLink(link: String): Unit = {
    clickByPartialLinkText(link)
  }

  // ^(?:I )?select (.+) for the boolean question
  def selectBooleanQuestion(option: String): Unit = {
    clickRadioBtn(option)
  }

  // ^(?:I )?check the first box of the checkbox question
  def checkFirstBoxCheckboxQuestion(): Unit = {
    clickFirstCheckboxItem()
  }

  // ^(?:I )?check none of the above for the checkbox question
  def checkNoneAboveCheckboxQuestion(): Unit = {
    clickLastCheckboxItem()
  }

  // ^(?:The radio button field )?should be prepopulated$
  def radioButtonFieldShouldBePrepopulated(): Unit = {
    isRadioBtnSelected("Yes").shouldEqual(true)
  }

  // ^(?:I )?should be on the 'Signed Out' page$
  def shouldBeOnSignedOutPage(): Unit = {
    SignedOutPage
          .assertPage()
  }

  // ^(?:I )?should be on the 'Give Feedback' page$
  def shouldBeOnGiveFeedbackPage(): Unit = {
    FeedbackPage
          .assertPage()
  }

}
