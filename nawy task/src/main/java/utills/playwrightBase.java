package utills;

import com.microsoft.playwright.*;

public class playwrightBase {
    protected static Playwright playwright;
    protected static Browser browser;
    protected static BrowserContext context;
    public static Page page;

    public static void initialize() {
        // Create Playwright instance
        playwright = Playwright.create();


        BrowserType.LaunchOptions options = new BrowserType.LaunchOptions()
                .setHeadless(false)
                .setSlowMo(500);

        browser = playwright.chromium().launch(options);


        context = browser.newContext();
        page = context.newPage();
    }

    public static void tearDown() {

        page.close();
        context.close();
        browser.close();
        playwright.close();
    }
}
