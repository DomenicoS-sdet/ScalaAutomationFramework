package pageObjects

import org.openqa.selenium.WebDriver

abstract class PageObject() {

  var uri : String
  var pageName : String
  var driver : WebDriver

  def goTo(): Unit = {
    driver.get(uri)
  }

  def isAt: Boolean = driver.getTitle.equalsIgnoreCase(pageName)

}
