package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GoogleHomePage;
import utilities.Driver;

public class GoogleStepDefinitions {

    GoogleHomePage googleHomePage = new GoogleHomePage();
    @Then("User close the application")
    public void user_close_the_application() {
        Driver.closeDriver();
    }

    @When("User searches for {string}")
    public void user_searches_for(String string) {
     googleHomePage.searchBox.sendKeys(string, Keys.ENTER);
    }

    @Then("Assert the result contains {string}")
    public void assert_the_result_contains(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }

}
