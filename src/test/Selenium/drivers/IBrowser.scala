package drivers

import org.openqa.selenium.WebDriver

trait IBrowser {

  var driver_ : WebDriver

  def canInit(brName : String) : Boolean

  def getDriver : WebDriver

  def start

  def get(uri : String) : Unit

  def getTitle : String

  def cleanup

  def dispose

}
