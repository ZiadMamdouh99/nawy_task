package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.Purchase;
import pom.loginPage;
import utills.playwrightBase;

public class PurchaseTest {
    @BeforeMethod
    public void setUp() {
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
    @Test
    public void testPurchaseAppleMonitor() throws InterruptedException {
        Purchase purchase = new Purchase(playwrightBase.page);

        // Execute purchase flow
        purchase.buyAppleMonitor();
    }

    @AfterMethod
    public void tearDown() {
        playwrightBase.tearDown();
    }
}
