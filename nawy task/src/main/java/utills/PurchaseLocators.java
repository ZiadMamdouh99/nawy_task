package utills;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class PurchaseLocators {
    public final Locator monitorsCategory;
    public final Locator appleMonitor;
    public final Locator addToCartButton;
    public final Locator cartLink;
    public final Locator placeOrderButton;
    public final Locator nameInputField;
    public final Locator cardInputField;
    public final Locator purchaseButton;
    public final Locator thankYouMessage;
    public final Locator confirmOkButton;

    // Constructor to initialize locators
    public PurchaseLocators(Page page) {

        this.monitorsCategory = page.locator("#itemc[onclick=\"byCat('monitor')\"]");
        this.appleMonitor = page.locator("a.hrefch[href='prod.html?idp_=10']");
        this.addToCartButton = page.locator("#tbodyid a.btn.btn-success.btn-lg:has-text('Add to cart')");
        this.cartLink = page.locator("#cartur");
        this.placeOrderButton = page.locator("button[data-target='#orderModal']");
        this.nameInputField = page.locator("input#name");
        this.cardInputField = page.locator("input#card");
        this.purchaseButton = page.locator("button[onclick='purchaseOrder()']");
        this.thankYouMessage = page.locator("h2:has-text('Thank you for your purchase!");
        this.confirmOkButton = page.locator("button.confirm");
    }
}
