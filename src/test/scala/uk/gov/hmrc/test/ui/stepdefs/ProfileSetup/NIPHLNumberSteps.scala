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

package uk.gov.hmrc.test.ui.stepdefs.ProfileSetup

import uk.gov.hmrc.test.ui.pages.ProfileSetup.NIPHLNumberPage

object NIPHLNumberSteps {

  // ^(?:I )?should be on the 'NIPHL registration number' page$
  def shouldBeOnNIPHLRegistrationNumberPage(): Unit = {
    NIPHLNumberPage
          .assertPage()
  }

  // ^(?:I )?should be on the check 'NIPHL registration number' page$
  def shouldBeOnCheckNIPHLRegistrationNumberPage(): Unit = {
    NIPHLNumberPage
          .assertCheckPage()
  }

  // ^(?:I )?enter (.*) value of my NIPHL Number$
  def enterValueNIPHLNumber(niphlNumberValidation: String): Unit = {
    niphlNumberValidation match {
          case "incorrect" =>
            NIPHLNumberPage
              .fillInput("value", "SN123452")
          case "different" =>
            NIPHLNumberPage
              .fillInput("value", "SN  5432  1")
          case "valid"     =>
            NIPHLNumberPage
              .fillInput("value", "S-N-1-2-3-4-5")
          case "empty"     =>
            NIPHLNumberPage
              .fillInput("value", "")
        }
  }

}
