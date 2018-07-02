import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features"
        ,glue={"stepDefinition"}
        ,plugin = {"junit:target/cucumber/result.xml", "json:target/cucumber/result.json"}
)

public class TestRunner {

}
