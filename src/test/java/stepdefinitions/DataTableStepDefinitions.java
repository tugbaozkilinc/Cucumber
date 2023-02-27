package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablesPage;
import utilities.Driver;

public class DataTableStepDefinitions {

    DataTablesPage dataTablesPage = new DataTablesPage();
    @Given("User goes to {string}")
    public void user_goes_to(String string) {
        Driver.getDriver().get(string);
    }

    @When("User clicks on new button")
    public void user_clicks_on_new_button() {
        dataTablesPage.newButton.click();
    }

    @When("User enters first name {string}")
    public void user_enters_first_name(String string) {
        dataTablesPage.firstName.sendKeys(string);
    }

    @When("User enters last name {string}")
    public void user_enters_last_name(String string) {
        dataTablesPage.lastName.sendKeys(string);
    }

    @When("User enters positions {string}")
    public void user_enters_positions(String string) {
        dataTablesPage.position.sendKeys(string);
    }

    @When("User enters office {string}")
    public void user_enters_office(String string) {
        dataTablesPage.office.sendKeys(string);
    }

    @When("User enters extension {string}")
    public void user_enters_extension(String string) {
        dataTablesPage.extension.sendKeys(string);
    }

    @When("User enters start_date {string}")
    public void user_enters_start_date(String string) {
        dataTablesPage.startDate.sendKeys(string);
    }

    @When("User enters salary {string}")
    public void user_enters_salary(String string) {
        dataTablesPage.salary.sendKeys(string);
    }

    @When("User clicks on create button")
    public void user_clicks_on_create_button() {
        dataTablesPage.createButton.click();
    }

    @When("User searches with {string}")
    public void user_searches_with(String string) {
        dataTablesPage.searchTextBox.sendKeys(string);
    }

    @Then("User verifies that the {string} is created")
    public void user_verifies_that_the_is_created(String string) {
        Assert.assertTrue(dataTablesPage.name.getText().contains(string));
    }

}
