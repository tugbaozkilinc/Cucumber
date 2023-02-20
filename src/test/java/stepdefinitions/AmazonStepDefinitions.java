package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonHomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {

    AmazonHomePage amazonHomePage = new AmazonHomePage();
    @Given("User goes to the amazon")
    public void user_goes_to_the_amazon() {
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));
    }

    @Given("User searches for teapot")
    public void user_searches_for_teapot() {
        amazonHomePage.searchBox.sendKeys("teapot", Keys.ENTER);
    }

    @Then("Assert the result contains teapot")
    public void assert_the_result_contains_teapot() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("teapot"));
    }

    @When("User searches for flower")
    public void user_searches_for_flower() {
        amazonHomePage.searchBox.sendKeys("flower", Keys.ENTER);
    }

    @Then("Assert the result contains flower")
    public void assert_the_result_contains_flower() {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("flower"));
    }

}
