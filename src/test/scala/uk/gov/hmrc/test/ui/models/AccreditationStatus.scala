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

package uk.gov.hmrc.test.ui.models

import enumeratum.{EnumEntry, PlayEnum}

sealed abstract class AccreditationStatus(override val entryName: String) extends EnumEntry

object AccreditationStatus extends PlayEnum[AccreditationStatus] {

  override val values: IndexedSeq[AccreditationStatus] = findValues

  case object NotRequested extends AccreditationStatus("Not Requested")
  case object Requested extends AccreditationStatus("Requested")
  case object InProgress extends AccreditationStatus("In progress")
  case object InformationRequested extends AccreditationStatus("Information Requested")
  case object Withdrawn extends AccreditationStatus("Withdrawn")
  case object Approved extends AccreditationStatus("Approved")
  case object Rejected extends AccreditationStatus("Rejected")
}
