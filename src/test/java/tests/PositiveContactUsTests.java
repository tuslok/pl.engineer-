package tests;

import driver.DriverUtils;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.testng.annotations.Test;
import page.objects.ContactUsPage;

import static navigation.ApplicationURLs.CONTACT_US_URL;

public class PositiveContactUsTests extends TestBase{

    @Description("")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void asUserWantToSendMessageWithoutAttachment(){
        DriverUtils.navigateToPage(CONTACT_US_URL);

        ContactUsPage contactUsPage = new ContactUsPage();
        contactUsPage.
                selectSubjectHeading("Customer service").
                typeEmailAddress("test11@google.pl").
                typeOrderReference("Z2020/4564/741").
                typeMessage("Test message. Ignore please.").
                clickOnSendButton();
    }

    @Test
    public void asUserWantToSendMessageWithAttachment() {
        DriverUtils.navigateToPage(CONTACT_US_URL);

        ContactUsPage contactUsPage = new ContactUsPage();
        contactUsPage.
                selectSubjectHeading("Customer service").
                typeEmailAddress("test11@google.pl").
                typeOrderReference("Z2020/4564/741").
                typeMessage("Test message. Ignore please.").
                attachFile("C:\\Users\\Uzytkownik\\Desktop\\cat.jpg");
    }

}
