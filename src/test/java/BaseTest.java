import com.microsoft.playwright.Page;
import org.junit.AfterClass;
import org.pages.BasePage;
import org.pages.HomePage;
import org.pages.ProductsPage;

public class BaseTest {
    public HomePage homePage = HomePage.getInstance();
    public ProductsPage productsPage = ProductsPage.getInstance();

    @AfterClass
    public static void closeTest() {
        Page pageInstance = BasePage.page;
        pageInstance.close();
    }
}
