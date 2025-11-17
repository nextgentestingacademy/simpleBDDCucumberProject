package base;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ConfigReader;

public class DriverFactory {
    private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return tlDriver.get();
    }

    public static void initDriver() {
        ConfigReader.loadProperties();
        String browser = ConfigReader.get("browser");
        switch(browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                tlDriver.set(new ChromeDriver());
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                tlDriver.set(new EdgeDriver());
                break;
            default:
                WebDriverManager.chromedriver().setup();
                tlDriver.set(new ChromeDriver());
        }
        WebDriver driver = tlDriver.get();
        driver.manage().window().maximize();
        int timeout = Integer.parseInt(ConfigReader.get("timeout"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
        driver.get(ConfigReader.get("url"));
    }

    public static void quitDriver() {
        WebDriver driver = tlDriver.get();
        if(driver != null) {
            driver.quit();
            tlDriver.remove();
        }
    }
}
