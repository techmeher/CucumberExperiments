package steps;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import sun.security.krb5.internal.crypto.Des;

import java.net.MalformedURLException;
import java.net.URL;

public class DockerRemotePage {

    @Test
    public void RunSeleniumOnChromeDockerImage() throws MalformedURLException {
        URL _remoteSeleniumHub = new URL("http://localhost:4444/wd/hub");
        DesiredCapabilities dc = DesiredCapabilities.chrome();
        RemoteWebDriver _remoteDriver = new RemoteWebDriver(_remoteSeleniumHub, dc);
        _remoteDriver.get("https://opensource-demo.orangehrmlive.com/");

        String _title = _remoteDriver.getTitle();

        System.out.println("Title is : " + _title);

        _remoteDriver.close();
        _remoteDriver.quit();

    }

    @Test
    public void RunSeleniumOnFireFoxDockerImage() throws MalformedURLException {
        URL _remoteSeleniumHub = new URL("http://localhost:4444/wd/hub");
        DesiredCapabilities dc = DesiredCapabilities.firefox();
        RemoteWebDriver _remoteDriver = new RemoteWebDriver(_remoteSeleniumHub, dc);
        _remoteDriver.get("https://opensource-demo.orangehrmlive.com/");

        String _title = _remoteDriver.getTitle();

        System.out.println("Title is : " + _title);

        _remoteDriver.close();
        _remoteDriver.quit();

    }
}
