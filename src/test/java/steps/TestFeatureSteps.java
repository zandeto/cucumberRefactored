package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.ArrayList;
import java.util.List;

public class TestFeatureSteps {
    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {

        System.out.println("I navigate to the login page");

    }

    @And("^I enter the following for login$")
    public void iEnterTheFollowingForLogin(DataTable table) throws Throwable {

        /* List<List<String>> data = table.raw();

         *//*System.out.println("The Value is : " + data.get(0).get(0));
        System.out.println("The Value is : " + data.get(0).get(1));*/

        //Create an ArrayList
        List<User> users = new ArrayList<User>();
        //Store all users
        users = table.asList(User.class);

        for(User user: users){

            System.out.println("The UserName is: " + user.userName);
            System.out.println("The Password is: " + user.password);
        }

    }

    public class User {

        public String userName;
        public String password;

        public User(String userName, String password) {
            this.userName = userName;
            this.password = password;
        }
    }

    @And("^I click on the login button$")
    public void iClickOnTheLoginButton() throws Throwable {

        System.out.println("I click on the login button");

    }

    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() throws Throwable {

        System.out.println("I should see the userform page");

    }
}
