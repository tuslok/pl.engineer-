package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomenHomePage {

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
}
