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

package uk.gov.hmrc.test.ui.specsteps.RequestAdvice

import uk.gov.hmrc.test.ui.specpages.Base.BasePage
import uk.gov.hmrc.test.ui.specpages.RequestAdvice.AskEmailPage

object AskEmailSteps extends BasePage {

  // ^(?:I )?should be on the 'What is your email address\?' page$
  def shouldBeOnWhatEmailAddressPage(): Unit = {
    AskEmailPage
          .assertPage()
  }

  // ^(?:I )?should be on the check 'What is your email address\?' page$
  def shouldBeOnCheckWhatEmailAddressPage(): Unit = {
    AskEmailPage
          .assertCheckPage()
  }

  // ^(?:I )?enter (.*) email$
  def enterEmail(email: String): Unit = {
    email match {
          case "invalid" =>
            AskEmailPage
              .fillInput("value", "Testing@testing.test")
          case "valid"   =>
            AskEmailPage
              .fillInput("value", "test@test.com")
        }
  }

  // ^(?:The Email field )?should be prepopulated$
  def emailFieldShouldBePrepopulated(): Unit = {
    AskEmailPage
          .findById("value")
          .getAttribute("value")
          .shouldEqual("test@test.com")
  }

}
