package tests;

import driver.DriverUtils;
import org.testng.annotations.Test;
import page.objects.LoginPage;
import page.objects.TopMenuPage;

import static org.testng.Assert.assertEquals;
import static navigation.ApplicationURLs.LOGIN_URL;

public class FailedLoginTests extends TestBase{


    @Test
    public void asUserTryToRegisterWithExistingEmail(){

        DriverUtils.navigateToPage(LOGIN_URL);

        LoginPage loginPage = new LoginPage();
        loginPage.typeEmailAddressToCreateAccount("more_more@google.pl");
        loginPage.clickOnSubmitCreateAnAccountButton();

        String warningMessageAboutExistingEmailAddress = loginPage.getWarningMessageAboutExistingEmail();
        assertEquals(warningMessageAboutExistingEmailAddress, "An account using this email address has already been registered. Please enter a valid password or request a new one.");
    }

    @Test
    public void asUserWantToLogInWithIncorrectEmailAndPassword(){

        DriverUtils.navigateToPage(LOGIN_URL);

        LoginPage loginPage = new LoginPage();
        loginPage.typeEmailLogin("pasta@google.pl");
        loginPage.typePassword("password");
        loginPage.clickOnSubmitLoginButton();

        String warningMessageAboutIncorrectEmailOrPassword = loginPage.getWarningMessageAboutIncorrectEmailOrPassword();
        assertEquals(warningMessageAboutIncorrectEmailOrPassword, "Authentication failed.");
    }

}
