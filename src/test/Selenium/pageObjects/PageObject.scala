package pageObjects

import org.apache.commons.io.FileUtils
import org.openqa.selenium.{TakesScreenshot, WebDriver}
import org.openqa.selenium.OutputType.BYTES
import java.io.File

abstract class PageObject() {

  var uri : String
  var pageName : String
  var driver : WebDriver
  var screenshotpath = "C:/Temp/ScalaTestResults/"

  def goTo(): Unit = {
    driver.get(uri)
  }

  def isAt: Boolean = driver.getTitle.equalsIgnoreCase(pageName)

  def takeScreenshot : String = {

    val r = scala.util.Random
    val n = r.nextInt(2147483647)

    val fileName = screenshotpath + n + ".png"

    driver match {
      case dr : TakesScreenshot =>
        val bytes = dr.getScreenshotAs(BYTES)
        FileUtils.writeByteArrayToFile(new File(fileName), bytes)
    }

    return fileName
  }

}
