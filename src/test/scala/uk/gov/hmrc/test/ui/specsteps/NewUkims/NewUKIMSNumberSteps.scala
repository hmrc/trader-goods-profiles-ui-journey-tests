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

package uk.gov.hmrc.test.ui.specsteps.NewUkims

import uk.gov.hmrc.test.ui.specpages.Base.BasePage
import uk.gov.hmrc.test.ui.specpages.NewUkims.NewUKIMSNumberPage

object NewUKIMSNumberSteps extends BasePage {

  // ^(?:I )?should be on the 'New UK internal scheme number' page$
  def shouldBeOnNewUKInternalSchemeNumberPage(): Unit = {
    NewUKIMSNumberPage
          .assertPage()
  }

  // ^(?:I )?should be on the check 'New UK internal scheme number' page$
  def shouldBeOnCheckNewUKInternalSchemeNumberPage(): Unit = {
    NewUKIMSNumberPage
          .assertCheckPage()
  }

  // ^(?:I )?enter (.*) value of my New UKIMS Number$
  def enterValueNewUKIMSNumber(ukimsNumberValidation: String): Unit = {
    ukimsNumberValidation match {
          case "incorrect" =>
            NewUKIMSNumberPage
              .fillInput("value", "INVALID")
          case "different" =>
            NewUKIMSNumberPage
              .fillInput("value", "XIUKIM 47699357400020231115081801")
          case "valid"     =>
            NewUKIMSNumberPage
              .fillInput("value", "XIUKIM-47699357400020231115081800")
          case "empty"     =>
            NewUKIMSNumberPage
              .fillInput("value", "")
        }
  }

  // ^(?:The New UKIMS Number field )?should be prepopulated$
  def newUKIMSNumberFieldShouldBePrepopulated(): Unit = {
    NewUKIMSNumberPage
          .findById("value")
          .getAttribute("value")
          .shouldEqual("XIUKIM47699357400020231115081800")
  }

}
