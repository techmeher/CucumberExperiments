package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LandingPage extends BasePage {

    @FindBy(how = How.CLASS_NAME, className = "login")
    public WebElement signInBtn;

    @FindBy(how = How.XPATH, xpath = "//*[@name='email_create']")
    public WebElement createEmailTxtFld;

    @FindBy(how = How.ID, id = "SubmitCreate")
    public WebElement createEmailBtn;

    @FindBy(how = How.ID, id = "email")
    public WebElement loginEmailTextFld;

    @FindBy(how = How.ID, id = "passwd")
    public WebElement loginPasswordTextFld;

    @FindBy(how = How.ID, id = "SubmitLogin")
    public WebElement loginBtn;

    private LandingPage(WebDriver _driver) {
        super(_driver);
    }

    public static LandingPage using(WebDriver _driver) {
        return new LandingPage(_driver);
    }

    public LandingPage loginWithRegisteredUser() {
        loginEmailTextFld.sendKeys("mytestmm2121@gmail.com");
        loginPasswordTextFld.sendKeys("Password01!");
        loginBtn.click();
        return this;
    }
}
