package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutomationSamplePage {

    @Test(testName = "UI_Test")
    public void SomeUIAutomation() throws InterruptedException {
        WebDriver wd = new ChromeDriver();
        wd.get("http://automationpractice.com/index.php");
        wd.manage().window().maximize();
        wd.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
        Thread.sleep(5000);
        wd.close();
        wd.quit();
    }
}
