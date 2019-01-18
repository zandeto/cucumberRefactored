package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {

    @Before
    public void initializeTest(){
        System.out.println("Opening the browser: MOCK" + '\n');
    }

    @After
    public void TearDown(){
        System.out.println("Closing the browser: MOCK" + '\n');
    }

}
