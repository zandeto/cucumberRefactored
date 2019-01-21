package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)

@CucumberOptions (
        features = {"src/test/java/featureFiles/"},
        glue = {"steps"},
        monochrome = true,
        tags = {},
        plugin = {"pretty", "html:target/cucumberReports",
                "json:target/cucumber.json",
                "com.cucumber.listener.ExtentCucumberFormatter:target/report.html"}
)

public class MainRunner {
}
