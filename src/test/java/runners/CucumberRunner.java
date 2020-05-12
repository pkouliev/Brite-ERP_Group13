package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            glue = "step_definitions",
            features = "src/test/resources/features",
            dryRun = true,
            strict = false,
            tags = "@scenario_outline",
            plugin = {
                    "html:target/default-report",
                    "json:target/cucumber.json",
                    "rerun:target/rerun.txt"
            }
    )
    public class CucumberRunner {
    }

