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

import uk.gov.hmrc.test.ui.pages.RequestAdvice.AskNamePage

object AskNameSteps {

  // ^(?:I )?should be on the 'What is your name\?' page$
  def shouldBeOnWhatNamePage(): Unit = {
    AskNamePage
          .assertPage()
  }

  // ^(?:I )?should be on the check 'What is your name\?' page$
  def shouldBeOnCheckWhatNamePage(): Unit = {
    AskNamePage
          .assertCheckPage()
  }

  // ^(?:I )?enter (.*) name$
  def enterName(name: String): Unit = {
    name match {
          case "long"      =>
            AskNamePage
              .fillInput("value", "Thisisaveryveryveryveryveryveryveryveryveryveryveryveryveryverylongname")
          case "valid"     =>
            AskNamePage
              .fillInput("value", "Testfirstname Testlastname")
          case "different" =>
            AskNamePage
              .fillInput("value", "different name")
        }
  }

}
