package tests;

import driver.DriverUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import page.objects.LoginPage;
import static navigation.ApplicationURLs.LOGIN_URL;

public class PositiveLoginTests extends TestBase{

    @Test
    @Description("The goal of this test is to log in using correct email password and checking if user can log in")
    @Severity(SeverityLevel.CRITICAL)
    public void asUserWantToLogInWithIncorrectEmailAndPassword(){
        DriverUtils.navigateToPage(LOGIN_URL);

        LoginPage loginPage = new LoginPage();
        loginPage.
                typeEmailLogin("pasta_pasta@google.pl").
                typePassword("password").
                clickOnSubmitLoginButton();
    }

}
