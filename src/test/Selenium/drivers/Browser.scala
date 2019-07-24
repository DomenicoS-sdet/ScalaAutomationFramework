package drivers

object Browser {

  val browsers : List[IBrowser] = List(new Chrome)

  def getBrowser(browserName : String) : IBrowser = {
    var browser_ : IBrowser = null
    for(b <- browsers) {
      if(b.canInit(browserName))
        browser_ = b
    }
    browser_
  }

}
