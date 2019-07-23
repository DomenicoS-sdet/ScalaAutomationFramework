package pageObjects

import drivers.Chrome
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy

class HomePage(var dr : Chrome) extends PageObject(dr, "https://www.phptravels.net/", pageName = "PHPTRAVELS | Travel Technology Partner") {

  @FindBy(xpath = "//*[text()='Search by Hotel or City Name']/parent::a/parent::div//input")
  val citySearch : WebElement = null

  @FindBy(xpath = "//input[@placeholder=\"Check in\" and @name='checkin']")
  val checkIn : WebElement = null

  @FindBy(xpath = "//input[@placeholder=\"Check out\" and @name='checkout']")
  val checkOut : WebElement = null

  @FindBy(id = "travellersInput")
  val travellersInput : WebElement = null

  @FindBy(id = "adultInput")
  val adultInput : WebElement = null

  @FindBy(id = "childInput")
  val childInput : WebElement = null

  def isHomePageReady : Boolean = {
    dr.driver.findElementByXPath("//button[text() = ' Search']").isDisplayed()
  }

}

