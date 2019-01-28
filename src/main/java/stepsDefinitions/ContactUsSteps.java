package stepsDefinitions;



import cucumber.api.DataTable;

import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.DriverFactory;

import java.io.IOException;
import java.util.List;


public class ContactUsSteps extends DriverFactory {


    @Given("^I access webdriveruniversity contact us form$")
    public void i_access_webdriveruniversity_contact_us_form() throws IOException {
        contactUsPage.getContactUsPage();
    }

    @When("^I enter a valid first name$")
    public void i_enter_a_valid_first_name() throws Exception {
        contactUsPage.enterFirstName("Tom");
    }

    @When("^I enter a valid last name$")
    public void i_enter_a_valid_last_name(DataTable table) throws Exception {
        contactUsPage.enterLastName(table, 0,1);
    }

    @When("^I enter a valid email address$")
    public void i_enter_a_valid_email_address() throws Exception {
        contactUsPage.enterEmailAddress("example@gmail.com");
    }

    @When("^I enter comments$")
    public void i_enter_comments(DataTable table) throws Exception {
        contactUsPage.enterComments(table, 0,0);
        contactUsPage.enterComments(table, 0,1);
    }

    @When("^I click on the submit button$")
    public void i_click_on_the_submit_button() throws IOException, InterruptedException {
        contactUsPage.clickSubmitButton();
    }

    @Then("^the information should successfully be submitted$")
    public void the_information_should_successfully_be_submitted() throws IOException {
        contactUsPage.confirmContactUsFormSubmissionWasSuccessful();
    }
}
