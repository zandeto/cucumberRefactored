//package stepsDefinitions;
//
//
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import org.junit.Assert;
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import utils.DriverFactory;
//
//
//public class LoginSteps extends DriverFactory {
//
//
//	@Given("^user navigates to (.*)$")
//	public void user_navigates_to(String url) throws InterruptedException {
//
//		driver.get(url);  //http://www.webdriveruniversity.com/
//	}
//
//	@When("^user clicks on the login portal button$")
//	public void user_clicks_on_the_login_portal_button()  {
//
//		driver.findElement(By.id("login-portal")).click();
//	}
//
//	@And("^user enters the (.*) username$")
//	public void userEntersTheUsername(String username)  {
//		//tab code
//		for (String windHandle : driver.getWindowHandles()) {
//			driver.switchTo().window(windHandle);
//		}
//		//send username keys
//		driver.findElement(By.id("text")).sendKeys(username);
//
//	}
//
//	@And("^user enter the (.*) password$")
//	public void user_enter_the_password(String password)  {
//
//		driver.findElement(By.id("password")).sendKeys(password);
//	}
//
//	@When("^user clicks on the login button$")
//	public void user_clicks_on_the_login_button()  {
//
//		driver.findElement(By.id("login-button")).click();
//	}
//
//	@Then("^the user should be presented with the following prompt alert (.*)$")
//	public void the_user_should_be_presented_with_the_following_prompt_alert(String message)  {
//		Alert alert = driver.switchTo().alert(); //Alert
//		//this gets the text, makes it a string,then to lower case and deletes all intervals in both expected and actual
//		Assert.assertEquals(alert.getText().toString().toLowerCase().replaceAll("\\s", ""),
//				message.toLowerCase().replaceAll("\\s", ""));
//		alert.accept();
//	}
//}
