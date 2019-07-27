package pageObjects

import org.openqa.selenium.{By, WebDriver}

class HomePage(var uri : String, var pageName : String, var driver : WebDriver) extends PageObject() {

  this.uri = uri
  this.pageName = pageName
  this.driver = driver

  def isHomePageReady : Boolean = {
    driver.findElement(By.xpath("//button[text() = ' Search']")).isDisplayed()
  }

  def fillHotelSearchFields(city : String, checkin : String, checkout : String , adults : String, childs : String ): Unit = {
    driver.findElement(By.xpath("//*[text()='Search by Hotel or City Name']/parent::a/parent::div//input")).sendKeys(city)
    driver.findElement(By.xpath("//*[text()='Locations']/following-sibling::ul/li//span[text()='" + city + "']"))
      .click()

    driver.findElement(By.xpath("//input[@placeholder=\"Check in\" and @name='checkin']")).sendKeys(checkin)
    driver.findElement(By.xpath("//input[@placeholder=\"Check out\" and @name='checkout']")).sendKeys(checkout)

    val travellersInput = driver.findElement(By.id("htravellersInput"))

    travellersInput.click()

    val adultInput = driver.findElement(By.id("hadultInput"))
    val childInput = driver.findElement(By.id("hchildInput"))

    while (!adultInput.getAttribute("value").equals(adults)) {
      if (adultInput.getAttribute("value").toInt < adults.toInt) driver.findElement(By.id("hadultPlusBtn")).click
      else driver.findElement(By.id("hadultMinusBtn")).click
    }

    while ( {
      !childInput.getAttribute("value").equals(childs)
    }) if (childInput.getAttribute("value").toInt < childs.toInt) driver.findElement(By.id("hchildPlusBtn")).click
    else driver.findElement(By.id("hchildMinusBtn")).click

    travellersInput.click()
  }

  def startSearch : Unit = {
    driver.findElement(By.xpath("//button[text() = ' Search']")).click()
  }

}

