package configuration;

import com.codeborne.selenide.WebDriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class CustomProvider implements WebDriverProvider {

    public WebDriver createDriver(DesiredCapabilities capabilities) {
        DesiredCapabilities dcap = DesiredCapabilities.chrome();
        ChromeOptions options = new ChromeOptions();
        dcap.setCapability(ChromeOptions.CAPABILITY, options);
        dcap.setCapability("enableVNC", true);
        dcap.setCapability("enableVideo", true);
        dcap.setBrowserName("firefox");
        try {
            return new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dcap);
        } catch (final MalformedURLException e) {
            throw new RuntimeException("Unable to create driver", e);
        }
    }
}