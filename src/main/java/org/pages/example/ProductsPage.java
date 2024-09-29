package org.pages.example;

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


}

