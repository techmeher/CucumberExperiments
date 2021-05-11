package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductPage extends BasePage {
    @FindBy(how = How.XPATH, xpath = "//*[@'Dresses']")
    public WebElement dressesMenu;

    public ProductPage(WebDriver _driver) {
        super(_driver);
    }

    public void displayDresses() {
        dressesMenu.click();
    }
}
