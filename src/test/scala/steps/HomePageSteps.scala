package steps

import cucumber.api.Scenario
import cucumber.api.scala.{EN, ScalaDsl}
import drivers.Chrome
import pageObjects.HomePage


class HomePageSteps extends ScalaDsl with EN {

  val homePage : HomePage = {
    new HomePage(new Chrome())
  }

Before("@HomePageTest"){scenario: Scenario =>
    homePage.openBrowser
  }

  Given("""^I Navigate to the home page$"""){ () =>
    homePage.goTo
  }
  When("""^I am on the home page$"""){ () =>
    assert(homePage.isAt)
  }
  Then("""^The search button is available$"""){ () =>
    assert(homePage.isHomePageReady)

  }

After("@HomePageTest") { scenario: Scenario =>
  homePage.closeBrowser
}


}
