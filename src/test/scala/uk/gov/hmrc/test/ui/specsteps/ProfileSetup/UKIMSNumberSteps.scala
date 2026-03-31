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

package uk.gov.hmrc.test.ui.specsteps.ProfileSetup

import uk.gov.hmrc.test.ui.specpages.Base.BasePage
import uk.gov.hmrc.test.ui.specpages.ProfileSetup.UKIMSNumberPage

object UKIMSNumberSteps extends BasePage {

  // ^(?:I )?should be on the 'UK internal scheme number' page$
  def shouldBeOnUKInternalSchemeNumberPage(): Unit = {
    UKIMSNumberPage
          .assertPage()
  }

  // ^(?:I )?should be on the check 'UK internal scheme number' page$
  def shouldBeOnCheckUKInternalSchemeNumberPage(): Unit = {
    UKIMSNumberPage
          .assertCheckPage()
  }

  // ^(?:I )?enter (.*) value of my UKIMS Number$
  def enterValueUKIMSNumber(ukimsNumberValidation: String): Unit = {
    ukimsNumberValidation match {
          case "incorrect" =>
            UKIMSNumberPage
              .fillInput("value", "INVALID")
          case "different" =>
            UKIMSNumberPage
              .fillInput("value", "XIUKIM 47699357400020231115081801")
          case "valid"     =>
            UKIMSNumberPage
              .fillInput("value", "XIUKIM47699357400020231115081800")
          case "empty"     =>
            UKIMSNumberPage
              .fillInput("value", "")
        }
  }

  // ^(?:The UKIMS Number field )?should be prepopulated$
  def uKIMSNumberFieldShouldBePrepopulated(): Unit = {
    UKIMSNumberPage
          .findById("value")
          .getAttribute("value")
          .shouldEqual("XIUKIM47699357400020231115081800")
  }

}
