package org.example.common;

import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.example.desktop.LoggedInHomePage;
import org.openqa.selenium.WebDriver;

public abstract class LoginPageBase extends AbstractPage {
    protected LoginPageBase(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
    }

    public abstract LoggedInHomePage clickLoginButton();
}
