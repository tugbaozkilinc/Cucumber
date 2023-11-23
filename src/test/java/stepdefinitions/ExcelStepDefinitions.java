package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.BlueRentalCarsHomePage;
import pages.BlueRentalCarsLoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExcelUtils;
import utilities.ReusableMethods;
import java.util.List;
import java.util.Map;
import static org.junit.Assert.assertTrue;

public class ExcelStepDefinitions {

    BlueRentalCarsHomePage blueRentalCarsHomePage = new BlueRentalCarsHomePage();
    BlueRentalCarsLoginPage blueRentalCarsLoginPage = new BlueRentalCarsLoginPage();
    ExcelUtils excelUtils;
    List<Map<String, String>> excelData;
    @Given("User logins with {string} information")
    public void user_logins_with_information(String pageName) {
        String path = "./src/test/resources/testdata/mysmoketestdata.xlsx";
        excelUtils = new ExcelUtils(path, pageName);
        excelData = excelUtils.getDataList();
        for (Map<String, String> w : excelData){
            Driver.getDriver().get(ConfigReader.getProperty("blue_rental_car_url"));
            blueRentalCarsHomePage.loginButton.click();
            blueRentalCarsLoginPage.emailBox.sendKeys(w.get("username"));
            blueRentalCarsLoginPage.passwordBox.sendKeys(w.get("password"));
            blueRentalCarsLoginPage.loginButton.click();
            assertTrue(blueRentalCarsHomePage.userId.isDisplayed());
            ReusableMethods.getScreenshot("login-screenshot");
            blueRentalCarsHomePage.userId.click();
            blueRentalCarsHomePage.logOutLink.click();
            blueRentalCarsHomePage.okButton.click();
        }
        Driver.closeDriver();
    }

}
