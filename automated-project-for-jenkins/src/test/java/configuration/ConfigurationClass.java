package configuration;

import com.codeborne.selenide.Configuration;

public class ConfigurationClass {
    public static void setUpBrowser(String browser) {
        Configuration.driverManagerEnabled = false;
        Configuration.browser = CustomProvider.class.getName();
        Configuration.startMaximized = true;
    }

}
