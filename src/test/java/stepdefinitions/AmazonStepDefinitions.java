package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonHomePage;
import utilities.Driver;

public class AmazonStepDefinitions {

    AmazonHomePage amazonHomePage = new AmazonHomePage();
    @Then("User verifies that he is in current {string}")
    public void user_verifies_that_he_is_in_current(String string) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(string));
    }

    @When("User searches for {string} in Amazon")
    public void userSearchesForInAmazon(String arg0) {
        amazonHomePage.searchBox.sendKeys(arg0, Keys.ENTER);
    }

}
