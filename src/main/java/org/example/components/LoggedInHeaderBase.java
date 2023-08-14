package org.example.components;

import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public class LoggedInHeaderBase extends AbstractUIObject {
    protected LoggedInHeaderBase(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
}
