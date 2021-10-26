package calculator;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class MyStepdefs {
    private Calculator calculator;
    private int value1;
    private int value2;
    private int result;

    private int value1_s2;
    private String value2_s2;
    private double result_s2;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Given("^Two input values, (-?\\d+) and (-?\\d+)$")
    public void twoInputValuesAnd(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
    }

    @When("^I add the two values$")
    public void iAddTheTwoValues() {
        result = calculator.add(value1, value2);
        System.out.print(result);
    }

    @Then("^I expect the result (-?\\d+)$")
    public void iExpectTheResult(int arg0) {
        Assert.assertEquals(arg0, result);
    }

    @Given("^One input value (-?\\d+), and opt \"([^\"]*)\"$")
    public void oneInputValueAndRvs(int arg0, String arg1) throws Throwable {
        value1_s2 = arg0;
        value2_s2 = arg1;
    }

    @When("^I press button$")
    public void iPressButton() {
        result_s2 = calculator.press(value1_s2, value2_s2);
    }

    @Then("^I expect the output ([\\d\\.]+)$")
    public void iExpectTheOutput(double arg0) {
        Assert.assertEquals(arg0, result_s2, 0.1);
    }


}