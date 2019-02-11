package stepsDefinitions;

import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import pageObjects.ProductsPage;
import utils.DriverFactory;

import java.io.IOException;


public class ProductSteps extends DriverFactory {


    @Given("^user navigates to (.*) website$")
    public void user_navigates_to_website(String url)  {
        driver.get(url);
    }

    @When("^user clicks on (.*)$")
    public void user_clicks_on(String locator) throws InterruptedException {
        basePage.waitAndClickElementUsingByLocator(By.cssSelector(locator));
    }

    @Then("^user should be presented with the correct promo alert$")
    public void user_should_be_presented_with_promo_alert() throws InterruptedException, IOException {
        productsPage.clickOnProceedButton_PopUp();
    }
}
