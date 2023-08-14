package org.example.desktop;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.example.common.LoggedOutHomePageBase;
import org.example.common.TreatmentGuidePageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = TreatmentGuidePageBase.class)

public class TreatmentGuidePage extends TreatmentGuidePageBase {

    @FindBy(xpath = "//p[text()='Our Brands']")
    private ExtendedWebElement ourBrandsRootMenuLink;

    public TreatmentGuidePage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(ourBrandsRootMenuLink);
    }
}
