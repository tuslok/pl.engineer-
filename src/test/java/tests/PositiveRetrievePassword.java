package tests;

import driver.DriverUtils;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.testng.annotations.Test;
import page.objects.PasswordPage;

import static navigation.ApplicationURLs.PASSWORD_URL;
import static org.testng.Assert.assertEquals;

public class PositiveRetrievePassword extends TestBase{

    @Test
    @Description("The goal of this test is to retrieve password using correct email")
    @Severity(SeverityLevel.NORMAL)
    public void asUserWantToRetrievePasswordUsingCorrectEmail(){
        DriverUtils.navigateToPage(PASSWORD_URL);
        PasswordPage passwordPage = new PasswordPage();
        passwordPage.
                typeAddressEmail("pasta_pasta@google.pl").
                clickOnRetrievePasswordButton();

        String informationMessage = passwordPage.getInformationMessageAboutSendingNewPassword();
        assertEquals(informationMessage, "A confirmation email has been sent to your address: pasta_pasta@google.pl");
    }
}
