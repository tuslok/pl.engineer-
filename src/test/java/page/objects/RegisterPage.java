package page.objects;

import driver.DriverManager;
import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import waits.WaitForElement;

public class RegisterPage extends BasePage{

    @FindBy (id = "id_gender1")
    WebElement mrTittleField;

    @FindBy (id = "id_gender2")
    WebElement mrsTittleField;

    @FindBy (id = "customer_firstname")
    WebElement customerFirstNameField;

    @FindBy(id = "customer_lastname")
    WebElement customerLastNameField;

    @FindBy(id = "email")
    WebElement customerEmailField;

    @FindBy (id = "passwd")
    WebElement customerPasswordField;

    @FindBy(id = "days")
    WebElement customerDayOfBirthDropDown;

    @FindBy(id = "months")
    WebElement customerMonthOfBirthDropDown;

    @FindBy(id = "years")
    WebElement customerYearOfBirthDropDown;

    @FindBy(id = "newsletter")
    WebElement customerNewsletter;

    @FindBy(id = "optin")
    WebElement customerSpecialOffers;

    @FindBy (id = "firstname")
    WebElement addressFirstNameField;

    @FindBy (id = "lastname")
    WebElement addressLastNameField;

    @FindBy (id = "company")
    WebElement addressCompanyField;

    @FindBy(id = "address1")
    WebElement addressFirstPart;

    @FindBy(id = "address2")
    WebElement addressSecondPart;

    @FindBy(id = "city")
    WebElement addressCityField;

    @FindBy(id = "id_state")
    WebElement addressStateField;

    @FindBy(id = "postcode")
    WebElement addressPostalCodeField;

    @FindBy(id = "id_country")
    WebElement addressCountryField;

    @FindBy(id = "other")
    WebElement additionalInformationField;

    @FindBy(id = "phone")
    WebElement homePhoneField;

    @FindBy(id = "phone_mobile")
    WebElement mobilePhoneField;

    @FindBy(id = "alias")
    WebElement addressAliasField;

    @FindBy(id = "submitAccount")
    WebElement submitRegisterButton;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div/ol/li")
    WebElement errorMessage;

    public RegisterPage(){
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    @Step("Click on Mr tittle button")
    public RegisterPage clickOnMrTittleField(){
        WaitForElement.waitForElementsIsVisible(mrTittleField);
        mrTittleField.click();
        log().info("Clicked on Mr tittle field");
        return this;
    }

    @Step("Click on Mrs tittle button")
    public RegisterPage clickOnMrsTittleField(){
        WaitForElement.waitUntilElementsIsClickable(mrsTittleField);
        mrsTittleField.click();
        log().info("Clicked on Mrs tittle field");
        return this;
    }

    @Step("Type into First Name Field {firstName}")
    public RegisterPage typeCustomerFirstName(String firstName){
        WaitForElement.waitUntilElementsIsClickable(customerFirstNameField);
        customerFirstNameField.sendKeys(firstName);
        log().info("Typed customer first name: " + firstName);
        return this;
    }

    @Step("Type into Last Name Field {lastName}")
    public RegisterPage typeCustomerLastName(String lastName){
        WaitForElement.waitForElementsIsVisible(customerLastNameField);
        customerLastNameField.sendKeys(lastName);
        log().info("Typed customer last name: " + lastName);
        return this;
    }

    @Step("Type into Email Field {email}")
    public RegisterPage typeCustomerEmailAddress(String email){
        WaitForElement.waitForElementsIsVisible(customerEmailField);
        customerEmailField.sendKeys(email);
        log().info("Typed customer email address: " + email);
        return this;
    }

    @Step("Type into Password Field {password}")
    public RegisterPage typeCustomerPasswordField(String password){
        WaitForElement.waitForElementsIsVisible(customerPasswordField);
        customerPasswordField.sendKeys(password);
        log().info("Typed customer password: " + password);
        return this;
    }

    @Step("Select day of birth {dayOfBirth}")
    public RegisterPage selectCustomerDayOfBirthDropDown(String dayOfBirth){
        customerDayOfBirthDropDown.sendKeys(dayOfBirth);
        log().info("Selected day: " + dayOfBirth);
        return this;
    }

    @Step("Select month of birth {monthOfBirth}")
    public RegisterPage selectCustomerMonthOfBirthDropDown(String monthOfBirth){
        customerMonthOfBirthDropDown.sendKeys(monthOfBirth);
        log().info("Selected month: " + monthOfBirth);
        return this;
    }

    @Step("Select year of birth {yearOfBirth}")
    public RegisterPage selectCustomerYearOfBirthDropDown(String yearOfBirth){
        customerYearOfBirthDropDown.sendKeys(yearOfBirth);
        log().info("Selected year: " + yearOfBirth);
        return this;
    }

    @Step("Click on Newsletter button")
    public RegisterPage clickOnCustomerNewsletter(){
        customerNewsletter.click();
        log().info("Clicked on customer newsletter field");
        return this;
    }

    @Step("Click on Special Offers button")
    public RegisterPage clickOnCustomerSpecialOffers(){
        customerSpecialOffers.click();
        log().info("Clicked on special offers field");
        return this;
    }

    @Step("Type into First Name Field {addressFirstName}")
    public RegisterPage typeAddressFirstNameField(String addressFirstName){
        WaitForElement.waitForElementsIsVisible(addressFirstNameField);
        addressFirstNameField.clear();
        addressFirstNameField.sendKeys(addressFirstName);
        log().info("Typed first name in address part: " + addressFirstName);
        return this;
    }

    @Step("Type into Last Name Field {addressLastName}")
    public RegisterPage typeAddressLastNameField(String addressLastName){
        WaitForElement.waitForElementsIsVisible(addressLastNameField);
        addressLastNameField.clear();
        addressLastNameField.sendKeys(addressLastName);
        log().info("Typed last name in address part: " + addressLastName);
        return this;
    }

    @Step("Type into Company Field {addressCompany}")
    public RegisterPage typeAddressCompanyField(String addressCompany){
        WaitForElement.waitForElementsIsVisible(addressCompanyField);
        addressCompanyField.sendKeys(addressCompany);
        log().info("Typed address company in address part: " + addressCompany);
        return this;
    }

    @Step("Type into Company Address Part 1 Field {firstPartOfAddress}")
    public RegisterPage typeAddressFirstPart(String firstPartOfAddress){
        WaitForElement.waitForElementsIsVisible(addressFirstPart);
        addressFirstPart.sendKeys(firstPartOfAddress);
        log().info("Typed first part of address in address part: " + firstPartOfAddress);
        return this;
    }

    @Step("Type into Company Address Part 2 Field {secondPartOfAddress}")
    public RegisterPage typeAddressSecondPart(String secondPartOfAddress){
        WaitForElement.waitForElementsIsVisible(addressSecondPart);
        addressSecondPart.sendKeys(secondPartOfAddress);
        log().info("Typed second part of address in address part: " + secondPartOfAddress);
        return this;
    }

    @Step("Type into Company City Field {addressCity}")
    public RegisterPage typeAddressCityField(String addressCity){
        WaitForElement.waitForElementsIsVisible(addressCityField);
        addressCityField.sendKeys(addressCity);
        log().info("Typed city in address part: " + addressCity);
        return this;
    }

    @Step("Select state {state}")
    public RegisterPage selectAddressStateField(String state){
        Select stateAddressDropDown = new Select(addressStateField);
        stateAddressDropDown.selectByVisibleText(state);
        log().info("Selected state: " + state);
        return this;
    }

    @Step("Type into Postal Code Field {postalCode}")
    public RegisterPage typeAddressPostalCodeField(String postalCode){
        WaitForElement.waitForElementsIsVisible(addressPostalCodeField);
        addressPostalCodeField.sendKeys(postalCode);
        log().info("Typed postal code in address part: " + postalCode);
        return this;
    }

    @Step("Type into Country Field {country}")
    public RegisterPage selectAddressCountryField(String country){
        addressCountryField.sendKeys(country);
        log().info("Selected country: " + country);
        return this;
    }

    @Step("Type into Country Field {country}")
    public RegisterPage typeAdditionalInformationField(String additionalInformation){
        WaitForElement.waitForElementsIsVisible(additionalInformationField);
        additionalInformationField.sendKeys(additionalInformation);
        log().info("Typed additional information in address: " + additionalInformation);
        return this;
    }

    @Step("Type into Home Phone Field {homePhone}")
    public RegisterPage typeHomePhoneField(String homePhone){
        WaitForElement.waitForElementsIsVisible(homePhoneField);
        homePhoneField.sendKeys(homePhone);
        log().info("Typed home phone in address part: " + homePhone);
        return this;
    }

    @Step("Type into Mobile Phone Field {mobilePhone}")
    public RegisterPage typeMobilePhoneField(String mobilePhone){
        WaitForElement.waitForElementsIsVisible(mobilePhoneField);
        mobilePhoneField.sendKeys(mobilePhone);
        log().info("Typed mobile phone in address part: " + mobilePhone);
        return this;
    }

    @Step("Type into Alias Field {alias}")
    public RegisterPage typeAddressAliasField(String alias){
        WaitForElement.waitForElementsIsVisible(addressAliasField);
        addressAliasField.sendKeys(alias);
        log().info("Typed address alias in address part: " + alias);
        return this;
    }

    @Step("Click on Submit button")
    public WelcomePage clickOnSubmitRegisterButton(){
        WaitForElement.waitUntilElementsIsClickable(submitRegisterButton);
        submitRegisterButton.sendKeys(Keys.ENTER);
        log().info("Clicked on submit button");
        return new WelcomePage();
    }

    @Step("Getting error message")
    public String gettingErrorMessage(){
        WaitForElement.waitForElementsIsVisible(errorMessage);
        String textMessage = errorMessage.getText();
        log().info("Returned error message: " + textMessage);
        return textMessage;
    }

}
