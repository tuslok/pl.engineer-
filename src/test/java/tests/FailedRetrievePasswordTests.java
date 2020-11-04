package tests;

import driver.DriverUtils;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.testng.annotations.Test;
import page.objects.PasswordPage;

import static navigation.ApplicationURLs.PASSWORD_URL;
import static org.testng.Assert.assertEquals;

public class FailedRetrievePasswordTests extends TestBase{
    @Test
    @Description("The goal of this test is to retrieve password using incorrect email")
    @Severity(SeverityLevel.NORMAL)
    public void asUserWantToRetrievePasswordUsingIncorrectEmail(){
        DriverUtils.navigateToPage(PASSWORD_URL);

        PasswordPage passwordPage = new PasswordPage();
        passwordPage.
                typeAddressEmail("fsafasfasfasfas@gmail.com").
                clickOnRetrievePasswordButton();

        String errorMessage = passwordPage.getWarningMessageAboutIncorrectEmailOrPassword();
        assertEquals(errorMessage, "There is no account registered for this email address.");
    }

    @Test
    @Description("The goal of this test is to retrieve password using correct email")
    @Severity(SeverityLevel.NORMAL)
    public void asUserWantToRetrievePasswordNotUsingEmail(){
        DriverUtils.navigateToPage(PASSWORD_URL);

        PasswordPage passwordPage = new PasswordPage();
        passwordPage.
                typeAddressEmail("").
                clickOnRetrievePasswordButton();

        String errorMessage = passwordPage.getWarningMessageAboutIncorrectEmailOrPassword();
        assertEquals(errorMessage, "Invalid email address.");
    }

    @Test
    @Description("The goal of this test is to retrieve password using correct email")
    @Severity(SeverityLevel.NORMAL)
    public void asUserWantToRetrievePasswordUsingIncorrectSampleOfEmail(){
        DriverUtils.navigateToPage(PASSWORD_URL);

        PasswordPage passwordPage = new PasswordPage();
        passwordPage.
                typeAddressEmail("randommail").
                clickOnRetrievePasswordButton();

        String errorMessage = passwordPage.getWarningMessageAboutIncorrectEmailOrPassword();
        assertEquals(errorMessage, "Invalid email address.");
    }

}
