package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    @Before //Note: Method lar cucumber dan import edilmeli, junitten degil
    public void setUpScenarios(){
        System.out.println("Before Method");
    }

    @After
    public void tearDownScenarios(Scenario scenario){
        System.out.println("After Method");
        if (scenario.isFailed()) {
            final byte[] failedScreenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(failedScreenshot, "image/png", "failed-scenario-" + scenario.getName()); //Eger bir scenario fail olursa ekran goruntusu al ve rapora ekle
                                                                                                                     //The screenshot will be attached If only test case fails in the cucumber html file
            Driver.closeDriver();
        }
    }

    //Hooks'u Runner class ında oluşturmak karmaşık kod yapısına neden olabilir. Hooks her bir Scenario ya da Scenario Outline dan ONCE yada SONRA calistirilan bir class dir
    //Neden hooks kullanilir?
    //Raporlamalar icin kullanilir (After metottaki kod ile)
    //After metotumuzda bulunan kod ile test case in fail olması durumunda otomatik olarak ekran goruntusu alinir ve rapora eklenir.
    //Hooks da ne tur kodlar var?
    //Before ve After metot lari. After da test case in fail olması durumunda ekran goruntusu almak icin kullandigim kodlar vardir

}
