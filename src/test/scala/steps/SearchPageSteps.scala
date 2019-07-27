package steps

import com.cucumber.listener.Reporter
import cucumber.api.scala.{EN, ScalaDsl}
import pageObjects.Pages

class SearchPageSteps extends ScalaDsl with EN {

  Then("""^a list of hotels is returned$"""){ () =>
    assert(Pages.searchPage.isListOfResultsReturned, "Search results not returned")
    Reporter.addScreenCaptureFromPath(Pages.searchPage.takeScreenshot)
  }

}
