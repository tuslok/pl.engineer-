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

public class WelcomePage extends BasePage{


    @FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]/a/span")
    WebElement customerLoggedButton;

    @FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[2]/a")
    WebElement logOutButton;

    public WelcomePage(){
        PageFactory.initElements(DriverManager.getWebDriver(),this);
    }

    @Step("")
    public String getNameAndSurnameLoggedUser(){
        WaitForElement.waitUntilElementsIsClickable(customerLoggedButton);
        String nameAndSurname = customerLoggedButton.getText();
        log().info("Returned name and surname {}: " + nameAndSurname);
        return nameAndSurname;
    }

    @Step ("")
    public WelcomePage clickOnLogOutButton(){
        WaitForElement.waitUntilElementsIsClickable(logOutButton);
        logOutButton.sendKeys(Keys.ENTER);
        log().info("Clicked on 'Log out' button. ");
        return new WelcomePage();
    }

    @Step("Getting title of page")
    public String getTitleOfPage(){
        String titleOfPage = driver.DriverManager.getWebDriver().getTitle();
        log().info("Title of page: " + titleOfPage);
        return titleOfPage;
    }
}
