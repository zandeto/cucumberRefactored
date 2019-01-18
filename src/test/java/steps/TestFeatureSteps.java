package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


import java.util.List;

public class TestFeatureSteps {
    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() {

        System.out.println("I navigate to the login page" + '\n');

    }

    @And("^I enter the following for login$")
    public void iEnterTheFollowingForLogin(DataTable table) {

        //Create an ArrayList and Store all users
        List<User> users = table.asList(User.class);

        for (User user : users) {

            System.out.println("The UserName is: " + user.getUserName() + '\n');
            System.out.println("The Password is: " + user.getPassword() + '\n');
        }

    }

    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUserNameAndPassword(String userName, String password) {
        System.out.println("The UserName is: " + userName + '\n');
        System.out.println("The Password is: " + password + '\n');
    }

    public class User {

        private String userName;
        private String password;

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public User(String userName, String password) {
            this.userName = userName;
            this.password = password;
        }
    }

    @And("^I click on the login button$")
    public void iClickOnTheLoginButton() {

        System.out.println("I click on the login button" + '\n');

    }

    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() {

        System.out.println("I should see the userform page" + '\n');

    }
}
