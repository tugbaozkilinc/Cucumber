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
        List<String> credentials1 = dataTable.row(1); //0 da title lar var.
        System.out.println("credentials1: " + credentials1); //[sam.walker@bluerentalcars.com, c!fas_art]
        blueRentalCarsHomePage.loginButton.click();
        blueRentalCarsLoginPage.emailBox.sendKeys(credentials1.get(0));
        blueRentalCarsLoginPage.passwordBox.sendKeys(credentials1.get(1));
        blueRentalCarsLoginPage.loginButton.click();

        //2. yol:
        List<List<String>> credentials2 = dataTable.asLists(String.class); //dataTable.asLists();
        System.out.println("credentials2: " + credentials2); //[[username, password], [sam.walker@bluerentalcars.com, c!fas_art]]
        for (List<String> w : credentials2){
            if (!w.get(0).equals("username")){
                blueRentalCarsLoginPage.emailBox.sendKeys(w.get(0));
                blueRentalCarsLoginPage.passwordBox.sendKeys(w.get(1));
            }
        }

        //3. yol:
        List<Map<String, String>> credentials3 = dataTable.asMaps(String.class, String.class);
        System.out.println("credentials3: " + credentials3); //[{username=sam.walker@bluerentalcars.com, password=c!fas_art}]
        for (Map<String, String> w : credentials3){
            blueRentalCarsLoginPage.emailBox.sendKeys(w.get("username"));
            blueRentalCarsLoginPage.passwordBox.sendKeys(w.get("password"));
        }
        blueRentalCarsLoginPage.loginButton.click();
    }

}
