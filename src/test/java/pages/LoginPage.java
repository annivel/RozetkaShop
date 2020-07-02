package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import tools.DriverPage;

public class LoginPage extends DriverPage {

    @FindBy(xpath = "//input[@id='auth_email']")
    private WebElement enterLogin;

    @FindBy(xpath = "//input[@id='auth_pass']")
    private WebElement enterPassword;

    @FindBy(xpath = "//button[@class='button button_size_large button_color_green auth-modal__submit']")
    private WebElement submit;


    public void login(String loginInput) {
        enterLogin.sendKeys(loginInput);
    }

    public void password(String pass) {
        enterPassword.sendKeys(pass + Keys.ENTER);
    }


/*
    public void submit() {
        submit.
*/

    }


