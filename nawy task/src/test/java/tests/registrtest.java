package tests;
import org.testng.annotations.*;
import pom.RegisterPage;
import utills.playwrightBase;
import pom.RegisterPage.*;

public class registrtest {
    @BeforeMethod
    public void setUp() {
        System.setProperty("PWDEBUG", "1");
        playwrightBase.initialize();
        playwrightBase.page.navigate("https://www.demoblaze.com/");
    }

    @Test
    public void testRegistration() throws InterruptedException {

        RegisterPage registerPage = new RegisterPage(playwrightBase.page);


        registerPage.registerUser();


    }
    @AfterMethod
    public void tearDown() {
        playwrightBase.tearDown();
    }
}
