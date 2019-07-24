package steps

import cucumber.api.DataTable
import cucumber.api.scala.{EN, ScalaDsl}
import pageObjects.Pages

class HomePageSteps extends ScalaDsl with EN {



  Given("""^I Navigate to the home page$"""){ () =>
    Pages.homePage.goTo()
  }
  When("""^I am on the home page$"""){ () =>
    assert(Pages.homePage.isAt)
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

  }
  When("""^I click on the button Search$"""){ () =>

    Pages.homePage.startSearch

  }


  Then("""^The search button is available$"""){ () =>
    assert(Pages.homePage.isHomePageReady)

  }




}
