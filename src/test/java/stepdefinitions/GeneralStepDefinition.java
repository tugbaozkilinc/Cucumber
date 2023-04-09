package stepdefinitions;

import io.cucumber.java.en.Then;
import utilities.ReusableMethods;

import java.io.IOException;

public class GeneralStepDefinition {

    @Then("take a screenshot")
    public void take_a_screenshot() throws IOException {
        ReusableMethods.getScreenshot("screenshot"); //Hooks ile sadece failed bir test case den sonra ekran goruntusu alabiliriz. Bu ara adimlarda ekran goruntusu almanın bir yontemidir.
    }

}