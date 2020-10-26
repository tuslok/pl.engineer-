package tests;

import driver.DriverUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import page.objects.LoginPage;

import static org.testng.Assert.assertEquals;
import static navigation.ApplicationURLs.LOGIN_URL;

public class FailedLoginTests extends TestBase{


    @Test
    @Description("The goal of this test is to log in using incorrect email and checking of warning message is displayed")
    @Severity(SeverityLevel.BLOCKER)
    public void asUserWantToLogInWithIncorrectEmail(){
        DriverUtils.navigateToPage(LOGIN_URL);

        LoginPage loginPage = new LoginPage();
        loginPage.
                typeEmailLogin("pasta@google.pl").
                typePassword("password").
                clickOnSubmitLoginButton();

        String warningMessage = loginPage.getWarningMessageLogIn();
        assertEquals(warningMessage, "Authentication failed.");
    }

    @Test
    @Description("The goal of this test is to log in using incorrect password and checking if warning message is displayed")
    @Severity(SeverityLevel.BLOCKER)
    public void asUserWantToLogInWithIncorrectPassword(){
        DriverUtils.navigateToPage(LOGIN_URL);

        LoginPage loginPage = new LoginPage();
        loginPage.
                typeEmailAddressToCreateAccount("pasta_pasta@google.pl").
                typePassword("passw0rd").
                clickOnSubmitLoginButton();

        String warningMessage = loginPage.getWarningMessageLogIn();
        assertEquals(warningMessage, "Authentication failed.");
    }

    @Test
    @Description("The goal of this test is to log in not using login")
    @Severity(SeverityLevel.CRITICAL)
    public void asUserWantToLogInWithoutEmail(){
        DriverUtils.navigateToPage(LOGIN_URL);

        LoginPage loginPage = new LoginPage();
        loginPage.
                typePassword("pa55word").
                clickOnSubmitLoginButton();

        String warningMessage = loginPage.getWarningMessageLogIn();
        assertEquals(warningMessage, "An email address required.");
    }

    @Test
    @Description("The goal of this test is to log in not using password")
    @Severity(SeverityLevel.CRITICAL)
    public void asUserWantToLogInWithoutPassword(){
        DriverUtils.navigateToPage(LOGIN_URL);

        LoginPage loginPage = new LoginPage();
        loginPage.
                typeEmailLogin("pasta@o2.pl").
                clickOnSubmitLoginButton();

        String warningMessage = loginPage.getWarningMessageLogIn();
        assertEquals(warningMessage, "Password is required.");
    }

    @Test
    @Description("The goal of this test is to log in not using email and password")
    @Severity(SeverityLevel.CRITICAL)
    public void asUserWantToLogInWithoutEmailAndPassword(){
        DriverUtils.navigateToPage(LOGIN_URL);

        LoginPage loginPage = new LoginPage();
        loginPage.
                clickOnSubmitLoginButton();

        String warningMessage = loginPage.getWarningMessageLogIn();
        assertEquals(warningMessage, "An email address required.");
    }

}
