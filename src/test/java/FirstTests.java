import org.junit.Test;

public class FirstTests extends BaseTest {
    @Test
    public void FirstTest() {
        homePage.navigate()
                .goToProducts()
                .addToCartProduct(3)
                .goToCart();
    }

}
