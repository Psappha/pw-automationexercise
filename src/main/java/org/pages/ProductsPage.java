package org.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class ProductsPage extends BasePage<ProductsPage> {
    private static ProductsPage $instance;

    private ProductsPage(Page page) {
        BasePage.page = page;
    }

    public static ProductsPage getInstance() {
        if ($instance == null) {
            $instance = new ProductsPage(BasePage.page);
        }
        return $instance;
    }

    public AddToCartModal addToCartProduct(Integer index) {
        Locator addToCartCard = page.locator("a[data-product-id=\"" + index + "\"]").first();
        Locator addToCartBtnByIndex = page.locator("a[data-product-id=\"" + index + "\"]").last();
        Locator.ClickOptions clickOptions = new Locator.ClickOptions().setDelay(100);
        addToCartCard.click();
        return AddToCartModal.getInstance();
    }

    public static class AddToCartModal extends BaseModal {
        private static AddToCartModal $instance;

        private AddToCartModal() {
            super(page);
        }

        public static AddToCartModal getInstance() {
            if ($instance == null) {
                $instance = new AddToCartModal();
            }
            return $instance;
        }

        public ProductsPage closeModalAndContinue() {
            continueShoppingBtn.click();
            return ProductsPage.getInstance();
        }

        public CartPage goToCart() {
            viewCartLink.click();
            return CartPage.getInstance();
        }
    }


}

