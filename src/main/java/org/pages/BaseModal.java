package org.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import static org.pages.BasePage.page;

public class BaseModal {
    public BaseModal(Page page) {
        BasePage.page = page;
    }

    public Locator viewCartLink = page.locator("a").filter(new Locator.FilterOptions().setHasText("View Cart"));
    public Locator continueShoppingBtn = page.getByText("Continue Shopping");
}
