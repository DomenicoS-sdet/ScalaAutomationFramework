package pageObjects

import drivers.Chrome

class PageObject(var driver : Chrome, var uri : String, var pageName : String) {

  def goTo: Unit = {
    driver.get(uri)
  }

  def isAt: Boolean = {
    driver.getTitle().equalsIgnoreCase(pageName)
  }

  def openBrowser: Unit = {
    driver.start()
  }

  def closeBrowser: Unit = {
    driver.cleanup()
    driver.dispose()
  }

}
