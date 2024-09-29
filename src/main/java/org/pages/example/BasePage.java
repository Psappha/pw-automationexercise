package org.pages.example;

import com.microsoft.playwright.*;

public class BasePage<T extends BasePage<T>> {

    static Playwright playwright = Playwright.create();
    static BrowserType.LaunchOptions options = new BrowserType.LaunchOptions().setHeadless(false);
    static Browser browser = playwright.webkit().launch(options);
    public static Page page = browser.newPage();

    private final Locator productsLink = page.locator("[href='/products']");

    public ProductsPage goToProducts() {
        productsLink.click();
        return ProductsPage.getInstance();
    }

}