package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BlueRentalCarsHomePage;
import pages.BlueRentalCarsLoginPage;
import utilities.ReusableMethods;

public class BlueRentalCarsDefinitions {

    BlueRentalCarsHomePage blueRentalCarsHomePage = new BlueRentalCarsHomePage();
    BlueRentalCarsLoginPage blueRentalCarsLoginPage = new BlueRentalCarsLoginPage();
    @When("User clicks on login button to go to login page")
    public void user_clicks_on_login_button_to_go_to_login_page() {
        blueRentalCarsHomePage.loginButton.click();
    }

    @When("User enters valid username {string}")
    public void user_enters_valid_username(String string) {
        blueRentalCarsLoginPage.emailBox.sendKeys(string);
    }

    @When("User enters valid password {string}")
    public void user_enters_valid_password(String string) {
        blueRentalCarsLoginPage.passwordBox.sendKeys(string);
    }

    @When("User clicks on login button")
    public void user_clicks_on_login_button() {
        blueRentalCarsLoginPage.loginButton.click();
    }

    @Then("User verifies that he is logged into the page")
    public void user_verifies_that_he_is_logged_into_the_page() {
        Assert.assertTrue(blueRentalCarsHomePage.userId.isDisplayed());
    }

    @Then("User verifies that he is not logged into the page")
    public void user_verifies_that_he_is_not_logged_into_the_page() {
        Assert.assertTrue(ReusableMethods.waitForVisibility(blueRentalCarsLoginPage.errorMessage, 10).isDisplayed());
    }

}
