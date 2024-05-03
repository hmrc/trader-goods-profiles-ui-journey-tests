package uk.gov.hmrc.test.ui.cucumber.stepdefs.CreateRecord

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.CreateRecord.CreateCommodityCodePage

class CreateCommodityCodeStepDef extends BaseStepDef{
  Given("""^(?:I )?navigate to the 'commodity code' page$""") { () =>
    CreateCommodityCodePage
      .navigateToPage()
  }
  Then("""^(?:I )?should be on the 'commodity code' page$""") { () =>
    CreateCommodityCodePage
      .assertPage()
  }
}
