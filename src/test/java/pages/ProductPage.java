package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductPage extends BasePage {
    @FindBy(how = How.XPATH, xpath = "//a[@title='Dresses']")
    public WebElement dressesMenu;

    private ProductPage(WebDriver _driver) {
        super(_driver);
    }

    public static ProductPage using(WebDriver _driver){
        return new ProductPage(_driver);
    }
    public ProductPage displayDresses() {
        dressesMenu.click();
        return this;
    }
}
