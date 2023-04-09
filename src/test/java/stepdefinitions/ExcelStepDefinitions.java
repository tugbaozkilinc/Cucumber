package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.BlueRentalCarsHomePage;
import pages.BlueRentalCarsLoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExcelUtils;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelStepDefinitions {

    BlueRentalCarsHomePage blueRentalCarsHomePage;
    BlueRentalCarsLoginPage blueRentalCarsLoginPage;
    ExcelUtils excelUtils;
    List<Map<String, String>> excelData;
    @Given("User logins with {string} information")
    public void user_logins_with_information(String pageName) throws IOException {
        String path = "./src/test/resources/testdata/mysmoketestdata.xlsx";
        excelUtils = new ExcelUtils(path, pageName);
        excelData = excelUtils.getDataList();
        for (Map<String, String> w : excelData){
            Driver.getDriver().get(ConfigReader.getProperty("blue_rental_car_url"));
            blueRentalCarsHomePage = new BlueRentalCarsHomePage();
            blueRentalCarsLoginPage = new BlueRentalCarsLoginPage();
            blueRentalCarsHomePage.loginButton.click();
            ReusableMethods.waitFor(1);
            blueRentalCarsLoginPage.emailBox.sendKeys(w.get("username"));
            ReusableMethods.waitFor(1);
            blueRentalCarsLoginPage.passwordBox.sendKeys(w.get("password"));
            ReusableMethods.waitFor(1);
            blueRentalCarsLoginPage.loginButton.click();
            ReusableMethods.waitFor(1);
            Assert.assertTrue(blueRentalCarsHomePage.userId.isDisplayed());
            ReusableMethods.getScreenshot("login-screenshot");
            blueRentalCarsHomePage.userId.click();
            ReusableMethods.waitFor(1);
            blueRentalCarsHomePage.logOutLink.click();
            ReusableMethods.waitFor(1);
            blueRentalCarsHomePage.okButton.click();
            ReusableMethods.waitFor(1);
        }
        Driver.closeDriver();
    }

}
