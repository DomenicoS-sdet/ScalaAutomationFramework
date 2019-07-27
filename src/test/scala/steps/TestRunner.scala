package steps

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith


@RunWith(classOf[Cucumber])
@CucumberOptions(
  features = Array("classpath:features"),
  glue = Array("classpath:steps"),
  tags = Array("@HomePageTest,@SearchTest"),
  monochrome = true,
  plugin =
    Array("com.cucumber.listener.ExtentCucumberFormatter:C:/Temp/ScalaTestResults/report.html")
)
class TestRunner {}
