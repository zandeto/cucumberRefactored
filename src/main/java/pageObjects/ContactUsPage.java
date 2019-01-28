package pageObjects;

import cucumber.api.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.util.List;

public class ContactUsPage extends BasePage {

    public @FindBy(xpath = "//input[@name='first_name']") WebElement textfield_FirstName;
    public @FindBy(xpath = "//input[@name='last_name']") WebElement textfield_LastName;
    public @FindBy(xpath = "//input[@name='email']") WebElement textfield_Email;
    public @FindBy(xpath = "//textarea[@name='message']") WebElement textfield_Message;
    public @FindBy(xpath = "//input[@value='SUBMIT']") WebElement button_Submit;

    public ContactUsPage() throws IOException {
        super();
    }

    public ContactUsPage getContactUsPage() throws IOException {
        driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
        return new ContactUsPage();
    }

    public ContactUsPage enterFirstName(String name) throws Exception {
        sendKeysToWebElement(textfield_FirstName, name);
        return new ContactUsPage();
    }

    public ContactUsPage enterLastName(DataTable table, int row, int column) throws Exception {
        List<List<String>> data = table.raw();
        sendKeysToWebElement(textfield_LastName, data.get(row).get(column));
        return new ContactUsPage();
    }

    public ContactUsPage enterEmailAddress(String email) throws Exception {
        sendKeysToWebElement(textfield_Email, email);
        return new ContactUsPage();
    }

    public ContactUsPage enterComments(DataTable table, int row, int column) throws Exception {
        List<List<String>> data = table.raw();
        sendKeysToWebElement(textfield_Message, data.get(row).get(column));
        //sendKeysToWebElement(textfield_Message, data.get(row).get(column));
        return new ContactUsPage();
    }

    public ContactUsPage clickSubmitButton() throws InterruptedException, IOException {
        waitAndClickElement(button_Submit);
        return new ContactUsPage();
    }

    public ContactUsPage confirmContactUsFormSubmissionWasSuccessful() throws IOException {
        WebElement thanksContactUsPage = driver.findElement(By.id("contact_reply"));
        waitUntilWebElementIsVisible(thanksContactUsPage);
        Assert.assertEquals("thank you for your message!", thanksContactUsPage.getText().toLowerCase());
        return new ContactUsPage();
    }
}
