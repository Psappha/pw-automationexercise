import org.junit.AfterClass;
import org.pages.BasePage;
import org.pages.HomePage;

public class BaseTest {
    public HomePage homePage = HomePage.getInstance();

    @AfterClass
    public static void closeTest() {
        BasePage.page.close();
        BasePage.playwright.close();
    }
}
