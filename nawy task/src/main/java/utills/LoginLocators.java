package utills;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class LoginLocators {

    public Locator loginLink;


    public Locator usernameField;


    public Locator passwordField;


    public Locator loginButton;


    public Locator welcomeMessage;


    public LoginLocators(Page page) {
        this.loginLink = page.locator("#login2");
        this.usernameField = page.locator("#loginusername");
        this.passwordField = page.locator("#loginpassword");
        this.loginButton = page.locator("button[onclick='logIn()'].btn.btn-primary"); // Login button
        this.welcomeMessage = page.locator("#nameofuser");
    }
}
