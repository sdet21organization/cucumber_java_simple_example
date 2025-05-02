package steps;

import com.eurotechstudy.Calculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CalculatorSteps {

    private Calculator calculator;
    private double factResult;

    @Then("the result should be {double}")
    public void theResultShouldBe(double result) {
        Assert.assertEquals(result, factResult, 0.0);
    }

    @Given("I opened a calculator")
    public void i_opened_a_calculator() {
        calculator = new Calculator();
    }

    @When("I add {int} and {int}")
    public void iAddAnd(int num1, int num2) {
        factResult = calculator.add(num1, num2);
    }

    @When("I multiply {double} and {double}")
    public void iMultiplyAnd(double num1, double num2) {
        factResult = calculator.multiply(num1, num2);
    }
}
