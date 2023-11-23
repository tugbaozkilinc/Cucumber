package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //@RunWith is used to run the class. Without this, Runner class will not be runnable
@CucumberOptions(
        plugin = {
                "pretty", //console bilgilerinin okunaklı olmasını sağlar.
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failed_scenarios.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        monochrome = true, //test senaryolarının konsolda siyah beyaz olarak görüntülenmesini sağlar. Bu, senaryoların daha okunaklı ve anlaşılır olmasına yardımcı olur.
        features = "./src/test/resources/features", //features folder path
        glue = {"stepdefinitions", "hooks"}, //stepdefinitions folder path(source root), runner folder ile sibling oldugu icin folder in ismini yazmak yeterli.
        tags = "@data_table",
        dryRun = false
)

public class Runner {
}

//Bu sinif test case leri run etmek icin ve configurasyon lar icin kullanilir.
//Runner class features ile stepdefinitions i birbirine baglar.

//Cucumber, test raporlarını "target" klasörü altında oluşturur çünkü bu klasör Maven, Gradle gibi project management tool lar tarafından kullanılan bir standart konumdur.
//Bu nedenle, Cucumber tarafından oluşturulan raporların bu klasör altında oluşturulması, diğer tool lar ile birlikte kullanıldığında sorunsuz bir şekilde entegre edilmesini sağlar.
//Ayrıca, "target" klasörü genellikle derlenmiş kodun, test raporlarının ve diğer derleme sırasında oluşan dosyaların bulunduğu bir konumdur. Bu nedenle, Cucumber'ın test raporları da
//bu klasör altında saklanarak, derleme sürecinde oluşan diğer dosyalarla birlikte yönetilebilir.
//Cucumber ayrıca, raporları "target" klasörü altında oluşturarak, kodun temizliğini de sağlamış olur. Test raporları, kod dosyaları ile birlikte bulunursa, kodun okunurluğunu
//azaltabilir ve dosya yönetimini zorlaştırabilir. Bu nedenle, raporların ayrı bir klasörde saklanması, kod dosyalarının ve test raporlarının daha düzenli bir şekilde yönetilmesini sağlar.



