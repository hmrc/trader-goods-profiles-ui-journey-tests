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
import java.time.temporal.ChronoUnit
import scala.concurrent.Await
import scala.concurrent.duration._

object TestDataHelper {

  private val mongoUri    = "mongodb://localhost:27017"
  private val dataStoreDb = "trader-goods-profiles-data-store"
  private val hawkStubDb  = "trader-goods-profiles-hawk-stub"

  private val seededRecordId  = "pre-seeded-goods-record-001"
  private val lockedRecordId  = "3b1c50e6-3ae6-11ef-a2ec-325096b39f42"
  private val seededSummaryId = "pre-seeded-summary-001"

  def resetTestData(): Unit = {
    val client       = MongoClient(mongoUri)
    val profiles     = client.getDatabase(dataStoreDb).getCollection("profiles")
    val goodsRecords = client.getDatabase(dataStoreDb).getCollection("goodsItemRecords")
    val hawkProfiles = client.getDatabase(hawkStubDb).getCollection("traderProfiles")

    Await.result(profiles.deleteOne(equal("eori", "GB123456789098")).toFuture(), 10.seconds)

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

    val oneDayAgo = Instant.now().minus(1, ChronoUnit.DAYS).toString
    Await.result(goodsRecords.deleteOne(equal("_id", seededRecordId)).toFuture(), 10.seconds)
    Await.result(
      goodsRecords
        .insertOne(
          Document(
            "_id"                      -> seededRecordId,
            "eori"                     -> "GB123456789098",
            "actorId"                  -> "GB123456789098",
            "traderRef"                -> "pre-seeded-record",
            "comcode"                  -> "170490",
            "adviceStatus"             -> "Not Requested",
            "goodsDescription"         -> "Pre-seeded test goods",
            "countryOfOrigin"          -> "GB",
            "version"                  -> 1,
            "active"                   -> true,
            "toReview"                 -> false,
            "declarable"               -> "IMMI Ready",
            "comcodeEffectiveFromDate" -> oneDayAgo,
            "createdDateTime"          -> oneDayAgo,
            "updatedDateTime"          -> oneDayAgo
          )
        )
        .toFuture(),
      10.seconds
    )

    val twoDaysAgo     = Instant.now().minus(2, ChronoUnit.DAYS).toString
    val twoDaysAgoBson = BsonDateTime(Instant.now().minus(2, ChronoUnit.DAYS).toEpochMilli)
    val hawkRecords    = client.getDatabase(hawkStubDb).getCollection("goodsItemRecords")

    Await.result(goodsRecords.deleteOne(equal("_id", lockedRecordId)).toFuture(), 10.seconds)
    Await.result(
      goodsRecords
        .insertOne(
          Document(
            "_id"                      -> lockedRecordId,
            "eori"                     -> "GB123456789098",
            "actorId"                  -> "GB123456789098",
            "traderRef"                -> "GB - 22030001 - In bottles 2",
            "comcode"                  -> "22030001",
            "adviceStatus"             -> "Requested",
            "goodsDescription"         -> "In bottles",
            "countryOfOrigin"          -> "GB",
            "category"                 -> 1,
            "version"                  -> 1,
            "active"                   -> true,
            "toReview"                 -> false,
            "declarable"               -> "IMMI Ready",
            "comcodeEffectiveFromDate" -> twoDaysAgo,
            "createdDateTime"          -> twoDaysAgo,
            "updatedDateTime"          -> twoDaysAgo
          )
        )
        .toFuture(),
      10.seconds
    )

    Await.result(hawkRecords.deleteOne(equal("recordId", lockedRecordId)).toFuture(), 10.seconds)
    Await.result(
      hawkRecords
        .insertOne(
          Document(
            "recordId"  -> lockedRecordId,
            "goodsItem" -> Document(
              "eori"                     -> "GB123456789098",
              "actorId"                  -> "GB123456789098",
              "traderRef"                -> "GB - 22030001 - In bottles 2",
              "comcode"                  -> "22030001",
              "goodsDescription"         -> "In bottles",
              "countryOfOrigin"          -> "GB",
              "category"                 -> 1,
              "comcodeEffectiveFromDate" -> twoDaysAgoBson,
              "comcodeEffectiveToDate"   -> twoDaysAgoBson
            ),
            "metadata"  -> Document(
              "accreditationStatus" -> "Requested",
              "version"             -> 1,
              "active"              -> true,
              "locked"              -> false,
              "toReview"            -> false,
              "srcSystemName"       -> "MDTP",
              "createdDateTime"     -> twoDaysAgoBson,
              "updatedDateTime"     -> twoDaysAgoBson
            )
          )
        )
        .toFuture(),
      10.seconds
    )

    val downloadDataSummary = client.getDatabase(dataStoreDb).getCollection("downloadDataSummary")
    val createdAtBson       = BsonDateTime(Instant.now().minus(1, ChronoUnit.DAYS).toEpochMilli)
    val expiresAtBson       = BsonDateTime(Instant.now().plus(30, ChronoUnit.DAYS).toEpochMilli)
    Await.result(downloadDataSummary.deleteOne(equal("summaryId", seededSummaryId)).toFuture(), 10.seconds)
    Await.result(
      downloadDataSummary
        .insertOne(
          Document(
            "summaryId" -> seededSummaryId,
            "eori"      -> "GB123456789098",
            "status"    -> "FileReadySeen",
            "createdAt" -> createdAtBson,
            "expiresAt" -> expiresAtBson,
            "fileInfo"  -> Document(
              "fileName"      -> "test",
              "fileSize"      -> 600,
              "retentionDays" -> "30"
            )
          )
        )
        .toFuture(),
      10.seconds
    )

    client.close()
  }
}
