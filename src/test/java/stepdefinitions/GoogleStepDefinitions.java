package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GoogleHomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class GoogleStepDefinitions {

    GoogleHomePage googleHomePage = new GoogleHomePage();
    @Given("User goes to the google")
    public void user_goes_to_the_google() {
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));
    }

    @When("User searches for iphone")
    public void user_searches_for_iphone() {
        googleHomePage.searchBox.sendKeys("iphone", Keys.ENTER);
    }

    @Then("Assert the result contains iphone")
    public void assert_the_result_contains_iphone() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("iphone"));
    }

    @When("User searches for tesla")
    public void userSearchesForTesla() {
        googleHomePage.searchBox.sendKeys("tesla", Keys.ENTER);
    }

    @Then("Assert the result contains tesla")
    public void assertTheResultContainsTesla() {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("tesla"));
    }

    @Then("User close the application")
    public void user_close_the_application() {
        Driver.closeDriver();
    }

}
