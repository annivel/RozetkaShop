package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tools.DriverPage;

public class RegistrationWindow extends DriverPage {

    @FindBy(xpath = "//a[@class='header-topline__user-link link-dashed']")
    private WebElement registrationWindow;

    public void setRegistrationWindow(){
        registrationWindow.click();
    }



}
