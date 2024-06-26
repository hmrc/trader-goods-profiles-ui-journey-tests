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

package uk.gov.hmrc.test.ui.pages.ProfileSetup

import uk.gov.hmrc.test.ui.pages.Base.Page

object ProfileSetupPage extends Page {

  override def title(args: String*): String = "Setting up your profile"
  override def h1(args: String*): String    = "Setting up your profile"
  override def url(args: String*): String   = "/create-profile/start"
  def clickOnLink(link: String): this.type  = {
    link match {
      case "who can apply to UKIMS"                               =>
        clickByPartialLinkText("who can apply to UKIMS")
      case "the Northern Ireland Retail Movement Scheme"          =>
        clickByPartialLinkText("the Northern Ireland Retail Movement Scheme")
      case "Moving plants from Great Britain to Northern Ireland" =>
        clickByPartialLinkText("Moving plants from Great Britain to Northern Ireland")
    }
    this
  }
}
