package org.example.desktop;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.example.common.LoggedInHomePageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoggedInHomePage extends LoggedInHomePageBase {

    @FindBy(xpath = "//h1[@data-testid='just-for-you-title']")
    private ExtendedWebElement justForYouTitle;
    public LoggedInHomePage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(justForYouTitle);
    }
}
