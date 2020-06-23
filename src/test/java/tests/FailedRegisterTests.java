package tests;

import driver.DriverUtils;
import org.testng.annotations.Test;
import page.objects.LoginPage;

import static navigation.ApplicationURLs.LOGIN_URL;
import static org.testng.Assert.assertEquals;

public class FailedRegisterTests {

    @Test
    public void asUserTryToRegisterWithExistingEmail(){

        DriverUtils.navigateToPage(LOGIN_URL);

        LoginPage loginPage = new LoginPage();
        loginPage.typeEmailAddressToCreateAccount("more_more@google.pl");
        loginPage.clickOnSubmitCreateAnAccountButton();

        String creationEmailWarning = loginPage.getWarningMessageAboutExistingEmail();
        assertEquals(creationEmailWarning, "An account using this email address has already been registered. Please enter a valid password or request a new one.");
    }

    @Test void asUserWantToRegisterWithoutEmail(){
        DriverUtils.navigateToPage(LOGIN_URL);

        LoginPage loginPage = new LoginPage();
        loginPage.clickOnSubmitCreateAnAccountButton();

        String creationEmailWarning = loginPage.getWarningMessageAboutExistingEmail();
        assertEquals(creationEmailWarning, "Invalid email address.");
    }

}
