package org.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import io.github.astrapi69.random.object.RandomStringFactory;

public class LoginPage extends BasePage<LoginPage> {
    private static LoginPage $instance;

    private LoginPage(Page page) {
        BasePage.page = page;
    }

    public static LoginPage getInstance() {
        if ($instance == null) {
            $instance = new LoginPage(BasePage.page);
        }
        return $instance;
    }

    private final Locator signupName = page.locator("input[data-qa=\"signup-name\"]");
    private final Locator signupEmail = page.locator("input[data-qa=\"signup-email\"]");
    private final Locator signupBtn = page.locator("button[data-qa=\"signup-button\"]");

    public SignupPage signupRandom() {
        signupName.fill(RandomStringFactory.newRandomString(8));
        signupEmail.fill(RandomStringFactory.randomHexString(8).trim()
                + "@" + RandomStringFactory.randomHexString(5).trim()
                + "." + RandomStringFactory.randomHexString(3).trim());
        signupBtn.click();
        return SignupPage.getInstance();
    }


}

