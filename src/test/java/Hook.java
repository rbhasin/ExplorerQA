

import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import util.WebConnector;


public class Hook {
    WebConnector selenium = WebConnector.getInstance();
    WebDriver driver = selenium.SharedDriver();
    @After
     public void afterScenario(Scenario scenario) throws Exception {
        if (scenario.isFailed()) {
           byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
           scenario.embed(screenshot, "image/png");
            }
         }
}
