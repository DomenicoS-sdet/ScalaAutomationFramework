package drivers

import org.openqa.selenium.chrome.ChromeDriver
import java.util.concurrent.TimeUnit
import org.openqa.selenium.WebDriver


class Chrome extends IBrowser {

  var driver_ : WebDriver = null

  def canInit(browserName : String) : Boolean = {
    browserName.equalsIgnoreCase("Chrome")
  }

  def getDriver : WebDriver = {
    driver_
  }

  def start(): Unit = {
    System.setProperty("webdriver.chrome.driver","""C:\\Temp\\chromedriver.exe""")
    driver_ = new ChromeDriver()
    driver_.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS)
    driver_.manage().window().maximize()
  }

  def get(uri : String) : Unit = {
    driver_.get(uri)
  }

  def getTitle() : String = {
    driver_.getTitle()
  }

  def cleanup() : Unit = {
    driver_.manage().deleteAllCookies()
  }

  def dispose() : Unit = {
    driver_.quit()
  }

}
