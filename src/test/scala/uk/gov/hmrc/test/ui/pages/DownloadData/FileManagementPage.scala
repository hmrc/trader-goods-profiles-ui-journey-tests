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

package uk.gov.hmrc.test.ui.pages.DownloadData

import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.pages.Base.Page

object FileManagementPage extends Page {

  override def title(args: String*): String = "TGP records files"
  override def h1(args: String*): String    = "TGP records files"
  override def url(args: String*): String   = "/download/tgp-record-files"

  def assertDownloadLink(): this.type = {
    findBy(By.xpath("/html/body/div/main/div/div/table[1]/tbody/tr/td[3]/a")).getAttribute("href").equals("/some-url")
    this
  }
}