package page.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.DriverManager;
import waits.WaitForElement;

public class TopMenuPage {

    private Logger logger = LogManager.getRootLogger();

    @FindBy(id = "contact-link")
    WebElement contactUsButton;

    @FindBy(className = "login")
    WebElement signInButton;

    @FindBy(id = "header_logo")
    WebElement headerLogoButton;

    @FindBy(xpath = "//*[@id='header']/div[3]/div/div/div[3]/div/a")
    WebElement shoppingCart;

    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/a")
    WebElement womenButton;

    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/a")
    WebElement dressesButton;

    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[3]/a")
    WebElement t_shirtButton;

    @FindBy(id = "search_query_top")
    WebElement searchQuery;

    @FindBy(name = "submitSearch")
    WebElement submitSearch;

    private WebDriver driver;

    public TopMenuPage(){
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnContactUsButton(){
        WaitForElement.waitUntilElementsIsClickable(contactUsButton);
        contactUsButton.click();
        logger.info("Clicked on 'Contact Us' button");
    }

    public void clickOnSignInButton(){
        WaitForElement.waitUntilElementsIsClickable(signInButton);
        signInButton.click();
        logger.info("Clicked on 'Sign in' button");
    }

    public void clickOnMainLogoButton(){
        WaitForElement.waitUntilElementsIsClickable(headerLogoButton);
        headerLogoButton.click();
        logger.info("Clicked on main logo button");
    }

    public void clickOnShoppingCartButton(){
        WaitForElement.waitUntilElementsIsClickable(shoppingCart);
        shoppingCart.click();
        logger.info("Clicked on 'Cart' button");
    }

    public void clickOnWomenButton(){
        WaitForElement.waitUntilElementsIsClickable(womenButton);
        womenButton.click();
        logger.info("Clicked on 'Women' button");
    }

    public void clickOnDressesButton(){
        WaitForElement.waitUntilElementsIsClickable(dressesButton);
        dressesButton.click();
        logger.info("Clicked on 'Dresses' button");
    }

    public void clickOnT_shirtButton(){
        WaitForElement.waitUntilElementsIsClickable(t_shirtButton);
        t_shirtButton.click();
        logger.info("Clicked on 'T-Shirt' button");
    }

    public void clickOnSearchQueryButton(String word){
        WaitForElement.waitUntilElementsIsClickable(searchQuery);
        searchQuery.sendKeys(word);
        logger.info("Typed the fraze: " + word);
    }

    public void clickOnSubmitSearch(){
        WaitForElement.waitForElementsIsVisible(submitSearch);
        submitSearch.click();
        logger.info("Click on search button");
    }
}
