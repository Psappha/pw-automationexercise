package org.example;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            BrowserType.LaunchOptions options = new BrowserType.LaunchOptions().setHeadless(false);
            Browser browser = playwright.webkit().launch(options);
            Page page = browser.newPage();
            page.navigate("http://playwright.dev");
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("example.png")));
            System.out.println(page.title());
        }
    }
}