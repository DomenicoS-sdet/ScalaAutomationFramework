package pageObjects

import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.support.FindBy

class HomePage(var uri : String, var pageName : String, var driver : WebDriver) extends PageObject() {

  this.uri = uri
  this.pageName = pageName
  this.driver = driver

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
    driver.findElement(By.xpath("//button[text() = ' Search']")).isDisplayed()
  }

}

