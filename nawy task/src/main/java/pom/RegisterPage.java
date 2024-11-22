package pom;

import com.microsoft.playwright.Page;
import org.json.JSONObject;
import utills.RegisterLocators;
import utills.jasonutills;

public class RegisterPage {

    private final Page page;
    private final RegisterLocators locators;


    public RegisterPage(Page page) {
        this.page = page;
        this.locators = new RegisterLocators(page);
    }

    // Register method that reads data from a JSON file
    public void registerUser() throws InterruptedException {
        // Load the registration data from JSON file
        JSONObject registrationData = jasonutills.readJSONFile("testData.json");

        // Retrieve the necessary data from the JSON object
        String username = registrationData.getString("username");
        String password = registrationData.getString("password");

        // Fill in the registration form using locators from the Locators class
        locators.signUpButton.click();
        locators.usernameField.fill(username);  // Fill username field
        locators.passwordField.fill(password);  // Fill password field

        // Click the submit button to complete registration
        locators.registerButton.click();  // Click the register button
        Thread.sleep(1000);



    }
}
