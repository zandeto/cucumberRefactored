package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import pageObjects.BasePage;
import pageObjects.ContactUsPage;
import pageObjects.ProductsPage;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
    public static WebDriver driver;
    public static BasePage basePage;
    public static ContactUsPage contactUsPage;
    public static ProductsPage productsPage;


    public WebDriver getDriver() {
        try {
            Properties p = new Properties();
            FileInputStream fi = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\properties\\config.properties");
            p.load(fi);
            String browserName = p.getProperty("browser");
            //String browserName = "chrome";


            switch (browserName) {
                case "firefox":
                    System.setProperty("webdriver.gecko.driver", Constant.GECKO_DRIVER_DIRECTORY);
                    DesiredCapabilities capabilities = DesiredCapabilities.firefox();
                    capabilities.setCapability("marionette", true);
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();

                    break;
                case "chrome":
                    System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_DIRECTORY);
                    //CHROME OPTIONS
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    break;

            }
        } catch (Exception e) {
            System.out.println("Unable to load browser" + e.getMessage());
        } finally {
            driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
            basePage = PageFactory.initElements(driver, BasePage.class);
            contactUsPage = PageFactory.initElements(driver, ContactUsPage.class);
            productsPage = PageFactory.initElements(driver, ProductsPage.class);
        }


        return driver;
    }
}
