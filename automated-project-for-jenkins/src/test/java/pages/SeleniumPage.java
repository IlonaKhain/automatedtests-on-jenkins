package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SeleniumPage {
    public SelenideElement getResult() {
        return $(By.xpath("//body"));
    }
}
