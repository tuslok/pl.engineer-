package page.objects;

import driver.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

public class WomenHomePage {

    private Logger logger = LogManager.getLogger(WomenHomePage.class);

    @FindBy(xpath = "//*[@id='categories_block_left']/div/ul/li[1]/span")
    WebElement TopsExtensionButton;

    @FindBy(xpath = "//*[@id='categories_block_left']/div/ul/li[1]/ul/li[1]/a")
    WebElement T_shirtsExtendedButton;

    @FindBy(xpath = "//*[@id='categories_block_left']/div/ul/li[1]/ul/li[2]/a")
    WebElement BlousesExtendedButton;

    @FindBy(xpath = "//*[@id='categories_block_left']/div/ul/li[2]/a")
    WebElement DressesExtensionButton;

    @FindBy(xpath = "//*[@id='categories_block_left']/div/ul/li[2]/ul/li[1]/a")
    WebElement CasualDressesExtendedButton;

    @FindBy(xpath = "//*[@id='categories_block_left']/div/ul/li[2]/ul/li[2]/a")
    WebElement EveningDressesExtendedButton;

    @FindBy(xpath = "//*[@id='categories_block_left']/div/ul/li[2]/ul/li[3]/a")
    WebElement SummerDressesExtendedButton;

    @FindBy(id = "layered_category_4")
    WebElement TopsCheckbox;

    @FindBy(id = "layered_category_8")
    WebElement DressesCheckbox;

    @FindBy(id = "layered_id_attribute_group_1")
    WebElement SizeSCheckbox;

    @FindBy(id = "layered_id_attribute_group_2")
    WebElement SizeMCheckbox;

    @FindBy(id = "layered_id_attribute_group_3")
    WebElement SizeLCheckbox;

    @FindBy(id = "layered_id_attribute_group_7")
    WebElement ColorBeigeButton;

    @FindBy(id = "layered_id_attribute_group_8")
    WebElement ColorWhiteButton;

    @FindBy(id = "layered_id_attribute_group_11")
    WebElement ColorBlackButton;

    @FindBy(id = "layered_id_attribute_group_13")
    WebElement ColorOrangeButton;

    @FindBy(id = "layered_id_attribute_group_14")
    WebElement ColorBlueButton;

    @FindBy(id = "layered_id_attribute_group_15")
    WebElement ColorGreenButton;

    @FindBy(id = "layered_id_attribute_group_16")
    WebElement ColorYellowButton;

    @FindBy(id = "layered_id_attribute_group_24")
    WebElement ColorPingButton;

    @FindBy(id = "layered_id_feature_5")
    WebElement MaterialCottonButton;

    @FindBy(id = "layered_id_feature_1")
    WebElement MaterialPolyesterButton;

    @FindBy(id = "layered_id_feature_3")
    WebElement MaterialViscoseButton;

    @FindBy(id = "layered_id_feature_11")
    WebElement StyleCasualButton;

    @FindBy(id = "layered_id_feature_16")
    WebElement StyleDressyButton;

    @FindBy(id = "layered_id_feature_13")
    WebElement StyleGirlyButton;

    @FindBy(id = "layered_id_feature_18")
    WebElement PropertyColorfulDressButton;

    @FindBy(id = "layered_id_feature_21")
    WebElement PropertyMaxiDressButton;

    @FindBy(id = "layered_id_feature_20")
    WebElement PropertyMidiDressButton;

    @FindBy(id = "layered_id_feature_19")
    WebElement PropertyShortDressButton;

    @FindBy(id = "layered_id_feature_17")
    WebElement PropertyShortSleeveButton;

    @FindBy(id = "layered_quantity_1")
    WebElement AvailabilityInStockButton;

    @FindBy(id = "layered_condition_new")
    WebElement ConditionNewButton;

    @FindBy(id = "layered_price_range")
    WebElement PriceRangeSlider;

    public WomenHomePage(){
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnTopsExtensionButton(){
        WaitForElement.waitUntilElementsIsClickable(TopsExtensionButton);
        TopsExtensionButton.click();
        logger.info("Clicked on Tops button below Women slider");
    }

    public void clickOnT_shirtsExtendedButton(){
        WaitForElement.waitUntilElementsIsClickable(T_shirtsExtendedButton);
        T_shirtsExtendedButton.click();
        logger.info("Clicked on T-shirt button below Women slider");
    }

    public void clickOnBlousesExtendedButton(){
        WaitForElement.waitUntilElementsIsClickable(BlousesExtendedButton);
        BlousesExtendedButton.click();
        logger.info("Clicked on Blouses button below Women slider");
    }

    public void clickOnDressesExtensionButton(){
        WaitForElement.waitUntilElementsIsClickable(DressesExtensionButton);
        DressesExtensionButton.click();
        logger.info("Clicked on Dresses button below Women slider");
    }

    public void clickOnCasualDressesExtendedButton(){
        WaitForElement.waitUntilElementsIsClickable(CasualDressesExtendedButton);
        CasualDressesExtendedButton.click();
        logger.info("Clicked on Casual Dresses button below Women slider");
    }

    public void clickOnEveningDressesExtendedButton(){
        WaitForElement.waitUntilElementsIsClickable(EveningDressesExtendedButton);
        EveningDressesExtendedButton.click();
        logger.info("Clicked on Evening Dresses button below Women slider");
    }

    public void clickOnSummerDressesExtendedButton(){
        WaitForElement.waitUntilElementsIsClickable(SummerDressesExtendedButton);
        SummerDressesExtendedButton.click();
        logger.info("Clicked on Summer Dresses button below Women slider");
    }

    public void clickOnTopsCheckbox(){
        WaitForElement.waitUntilElementsIsClickable(TopsCheckbox);
        TopsCheckbox.click();
        logger.info("Clicked on Tops checkbox");
    }

    public void clickOnDressesCheckbox(){
        WaitForElement.waitUntilElementsIsClickable(DressesCheckbox);
        DressesCheckbox.click();
        logger.info("Clicked on Dresses checkbox");
    }

    public void clickOnSizeSCheckbox(){
        WaitForElement.waitUntilElementsIsClickable(SizeSCheckbox);
        SizeSCheckbox.click();
        logger.info("Click on size 'S' button");
    }

    public void clickOnSizeMCheckbox(){
        WaitForElement.waitUntilElementsIsClickable(SizeMCheckbox);
        SizeMCheckbox.click();
        logger.info("Clicked on size 'M' button");
    }

    public void clickOnSizeLCheckbox(){
        WaitForElement.waitUntilElementsIsClickable(SizeLCheckbox);
        SizeLCheckbox.click();
        logger.info("Clicked on size 'L' button");
    }
}
