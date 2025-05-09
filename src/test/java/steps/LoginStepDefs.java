package steps;

import context.TestContext;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ConfigurationReader;
import utils.DriverFactory;

import java.time.Duration;

public class LoginStepDefs {

    TestContext context;
    Scenario scenario;

    @Before
    public void beforeEach(Scenario scenario) {
        context = new TestContext();
        context.driver = DriverFactory.get();
        context.wait = new WebDriverWait(context.driver, Duration.ofSeconds(Long.parseLong(ConfigurationReader.get("timeout"))));
        context.actions = new Actions(context.driver);
        context.js = (JavascriptExecutor) context.driver;

        this.scenario = scenario;
    }

    @Given("user enter login page")
    public void userEnterLoginPage() {
        context.driver.get(ConfigurationReader.get("base_url"));
        scenario.log("Entered login page");
    }
}
