import com.sun.xml.bind.v2.TODO;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.utils.R;
import org.example.common.TreatmentGuidePageBase;
import org.example.desktop.LoggedInHomePage;
import org.example.desktop.LoggedOutHomePage;
import org.example.desktop.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTests implements IAbstractTest {

    @Test(testName = "Login with Valid Credentials Test", description = "Run a successful login with valid credentials")
    public void loginValidCredentialsTest() {

        // Open LoggedOutHomePage
        LoggedOutHomePage loggedOutHomePage = new LoggedOutHomePage(getDriver());
        loggedOutHomePage.open();
        Assert.assertTrue(loggedOutHomePage.isPageOpened());

        // Navigate to Login Page
        LoginPage loginPage = loggedOutHomePage.openLoginPage();
        Assert.assertTrue(loginPage.isPageOpened());

        // Enter Valid Credentials
        loginPage.inputPhoneNumber();
        loginPage.inputPassword();

        // Click submit button
        LoggedInHomePage loggedInHomePage = loginPage.clickLoginButton();

        // Verify redirect to LoggedInHomePage
        Assert.assertTrue(loggedInHomePage.isPageOpened());
    }

    @Test(testName = "Open Brand Link Test", description = "Open various brank links in Logged Out home page")
    public void openBrandLinkTest() {

        // Open LoggedOutHomePage
        LoggedOutHomePage loggedOutHomePage = new LoggedOutHomePage(getDriver());
        loggedOutHomePage.open();
        Assert.assertTrue(loggedOutHomePage.isPageOpened());

        // Click treatment brand
        TreatmentGuidePageBase treatmentGuidePage = loggedOutHomePage.openTreatmentPage();
        Assert.assertTrue(treatmentGuidePage.isPageOpened());
    }

}
