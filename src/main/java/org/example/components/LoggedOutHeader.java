package org.example.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.example.desktop.LoginPage;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoggedOutHeader extends LoggedOutHeaderBase {

    @FindBy(xpath = "//a[@aria-label='ALLE']")
    private ExtendedWebElement loggedOutAlleLogoHomeLink;

    @FindBy(xpath = "//a[@data-testid='header-login-link']")
    private ExtendedWebElement loginLink;

    @FindBy(xpath = "//a[@data-testid='header-join-link']")
    private ExtendedWebElement joinAlleLink;

    public LoggedOutHeader(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public LoginPage openLoginPage() {
        loginLink.click();
        return new LoginPage(driver);
    }


}
