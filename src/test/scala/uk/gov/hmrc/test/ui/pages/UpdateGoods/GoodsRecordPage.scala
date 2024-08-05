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

package uk.gov.hmrc.test.ui.pages.UpdateGoods

import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.pages.Base.Page

object GoodsRecordPage extends Page {

  override def title(args: String*): String = "Goods record"

  override def h1(args: String*): String = "Goods record"

  override def url(args: String*): String = "/goods-record/" + recordId

  def clickChangeLink(key: String): this.type = {

    val changeLinkSelector = s"dl.govuk-summary-list > div:nth-child($key) > dd.govuk-summary-list__actions > a"
    click(By.cssSelector(changeLinkSelector))

    this
  }

  def clickSuppUnitChangeLink(key: String): this.type = {

    val changeLinkSelector = s"dl.nth-child(9) > div:nth-child($key) > dd.govuk-summary-list__actions > a"
    click(By.cssSelector(changeLinkSelector))

    this
  }
}
