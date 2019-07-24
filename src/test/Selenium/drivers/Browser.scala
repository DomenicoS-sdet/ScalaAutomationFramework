package drivers
import com.typesafe.config._

object Browser {

  val browsers : List[IBrowser] = List(new Chrome)

  def getBrowser: IBrowser = {

    val conf = ConfigFactory.load()
    val brName = conf.getString("configuration-file.browser")

    var browser_ : IBrowser = null
    for(b <- browsers) {
      if(b.canInit(brName))
        browser_ = b
    }
    browser_
  }

}
