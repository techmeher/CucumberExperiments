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


    public LandingPage(WebDriver _driver) {
        super(_driver);
    }


}
