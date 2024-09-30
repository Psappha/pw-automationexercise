package org.pages;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;

public class BasePage<T extends BasePage<T>> {
    public static Playwright playwright = Playwright.create();
    static BrowserType.LaunchOptions options = new BrowserType.LaunchOptions().setHeadless(false);
    static Browser browser = playwright.chromium().launch(options);
    static BrowserContext context = browser.newContext();
    private static boolean isTracingStarted = false;

    public BasePage() {
        if (!isTracingStarted) {
            context.tracing().start(new Tracing.StartOptions()
                    .setScreenshots(true)
                    .setSnapshots(true)
                    .setSources(true));
            isTracingStarted = true;
        }
    }


    public static Page page = context.newPage();

    private final Locator productsLink = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(" Products"));

    public ProductsPage goToProducts() {
        productsLink.click();
        return ProductsPage.getInstance();
    }

}
