package steps

import com.cucumber.listener.Reporter
import cucumber.api.DataTable
import cucumber.api.scala.{EN, ScalaDsl}
import pageObjects.Pages

class HomePageSteps extends ScalaDsl with EN {



  Given("""^I Navigate to the home page$"""){ () =>
    Pages.homePage.goTo()
    Reporter.addScreenCaptureFromPath(Pages.homePage.takeScreenshot)
  }
  When("""^I am on the home page$"""){ () =>
    assert(Pages.homePage.isAt)
    Reporter.addScreenCaptureFromPath(Pages.homePage.takeScreenshot)
  }

  When("""^I fill the hotel search with the following data$"""){ (arg0:DataTable) =>
    val list = arg0.asList(classOf[String])

    Pages.homePage.fillHotelSearchFields(
      list.get(0),
      list.get(1),
      list.get(2),
      list.get(3),
      list.get(4)
    )
    Reporter.addScreenCaptureFromPath(Pages.homePage.takeScreenshot)
  }
  When("""^I click on the button Search$"""){ () =>

    Pages.homePage.startSearch
    Reporter.addScreenCaptureFromPath(Pages.homePage.takeScreenshot)
  }


  Then("""^The search button is available$"""){ () =>
    assert(Pages.homePage.isHomePageReady)
    Reporter.addScreenCaptureFromPath(Pages.homePage.takeScreenshot)
  }




}
