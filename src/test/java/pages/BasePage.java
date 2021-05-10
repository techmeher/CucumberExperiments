package pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class BasePage {

    protected WebDriver _driver;
    // protected Logger logger = Logger.getLogger("App_Logs");

    public BasePage(WebDriver _driver) {
        this._driver = _driver;
        /*ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);*/

        PageFactory.initElements(_driver, this);
    }

    /**
     * use this method to get current webdriver instance
     *
     * @return webdriver instance
     */
    protected WebDriver getDriver() {
        return this._driver;
    }

    /**
     * use this method to create an instance of webdriverwait by specifying the
     * wait period in seconds
     *
     * @param seconds
     * @return
     */
    protected WebDriverWait getWebDriverWait(int seconds) {
        return new WebDriverWait(this._driver, seconds);
    }

    public void clickBrowserBackButton() {
        this._driver.navigate().back();
    }

    public void clickBrowserForwardButton() {
        this._driver.navigate().forward();
    }

    public void clickBrowserRefreshButton() {
        this._driver.navigate().refresh();
    }

    public String getTitle() {
        String pageTitle = "";
        pageTitle = this._driver.getTitle();
        return pageTitle;
    }

    public String getCurrentUrl() {
        String currentUrl = "";
        currentUrl = this._driver.getCurrentUrl();
        return currentUrl;
    }

    public void takeScreenShot(String location) {
        final String _location = location;
        takeScreenShot(_location, "Custom");
    }


    public void takeScreenShot(String location, String methodName) {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yy_M_d_Hms");
        String dates = sdf.format(now);
        String method = "_" + methodName + ".png";
        File screenshot = ((TakesScreenshot) _driver)
                .getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File(location + "_" + dates
                    + method));

        } catch (IOException e) {
            e.getMessage();
        }
    }
}
