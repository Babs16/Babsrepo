package tv.sis.capp2.testCases;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import tv.sis.capp2.configuration.ReadConfig;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    ReadConfig readConfig=new ReadConfig();

    protected String baseURL=readConfig.getApplicationUrl();
    public String username=readConfig.getUsername();
    public String password=readConfig.getPassword();
    public static WebDriver driver;

    public static Logger logger;

    @BeforeClass
    public void setup()
    {
        System.setProperty("webdriver.chrome.driver",readConfig.getChromePath());
        driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        WebDriverWait wait = new WebDriverWait(driver, 30);


        logger=Logger.getLogger("LoginTest");
        PropertyConfigurator.configure("Log4j.properties");
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }

    public void captureScreen(WebDriver driver, String tname) throws IOException{
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File target = new File(System.getProperty("user.dir")+"/Screenshots/"+ tname + ".png");
        FileUtils.copyFile(source, target);
        System.out.println("Screenshot Taken");
    }
}
