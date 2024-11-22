package pom;

import com.microsoft.playwright.Page;
import org.json.JSONObject;

import utills.*;

public class Purchase {

    private final Page page;
    private final PurchaseLocators locators;


    public Purchase(Page page) {
        this.page = page;
        this.locators = new utills.PurchaseLocators(page);
    }

    // Purchase method to buy an Apple monitor
    public void buyAppleMonitor() throws InterruptedException {
        // Step 1: Select the Monitors category
        locators.monitorsCategory.click();

        // Step 2: Select the Apple monitor
        locators.appleMonitor.click();
        Thread.sleep(1000);

        // Step 3: Add to cart
        locators.addToCartButton.click();
      Thread.sleep(2000);
        page.keyboard().press("Enter");

        // Step 4: Navigate to the cart
        locators.cartLink.click();

        // Step 5: Place order
        locators.placeOrderButton.waitFor();
        locators.placeOrderButton.click();

        // Step 6: Fill in order details using data from JSON
        JSONObject orderData = jasonutills.readJSONFile("testData.json");
        String name = orderData.getString("name");
        String card = orderData.getString("creditCard");
        locators.nameInputField.waitFor();
        locators.nameInputField.fill(name);
        locators.cardInputField.waitFor();
        locators.cardInputField.fill(card);

        // Step 7: Complete purchase
        locators.purchaseButton.waitFor();
        locators.purchaseButton.click();


locators.confirmOkButton.waitFor();
        locators.confirmOkButton.click();


        Thread.sleep(1000);
    }
}
