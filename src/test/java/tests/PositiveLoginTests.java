package tests;

import driver.DriverUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import page.objects.LoginPage;
import page.objects.WelcomePage;
import utils.ExcelDataProvider;

import static navigation.ApplicationURLs.LOGIN_URL;
import static org.testng.Assert.assertEquals;

public class PositiveLoginTests extends TestBase{

    @Test(dataProviderClass = ExcelDataProvider.class,dataProvider = "myTestDataProvider")
    @Description("The goal of this test is to log in using correct email password and checking if user can log in")
    @Severity(SeverityLevel.CRITICAL)
    public void asUserWantToLogInWithCorrectEmailAndPassword(String username, String password){
        DriverUtils.navigateToPage(LOGIN_URL);

        LoginPage loginPage = new LoginPage();
        loginPage.
                typeEmailLogin(username).
                typePassword(password).
                clickOnSubmitLoginButton();

        WelcomePage welcomePage = new WelcomePage();
        welcomePage.
                getNameAndSurnameLoggedUser();
        String titleOfPage = welcomePage.getTitleOfPage();
        assertEquals(titleOfPage, "My account - My Store");
        welcomePage.
                clickOnLogOutButton();

        try {
            Thread.sleep(9999);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
