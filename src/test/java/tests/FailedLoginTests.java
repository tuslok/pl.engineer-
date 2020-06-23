package tests;

import driver.DriverUtils;
import org.testng.annotations.Test;
import page.objects.LoginPage;
import page.objects.TopMenuPage;

import static org.testng.Assert.assertEquals;
import static navigation.ApplicationURLs.LOGIN_URL;

public class FailedLoginTests extends TestBase{


    @Test
    public void asUserWantToLogInWithIncorrectEmail(){
        DriverUtils.navigateToPage(LOGIN_URL);

        LoginPage loginPage = new LoginPage();
        loginPage.typeEmailLogin("pasta@google.pl");
        loginPage.typePassword("password");
        loginPage.clickOnSubmitLoginButton();

        String warningMessageAboutIncorrectEmailOrPassword = loginPage.getWarningMessageAboutIncorrectEmailOrPassword();
        assertEquals(warningMessageAboutIncorrectEmailOrPassword, "Authentication failed.");
    }

    @Test
    public void asUserWantToLogInWithIncorrectPassword(){
        DriverUtils.navigateToPage(LOGIN_URL);

        LoginPage loginPage = new LoginPage();
        loginPage.typeEmailLogin("pasta_pasta@google.pl");
        loginPage.typePassword("pa55word");
        loginPage.clickOnSubmitLoginButton();

        String warningMessageAboutIncorrectEmailOrPassword = loginPage.getWarningMessageAboutIncorrectEmailOrPassword();
        assertEquals(warningMessageAboutIncorrectEmailOrPassword, "Authentication failed.");
    }

}
