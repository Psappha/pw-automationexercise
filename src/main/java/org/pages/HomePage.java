package org.pages;

import com.microsoft.playwright.Page;

public class HomePage extends BasePage<HomePage> {
    private static HomePage $instance;

    private HomePage(Page page) {
        BasePage.page = page;
    }

    public static HomePage getInstance() {
        if ($instance == null) {
            $instance = new HomePage(BasePage.page);
        }
        return $instance;
    }

    public HomePage navigate() {
        page.navigate("https://automationexercise.com/");
        return HomePage.getInstance();
    }
}

