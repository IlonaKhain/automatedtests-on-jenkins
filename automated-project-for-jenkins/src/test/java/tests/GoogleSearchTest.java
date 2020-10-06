package tests;

import com.codeborne.selenide.junit.ScreenShooter;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import pages.GooglePage;
import pages.SearchResultsPage;
import pages.SeleniumPage;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static configuration.ConfigurationClass.setUpBrowser;

public class GoogleSearchTest {
    private String GOOGLE_URL = "https://google.com/ncr";
    @Rule
    public ScreenShooter screenShooter = ScreenShooter.failedTests().succeededTests();

    @Before
    public void start() {
        setUpBrowser("chrome");//or chrome, ie ...
    }

    @Test
    public void userCanSearch() {
        open(GOOGLE_URL);
        new GooglePage().searchFor("selenium");
        SearchResultsPage results = new SearchResultsPage();
        results.getResults().shouldHave(sizeGreaterThan(1));
        results.clickResult(0);
        SeleniumPage seleniumPage = new SeleniumPage();
        seleniumPage.getResult().shouldHave(text("selenium"));
    }
}
