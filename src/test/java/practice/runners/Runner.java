package practice.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/resourcespractice/features",
        glue = "practice/stepdefinitions", //source root
        tags = "@dynamic_url",
        dryRun = false
)

public class Runner {
}
