package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failed_scenarios.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        monochrome = true,
        features = "@target/failed_scenarios.txt", //.txt folder path, target ozel bir dosya oldugu icin @ kullaniyoruz.
        glue = {"stepdefinitions", "hooks"}, //tags = "@failed_scenario", siliyoruz cunku features lara ozgu bir durum, ben ise txt dosyasındaki fail olan tum test case lerimi rerun yapmak istiyorum.
        dryRun = false
)

public class FailedRunner {
}
