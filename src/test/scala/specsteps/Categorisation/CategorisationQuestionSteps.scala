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

import uk.gov.hmrc.test.ui.pages.Categorisation.CategorisationAssessmentPage

object CategorisationQuestionSteps extends BasePage {

  // ^(?:I )?should be on the 'Category assessment(.+)' page$
  def shouldBeOnCategoryAssessmentPage(number: String): Unit = {
    CategorisationAssessmentPage
          .assertPage(number)
  }

  // ^(?:I )?should be on the check 'Category assessment(.+)' page$
  def shouldBeOnCheckCategoryAssessmentPage(number: String): Unit = {
    CategorisationAssessmentPage
          .assertCheckPage(number)
  }

  // ^(?:I )?should be on the 'Category assessment(.+)' page for Longer Commodity code$
  def shouldBeOnCategoryAssessmentPageLongerCommodityCode(number: String): Unit = {
    CategorisationAssessmentPage
          .assertRecategorisePage(number)
  }

  // ^(?:I )?should be on the check 'Category assessment(.+)' page for Longer Commodity code$
  def shouldBeOnCheckCategoryAssessmentPageLongerCommodityCode(number: String): Unit = {
    CategorisationAssessmentPage
            .assertRecategoriseCheckPage(number)
  }

  // ^(?:I )?select (.+) option$
  def selectOption(option: String): Unit = {
    clickRadioOpt(option)
        submitPage()
  }

}
