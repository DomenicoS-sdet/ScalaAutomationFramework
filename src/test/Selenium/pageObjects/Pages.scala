package pageObjects

import drivers.Browser

object Pages {

  def homePage : HomePage = {
    new HomePage("https://www.phptravels.net/", "PHPTRAVELS | Travel Technology Partner", Browser.getBrowser("Chrome").driver)
  }
}
