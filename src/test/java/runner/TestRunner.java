package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/com/infotrack/features"},
        glue = {"com.infotrack.steps"},
        plugin = {"html:target/site/cucumber-pretty", "json:target/cucumber.json"}
)
public class TestRunner {
}
