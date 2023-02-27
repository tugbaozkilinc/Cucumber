package practice.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AmazonHomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {

    AmazonHomePage amazonHomePage = new AmazonHomePage();
    @Given("User goes to {string}")
    public void user_goes_to(String string) {
        Driver.getDriver().get(string);
    }

    @When("User searches for {string}")
    public void user_searches_for(String string) {
        amazonHomePage.searchBox.sendKeys(string);
    }

    @When("Assert the result contains {string}")
    public void assert_the_result_contains(String string) {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains(string));
    }

    @When("User close the application")
    public void user_close_the_application() {
        Driver.closeDriver();
    }

}
