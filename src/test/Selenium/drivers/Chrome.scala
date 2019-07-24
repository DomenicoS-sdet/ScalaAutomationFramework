package drivers

import org.openqa.selenium.chrome.ChromeDriver
import java.util.concurrent.TimeUnit
import org.openqa.selenium.WebDriver


class Chrome extends IBrowser {

  var driver : WebDriver = {
    System.setProperty("webdriver.chrome.driver","""C:\\Temp\\chromedriver.exe""")
    new ChromeDriver()
  }

  def canInit(browserName : String) : Boolean = {
    browserName.equalsIgnoreCase("Chrome")
  }

  def start(): Unit = {

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS)
    driver.manage().window().maximize()
  }

  def get(uri : String) : Unit = {
    driver.get(uri)
  }

  def getTitle() : String = {
    driver.getTitle()
  }

  def cleanup() : Unit = {
    driver.manage().deleteAllCookies()
  }

  def dispose() : Unit = {
    driver.close()
  }

}
