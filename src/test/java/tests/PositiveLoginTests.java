package tests;

import driver.DriverUtils;
import org.testng.annotations.Test;
import page.objects.LoginPage;
import static navigation.ApplicationURLs.LOGIN_URL;

public class PositiveLoginTests extends TestBase{

    @Test
    public void asUserWantToLogInWithIncorrectEmailAndPassword(){
        DriverUtils.navigateToPage(LOGIN_URL);

        LoginPage loginPage = new LoginPage();
        loginPage.typeEmailLogin("pasta_pasta@google.pl");
        loginPage.typePassword("password");
        loginPage.clickOnSubmitLoginButton();
    }

}
