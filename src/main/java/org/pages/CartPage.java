package org.pages;

import com.microsoft.playwright.Page;

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


}

