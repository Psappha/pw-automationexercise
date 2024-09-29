package org.pages;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;

public class BasePage<T extends BasePage<T>> {

    static Playwright playwright = Playwright.create();
    static BrowserType.LaunchOptions options = new BrowserType.LaunchOptions().setHeadless(false);
    static Browser browser = playwright.webkit().launch(options);
    public static Page page = browser.newPage();

    private final Locator productsLink = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(" Products"));

    public ProductsPage goToProducts() {
        productsLink.click();
        return ProductsPage.getInstance();
    }

}
