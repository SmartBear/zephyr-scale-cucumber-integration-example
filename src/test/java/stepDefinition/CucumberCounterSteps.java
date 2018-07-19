package stepDefinition;

import org.junit.Assert;

import bdd.counter.Counter;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberCounterSteps {
    Counter counter;

    @Given("^a counter I just turned on$")
    public void a_counter_I_just_turned_on(){
        counter = new Counter();
    }

    @Then("^the size is (\\d+)$")
    public void the_size_is(int result) {
        Assert.assertEquals("Actual doesnt match expected ",counter.getSize(),result);
    }

    @When("^I pass the word (\\w+)$")
    public void letters_are_count(String text){
        counter.count(text);
    }
}
