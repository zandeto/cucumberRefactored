package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class ProductsPage extends BasePage{

    public @FindBy(css = "#container-special-offers") WebElement button_SpecialOffers;
    public @FindBy(css = "#container-product2") WebElement button_Laptops;
    public @FindBy(xpath = "//*[@id = 'myModal']//b[contains(text(),'NEWCUSTOMER')]") WebElement voucherNumber;
    public @FindBy(xpath = "//button[text() = 'Proceed']") WebElement button_Proceed_Popup;

    public ProductsPage() throws IOException {
        super();
    }

    public ProductsPage clickOnProceedButton_PopUp() throws InterruptedException, IOException {
        waitAndClickElement(button_Proceed_Popup);
        return new ProductsPage();
    }

}
