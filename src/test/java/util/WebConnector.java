package util;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by r.singhbhasin on 18/07/2014.
 */
public class WebConnector {
    Properties CONFIG = null;
    WebDriver driver = null;
    WebDriver webDriver = null;
    static WebConnector w;

    private WebConnector() {

        if (CONFIG == null) {
            try {
                // initialize CONFIG properties file
                CONFIG = new Properties();
                FileInputStream fs = new FileInputStream(Constants.CONFIG_FILE_PATH);
                CONFIG.load(fs);
            } catch (Exception e) {
                System.out.println("Error on initializing config.properties files");
            }
        }
    }

    public static WebConnector getInstance() {
        if (w == null)
            w = new WebConnector();
        return w;
    }

    public WebDriver SharedDriver() {

        try {

            if (webDriver == null) {
                driver = new FirefoxDriver();
                webDriver = driver;
            }
            driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        } catch (Exception e) {
            System.out.println("Error on opening driver");
        }
        return webDriver;
    }

    public void navigate(String URL) {

        System.out.println("navigating to " + URL);
        driver.get(CONFIG.getProperty(URL));
    }

    public void waitForPageToLoad(int seconds) {
        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void takescreenshot() throws IOException {

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
// Now you can do whatever you need to do with it, for example copy somewhere
        FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));
    }




}
