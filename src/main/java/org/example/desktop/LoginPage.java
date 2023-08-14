package org.example.desktop;

import com.zebrunner.carina.utils.R;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.example.common.LoginPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends LoginPageBase {

    @FindBy(xpath = "//h1[text()='Log into Allē']")
    private ExtendedWebElement loginHeader;

    @FindBy(id = "login-phone-number")
    private ExtendedWebElement phoneNumberTextField;

    @FindBy(id = "login-password")
    private ExtendedWebElement passwordTextField;

    @FindBy(xpath = "//button[@data-testid='submit']")
    private ExtendedWebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(loginHeader);
    }


    public void inputPhoneNumber() {
        phoneNumberTextField.click();
        phoneNumberTextField.type(R.TESTDATA.get("phoneNumber"));
    }

    public void inputPassword() {
        passwordTextField.click();
        passwordTextField.type(R.TESTDATA.get("password"));
    }

    @Override
    public LoggedInHomePage clickLoginButton() {
        loginButton.click();
        return new LoggedInHomePage(driver);
    }

}
