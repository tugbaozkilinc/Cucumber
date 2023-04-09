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
                "rerun:target/failed_scenarios.txt"
        },
        monochrome = true,
        features = "./src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@regression",
        dryRun = false
)

public class RegressionTestRunner {
}

//Cucumber'da Maven ile yapılan parallel testlerde, base runner'dan ayrı olarak oluşturduğumuz runner'larımızda Hooks kullanmama sebebimiz, Hooks'un senaryo bazlı çalışmasıdır.
//Her senaryo için ayrı bir Hooks kullanılması gerekir ve bu nedenle birden fazla senaryoyu içeren bir runner dosyasında Hooks kullanmak mümkün değildir.
//Bunun yerine, parallel testler için genellikle TestNG veya JUnit gibi framework ler kullanılır. Bu framework ler, her senaryo için ayrı bir test metodu kullanarak senaryoları çalıştırır
//ve Hooks'lar bu test metotlarına uygulanabilir.
//Özetle, parallel testlerde birden fazla senaryoyu içeren bir runner dosyasında Hooks kullanmak mümkün değildir ve bunun yerine test framework leri tarafından sağlanan Hooks özelliğini
//kullanmak daha uygundur.
