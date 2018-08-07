package com.adaptavist.tm4j.cucumberExample.stepDefinition;

import com.adaptavist.tm4j.cucumberExample.calculator.Calculator;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class CucumberCalculatorSteps {
    Calculator c;

    @Given("^a calculator I just turned on$")
    public void a_calculator_I_just_turned_on(){
        c = new Calculator();
    }

    @Then("^the result is (\\d+)$")
    public void the_result_is(long result) {
        Assert.assertEquals("Actual doesnt match expected ",c.getState(),result);
    }

    @When("^I add (\\d+) and (\\d+)$")
    public void numbers_are_added(long number, long number2){
        c.add(number);
        c.add(number2);
    }
}
