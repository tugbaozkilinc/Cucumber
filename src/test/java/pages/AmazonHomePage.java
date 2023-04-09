package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonHomePage {

    public AmazonHomePage() { PageFactory.initElements(Driver.getDriver(), this); }; //initElements(), bir sayfanın elementlerini tanımlamak icin kullanilir.

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;

}
