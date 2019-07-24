package drivers

import org.openqa.selenium.WebDriver

trait IBrowser {

  var driver : WebDriver

  def canInit(brName : String) : Boolean

  def start

  def get(uri : String) : Unit

  def getTitle : String

  def cleanup

  def dispose

}
