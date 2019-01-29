package stepsDefinitions;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pageObjects.BasePage;
import utils.DriverFactory;

public class MasterHooks extends DriverFactory {
    @Before
    public void setup() {
        getDriver();

    }


    @After
    public void tearDown(Scenario scenario) {
        try {
            if(driver != null && scenario.isFailed()){
                scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
                BasePage.captureScreenshot();
                driver.manage().deleteAllCookies();
                driver.quit();
            }
            if (driver != null ){
                driver.manage().deleteAllCookies();
                driver.quit();

            }
        } catch (Exception e) {
            System.out.println("Methods failed: tearDown, Exceprion: " + e.getMessage());
        }
    }


}
