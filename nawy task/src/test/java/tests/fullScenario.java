package tests;

import org.testng.annotations.*;

import pom.*;
import utills.playwrightBase;

import static utills.playwrightBase.page;

public class fullScenario {

    @BeforeTest
    public void setUp() {
        // Initialize Playwright and navigate to the application URL
        playwrightBase.initialize();
        page.navigate("https://www.demoblaze.com/");
    }

    @Test
    public void testRegistration() throws InterruptedException {

        RegisterPage registerPage = new RegisterPage(page);


        registerPage.registerUser();
        Thread.sleep(1000);


    }

    @Test(dependsOnMethods = "testRegistration")

    public void testLogin() throws InterruptedException {

        loginPage loginPage = new loginPage(page);


        loginPage.loginUser();
        Thread.sleep(2000);





    }

    @Test(dependsOnMethods = "testLogin")
    public void testPurchaseAppleMonitor() throws InterruptedException {
        Purchase purchase = new Purchase(playwrightBase.page);


        purchase.buyAppleMonitor();
        page.locator("#logout2").click();
    }


    @AfterTest
    public void tearDown() {
        // Close the browser
        playwrightBase.tearDown();
    }
}
