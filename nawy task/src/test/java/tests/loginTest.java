package tests;

import org.testng.Assert;
import org.testng.annotations.*;
import pom.loginPage;
import utills.playwrightBase;

public class loginTest {

    @BeforeMethod
    public void setUp() {
        // Initialize Playwright and navigate to the application URL
        playwrightBase.initialize();
        playwrightBase.page.navigate("https://www.demoblaze.com/");
    }

    @Test
    public void testLogin() throws InterruptedException {
        // Create an instance of the LoginPage
        loginPage loginPage = new loginPage(playwrightBase.page);

        // Perform login action
        loginPage.loginUser();



    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        playwrightBase.tearDown();
    }
}
