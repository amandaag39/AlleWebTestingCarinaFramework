package org.example.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoggedInHeader extends LoggedInHeaderBase{

    @FindBy(xpath = "//a[@aria-label='ALLE']")
    private ExtendedWebElement loggedInAlleHomeLink;

    @FindBy(xpath = "//p[text()='Home']")
    private ExtendedWebElement homeLink;

    @FindBy(xpath = "//p[text()='Wallet']")
    private ExtendedWebElement walletLink;

    @FindBy(xpath = "//p[text()='Providers']")
    private ExtendedWebElement providersLink;

    @FindBy(xpath = "//button[@data-testid='open-menu-button']")
    private ExtendedWebElement openMenuButton;

    public LoggedInHeader(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
}
