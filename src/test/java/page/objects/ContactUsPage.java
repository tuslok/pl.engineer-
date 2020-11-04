package page.objects;

import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import waits.WaitForElement;

import javax.swing.*;

public class ContactUsPage extends BasePage{

    @FindBy(id = "id_contact")
    WebElement subjectHeading;

    @FindBy(id = "email")
    WebElement emailAddressField;

    @FindBy(id = "id_order")
    WebElement orderReferenceField;

    @FindBy(id = "fileUpload")
    WebElement attachFile;

    @FindBy(id = "message")
    WebElement messageField;

    @FindBy(id = "submitMessage")
    WebElement sendMessageButton;

    @Step("")
    public ContactUsPage selectSubjectHeading(String heading){
        Select headingDropDown = new Select(subjectHeading);
        headingDropDown.selectByVisibleText(heading);
        log().info("Selected heading {} " + heading);
        return this;
    }

    @Step("")
    public ContactUsPage typeEmailAddress(String email){
        WaitForElement.waitForElementsIsVisible(emailAddressField);
        emailAddressField.sendKeys(email);
        log().info("Typed email address: {}" + email);
        return this;
    }

    @Step("")
    public ContactUsPage typeOrderReference(String reference){
        WaitForElement.waitForElementsIsVisible(orderReferenceField);
        orderReferenceField.sendKeys(reference);
        log().info("Typed reference number: {}" + reference);
        return this;
    }

    @Step("")
    public ContactUsPage attachFile(String file){
        WaitForElement.waitForElementsIsVisible(attachFile);
        attachFile.sendKeys(file);
        log().info("Attached file: {}" + file);
        return this;
    }

    @Step("")
    public ContactUsPage typeMessage(String message){
        WaitForElement.waitForElementsIsVisible(messageField);
        messageField.sendKeys(message);
        log().info("Typed message: {}" + message);
        return this;
    }

    @Step("")
    public ContactUsPage clickOnSendButton(){
        WaitForElement.waitForElementsIsVisible(sendMessageButton);
        sendMessageButton.click();
        log().info("Click on Submit button");
        return this;
    }
}
