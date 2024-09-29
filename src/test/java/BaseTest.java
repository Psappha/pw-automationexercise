import com.microsoft.playwright.Page;
import org.junit.AfterClass;
import org.pages.example.BasePage;
import org.pages.example.HomePage;
import org.pages.example.ProductsPage;

public class BaseTest {
    public org.pages.example.HomePage homePage = HomePage.getInstance();
    public ProductsPage productsPage = ProductsPage.getInstance();

    @AfterClass
    public static void closeTest() {
        Page pageInstance = BasePage.page;
        pageInstance.close();
    }
}
