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

package testdata

import org.mongodb.scala._
import org.mongodb.scala.bson.BsonDateTime
import org.mongodb.scala.model.Filters._

import java.time.Instant
import scala.concurrent.Await
import scala.concurrent.duration._

object TestDataHelper {

  private val mongoUri      = "mongodb://localhost:27017"
  private val dataStoreDb   = "trader-goods-profiles-data-store"
  private val hawkStubDb    = "trader-goods-profiles-hawk-stub"

  def resetTestData(): Unit = {
    println("[TestDataHelper] Starting test data reset...")
    val client       = MongoClient(mongoUri)
    val profiles     = client.getDatabase(dataStoreDb).getCollection("profiles")
    val hawkProfiles = client.getDatabase(hawkStubDb).getCollection("traderProfiles")

    Await.result(profiles.deleteOne(equal("eori", "GB123456789098")).toFuture(), 10.seconds)
    println("[TestDataHelper] Deleted TGP data-store profile for GB123456789098")

    Await.result(hawkProfiles.deleteOne(equal("eori", "GB123456789098")).toFuture(), 10.seconds)
    Await.result(
      hawkProfiles
        .insertOne(
          Document(
            "eori"        -> "GB123456789098",
            "actorId"     -> "GB123456789098",
            "ukimsNumber" -> "XIUKIM47699357400020231115081800",
            "niphlNumber" -> "SN12345",
            "lastUpdated" -> BsonDateTime(Instant.now().toEpochMilli)
          )
        )
        .toFuture(),
      10.seconds
    )
    println("[TestDataHelper] Seeded hawk-stub traderProfiles for GB123456789098")

    Await.result(profiles.deleteOne(equal("eori", "GB123456789555")).toFuture(), 10.seconds)
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
    println("[TestDataHelper] Seeded TGP data-store profile for GB123456789555")

    client.close()
    println("[TestDataHelper] Test data reset complete")
  }
}
