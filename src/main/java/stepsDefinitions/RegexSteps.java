package stepsDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import utils.OrderItem;
import java.util.List;
import java.util.Map;
import static java.text.MessageFormat.format;


public class RegexSteps {

    //Non-Capturing Groups
    @Given("^I have a (?:tasty|nasty|rusty) cucumber step$")
    public void i_have_a_X_cucumber_step() throws Throwable {
        System.out.println ("Step definition with a non-capturing group" + "\n");
    }
    //Capture integers and strings
    @Given("^I have (\\d+) (.*) in my basket$")
    public void i_have_in_my_basket(int number, String veg) throws Throwable {
        System.out.println(format("I have {0} {1} in my basket", number, veg));
    }
    //Singular and plural
    @Given("^There (?:is|are) (\\d+) (?:cats?|ox|oxen) fed by (\\d+) (?:persons?|people)$")
    public void animals_fed_by_people(int animals, int persons) throws Throwable {
        System.out.println(format("{0} animal(s) fed by {1} person(s)" + "\n" , animals, persons));
    }
    //Alternations
    @Given("^I have a (ball|foot)$")
    public void iHaveA(String obj){
        System.out.println("I will play with my " + obj + "\n");
    }
    //Multiple Captures


    //Data tables
    @Given ("^I have the following order$")
    public void i_have_the_following_order (DataTable table) throws Throwable {
        for (Map<String, String> map : table.asMaps(String.class, String.class)) {
            String vegetable = map.get("vegetable");
            String amount = map.get("amount");
            String cost = map.get("cost");
            System.out.println (format("Order of {0} {1}s at the cost of {2} bucks" + "\n", amount, vegetable, cost));
        }
    }
    //List of domain objects
    @Given("^I have another order$")
    public void i_have_another_order(List<OrderItem> list) throws Throwable {
        for (OrderItem orderItem : list) {
            String vegetable = orderItem.getVegetable ();
            int amount = orderItem.getAmount();
            int cost = orderItem.getCost ();
            System.out.println (format("Order of {0} {1}s at the cost of {2} bucks" + "\n", amount, vegetable, cost));
        }
    }
}
