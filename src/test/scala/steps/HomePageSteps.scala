package steps

import cucumber.api.Scenario
import cucumber.api.scala.{EN, ScalaDsl}
import drivers.Browser
import pageObjects.Pages

class HomePageSteps extends ScalaDsl with EN {

Before("@HomePageTest"){scenario: Scenario =>
    Browser.getBrowser.start
  }

  Given("""^I Navigate to the home page$"""){ () =>
    Pages.homePage.goTo()
  }
  When("""^I am on the home page$"""){ () =>
    assert(Pages.homePage.isAt)
  }
  Then("""^The search button is available$"""){ () =>
    assert(Pages.homePage.isHomePageReady)

  }

After("@HomePageTest") { scenario: Scenario =>
  Browser.getBrowser.dispose
}


}
