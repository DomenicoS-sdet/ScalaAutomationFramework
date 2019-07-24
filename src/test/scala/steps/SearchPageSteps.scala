package steps

import cucumber.api.scala.{EN, ScalaDsl}
import pageObjects.Pages

class SearchPageSteps extends ScalaDsl with EN {

  Then("""^a list of hotels is returned$"""){ () =>
    assert(Pages.searchPage.isListOfResultsReturned, "Search results not returned")
  }

}
