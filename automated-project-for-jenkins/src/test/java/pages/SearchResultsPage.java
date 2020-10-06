package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultsPage {
    public ElementsCollection getResults() {
        return $$("#res .g");
    }

    public SelenideElement getResult(int index) {
        return $("#res .g", index);
    }

    public void clickResult(int index) {
        $(By.xpath("//h3[@class = 'LC20lb DKV0Md']"), index).click();
    }
}
