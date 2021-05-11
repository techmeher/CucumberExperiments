package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.LandingPage;
import pages.ProductPage;
import pages.RegistrationPage;

public class AutomationSamplePage {

    @Test(testName = "UI_Test")
    public void UIAutomation() throws InterruptedException {
        WebDriver wd = new ChromeDriver();
        LandingPage landingPage = new LandingPage(wd);
        RegistrationPage registrationPage = new RegistrationPage(wd);

        wd.get("http://automationpractice.com/index.php");
        wd.manage().window().maximize();

        landingPage.signInBtn.click();
/*
//new registration
        new WebDriverWait(wd, 3000).until(ExpectedConditions.visibilityOf(landingPage.createEmailTxtFld));
        landingPage.createEmailTxtFld.sendKeys("mytestmm2121@gmail.com");
        landingPage.createEmailBtn.click();
        new WebDriverWait(wd, 3000).until(ExpectedConditions.visibilityOf(registrationPage.formElem));
        registrationPage.fillInNewCustomerDetails();
        registrationPage.registerNewCustomer();
        Thread.sleep(5000);
*/

        //login with registered user
        new WebDriverWait(wd, 3000).until(ExpectedConditions.visibilityOf(landingPage.createEmailTxtFld));
        landingPage.loginWithRegisteredUser();

        ProductPage pp = new ProductPage(wd);
        pp.displayDresses();

        Thread.sleep(5000);

        wd.close();
        wd.quit();
    }

}
