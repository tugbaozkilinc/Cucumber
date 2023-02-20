package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //@RunWith annotation JUnit ten gelir.
@CucumberOptions(
        features = "./src/test/resources/features", //features folder path
        glue = "stepdefinitions", //stepdefinitions folder path, runner folder ile sibling oldugu icin folder in ismini yazmak yeterli.
        tags = "@amazon"
)

public class Runner {
}

//Bu sinif test case leri run etmek icin ve configurasyon lar icin kullanilir.
//Runner class features ile stepdefinitions i birbirine baglar.
//Interview Question: Cucumber da bir sayfaya giris yapmak icin yapman gereken adimlari en bastan anlatir misin?(Feature file, step definitions olustur, step definitions lara gerekli
//java kodunu yaz(page de olusturulan locate leri alarak))
