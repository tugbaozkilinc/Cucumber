package stepdefinitions;

import io.cucumber.java.en.When;
import pages.BlueRentalCarsHomePage;
import pages.BlueRentalCarsLoginPage;
import java.util.List;
import java.util.Map;

public class DataTableStepDefinitions {

    BlueRentalCarsLoginPage blueRentalCarsLoginPage = new BlueRentalCarsLoginPage();
    BlueRentalCarsHomePage blueRentalCarsHomePage = new BlueRentalCarsHomePage();
    @When("User enters valid username and password")
    public void user_enters_valid_username_and_password(io.cucumber.datatable.DataTable dataTable) {
        //1. yol:
        //List<String> credentials = dataTable.row(1); //0 da title lar var.
        blueRentalCarsHomePage.loginButton.click();
        //blueRentalCarsLoginPage.emailBox.sendKeys(credentials.get(0));
        //blueRentalCarsLoginPage.passwordBox.sendKeys(credentials.get(1));
        //blueRentalCarsLoginPage.loginButton.click();
        //2. yol:
        //List<List<String>> credentials = dataTable.asLists();
        //System.out.println(credentials); //[[username, password], [sam.walker@bluerentalcars.com, c!fas_art]]
        //3. yol:
        List<Map<String, String>> credentials = dataTable.asMaps(String.class, String.class);
        credentials.forEach(System.out::println); //{username=sam.walker@bluerentalcars.com, password=c!fas_art}
        for (Map<String, String> w : credentials){
            blueRentalCarsLoginPage.emailBox.sendKeys(w.get("username"));
            blueRentalCarsLoginPage.passwordBox.sendKeys(w.get("password"));
        }
        blueRentalCarsLoginPage.loginButton.click();
    }

}
