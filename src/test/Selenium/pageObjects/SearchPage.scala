package pageObjects

import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

class SearchPage(var uri : String, var pageName : String, var driver : WebDriver) extends PageObject {

  def isListOfResultsReturned: Boolean = {
    driver.findElement(By.xpath("//table[@class=\"bgwhite table table-striped\"]")).isDisplayed
  }
}
