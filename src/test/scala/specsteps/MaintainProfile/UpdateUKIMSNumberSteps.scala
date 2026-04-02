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

import uk.gov.hmrc.test.ui.pages.MaintainProfile.UpdateUKIMSNumberPage

object UpdateUKIMSNumberSteps extends BasePage {

  // ^(?:I )?should be on the update 'UK internal scheme number' page$
  def shouldBeOnUpdateUKInternalSchemeNumberPage(): Unit = {
    UpdateUKIMSNumberPage
          .assertPage()
  }

  // ^(?:I )?update value of my UKIMS Number$
  def updateValueUKIMSNumber(): Unit = {
    UpdateUKIMSNumberPage
          .fillInput("value", "XIUKIM--47699357400020231115081800")
  }

  // ^(?:The update UKIMS Number field )?should be prepopulated$
  def updateUKIMSNumberFieldShouldBePrepopulated(): Unit = {
    UpdateUKIMSNumberPage
          .findById("value")
          .getAttribute("value")
          .shouldEqual("XIUKIM47699357400020231115081801")
  }

}
