package steps

import cucumber.api.Scenario
import cucumber.api.scala.ScalaDsl
import drivers.Browser

class BeforeAfterSteps extends  ScalaDsl {

  Before("@HomePageTest , @SearchTest"){scenario: Scenario =>
    Browser.getBrowser.start
  }

  After("@HomePageTest , @SearchTest") { scenario: Scenario =>
    Browser.getBrowser.cleanup
    Browser.getBrowser.dispose
  }

}
