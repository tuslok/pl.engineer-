package tests;

import driver.DriverUtils;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.testng.annotations.Test;
import page.objects.ContactUsPage;

import static navigation.ApplicationURLs.CONTACT_US_URL;
import static org.testng.Assert.assertTrue;

public class NegativeContactUsTests extends TestBase {

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("")
    public void asUserWantToSendMessageWithoutSubjectHeading() {
        DriverUtils.navigateToPage(CONTACT_US_URL);

        ContactUsPage contactUsPage = new ContactUsPage();
        contactUsPage.
                typeEmailAddress("test11@google.pl").
                typeOrderReference("XXX/LLL/999").
                typeMessage("Test message. Ignore please.").
                attachFile("C:\\Users\\Uzytkownik\\Desktop\\cat.jpg");

        // to be add error message and assertion
        //String warningMessage =
        //assertTrue();
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("")
    public void asUserWantToSendMessageWithoutEmailAddress() {
        DriverUtils.navigateToPage(CONTACT_US_URL);

        ContactUsPage contactUsPage = new ContactUsPage();
        contactUsPage.
                selectSubjectHeading("Customer service").
                typeOrderReference("XXX/LLL/999").
                typeMessage("Test message. Ignore please.").
                attachFile("C:\\Users\\Uzytkownik\\Desktop\\cat.jpg");

        // to be add error message and assertion
        //String warningMessage =
        //assertTrue();
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("")
    public void asUserWantToSendMessageWithoutOrderReference() {
        DriverUtils.navigateToPage(CONTACT_US_URL);

        ContactUsPage contactUsPage = new ContactUsPage();
        contactUsPage.
                selectSubjectHeading("Customer service").
                typeEmailAddress("test_mail@google.pl").
                typeMessage("Test message. Ignore please.").
                attachFile("C:\\Users\\Uzytkownik\\Desktop\\cat.jpg");

        // to be add error message and assertion
        //String warningMessage =
        //assertTrue();
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("")
    public void asUserWantToSendMessageWithoutMessage() {
        DriverUtils.navigateToPage(CONTACT_US_URL);

        ContactUsPage contactUsPage = new ContactUsPage();
        contactUsPage.
                selectSubjectHeading("Customer service").
                typeOrderReference("Z2020/4564/741").
                typeOrderReference("XXX/LLL/999").
                attachFile("C:\\Users\\Uzytkownik\\Desktop\\cat.jpg");

        // to be add error message and assertion
        //String warningMessage =
        //assertTrue();
    }

}
