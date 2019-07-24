package pageObjects

import drivers.Browser

object Pages {

  def homePage : HomePage = {
    new HomePage("https://www.phptravels.net/", "PHPTRAVELS | Travel Technology Partner", Browser.getBrowser.getDriver)
  }

  def searchPage : SearchPage = {
    new SearchPage("https://www.phptravels.net/hotels/search/", "Search Results", Browser.getBrowser.getDriver)
  }
}
