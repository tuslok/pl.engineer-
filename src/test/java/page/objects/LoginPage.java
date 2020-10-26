package page.objects;

import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.DriverManager;
import waits.WaitForElement;

public class LoginPage extends BasePage{

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

    @FindBy (xpath = "//*[@id='center_column']/div[1]/ol/li")
    WebElement warningMessageLogIn;

    @FindBy(xpath = "//*[@id='create_account_error']/ol/li")
    WebElement warningMessageRegister;

    public LoginPage(){
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    @Step("Type into Email Field {email}")
    public LoginPage typeEmailAddressToCreateAccount(String emailCustomer){
        WaitForElement.waitForElementsIsVisible(emailToCreationField);
        emailToCreationField.sendKeys(emailCustomer);
        log().info("Typed e-mail address: {}", emailCustomer);
        return this;
    }

    @Step("Click on Create Button")
    public RegisterPage clickOnSubmitCreateAnAccountButton(){
        WaitForElement.waitUntilElementsIsClickable(submitCreateAccountButton);
        submitCreateAccountButton.sendKeys(Keys.ENTER);
        log().info("Clicked on 'Create an account' button");
        return new RegisterPage();
    }

    @Step("Type into Email Field To Log In {email}")
    public LoginPage typeEmailLogin(String email){
        WaitForElement.waitForElementsIsVisible(emailToCreationField);
        emailToLogInField.sendKeys(email);
        log().info("Typed e-mail address to log in {}", email);
        return this;
    }

    @Step("Type into Password Field {email}")
    public LoginPage typePassword(String password){
        WaitForElement.waitForElementsIsVisible(passwordField);
        passwordField.sendKeys(password);
        log().info("Typed password {}", password);
        return this;
    }

    @Step("Click on Retrieve Password Button")
    public PasswordPage clickOnRetrievingPasswordButton(){
        WaitForElement.waitUntilElementsIsClickable(retrievingPasswordButton);
        retrievingPasswordButton.click();
        log().info("Clicked on 'Forgot your password?' button");
        return new PasswordPage();
    }

    @Step("Click on Submit Log In Button")
    public WelcomePage clickOnSubmitLoginButton(){
        WaitForElement.waitUntilElementsIsClickable(submitLoginButton);
        submitLoginButton.sendKeys(Keys.ENTER);
        log().info("Clicked on 'Login' button");
        return new WelcomePage();
    }

    @Step("Getting warning message during log in")
    public String getWarningMessageLogIn(){
        WaitForElement.waitForElementsIsVisible(warningMessageLogIn);
        String warningTextLogIn = warningMessageLogIn.getText();
        log().info("Returned warning message: " + warningTextLogIn);
        return warningTextLogIn;
    }

    @Step("")
    public String getWarningMessageRegister(){
        WaitForElement.waitForElementsIsVisible(warningMessageRegister);
        String warningTextRegister = warningMessageRegister.getText();
        log().info("Returned warning message: " + warningTextRegister);
        return warningTextRegister;
    }


}
