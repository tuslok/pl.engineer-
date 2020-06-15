package page.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.DriverManager;
import waits.WaitForElement;

public class LoginPage {

    Logger logger = LogManager.getRootLogger();

    @FindBy(id="email_create")
    WebElement emailToCreationField;

    @FindBy(name="SubmitCreate")
    WebElement submitCreateAccountButton;

    @FindBy(id="email")
    WebElement emailToLogInField;

    @FindBy(id="passwd")
    WebElement passwordField;

    @FindBy(xpath = "//*[@id='login_form']/div/p[1]/a")
    WebElement retrievingPasswordButton;

    @FindBy(id = "SubmitLogin")
    WebElement submitLoginButton;

    @FindBy (xpath = "//*[@id='create_account_error']/ol/li")
    WebElement existingEmailWarning;

    @FindBy (xpath = "//*[@id='center_column']/div[1]/ol/li")
    WebElement incorrectLoginPasswordWarning;

    public LoginPage(){
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void typeEmailAddressToCreateAccount(String email){
        WaitForElement.waitForElementsIsVisible(emailToCreationField);
        emailToCreationField.sendKeys(email);
        logger.info("Typed e-mail address: '" + email + "' in order to register customer");
    }

    public void clickOnSubmitCreateAnAccountButton(){
        WaitForElement.waitUntilElementsIsClickable(submitCreateAccountButton);
        submitCreateAccountButton.click();
        logger.info("Clicked on 'Create an account' button");
    }

    public void typeEmailLogin(String email){
        WaitForElement.waitForElementsIsVisible(emailToCreationField);
        emailToLogInField.sendKeys(email);
        logger.info("Typed e-mail addres '" + email + "' in order to log in");
    }

    public void typePassword(String password){
        WaitForElement.waitForElementsIsVisible(passwordField);
        passwordField.sendKeys(password);
        logger.info("Type password '" + password + "' in order to log in");
    }

    public void clickOnRetrievingPasswordButton(){
        WaitForElement.waitUntilElementsIsClickable(retrievingPasswordButton);
        retrievingPasswordButton.click();
        logger.info("Clicked on 'Forgot your password?' button");
    }
    
    public void clickOnSubmitLoginButton(){
        WaitForElement.waitUntilElementsIsClickable(submitLoginButton);
        submitLoginButton.click();
    }

    public String getWarningMessageAboutExistingEmail(){
        WaitForElement.waitForElementsIsVisible(existingEmailWarning);
        String warningText = existingEmailWarning.getText();
        logger.info("Returned warning message: " + warningText);
        return warningText;
    }

    public String getWarningMessageAboutIncorrectEmailOrPassword(){
        WaitForElement.waitForElementsIsVisible(incorrectLoginPasswordWarning);
        String warningText = incorrectLoginPasswordWarning.getText();
        logger.info("Returned warning message: " +warningText);
        return warningText;
    }

}
