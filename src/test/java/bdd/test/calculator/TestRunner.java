package bdd.test.calculator;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/calculatorFeatures"
        ,glue={"stepDefinition"}
        ,plugin = {"junit:target/cucumber/result.xml", "json:target/cucumber/calculator.json"}
)

public class TestRunner {

}
