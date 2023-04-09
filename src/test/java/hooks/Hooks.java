package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    @Before //Note: Method lar cucumber dan import edilmeli
    public void setUpScenarios(){
        System.out.println("Before Method");
    }

    @After //Cucumber dan geleni sec, junit tekini degil.
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
    //After metotumuzda bulunan kod ile otomatik olarak ekran goruntusu alinir ve rapora eklenir.
    //Hooks da ne tur kodlar var?
    //Before ve After metot lari. After da ekran goruntusu almak icin kullandigim kodlar vardir

    //#CUCUMBER HTML DOSYALARI CLOUD A NASIL EKLENIR?
    //#1.resources dosyasinin altında cucumber properties dosyası olustur: cucumber.properties
    //#2.Su kodu ekle: cucumber.publish.enabled=true
    //#3.Testi calistir. Bu sekilde cucumber html raporu cloud yuklenecektir. Fakat GitHub ile giris yapilmazsa 24 saat icinde silinecektir. Bu yüzden GitHub ile giriş yapalım.
    //#4.Login with GitHub a tikla > Authorize SmartBear
    //#5.Create Collection
    //#6.Token i cucumber.properties e ekle
    //#7.Testi tekrar calistir. Collections klasorunde raporlar olusacaktir.

}
