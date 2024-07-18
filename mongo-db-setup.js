db.getSiblingDB("trader-goods-profiles-data-store").getCollection("checkRecords").deleteMany({})
db.getSiblingDB("trader-goods-profiles-data-store").getCollection("goodsItemRecords").deleteMany({})
db.getSiblingDB("trader-goods-profiles-data-store").getCollection("profiles").deleteMany({})
db.getSiblingDB("trader-goods-profiles-hawk-stub").getCollection("traderProfiles").deleteMany({})
db.getSiblingDB("trader-goods-profiles-hawk-stub").getCollection("goodsItemRecords").deleteMany({})
db.getSiblingDB("trader-goods-profiles-hawk-stub").getCollection("traderProfiles").insertMany(
[{
  "eori": "GB000012340002",
  "actorId": "GB000012340002",
  "ukimsNumber": "XIUKIM00001234000220240207140148",
  "lastUpdated": new ISODate("2024-07-05T15:23:43.134Z")
},
  {
    "eori": "GB000012340003",
    "actorId": "GB000012340003",
    "ukimsNumber": "XIUKIM11111111111220210101165698",
    "lastUpdated": new ISODate("2024-07-05T15:26:08.485Z")
  },
  {
    "eori": "GB000012340004",
    "actorId": "GB000012340004",
    "ukimsNumber": "XIUKIM11111111111220242205143152",
    "lastUpdated": new ISODate("2024-07-05T15:23:43.134Z")
  },
  {
    "eori": "GB000012340005",
    "actorId": "GB000012340005",
    "ukimsNumber": "XIUKIM00001234000520240212142805",
    "lastUpdated": new ISODate("2024-07-05T15:23:43.134Z")
  }])

db.getSiblingDB("trader-goods-profiles-hawk-stub").getCollection("goodsItemRecords").insertMany(
[
  {
    "recordId": "3b1c50e6-3ae6-11ef-a2ec-325096b39f47",
    "goodsItem": {
      "eori": "GB123456789098",
      "actorId": "GB123456789098",
      "traderRef": "GB - 22030001 - In bottles",
      "comcode": "22030001",
      "goodsDescription": "In bottles",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("2023-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c52d0-3ae6-11ef-995b-325096b39f47",
    "goodsItem": {
      "eori": "GB123456789098",
      "actorId": "GB123456789098",
      "traderRef": "GB - 22030001 - In bottles",
      "comcode": "22030001",
      "goodsDescription": "In bottles",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("2023-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c533e-3ae6-11ef-9da2-325096b39f47",
    "goodsItem": {
      "eori": "GB123456789098",
      "actorId": "GB123456789098",
      "traderRef": "GB - 0101210000 - Pure-bred breeding animals",
      "comcode": "101210000",
      "goodsDescription": "Pure-bred breeding animals",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("2023-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c538e-3ae6-11ef-95c5-325096b39f47",
    "goodsItem": {
      "eori": "GB123456789098",
      "actorId": "GB123456789098",
      "traderRef": "GB - 01012910 - For slaughter",
      "comcode": "1012910",
      "goodsDescription": "For slaughter",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("2023-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c5424-3ae6-11ef-a939-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340003",
      "actorId": "GB000012340003",
      "traderRef": "AL - 01012910 - For slaughter",
      "comcode": "1012910",
      "goodsDescription": "For slaughter",
      "countryOfOrigin": "AL",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1972-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c5488-3ae6-11ef-8def-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340004",
      "actorId": "GB000012340004",
      "traderRef": "GB - 4016920000 - Erasers",
      "comcode": "4016920000",
      "goodsDescription": "Erasers",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1972-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c5546-3ae6-11ef-913e-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340004",
      "actorId": "GB000012340004",
      "traderRef": "GB - 22030001 - In bottles",
      "comcode": "22030001",
      "goodsDescription": "In bottles",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1972-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c558c-3ae6-11ef-a611-325096b39f47",
    "goodsItem": {
      "eori": "GB123456789099",
      "actorId": "GB123456789099",
      "traderRef": "GB - 0101291000 - For slaughter",
      "comcode": "101291000",
      "goodsDescription": "For slaughter",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1972-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c5654-3ae6-11ef-9541-325096b39f47",
    "goodsItem": {
      "eori": "GB123456789099",
      "actorId": "GB123456789099",
      "traderRef": "GB - 11032050 - Of rice",
      "comcode": "11032050",
      "goodsDescription": "Of rice",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1972-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c569a-3ae6-11ef-afa7-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340004",
      "actorId": "GB000012340004",
      "traderRef": "GB - 1103205000 - Of rice",
      "comcode": "1103205000",
      "goodsDescription": "Of rice",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1972-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c57da-3ae6-11ef-987e-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340004",
      "actorId": "GB000012340004",
      "traderRef": "GB - 6109100010 - T-shirts",
      "comcode": "6109100010",
      "goodsDescription": "T-shirts",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1972-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c5866-3ae6-11ef-a260-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340004",
      "actorId": "GB000012340004",
      "traderRef": "GB - 07099310 - Courgettes",
      "comcode": "7099310",
      "goodsDescription": "Courgettes",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1972-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c58ac-3ae6-11ef-9586-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340004",
      "actorId": "GB000012340004",
      "traderRef": "GB - 0101210000 - Pure-bred breeding animals",
      "comcode": "101210000",
      "goodsDescription": "Pure-bred breeding animals",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("2021-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c58e8-3ae6-11ef-babb-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340004",
      "actorId": "GB000012340004",
      "traderRef": "GB - 11031950 - Of rice",
      "comcode": "11031950",
      "goodsDescription": "Of rice",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("2021-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c5924-3ae6-11ef-bf2b-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340004",
      "actorId": "GB000012340004",
      "traderRef": "GB - 01012910 - For slaughter",
      "comcode": "1012910",
      "goodsDescription": "For slaughter",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("2021-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c59a6-3ae6-11ef-95ac-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340004",
      "actorId": "GB000012340004",
      "traderRef": "GB - 610910 - T-shirts",
      "comcode": "610910",
      "goodsDescription": "T-shirts",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("2021-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c5b90-3ae6-11ef-b654-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340004",
      "actorId": "GB000012340004",
      "traderRef": "GB - 070993 - Courgettes",
      "comcode": "70993",
      "goodsDescription": "Courgettes",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("2021-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c5bcc-3ae6-11ef-be9c-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340004",
      "actorId": "GB000012340004",
      "traderRef": "GB - 0201100021 - Of bison",
      "comcode": "201100021",
      "goodsDescription": "Of bison",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("2021-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c5c4e-3ae6-11ef-89d8-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340004",
      "actorId": "GB000012340004",
      "traderRef": "FI - 6106905000 - Of flax or of ramie",
      "comcode": "6106905000",
      "goodsDescription": "Of flax or of ramie",
      "countryOfOrigin": "FI",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("2021-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c5ca8-3ae6-11ef-9b28-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340004",
      "actorId": "GB000012340004",
      "traderRef": "DZ - 4016920000 - Erasers",
      "comcode": "4016920000",
      "goodsDescription": "Erasers",
      "countryOfOrigin": "DZ",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("2021-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c5d2a-3ae6-11ef-b590-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340004",
      "actorId": "GB000012340004",
      "traderRef": "DZ - 401692 - Erasers",
      "comcode": "401692",
      "goodsDescription": "Erasers",
      "countryOfOrigin": "DZ",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("2021-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c5d66-3ae6-11ef-9c31-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340004",
      "actorId": "GB000012340004",
      "traderRef": "DZ - 1103205000 - Of rice",
      "comcode": "1103205000",
      "goodsDescription": "Of rice",
      "countryOfOrigin": "DZ",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("2021-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c5de8-3ae6-11ef-821f-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340004",
      "actorId": "GB000012340004",
      "traderRef": "DZ - 01012910 - For slaughter",
      "comcode": "1012910",
      "goodsDescription": "For slaughter",
      "countryOfOrigin": "DZ",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("2021-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c5e24-3ae6-11ef-b122-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340004",
      "actorId": "GB000012340004",
      "traderRef": "AL - 01012910 - For slaughter",
      "comcode": "1012910",
      "goodsDescription": "For slaughter",
      "countryOfOrigin": "AL",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("2021-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c5e60-3ae6-11ef-aebc-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340004",
      "actorId": "GB000012340004",
      "traderRef": "US - 0712909010 - Garlic and allium ampeloprasum and mixtures of vegetables containing garlic and/or allium ampeloprasum",
      "comcode": "712909010",
      "goodsDescription": "Garlic and allium ampeloprasum and mixtures of vegetables containing garlic and/or allium ampeloprasum",
      "countryOfOrigin": "US",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c5ea6-3ae6-11ef-8e0e-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "ID - 4404100010 - Chipwood and the like",
      "comcode": "4404100010",
      "goodsDescription": "Chipwood and the like",
      "countryOfOrigin": "ID",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c5ee2-3ae6-11ef-b00d-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "CZ - 2906290015 - Dicofol  (cas 115-32-2)",
      "comcode": "2906290015",
      "goodsDescription": "Dicofol  (cas 115-32-2)",
      "countryOfOrigin": "CZ",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c5f46-3ae6-11ef-8a56-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "BD - 6203431900 - Other",
      "comcode": "6203431900",
      "goodsDescription": "Other",
      "countryOfOrigin": "BD",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c5faa-3ae6-11ef-b72b-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "AO - 0101299000 - Other",
      "comcode": "101299000",
      "goodsDescription": "Other",
      "countryOfOrigin": "AO",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c6004-3ae6-11ef-8e92-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "AO - 01012990 - Other",
      "comcode": "1012990",
      "goodsDescription": "Other",
      "countryOfOrigin": "AO",
      "category": 1,
      "supplementaryUnit": 10,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c6086-3ae6-11ef-88ce-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "AO - 0101291000 - For slaughter",
      "comcode": "101291000",
      "goodsDescription": "For slaughter",
      "countryOfOrigin": "AO",
      "category": 1,
      "supplementaryUnit": 9,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c60c2-3ae6-11ef-a2cb-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "AD - 0101210000 - Pure-bred breeding animals",
      "comcode": "101210000",
      "goodsDescription": "Pure-bred breeding animals",
      "countryOfOrigin": "AD",
      "category": 1,
      "supplementaryUnit": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c60fe-3ae6-11ef-81b0-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "AD - 070951 - Mushrooms of the genus agaricus",
      "comcode": "70951",
      "goodsDescription": "Mushrooms of the genus agaricus",
      "countryOfOrigin": "AD",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c6144-3ae6-11ef-98bf-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "AR - 284330 - Gold compounds",
      "comcode": "284330",
      "goodsDescription": "Gold compounds",
      "countryOfOrigin": "AR",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c6180-3ae6-11ef-bd8d-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "CA - 4016920000 - Erasers",
      "comcode": "4016920000",
      "goodsDescription": "Erasers",
      "countryOfOrigin": "CA",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c61bc-3ae6-11ef-8955-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "CA - 2805409000 - Other",
      "comcode": "2805409000",
      "goodsDescription": "Other",
      "countryOfOrigin": "CA",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c6202-3ae6-11ef-ab28-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "CA - 6109100010 - T-shirts",
      "comcode": "6109100010",
      "goodsDescription": "T-shirts",
      "countryOfOrigin": "CA",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c623e-3ae6-11ef-b8fa-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "RU - 2903779015 - Pentachlorofluoroethane",
      "comcode": "2903779015",
      "goodsDescription": "Pentachlorofluoroethane",
      "countryOfOrigin": "RU",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c627a-3ae6-11ef-8201-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "GB - 6109100010 - T-shirts",
      "comcode": "6109100010",
      "goodsDescription": "T-shirts",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c62c0-3ae6-11ef-981b-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "GB - 4016920000 - Erasers",
      "comcode": "4016920000",
      "goodsDescription": "Erasers",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c6356-3ae6-11ef-9d67-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "GB - 22030001 - In bottles",
      "comcode": "22030001",
      "goodsDescription": "In bottles",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c63ba-3ae6-11ef-b93d-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "GB - 0201100021 - Of bison",
      "comcode": "201100021",
      "goodsDescription": "Of bison",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c6478-3ae6-11ef-a528-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "GB - 11032050 - Of rice",
      "comcode": "11032050",
      "goodsDescription": "Of rice",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c64d2-3ae6-11ef-8a4d-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "GB - 610910 - T-shirts",
      "comcode": "610910",
      "goodsDescription": "T-shirts",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c6644-3ae6-11ef-a9a4-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "GB - 78060010 - Containers with an anti-radiation lead covering, for the transport or storage of radioactive materials",
      "comcode": "78060010",
      "goodsDescription": "Containers with an anti-radiation lead covering, for the transport or storage of radioactive materials",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c669e-3ae6-11ef-93f9-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "GB - 1103205000 - Of rice",
      "comcode": "1103205000",
      "goodsDescription": "Of rice",
      "countryOfOrigin": "GB",
      "category": 1,
      "supplementaryUnit": 5,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c66f8-3ae6-11ef-8a19-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "GB - 070993 - Courgettes",
      "comcode": "70993",
      "goodsDescription": "Courgettes",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c6752-3ae6-11ef-87bc-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "GB - 2936290000 - Other vitamins and their derivatives",
      "comcode": "2936290000",
      "goodsDescription": "Other vitamins and their derivatives",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c681a-3ae6-11ef-81c2-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "GB - 07099310 - Courgettes",
      "comcode": "7099310",
      "goodsDescription": "Courgettes",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c6860-3ae6-11ef-a000-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "GB - 01012910 - For slaughter",
      "comcode": "1012910",
      "goodsDescription": "For slaughter",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c68e2-3ae6-11ef-95b9-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "GB - 401692 - Erasers",
      "comcode": "401692",
      "goodsDescription": "Erasers",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c6964-3ae6-11ef-8d33-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "GB - 0709931000 - Courgettes",
      "comcode": "709931000",
      "goodsDescription": "Courgettes",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c6a22-3ae6-11ef-9d3f-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "GB - 4421100000 - Clothes hangers",
      "comcode": "4421100000",
      "goodsDescription": "Clothes hangers",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c6a5e-3ae6-11ef-829a-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "GB - 01022110 - Heifers (female bovines that have never calved)",
      "comcode": "1022110",
      "goodsDescription": "Heifers (female bovines that have never calved)",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c6ae0-3ae6-11ef-9e26-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "GB - 0101291000 - For slaughter",
      "comcode": "101291000",
      "goodsDescription": "For slaughter",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c6b26-3ae6-11ef-8741-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "GB - 0101210000 - Pure-bred breeding animals",
      "comcode": "101210000",
      "goodsDescription": "Pure-bred breeding animals",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c6b62-3ae6-11ef-83e5-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "GB - 0709939000 - Other",
      "comcode": "709939000",
      "goodsDescription": "Other",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c6b9e-3ae6-11ef-a629-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "GB - 11031950 - Of rice",
      "comcode": "11031950",
      "goodsDescription": "Of rice",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c6c5c-3ae6-11ef-8b3c-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "GB - 01012990 - Other",
      "comcode": "1012990",
      "goodsDescription": "Other",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c6cde-3ae6-11ef-bbf9-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "GB - 010130 - Asses",
      "comcode": "10130",
      "goodsDescription": "Asses",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c6e1e-3ae6-11ef-88bd-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "GB - 4406920000 - Non-coniferous",
      "comcode": "4406920000",
      "goodsDescription": "Non-coniferous",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c6e5a-3ae6-11ef-a20e-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "GB - 0703200000 - Garlic",
      "comcode": "703200000",
      "goodsDescription": "Garlic",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c6ea0-3ae6-11ef-8ee0-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "GB - 0102291090 - Other",
      "comcode": "102291090",
      "goodsDescription": "Other",
      "countryOfOrigin": "GB",
      "category": 1,
      "supplementaryUnit": 3,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c6ee6-3ae6-11ef-87c0-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "GB - 2203000100 - In bottles",
      "comcode": "2203000100",
      "goodsDescription": "In bottles",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "3b1c6f5e-3ae6-11ef-99b7-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "GB - 010121 - Pure-bred breeding animals",
      "comcode": "10121",
      "goodsDescription": "Pure-bred breeding animals",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579ace64-3ae6-11ef-9ddf-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "GB - 6109100090 - Other",
      "comcode": "6109100090",
      "goodsDescription": "Other",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579aced2-3ae6-11ef-aeb9-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "GB - 4301900000 - Heads, tails, paws and other pieces or cuttings, suitable for furriers' use",
      "comcode": "4301900000",
      "goodsDescription": "Heads, tails, paws and other pieces or cuttings, suitable for furriers' use",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579acf22-3ae6-11ef-bfde-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "GB - 48201010 - Registers, account books, order books and receipt books",
      "comcode": "48201010",
      "goodsDescription": "Registers, account books, order books and receipt books",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579acf72-3ae6-11ef-bf25-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "GB - 9701910000 - Paintings, drawing and pastels",
      "comcode": "9701910000",
      "goodsDescription": "Paintings, drawing and pastels",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579acfb8-3ae6-11ef-9407-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "GB - 610620 - Of man-made fibres",
      "comcode": "610620",
      "goodsDescription": "Of man-made fibres",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579acffe-3ae6-11ef-b41c-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "GB - 0210929100 - Meat",
      "comcode": "210929100",
      "goodsDescription": "Meat",
      "countryOfOrigin": "GB",
      "category": 1,
      "supplementaryUnit": 15,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579ad08a-3ae6-11ef-b4bb-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "GB - 7308905100 - Panels comprising two walls of profiled (ribbed) sheet with an insulating core",
      "comcode": "7308905100",
      "goodsDescription": "Panels comprising two walls of profiled (ribbed) sheet with an insulating core",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579ad184-3ae6-11ef-986e-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "GB - 0706100010 - Carrots",
      "comcode": "706100010",
      "goodsDescription": "Carrots",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579ad382-3ae6-11ef-b181-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "GB - 7208512090 - Other",
      "comcode": "7208512090",
      "goodsDescription": "Other",
      "countryOfOrigin": "GB",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579ad4f4-3ae6-11ef-9a63-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "ES - 11032050 - Of rice",
      "comcode": "11032050",
      "goodsDescription": "Of rice",
      "countryOfOrigin": "ES",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579ad54e-3ae6-11ef-8878-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "ES - 01012910 - For slaughter",
      "comcode": "1012910",
      "goodsDescription": "For slaughter",
      "countryOfOrigin": "ES",
      "category": 1,
      "supplementaryUnit": 4,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579ad5a8-3ae6-11ef-8ea3-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "TR - 6109100010 - T-shirts",
      "comcode": "6109100010",
      "goodsDescription": "T-shirts",
      "countryOfOrigin": "TR",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579ad60c-3ae6-11ef-a565-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "TR - 9403109100 - Cupboards with doors, shutters or flaps",
      "comcode": "9403109100",
      "goodsDescription": "Cupboards with doors, shutters or flaps",
      "countryOfOrigin": "TR",
      "category": 1,
      "supplementaryUnit": 10,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579ad666-3ae6-11ef-ad17-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "FI - 4016920000 - Erasers",
      "comcode": "4016920000",
      "goodsDescription": "Erasers",
      "countryOfOrigin": "FI",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579ad724-3ae6-11ef-ae55-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "FI - 0101291000 - For slaughter",
      "comcode": "101291000",
      "goodsDescription": "For slaughter",
      "countryOfOrigin": "FI",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579ad828-3ae6-11ef-8c5e-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "FI - 01012990 - Other",
      "comcode": "1012990",
      "goodsDescription": "Other",
      "countryOfOrigin": "FI",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579ad8aa-3ae6-11ef-9a9d-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "FI - 0101210000 - Pure-bred breeding animals",
      "comcode": "101210000",
      "goodsDescription": "Pure-bred breeding animals",
      "countryOfOrigin": "FI",
      "category": 1,
      "supplementaryUnit": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579ad8f0-3ae6-11ef-a52d-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "IT - 9701910000 - Paintings, drawing and pastels",
      "comcode": "9701910000",
      "goodsDescription": "Paintings, drawing and pastels",
      "countryOfOrigin": "IT",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579ad92c-3ae6-11ef-af26-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "DZ - 0709510000 - Mushrooms of the genus agaricus",
      "comcode": "709510000",
      "goodsDescription": "Mushrooms of the genus agaricus",
      "countryOfOrigin": "DZ",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579ad968-3ae6-11ef-8e2f-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "DZ - 4016920000 - Erasers",
      "comcode": "4016920000",
      "goodsDescription": "Erasers",
      "countryOfOrigin": "DZ",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579ad9b8-3ae6-11ef-89ed-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "DZ - 0101291000 - For slaughter",
      "comcode": "101291000",
      "goodsDescription": "For slaughter",
      "countryOfOrigin": "DZ",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579ad9f4-3ae6-11ef-afb9-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "DZ - 6109100010 - T-shirts",
      "comcode": "6109100010",
      "goodsDescription": "T-shirts",
      "countryOfOrigin": "DZ",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579ada3a-3ae6-11ef-bcb4-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "AE - 4402100010 - Exported from somalia",
      "comcode": "4402100010",
      "goodsDescription": "Exported from somalia",
      "countryOfOrigin": "AE",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579adad0-3ae6-11ef-bcd5-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "AE - 6109100010 - T-shirts",
      "comcode": "6109100010",
      "goodsDescription": "T-shirts",
      "countryOfOrigin": "AE",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579adb0c-3ae6-11ef-9738-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "FR - 0703200000 - Garlic",
      "comcode": "703200000",
      "goodsDescription": "Garlic",
      "countryOfOrigin": "FR",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579adb48-3ae6-11ef-aacc-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "FR - 2402100000 - Cigars, cheroots and cigarillos, containing tobacco",
      "comcode": "2402100000",
      "goodsDescription": "Cigars, cheroots and cigarillos, containing tobacco",
      "countryOfOrigin": "FR",
      "category": 1,
      "supplementaryUnit": 2,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579adb8e-3ae6-11ef-9afd-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "FR - 0404108400 - Exceeding 27%",
      "comcode": "404108400",
      "goodsDescription": "Exceeding 27%",
      "countryOfOrigin": "FR",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579adbca-3ae6-11ef-87b3-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "AU - 6109100010 - T-shirts",
      "comcode": "6109100010",
      "goodsDescription": "T-shirts",
      "countryOfOrigin": "AU",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("1990-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579adc10-3ae6-11ef-b64f-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "AU - 4301900000 - Heads, tails, paws and other pieces or cuttings, suitable for furriers' use",
      "comcode": "4301900000",
      "goodsDescription": "Heads, tails, paws and other pieces or cuttings, suitable for furriers' use",
      "countryOfOrigin": "AU",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("2015-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579adc4c-3ae6-11ef-90b2-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "AU - 11032050 - Of rice",
      "comcode": "11032050",
      "goodsDescription": "Of rice",
      "countryOfOrigin": "AU",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("2015-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579adc92-3ae6-11ef-86e5-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "AU - 44141010 - Of tropical wood specified in additional note&nbsp;2&nbsp;to this chapter",
      "comcode": "44141010",
      "goodsDescription": "Of tropical wood specified in additional note&nbsp;2&nbsp;to this chapter",
      "countryOfOrigin": "AU",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("2015-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579adcce-3ae6-11ef-89d4-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "AU - 4016920000 - Erasers",
      "comcode": "4016920000",
      "goodsDescription": "Erasers",
      "countryOfOrigin": "AU",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("2015-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579add0a-3ae6-11ef-8a92-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "AU - 7308905100 - Panels comprising two walls of profiled (ribbed) sheet with an insulating core",
      "comcode": "7308905100",
      "goodsDescription": "Panels comprising two walls of profiled (ribbed) sheet with an insulating core",
      "countryOfOrigin": "AU",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("2015-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579add50-3ae6-11ef-bba8-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "PE - 4016920000 - Erasers",
      "comcode": "4016920000",
      "goodsDescription": "Erasers",
      "countryOfOrigin": "PE",
      "category": 1,
      "supplementaryUnit": 1,
      "comcodeEffectiveFromDate": new ISODate("2015-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579add8c-3ae6-11ef-a9e8-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "BR - 0201100021 - Of bison",
      "comcode": "201100021",
      "goodsDescription": "Of bison",
      "countryOfOrigin": "BR",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("2015-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579ae052-3ae6-11ef-af9d-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "CN - 44081091 - Small boards for the manufacture of pencils",
      "comcode": "44081091",
      "goodsDescription": "Small boards for the manufacture of pencils",
      "countryOfOrigin": "CN",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("2015-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579ae098-3ae6-11ef-bcbf-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "AF - 610910 - T-shirts",
      "comcode": "610910",
      "goodsDescription": "T-shirts",
      "countryOfOrigin": "AF",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("2015-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579ae0d4-3ae6-11ef-bd04-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "AF - 0101210000 - Pure-bred breeding animals",
      "comcode": "101210000",
      "goodsDescription": "Pure-bred breeding animals",
      "countryOfOrigin": "AF",
      "category": 1,
      "supplementaryUnit": 1,
      "comcodeEffectiveFromDate": new ISODate("2015-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579ae110-3ae6-11ef-8dae-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "AF - 01012990 - Other",
      "comcode": "1012990",
      "goodsDescription": "Other",
      "countryOfOrigin": "AF",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("2015-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579ae156-3ae6-11ef-9e1b-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "JP - 4016920000 - Erasers",
      "comcode": "4016920000",
      "goodsDescription": "Erasers",
      "countryOfOrigin": "JP",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("2015-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579ae1ce-3ae6-11ef-a37a-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "JP - 401692 - Erasers",
      "comcode": "401692",
      "goodsDescription": "Erasers",
      "countryOfOrigin": "JP",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("2015-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579ae250-3ae6-11ef-babf-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "AL - 0101299000 - Other",
      "comcode": "101299000",
      "goodsDescription": "Other",
      "countryOfOrigin": "AL",
      "category": 1,
      "supplementaryUnit": 3,
      "comcodeEffectiveFromDate": new ISODate("2015-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579ae28c-3ae6-11ef-99b2-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "AL - 610910 - T-shirts",
      "comcode": "610910",
      "goodsDescription": "T-shirts",
      "countryOfOrigin": "AL",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("2015-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579ae2c8-3ae6-11ef-b26c-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "AL - 6109100010 - T-shirts",
      "comcode": "6109100010",
      "goodsDescription": "T-shirts",
      "countryOfOrigin": "AL",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("2015-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579ae304-3ae6-11ef-be3f-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "AL - 0101291000 - For slaughter",
      "comcode": "101291000",
      "goodsDescription": "For slaughter",
      "countryOfOrigin": "AL",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("2015-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579ae34a-3ae6-11ef-add9-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "AL - 0101300000 - Asses",
      "comcode": "101300000",
      "goodsDescription": "Asses",
      "countryOfOrigin": "AL",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("2015-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579ae386-3ae6-11ef-8796-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "AL - 6106905000 - Of flax or of ramie",
      "comcode": "6106905000",
      "goodsDescription": "Of flax or of ramie",
      "countryOfOrigin": "AL",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("2015-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579ae3c2-3ae6-11ef-ada2-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "DE - 01022110 - Heifers (female bovines that have never calved)",
      "comcode": "1022110",
      "goodsDescription": "Heifers (female bovines that have never calved)",
      "countryOfOrigin": "DE",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("2015-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579ae3fe-3ae6-11ef-aa1e-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "US - 0202305011 - Of bison",
      "comcode": "202305011",
      "goodsDescription": "Of bison",
      "countryOfOrigin": "US",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("2015-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  },
  {
    "recordId": "579ae43a-3ae6-11ef-a21b-325096b39f47",
    "goodsItem": {
      "eori": "GB000012340005",
      "actorId": "GB000012340005",
      "traderRef": "US - 11032050 - Of rice",
      "comcode": "11032050",
      "goodsDescription": "Of rice",
      "countryOfOrigin": "US",
      "category": 1,
      "comcodeEffectiveFromDate": new ISODate("2015-01-01T00:00:00.000Z"),
      "comcodeEffectiveToDate": new ISODate("2030-01-01T00:00:00.000Z")
    },
    "metadata": {
      "accreditationStatus": "Not Requested",
      "version": 1,
      "active": true,
      "locked": false,
      "toReview": false,
      "srcSystemName": "MDTP",
      "createdDateTime": new ISODate("2024-07-05T15:38:38.010Z"),
      "updatedDateTime": new ISODate("2024-07-05T15:38:38.010Z")
    }
  }
])