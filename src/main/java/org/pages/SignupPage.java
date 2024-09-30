package org.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import io.github.astrapi69.random.object.RandomStringFactory;


public class SignupPage extends BasePage<SignupPage> {
    private static SignupPage $instance;

    private SignupPage(Page page) {
        BasePage.page = page;
    }

    public static SignupPage getInstance() {
        if ($instance == null) {
            $instance = new SignupPage(BasePage.page);
        }
        return $instance;
    }

    private Locator nameField = page.locator("input[data-qa=\"name\"]");
    private Locator passwordField = page.locator("input[data-qa=\"password\"]");
    private final Locator firstName = page.locator("input[data-qa=\"first_name\"]");
    private final Locator lastName = page.locator("input[data-qa=\"last_name\"]");
    private final Locator address = page.locator("input[data-qa=\"address\"]");
    private final Locator countryDD = page.locator("select[data-qa=\"country\"]");
    private Locator stateField = page.locator("input[data-qa=\"state\"]");
    private Locator cityField = page.locator("input[data-qa=\"city\"]");
    private Locator zipCode = page.locator("input[data-qa=\"zipcode\"]");
    private Locator mobileNumber = page.locator("input[data-qa=\"mobile_number\"]");
    private final Locator createAccountBtn = page.locator("button[data-qa=\"create-account\"]");

    public LoginPage fillOutRandomInfo() {
        firstName.fill(RandomStringFactory.newRandomString(8));
        lastName.fill(RandomStringFactory.newRandomString(8));
        address.fill(RandomStringFactory.newRandomString(8));
        countryDD.selectOption("India");
        createAccountBtn.click();
        return LoginPage.getInstance();
    }

    public Locator getNameField() {
        return nameField;
    }

    public void setNameField(Locator nameField) {
        this.nameField = nameField;
    }

    public Locator getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(Locator passwordField) {
        this.passwordField = passwordField;
    }

    public Locator getStateField() {
        return stateField;
    }

    public void setStateField(Locator stateField) {
        this.stateField = stateField;
    }

    public Locator getCityField() {
        return cityField;
    }

    public void setCityField(Locator cityField) {
        this.cityField = cityField;
    }

    public Locator getZipCode() {
        return zipCode;
    }

    public void setZipCode(Locator zipCode) {
        this.zipCode = zipCode;
    }

    public Locator getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Locator mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}

