package page.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;
import waits.WaitForElement;

public class RegisterPage {

    Logger logger = LogManager.getRootLogger();

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

    public void clickOnMrTittleField(){
        WaitForElement.waitUntilElementsIsClickable(mrTittleField);
        mrTittleField.click();
        logger.info("Clicked on Mr tittle field");
    }

    public void clickOnMrsTittleField(){
        WaitForElement.waitUntilElementsIsClickable(mrsTittleField);
        mrsTittleField.click();
        logger.info("Clicked on Mrs tittle field");
    }

    public void typeCustomerFirstName(String firstName){
        WaitForElement.waitForElementsIsVisible(customerFirstNameField);
        customerFirstNameField.sendKeys(firstName);
        logger.info("Typed customer first name: " + firstName);
    }

    public void typeCustomerLastName(String lastName){
        WaitForElement.waitForElementsIsVisible(customerLastNameField);
        customerLastNameField.sendKeys(lastName);
        logger.info("Typed customer last name: " + lastName);
    }

    public void typeCustomerEmailAddress(String email){
        WaitForElement.waitForElementsIsVisible(customerEmailField);
        customerEmailField.sendKeys(email);
        logger.info("Typed customer email address: " + email);
    }

    public void typeCustomerPasswordField(String password){
        WaitForElement.waitForElementsIsVisible(customerPasswordField);
        customerPasswordField.sendKeys(password);
        logger.info("Typed customer password: " + password);
    }

    public void selectCustomerDayOfBirthDropDown(){
        // TO DO
    }

    public void selectCustomerMonthOfBirthDropDown(){
        // TO DO
    }

    public void selectCustomerYearOfBirthDropDown(){
        // TO DO
    }

    public void clickOnCustomerNewsletter(){
        WaitForElement.waitUntilElementsIsClickable(customerNewsletter);
        customerNewsletter.click();
        logger.info("Clicked on customer newsletter field");
    }

    public void clickOnCustomerSpecialOffers(){
        WaitForElement.waitUntilElementsIsClickable(customerSpecialOffers);
        customerSpecialOffers.click();
        logger.info("Clicked on special offers field");
    }

    public void typeAddressFirstNameField(String addressFirstName){
        WaitForElement.waitForElementsIsVisible(addressFirstNameField);
        addressFirstNameField.sendKeys(addressFirstName);
        logger.info("Typed first name in address part: " + addressFirstName);
    }

    public void typeAddressLastNameField(String addressLastName){
        WaitForElement.waitForElementsIsVisible(addressLastNameField);
        addressLastNameField.sendKeys(addressLastName);
        logger.info("Typed last name in address part " + addressLastName);
    }

    public void typeAddressCompanyField(String addressCompany){
        WaitForElement.waitForElementsIsVisible(addressCompanyField);
        addressCompanyField.sendKeys(addressCompany);
        logger.info("Typed address company in address part: " + addressCompany);
    }

    public void typeAddressFirstPart(String firstPartOfAddress){
        WaitForElement.waitForElementsIsVisible(addressFirstPart);
        addressFirstPart.sendKeys();
        logger.info("Typed first part of address in address part: " + firstPartOfAddress);
    }

    public void typeAddressSecondPart(String secondPartOfAddress){
        WaitForElement.waitForElementsIsVisible(addressSecondPart);
        addressSecondPart.sendKeys();
        logger.info("Typed second part of address in address part: " + secondPartOfAddress);
    }

    public void typeAddressCityField(String addressCity){
        WaitForElement.waitForElementsIsVisible(addressCityField);
        addressCityField.sendKeys(addressCity);
        logger.info("Typed city in address part: " + addressCity);
    }

    public void selectAddressStateField(String state){

    }

    public void typeAddressPostalCodeField(String postalCode){
        WaitForElement.waitForElementsIsVisible(addressPostalCodeField);
        addressPostalCodeField.sendKeys(postalCode);
        logger.info("Typed postal code in address part: " + postalCode);
    }

    public void selectAddressCountryField(){
        // TO DO
    }

    public void typeAdditionalInformationField(String additionalInformation){
        WaitForElement.waitForElementsIsVisible(additionalInformationField);
        additionalInformationField.sendKeys(additionalInformation);
        logger.info("Typed additional information in address: " + additionalInformation);
    }

    public void typeHomePhoneField(String homePhone){
        WaitForElement.waitForElementsIsVisible(homePhoneField);
        homePhoneField.sendKeys(homePhone);
        logger.info("Typed home phone in address part: " + homePhone);
    }

    public void typeMobilePhoneField(String mobilePhone){
        WaitForElement.waitForElementsIsVisible(mobilePhoneField);
        mobilePhoneField.sendKeys(mobilePhone);
        logger.info("Typed mobile phone in address part: " + mobilePhone);
    }

    public void typeAddressAliasField(String alias){
        WaitForElement.waitForElementsIsVisible(addressAliasField);
        addressAliasField.sendKeys(alias);
        logger.info("Typed address alias in address part: " + alias);
    }

    public void clickOnSubmitRegisterButton(){
        WaitForElement.waitUntilElementsIsClickable(submitRegisterButton);
        submitRegisterButton.click();
        logger.info("Clicked on submit button");
    }

}
