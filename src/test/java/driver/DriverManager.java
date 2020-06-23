package driver;

import driver.manager.BrowserFactory;
import driver.manager.BrowserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    private static final BrowserType BROWSER_TYPE = BrowserType.CHROME;
    private static WebDriver driver;

    private DriverManager(){

    }

    public static WebDriver getWebDriver(){
        if (driver == null){
            //System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
            //driver = new ChromeDriver();
            driver = BrowserFactory.getBrowser(BROWSER_TYPE);
        }

        return driver;
    }

    public static void disposeDriver(){
        driver.close();
        if (!BROWSER_TYPE.equals(BrowserType.FIREFOX)){
            driver.quit();
        }

        driver = null;
    }
}
