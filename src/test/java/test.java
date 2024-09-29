import org.junit.Test;

public class test extends BaseTest {
    @Test
    public void FirstTest() {
        homePage.navigate()
                .goToProducts();
    }

}
