package tv.sis.capp2.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import tv.sis.capp2.Pages.LoginPage;

import java.io.IOException;

public class LoginTest extends BaseClass{



    @Test
    public void loginTest() throws InterruptedException, IOException {
        driver.get(baseURL);

        LoginPage login = new LoginPage(driver);
        login.setTxtUsernameField(username);
        login.setTxtPasswordField(password);
        login.clickLogin();
        logger.info("User Logins successfully");

        Thread.sleep(5000);

        if (driver.getTitle().equals("Sports Data Editor | Product Selector"))
            {
                Assert.assertTrue(true);
                login.clickLogOut();
                logger.info("Login test PASSED");
            }
        else
        {
            captureScreen(driver,"loginTest");
            Assert.assertTrue(false);
            logger.info("Login Failed");
        }

    }


}
