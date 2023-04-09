package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BlueRentalCarsHomePage {

    public BlueRentalCarsHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(partialLinkText = "Login")
    public WebElement loginButton;

    @FindBy(id = "dropdown-basic-button")
    public WebElement userId;

    @FindBy(partialLinkText = "CONTINUE RESERVATION")
    public WebElement continueReservationButton;

    @FindBy(xpath = "//a[text()='Logout']")
    public WebElement logOutLink;

    @FindBy(xpath = "//button[contains(text(), 'OK')]")
    public WebElement okButton;

}
