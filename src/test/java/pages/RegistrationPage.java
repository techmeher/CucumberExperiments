package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegistrationPage extends BasePage {

    @FindBy(how = How.CLASS_NAME, className = "page-heading")
    public WebElement registrationPageHeaderEle;
    //Form controls

    @FindBy(how = How.ID, id = "account-creation_form")
    public WebElement formElem;

    @FindBy(how = How.ID, id = "id_gender1")
    public WebElement mrRadioBtn;

    @FindBy(how = How.ID, id = "id_gender2")
    public WebElement mrsRadioBtn;

    @FindBy(how = How.ID, id = "customer_firstname")
    public WebElement firstNameTxtFld;

    @FindBy(how = How.ID, id = "customer_lastname")
    public WebElement lastNameTxtFld;

    @FindBy(how = How.ID, id = "email")
    public WebElement emailTxtFld;

    @FindBy(how = How.ID, id = "passwd")
    public WebElement passwordTxtFld;

    @FindBy(how = How.ID, id = "days")
    public WebElement daysSelectFld;

    @FindBy(how = How.ID, id = "months")
    public WebElement monthSelectFld;

    @FindBy(how = How.ID, id = "years")
    public WebElement yearsSelectFld;

    //Address fields

    @FindBy(how = How.ID, id = "firstname")
    public WebElement addFirstNameTxtFld;

    @FindBy(how = How.ID, id = "lastname")
    public WebElement addLastNameTxtFld;

    @FindBy(how = How.ID, id = "address1")
    public WebElement addFirstLineTxtFld;

    @FindBy(how = How.ID, id = "city")
    public WebElement addCityNameTxtFld;

    @FindBy(how = How.ID, id = "id_state")
    public WebElement addStateNameSelectFld;

    @FindBy(how = How.ID, id = "postcode")
    public WebElement addPostcodeTxtFld;

    @FindBy(how = How.ID, id = "id_country")
    public WebElement addCountryNameSelectFld;

    @FindBy(how = How.ID, id = "phone_mobile")
    public WebElement addMobileTxtFld;

    @FindBy(how = How.ID, id = "alias")
    public WebElement addReferenceEmailTxtFld;

    @FindBy(how = How.ID, id = "submitAccount")
    public WebElement registerBtn;


    public RegistrationPage(WebDriver _driver) {
        super(_driver);
    }

    public void fillInNewCustomerDetails() {

        mrRadioBtn.click();
        firstNameTxtFld.sendKeys("testFirst");
        lastNameTxtFld.sendKeys("lastName");
        passwordTxtFld.sendKeys("Password01!");
        daysSelectFld.sendKeys("20");
        monthSelectFld.sendKeys("November");
        yearsSelectFld.sendKeys("2000");

        addFirstLineTxtFld.sendKeys("testFirstAdd");
        addLastNameTxtFld.sendKeys("testLastAdd");
        addFirstLineTxtFld.sendKeys("FirstLine");
        addCityNameTxtFld.sendKeys("London");
        addStateNameSelectFld.sendKeys("Texas");
        addCountryNameSelectFld.sendKeys("United States");
        addPostcodeTxtFld.sendKeys("00000");
        addMobileTxtFld.sendKeys("20011000");
        addReferenceEmailTxtFld.sendKeys("mytestmm201@gmail.com");
    }

    public void registerNewCustomer() {

        registerBtn.click();
    }

}
