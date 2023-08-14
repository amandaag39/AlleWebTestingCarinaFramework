package org.example.common;

import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.example.components.LoggedOutHeader;
import org.example.desktop.LoginPage;
import org.openqa.selenium.WebDriver;

public abstract class LoggedOutHomePageBase extends AbstractPage {
    public LoggedOutHomePageBase(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);

    }
    public abstract LoggedOutHeader getLoggedOutHeader();

    public abstract LoginPage openLoginPage();
}
