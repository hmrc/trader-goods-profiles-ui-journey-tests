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

import org.junit.Assert
import uk.gov.hmrc.test.ui.pages.Base.Page
import org.openqa.selenium.By

object ExistingUKIMSNumberPage extends Page {

  override def title(args: String*): String = "Existing UK Internal Market Scheme (UKIMS) number"
  override def h1(args: String*): String    = "Existing UK Internal Market Scheme (UKIMS) number"
  override def url(args: String*): String   = "/create-profile/existing-ukims-number"

  def checkUKIMS(expected: String): this.type = {
    val actual = findBy(By.className("govuk-body")).getText

    Assert.assertTrue("Expected " + expected + " value but found " + actual + " instead.", actual.contains(expected))
    this
  }
}
