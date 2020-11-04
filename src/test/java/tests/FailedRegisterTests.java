package tests;

import driver.DriverUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import page.objects.LoginPage;
import page.objects.RegisterPage;

import static navigation.ApplicationURLs.*;
import static org.testng.Assert.assertEquals;

public class FailedRegisterTests extends TestBase {

    @Test
    @Description("The goal of this test is to log in using existing email and checking if warning message is displayed")
    @Severity(SeverityLevel.CRITICAL)
    public void asUserTryToRegisterWithExistingEmail(){

        DriverUtils.navigateToPage(LOGIN_URL);

        LoginPage loginPage = new LoginPage();
        loginPage.
                typeEmailAddressToCreateAccount("mark_smith@google.pl").
                clickOnSubmitCreateAnAccountButton();

        String warningMessage = loginPage.getWarningMessageRegister();
        assertEquals(warningMessage, "An account using this email address has already been registered. Please enter a valid password or request a new one.");
    }

    @Test
    @Description("The goal of this test is to log in not using email and checking if warning message is displayed")
    @Severity(SeverityLevel.CRITICAL)
    public void asUserWantToRegisterWithoutEmail(){

        DriverUtils.navigateToPage(LOGIN_URL);

        LoginPage loginPage = new LoginPage();
        loginPage.
                clickOnSubmitCreateAnAccountButton();

        String warningMessage = loginPage.getWarningMessageRegister();
        assertEquals(warningMessage, "Invalid email address.");
    }

    @Test
    @Description("The goal of this test is to log in using incorrect email format")
    @Severity(SeverityLevel.CRITICAL)
    public void asUserWantToRegisterUsingIncorrectEmailFormat(){
        DriverUtils.navigateToPage(LOGIN_URL);

        LoginPage loginPage = new LoginPage();
        loginPage.
                typeEmailAddressToCreateAccount("inncorectFormat").
                clickOnSubmitCreateAnAccountButton();

        String warningMessage = loginPage.getWarningMessageRegister();
        assertEquals(warningMessage, "Invalid email address.");

    }

    @Test
    @Description("")
    @Severity(SeverityLevel.BLOCKER)
    public void asUserWantToRegisterNotUsingFirstName(){
        DriverUtils.navigateToPage(ACCOUNT_CREATION_URL);

        LoginPage loginPage = new LoginPage();
        loginPage.
                typeEmailAddressToCreateAccount("mark_smith45@google.pl").
                clickOnSubmitCreateAnAccountButton();

        RegisterPage registerPage = new RegisterPage();
        registerPage.
                clickOnMrTittleField().
                typeCustomerLastName("Smith").
                typeCustomerPasswordField("password").
                selectCustomerDayOfBirthDropDown("5").
                selectCustomerMonthOfBirthDropDown("October").
                selectCustomerYearOfBirthDropDown("1983").
                typeAddressFirstPart("Water Street 63").
                typeAddressCityField("Side").
                selectAddressStateField("Idaho").
                typeAddressPostalCodeField("46964").
                selectAddressCountryField("United States").
                typeMobilePhoneField("123-467-654").
                clickOnSubmitRegisterButton();

        String warningMessage = registerPage.gettingErrorMessage();
        assertEquals(warningMessage, "firstname is required.");
    }

    @Test
    @Description("")
    @Severity(SeverityLevel.MINOR)
    public void asUserWantToRegisterNotUsingLastName(){
        DriverUtils.navigateToPage(ACCOUNT_CREATION_URL);

        LoginPage loginPage = new LoginPage();
        loginPage.
                typeEmailAddressToCreateAccount("mark12_smith@google.pl").
                clickOnSubmitCreateAnAccountButton();

        RegisterPage registerPage = new RegisterPage();
        registerPage.
                clickOnMrTittleField().
                typeCustomerFirstName("Mark").
                typeCustomerPasswordField("password").
                selectCustomerDayOfBirthDropDown("5").
                selectCustomerMonthOfBirthDropDown("October").
                selectCustomerYearOfBirthDropDown("1983").
                typeAddressFirstPart("Water Street 63").
                typeAddressCityField("Side").
                selectAddressStateField("Idaho").
                typeAddressPostalCodeField("46964").
                selectAddressCountryField("United States").
                typeMobilePhoneField("123-467-654").
                clickOnSubmitRegisterButton();

        String warningMessage = registerPage.gettingErrorMessage();
        assertEquals(warningMessage, "lastname is required.");
    }

    @Test
    @Description("")
    @Severity(SeverityLevel.MINOR)
    public void asUserWantToRegisterNotUsingPassword(){
        DriverUtils.navigateToPage(ACCOUNT_CREATION_URL);

        LoginPage loginPage = new LoginPage();
        loginPage.
                typeEmailAddressToCreateAccount("mark1_smith99@google.pl").
                clickOnSubmitCreateAnAccountButton();

        RegisterPage registerPage = new RegisterPage();
        registerPage.
                clickOnMrTittleField().
                typeCustomerFirstName("Mark").
                typeCustomerLastName("Smith").
                selectCustomerDayOfBirthDropDown("5").
                selectCustomerMonthOfBirthDropDown("October").
                selectCustomerYearOfBirthDropDown("1983").
                typeAddressFirstPart("Water Street 63").
                typeAddressCityField("Side").
                selectAddressStateField("Idaho").
                typeAddressPostalCodeField("46964").
                selectAddressCountryField("United States").
                typeMobilePhoneField("123-467-654").
                clickOnSubmitRegisterButton();

        String warningMessage = registerPage.gettingErrorMessage();
        assertEquals(warningMessage, "passwd is required.");
    }

    @Test
    @Description("")
    @Severity(SeverityLevel.MINOR)
    public void asUserWantToRegisterUsingInvalidDateOfBirth(){
        DriverUtils.navigateToPage(ACCOUNT_CREATION_URL);

        LoginPage loginPage = new LoginPage();
        loginPage.
                typeEmailAddressToCreateAccount("mark12_smith@google.pl").
                clickOnSubmitCreateAnAccountButton();

        RegisterPage registerPage = new RegisterPage();
        registerPage.
                clickOnMrTittleField().
                typeCustomerFirstName("Mark").
                typeCustomerLastName("Smith").
                typeCustomerPasswordField("password").
                selectCustomerDayOfBirthDropDown("5").
                selectCustomerYearOfBirthDropDown("1983").
                typeAddressFirstPart("Water Street 63").
                typeAddressCityField("Side").
                selectAddressStateField("Idaho").
                typeAddressPostalCodeField("46964").
                selectAddressCountryField("United States").
                typeMobilePhoneField("123-467-654").
                clickOnSubmitRegisterButton();

        String warningMessage = registerPage.gettingErrorMessage();
        assertEquals(warningMessage, "Invalid date of birth");
    }

    @Test
    @Description("")
    @Severity(SeverityLevel.MINOR)
    public void asUserWantToRegisterNotUsingAddress(){
        DriverUtils.navigateToPage(ACCOUNT_CREATION_URL);

        LoginPage loginPage = new LoginPage();
        loginPage.
                typeEmailAddressToCreateAccount("mark1_smith1@google.pl").
                clickOnSubmitCreateAnAccountButton();

        RegisterPage registerPage = new RegisterPage();
        registerPage.
                clickOnMrTittleField().
                typeCustomerFirstName("Mark").
                typeCustomerLastName("Smith").
                typeCustomerPasswordField("password").
                selectCustomerDayOfBirthDropDown("5").
                selectCustomerMonthOfBirthDropDown("October").
                selectCustomerYearOfBirthDropDown("1983").
                typeAddressCityField("Side").
                selectAddressStateField("Idaho").
                typeAddressPostalCodeField("46964").
                selectAddressCountryField("United States").
                typeMobilePhoneField("123-467-654").
                clickOnSubmitRegisterButton();

        String warningMessage = registerPage.gettingErrorMessage();
        assertEquals(warningMessage, "address1 is required.");
    }

    @Test
    @Description("")
    @Severity(SeverityLevel.MINOR)
    public void asUserWantToRegisterNotUsingCity(){
        DriverUtils.navigateToPage(ACCOUNT_CREATION_URL);

        LoginPage loginPage = new LoginPage();
        loginPage.
                typeEmailAddressToCreateAccount("mark1_smith1@google.pl").
                clickOnSubmitCreateAnAccountButton();

        RegisterPage registerPage = new RegisterPage();
        registerPage.
                clickOnMrTittleField().
                typeCustomerFirstName("Mark").
                typeCustomerLastName("Smith").
                typeCustomerPasswordField("password").
                selectCustomerDayOfBirthDropDown("5").
                selectCustomerMonthOfBirthDropDown("October").
                selectCustomerYearOfBirthDropDown("1983").
                typeAddressFirstPart("Water Street 63").
                selectAddressStateField("Idaho").
                typeAddressPostalCodeField("46964").
                selectAddressCountryField("United States").
                typeMobilePhoneField("123-467-654").
                clickOnSubmitRegisterButton();

        String warningMessage = registerPage.gettingErrorMessage();
        assertEquals(warningMessage, "city is required.");
    }

    @Test
    @Description("")
    @Severity(SeverityLevel.MINOR)
    public void asUserWantToRegisterNotUsingState(){
        DriverUtils.navigateToPage(ACCOUNT_CREATION_URL);

        LoginPage loginPage = new LoginPage();
        loginPage.
                typeEmailAddressToCreateAccount("mark1_1smith@google.pl").
                clickOnSubmitCreateAnAccountButton();

        RegisterPage registerPage = new RegisterPage();
        registerPage.
                clickOnMrTittleField().
                typeCustomerFirstName("Mark").
                typeCustomerLastName("Smith").
                typeCustomerPasswordField("password").
                selectCustomerDayOfBirthDropDown("5").
                selectCustomerMonthOfBirthDropDown("October").
                selectCustomerYearOfBirthDropDown("1983").
                typeAddressFirstPart("Water Street 63").
                typeAddressCityField("Side").
                typeAddressPostalCodeField("46964").
                selectAddressCountryField("United States").
                typeMobilePhoneField("123-467-654").
                clickOnSubmitRegisterButton();

        String warningMessage = registerPage.gettingErrorMessage();
        assertEquals(warningMessage, "This country requires you to choose a State.");
    }

    @Test
    @Description("")
    @Severity(SeverityLevel.MINOR)
    public void asUserWantToRegisterUsingInvalidPostalCode(){
        DriverUtils.navigateToPage(ACCOUNT_CREATION_URL);

        LoginPage loginPage = new LoginPage();
        loginPage.
                typeEmailAddressToCreateAccount("mark1_smith6@google.pl").
                clickOnSubmitCreateAnAccountButton();

        RegisterPage registerPage = new RegisterPage();
        registerPage.
                clickOnMrTittleField().
                typeCustomerFirstName("Mark").
                typeCustomerLastName("Smith").
                typeCustomerPasswordField("password").
                selectCustomerDayOfBirthDropDown("5").
                selectCustomerMonthOfBirthDropDown("October").
                selectCustomerYearOfBirthDropDown("1983").
                typeAddressFirstPart("Water Street 63").
                selectAddressStateField("Idaho").
                typeAddressCityField("Side").
                selectAddressCountryField("United States").
                typeMobilePhoneField("123-467-654").
                clickOnSubmitRegisterButton();

        String warningMessage = registerPage.gettingErrorMessage();
        assertEquals(warningMessage, "The Zip/Postal code you've entered is invalid. It must follow this format: 00000");
    }

    @Test
    @Description("")
    @Severity(SeverityLevel.MINOR)
    public void asUserWantToRegisterNotUsingCountry(){
        DriverUtils.navigateToPage(ACCOUNT_CREATION_URL);

        LoginPage loginPage = new LoginPage();
        loginPage.
                typeEmailAddressToCreateAccount("mark19_smith80@google.pl").
                clickOnSubmitCreateAnAccountButton();

        RegisterPage registerPage = new RegisterPage();
        registerPage.
                clickOnMrTittleField().
                typeCustomerFirstName("Mark").
                typeCustomerLastName("Smith").
                typeCustomerPasswordField("password").
                selectCustomerDayOfBirthDropDown("5").
                selectCustomerMonthOfBirthDropDown("October").
                selectCustomerYearOfBirthDropDown("1983").
                typeAddressFirstPart("Water Street 63").
                selectAddressStateField("Idaho").
                typeAddressCityField("Side").
                selectAddressCountryField("-").
                typeAddressPostalCodeField("46964").
                typeMobilePhoneField("123-467-654").
                clickOnSubmitRegisterButton();

        String warningMessage = registerPage.gettingErrorMessage();
        assertEquals(warningMessage, "Country is invalid");
    }
}
