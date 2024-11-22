package pom;

import com.microsoft.playwright.Page;
import org.json.JSONObject;
import utills.LoginLocators;
import utills.jasonutills;
import org.testng.Assert;

public class loginPage {

    private final Page page;
    private final LoginLocators locators;

    // Constructor where we pass the page from PlaywrightBase and Locators class
    public loginPage(Page page) {
        this.page = page;
        this.locators = new LoginLocators(page);
    }

    // Login method that reads data from a JSON file
    public void loginUser() throws InterruptedException {
        // Load the login data from JSON file
        JSONObject loginData = jasonutills.readJSONFile("testData.json");

        // Retrieve the necessary data from JSON object
        String username = loginData.getString("username");
        String password = loginData.getString("password");

        // Click the Login link to open the modal
        locators.loginLink.click();

        // Fill in the login form
        locators.usernameField.fill(username);
        locators.passwordField.fill(password);

        // Click the login button to submit the form
        locators.loginButton.click();

        // Wait for the user to be logged in and for the Welcome message to appear
        page.waitForSelector("a#nameofuser");

        // Assert that the "Welcome" message contains the expected text
        String welcomeText = locators.welcomeMessage.textContent();
        Assert.assertTrue(welcomeText.contains("Welcome"), "Login failed or Welcome text mismatch!");
        Thread.sleep(1000);



    }
}
