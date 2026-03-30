/*
 * Copyright 2025 HM Revenue & Customs
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

package uk.gov.hmrc.test.ui.testdata

import org.mongodb.scala._
import org.mongodb.scala.model.Filters._
import uk.gov.hmrc.test.ui.conf.TestConfiguration

import scala.concurrent.Await
import scala.concurrent.duration._

object TestDataHelper {

  private val mongoUri  = "mongodb://localhost:27017"
  private val dbName    = "trader-goods-profiles-data-store"

  def resetTestData(): Unit =
    if (TestConfiguration.env == "local") {
      val client   = MongoClient(mongoUri)
      val profiles = client.getDatabase(dbName).getCollection("profiles")

      // Scenario 1: profile setup — must start with no profile
      Await.result(
        profiles.deleteOne(equal("eori", "GB123456789098")).toFuture(),
        10.seconds
      )

      // Scenario 2: UKIMS change — needs a profile with eoriChanged=true
      // and a ukimsNumber different from the one the test will submit
      Await.result(
        profiles.deleteOne(equal("eori", "GB123456789555")).toFuture(),
        10.seconds
      )
      Await.result(
        profiles
          .insertOne(
            Document(
              "eori"        -> "GB123456789555",
              "actorId"     -> "GB123456789555",
              "ukimsNumber" -> "XIUKIM47699357400020231115081799",
              "niphlNumber" -> "SN12345",
              "eoriChanged" -> true
            )
          )
          .toFuture(),
        10.seconds
      )

      client.close()
    }
}
