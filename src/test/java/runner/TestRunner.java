package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps",
plugin = {

        "pretty",

        "html:target/cucumber-reports/cucumber.html",

        "json:target/cucumber-reports/cucumber.json",

        "junit:target/cucumber-reports/cucumber.xml"

        }
)
public class TestRunner {
}