package com.tiagobmarques;

import Calculator.Calculator;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class CalculatorStepDefinitions {

    Calculator calculator;
    Integer result;
    @Given("I have a calculator")
    public void iHaveACalculator() {
        calculator = new Calculator();
    }

    @When("I add {int} and {int}")
    public void iAddAnd(int a, int b) {
        result = calculator.add(a,b);
    }

    @Then("I should get {int}")
    public void iShouldGet(int expectedResult) {
        assertThat(result).isEqualTo(expectedResult);
    }
}
