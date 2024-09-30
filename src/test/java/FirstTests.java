import org.junit.Test;

public class FirstTests extends BaseTest {
    @Test
    public void FirstTest() {
        homePage.navigate()
                .goToProducts()
                .addToCartProduct(3)
                .closeModalAndContinue()
                .addToCartProduct(2)
                .goToCart()
                .clickProceedToCheckoutUnathorized()
                .clickLogin()
                .signupRandom()
                .fillOutRandomInfo();

    }

}
