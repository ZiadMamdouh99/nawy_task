package utills;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class RegisterLocators {

    public Locator signUpButton;


    public Locator usernameField;


    public Locator passwordField;
    public Locator registerButton ;




    // Constructor to initialize the locators
    public RegisterLocators(Page page) {
        // Initialize all locators using the provided Page object
        this.signUpButton = page.locator("#signin2");
        this.usernameField = page.locator("#sign-username");
        this.passwordField = page.locator("#sign-password");
        this.registerButton = page.locator("button[onclick='register()'].btn.btn-primary");
    }
}