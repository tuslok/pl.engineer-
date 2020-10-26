package page.objects;

import driver.DriverManager;
import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

public class PasswordPage extends BasePage{

    private Logger logger = LogManager.getLogger(PasswordPage.class);

    @FindBy(id = "email")
    WebElement emailAddress;

    @FindBy(xpath = "//*[@id='form_forgotpassword']/fieldset/p/button")
    WebElement retrievePasswordButton;

    @FindBy(xpath = "//*[@id='center_column']/div/div/ol/li")
    WebElement errorMessage;

    @FindBy(xpath = "//*[@id='center_column']/div/p")
    WebElement informationMessage;

    public PasswordPage(){
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    @Step("Type into Email Field To Log In {email}")
    public PasswordPage typeAddressEmail(String email){
        //WaitForElement.waitForElementsIsVisible(emailAddress);
        emailAddress.sendKeys(email);
        logger.info("Typed e-mail address to retrieve password {}", email);
        return this;
    }

    @Step("Click on 'Retrieve password' button")
    public PasswordPage clickOnRetrievePasswordButton(){
        //WaitForElement.waitUntilElementsIsClickable(retrievePasswordButton);
        retrievePasswordButton.sendKeys(Keys.ENTER);
        logger.info("Clicked on 'Retrieve password' button");
        return this;
    }

    @Step("Getting warning message about no email address assigned to account")
    public String getWarningMessageAboutIncorrectEmailOrPassword(){
        WaitForElement.waitUntilElementsIsClickable(errorMessage);
        String warningText = errorMessage.getText();
        logger.info("Returned warning message: " +warningText);
        return warningText;
    }

    @Step()
    public String getInformationMessageAboutSendingNewPassword(){
        WaitForElement.waitForElementsIsVisible(informationMessage);
        String informationText = informationMessage.getText();
        logger.info("Returned information message: " + informationText);
        return informationText;
    }

}
