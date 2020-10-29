package tests;

import driver.DriverUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import page.objects.LoginPage;
import page.objects.RegisterPage;
import page.objects.WelcomePage;

import static navigation.ApplicationURLs.LOGIN_URL;
import static org.testng.Assert.assertEquals;


public class PositiveRegisterTests extends TestBase {

    @Test
    @Description("The goal of this test is to register completing only all mandatory data and check if user can create account")
    @Severity(SeverityLevel.BLOCKER)
    public void asUserWantToRegisterAccountWithBasicData(){
        DriverUtils.navigateToPage(LOGIN_URL);

        LoginPage loginPage = new LoginPage();
        loginPage.
                typeEmailAddressToCreateAccount("newaccount@google.pl").
                clickOnSubmitCreateAnAccountButton();

        RegisterPage registerPage = new RegisterPage();
        registerPage.
                clickOnMrTittleField().
                typeCustomerFirstName("Adrian").
                typeCustomerLastName("Smith").
                typeCustomerPasswordField("password").
                selectCustomerDayOfBirthDropDown("19").
                selectCustomerMonthOfBirthDropDown("September").
                selectCustomerYearOfBirthDropDown("1993").

                typeAddressFirstPart("Waterside Street 7/9").
                typeAddressCityField("Ficus").
                selectAddressStateField("Arizona").
                typeAddressPostalCodeField("74123").
                selectAddressCountryField("United States").
                typeMobilePhoneField("+74 453 456 741").
                typeAddressAliasField("My home address").
                clickOnSubmitRegisterButton();

        WelcomePage welcomePage = new WelcomePage();
        assertEquals(welcomePage.getTitleOfPage(), "My account - My Store");

    }

    @Test
    @Description("The goal of this test is to register completing only all mandatory data and newsletter and check if user can create account")
    @Severity(SeverityLevel.NORMAL)
    public void asUserWantToRegisterAccountWithNewsletter(){
        DriverUtils.navigateToPage(LOGIN_URL);

        LoginPage loginPage = new LoginPage();
        loginPage.
                typeEmailAddressToCreateAccount("newaccount@google.pl").
                clickOnSubmitCreateAnAccountButton();

        RegisterPage registerPage = new RegisterPage();
        registerPage.
                clickOnMrsTittleField().
                typeCustomerFirstName("Emma").
                typeCustomerLastName("Smith").
                typeCustomerPasswordField("password").
                selectCustomerDayOfBirthDropDown("10").
                selectCustomerMonthOfBirthDropDown("June").
                selectCustomerYearOfBirthDropDown("2000").
                clickOnCustomerNewsletter().

                typeAddressFirstPart("Wooden Street 41/95").
                typeAddressCityField("Los Santos").
                selectAddressStateField("Delaware").
                typeAddressPostalCodeField("1474DX").
                selectAddressCountryField("United States").
                typeMobilePhoneField("+41 441 032 001").
                typeAddressAliasField("Delivery address");

        WelcomePage welcomePage = new WelcomePage();
        assertEquals(welcomePage.getTitleOfPage(), "My account - My Store");
    }

    @Test
    @Description("The goal of this test is to register completing only all mandatory data and special offer and check if user can create account")
    @Severity(SeverityLevel.NORMAL)
    public void asUserWantToRegisterAccountWithSpecialOffers(){
        DriverUtils.navigateToPage(LOGIN_URL);

        LoginPage loginPage = new LoginPage();
        loginPage.
                typeEmailAddressToCreateAccount("newaccount@google.pl").
                clickOnSubmitCreateAnAccountButton();

        RegisterPage registerPage = new RegisterPage();
        registerPage.
                clickOnMrsTittleField().
                typeCustomerFirstName("Taylor").
                typeCustomerLastName("McColl").
                typeCustomerPasswordField("password").
                selectCustomerDayOfBirthDropDown("1").
                selectCustomerMonthOfBirthDropDown("March").
                selectCustomerYearOfBirthDropDown("1974").
                clickOnCustomerSpecialOffers().

                typeAddressFirstPart("Book Street 195").
                typeAddressCityField("Los Santon").
                selectAddressStateField("Kansas").
                typeAddressPostalCodeField("1474DX").
                selectAddressCountryField("United States").
                typeMobilePhoneField("+41 461 487 300").
                typeAddressAliasField("My address");

        WelcomePage welcomePage = new WelcomePage();
        assertEquals(welcomePage.getTitleOfPage(), "My account - My Store");
    }

    @Test
    @Description("The goal of this test is to register completing only basic and all mandatory data and newsletter, special offer and check if user can create account")
    @Severity(SeverityLevel.NORMAL)
    public void asUserWantToRegisterAccountWithNewsletterAndSpecialOffers(){
        DriverUtils.navigateToPage(LOGIN_URL);

        LoginPage loginPage = new LoginPage();
        loginPage.
                typeEmailAddressToCreateAccount("newaccount@google.pl").
                clickOnSubmitCreateAnAccountButton();


        RegisterPage registerPage = new RegisterPage();
        registerPage.clickOnMrsTittleField().
                typeCustomerFirstName("Andrew").
                typeCustomerLastName("Giggs").
                typeCustomerPasswordField("password").
                selectCustomerDayOfBirthDropDown("30").
                selectCustomerMonthOfBirthDropDown("January").
                selectCustomerYearOfBirthDropDown("1988").
                clickOnCustomerNewsletter().
                clickOnCustomerSpecialOffers().

                typeAddressFirstPart("Book Street 195").
                typeAddressCityField("Gildmor").
                selectAddressStateField("Georgia").
                typeAddressPostalCodeField("11SD4X").
                selectAddressCountryField("United States").
                typeMobilePhoneField("+02 896 456 396").
                typeAddressAliasField("My address ");

        WelcomePage welcomePage = new WelcomePage();
        assertEquals(welcomePage.getTitleOfPage(), "My account - My Store");
    }

    @Test
    @Description("The goal of this test is to register completing only all mandatory data and complete additional information and check if user can create account")
    @Severity(SeverityLevel.NORMAL)
    public void asUserWantToRegisterAccountWithAdditionalInformation(){
        DriverUtils.navigateToPage(LOGIN_URL);

        LoginPage loginPage = new LoginPage();
        loginPage.
                typeEmailAddressToCreateAccount("newaccount@google.pl").
                clickOnSubmitCreateAnAccountButton();

        RegisterPage registerPage = new RegisterPage();
        registerPage.
                clickOnMrTittleField().
                typeCustomerFirstName("Thomas").
                typeCustomerLastName("York").
                typeCustomerPasswordField("password").
                selectCustomerDayOfBirthDropDown("19").
                selectCustomerMonthOfBirthDropDown("June").
                selectCustomerYearOfBirthDropDown("1995").

                typeAddressFirstPart("Fast Street 10").
                typeAddressCityField("Poms").
                selectAddressStateField("Connecticut").
                typeAddressPostalCodeField("DS412S").
                selectAddressCountryField("United States").
                typeAdditionalInformationField("Additional information to account").
                typeMobilePhoneField("+74 410 457 052").
                typeAddressAliasField("My home address");

        WelcomePage welcomePage = new WelcomePage();
        assertEquals(welcomePage.getTitleOfPage(), "My account - My Store");
    }

    @Test
    @Description("The goal of this test is to register completing only all mandatory data and complete company name, company address and check if user can create account")
    @Severity(SeverityLevel.BLOCKER)
    public void asUserWantToRegisterAccountWithCompanyNameAndFullAddress(){
        DriverUtils.navigateToPage(LOGIN_URL);

        LoginPage loginPage = new LoginPage();
        loginPage.
                typeEmailAddressToCreateAccount("newaccount@google.pl").
                clickOnSubmitCreateAnAccountButton();

        RegisterPage registerPage = new RegisterPage();
        registerPage.
                clickOnMrTittleField().
                typeCustomerFirstName("Simon").
                typeCustomerLastName("White").
                typeCustomerPasswordField("password").
                selectCustomerDayOfBirthDropDown("29").
                selectCustomerMonthOfBirthDropDown("February").
                selectCustomerYearOfBirthDropDown("1973").

                typeAddressCompanyField("EvilCorp").
                typeAddressFirstPart("Cholo Street 110").
                typeAddressSecondPart("Building 17").
                typeAddressCityField("Kirkland").
                selectAddressStateField("Virginia").
                typeAddressPostalCodeField("D2S11S").
                selectAddressCountryField("United States").
                typeAdditionalInformationField("Additional information to account").
                typeMobilePhoneField("+74 410 457 052").
                typeAddressAliasField("My home address");

        WelcomePage welcomePage = new WelcomePage();
        assertEquals(welcomePage.getTitleOfPage(), "My account - My Store");
    }

    @Test
    @Description("The goal of this test is to register completing only all mandatory data and complete additional phone number and check if user can create account")
    @Severity(SeverityLevel.CRITICAL)
    public void asUserWantToRegisterAccountWithHomePhone(){
        DriverUtils.navigateToPage(LOGIN_URL);

        LoginPage loginPage = new LoginPage();
        loginPage.
                typeEmailAddressToCreateAccount("newaccount@google.pl").
                clickOnSubmitCreateAnAccountButton();

        RegisterPage registerPage = new RegisterPage();
        registerPage.
                clickOnMrTittleField().
                typeCustomerFirstName("Steven").
                typeCustomerLastName("Owen").
                typeCustomerPasswordField("password").
                selectCustomerDayOfBirthDropDown("22").
                selectCustomerMonthOfBirthDropDown("March").
                selectCustomerYearOfBirthDropDown("1997").

                typeAddressFirstPart("Wall Street 11/15").
                typeAddressCityField("Overland").
                selectAddressStateField("Nevada").
                typeAddressPostalCodeField("PO741E").
                selectAddressCountryField("United States").
                typeAdditionalInformationField("Additional information to account").
                typeHomePhoneField("+74 854 45 32").
                typeMobilePhoneField("+74 410 457 052").
                typeAddressAliasField("My home address");

        WelcomePage welcomePage = new WelcomePage();
        assertEquals(welcomePage.getTitleOfPage(), "My account - My Store");
    }

    @Test
    @Description("The goal of this test is to register completing only all mandatory data and complete different person to delivery address and check if user can create account")
    @Severity(SeverityLevel.CRITICAL)
    public void asUserWantToRegisterAccountWithDifferentNameAndLastNameAddress(){
        DriverUtils.navigateToPage(LOGIN_URL);

        LoginPage loginPage = new LoginPage();
        loginPage.typeEmailAddressToCreateAccount("newaccount@google.pl");
        loginPage.clickOnSubmitCreateAnAccountButton();

        RegisterPage registerPage = new RegisterPage();
        registerPage.clickOnMrTittleField();
        registerPage.typeCustomerFirstName("Mike");
        registerPage.typeCustomerLastName("Brown");
        registerPage.typeCustomerPasswordField("password");
        registerPage.selectCustomerDayOfBirthDropDown("8");
        registerPage.selectCustomerMonthOfBirthDropDown("February");
        registerPage.selectCustomerYearOfBirthDropDown("1990");

        registerPage.typeAddressFirstNameField("Amanda");
        registerPage.typeAddressLastNameField("White");
        registerPage.typeAddressFirstPart("Watch Street 11A");
        registerPage.typeAddressCityField("San Yellow");
        registerPage.selectAddressStateField("South Carolina");
        registerPage.typeAddressPostalCodeField("111SD5");
        registerPage.selectAddressCountryField("United States");
        registerPage.typeAdditionalInformationField("Additional information to account");
        registerPage.typeMobilePhoneField("+74 410 457 052");
        registerPage.typeAddressAliasField("My home address");

        WelcomePage welcomePage = new WelcomePage();
        assertEquals(welcomePage.getTitleOfPage(), "My account - My Store");
    }

}
