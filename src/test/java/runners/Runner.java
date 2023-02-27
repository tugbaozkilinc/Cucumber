package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //@RunWith annotation JUnit ten gelir.
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
        monochrome = true, //raporlarin consol da okunakli sekilde cikmasi icindir
        features = "./src/test/resources/features", //features folder path
        glue = "stepdefinitions", //stepdefinitions folder path(source root), runner folder ile sibling oldugu icin folder in ismini yazmak yeterli.
        tags = "@blue_rental_car_negative",
        dryRun = false
)

public class Runner {
}

//Bu sinif test case leri run etmek icin ve configurasyon lar icin kullanilir.
//Runner class features ile stepdefinitions i birbirine baglar.

