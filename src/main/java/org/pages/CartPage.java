package org.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class CartPage extends BasePage<CartPage> {
    private static CartPage $instance;

    private CartPage(Page page) {
        BasePage.page = page;
    }

    public static CartPage getInstance() {
        if ($instance == null) {
            $instance = new CartPage(BasePage.page);
        }
        return $instance;
    }

    private final Locator proceedToCheckoutBtn = page.getByText("Proceed To Checkout");

    public AuthorizeModal clickProceedToCheckoutUnathorized() {
        proceedToCheckoutBtn.click();
        return AuthorizeModal.getInstance();
    }

    public static class AuthorizeModal {
        private static AuthorizeModal $instance;

        private AuthorizeModal() {
        }

        public static AuthorizeModal getInstance() {
            if ($instance == null) {
                $instance = new AuthorizeModal();
            }
            return $instance;
        }

        private final Locator loginLink = page.getByRole(AriaRole.LINK).getByText("Register / Login");
        private final Locator continueLink = page.getByText("Continue On Cart");

        public LoginPage clickLogin() {
            loginLink.click();
            return LoginPage.getInstance();
        }

        public CartPage clickContinue() {
            continueLink.click();
            return CartPage.getInstance();
        }
    }
}

