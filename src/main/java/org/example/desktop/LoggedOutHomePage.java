package org.example.desktop;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.example.common.LoggedOutHomePageBase;
import org.example.common.TreatmentGuidePageBase;
import org.example.components.LoggedOutHeader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = LoggedOutHomePageBase.class)
public class LoggedOutHomePage extends LoggedOutHomePageBase {

    @FindBy(xpath = "//div[@data-testid='logged-out-header']")
    private LoggedOutHeader loggedOutHeader;

    @FindBy(xpath = "//span[text()='Welcome']")
    private ExtendedWebElement welcomeMessage;

    // Brands Elements List
    @FindBy(xpath = "//div[contains(@class, 'earnAndSaveSection___StyledDiv4')]//a[@aria-label]")
    private List<ExtendedWebElement> brandLinks;

    // Brands List individual Elements
    @FindBy(xpath = "//button[@aria-label='BOTOX® Cosmetic (onabotulinumtoxinA)']")
    private ExtendedWebElement botoxCosmeticLink;

    @FindBy(xpath = "//h4[text()='JUVÉDERM® Collection of Fillers']//parent::a")
    private ExtendedWebElement juvedermCollectionFillersLink;

    @FindBy(xpath = "//h4[text()='CoolSculpting® and CoolSculpting® Elite']//parent::a")
    private ExtendedWebElement coolSculptingAndEliteLink;

    @FindBy(xpath = "//h4[text()='CoolTone®']//parent::a")
    private ExtendedWebElement coolToneLink;

    @FindBy(xpath = "//h4[text()='SkinMedica®']//parent::a")
    private ExtendedWebElement skinMedicaLink;



    public LoggedOutHomePage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(welcomeMessage);
    }
    @Override
    public LoggedOutHeader getLoggedOutHeader() {
        return loggedOutHeader;
    }

    @Override
    public LoginPage openLoginPage() {
        return getLoggedOutHeader().openLoginPage();
    }

    public TreatmentGuidePageBase openTreatmentPage() {
        botoxCosmeticLink.click();
        return initPage(driver, TreatmentGuidePageBase.class);
    }

}
