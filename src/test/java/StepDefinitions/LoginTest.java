package StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import tv.sis.capp2.Pages.LoginPage;
import tv.sis.capp2.testCases.BaseClass;
import tv.sis.capp2.configuration.ReadConfig;

public class LoginTest extends BaseClass{


    LoginPage loginPage = new LoginPage(driver);
    ReadConfig readConfig = new ReadConfig();


    @Given("^Enters valid URL for the Web Editor$")
    public void enters_valid_URL_for_the_Web_Editor() throws Throwable {
        System.setProperty("webdriver.chrome.driver",readConfig.getChromePath());
        driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(baseURL);

    }


    @When("^User enters valid username \"([^\"]*)\" and Password \"([^\"]*)\"$")
    public void user_enters_valid_username_and_Password(String username, String password) throws Throwable {

        //loginPage.setTxtUsernameField("username");
        //loginPage.setTxtPasswordField("Password");
        driver.findElement(By.id("UserName")).sendKeys(username);
        driver.findElement(By.id("Password")).sendKeys(password);
    }

    @And("^Clicks on Logon button$")
    public void clicks_on_Logon_button() throws Throwable {
        //loginPage.clickLogin();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("^Editor Homepage should be opened$")
    public void editor_Homepage_should_be_opened() throws Throwable {

//        String pageTitle = driver.findElement(By.xpath("//*[@id=\"MeetingSummaryTableItem\"]/thead/tr/th[1]")).getText();
//        Assert.assertEquals(true, pageTitle.contains("Name"));

       String pageTitle= driver.getTitle();
       Assert.assertEquals(true, pageTitle.equals("Sports Data Editor | Product Selector"));
        driver.findElement(By.xpath("//div[@class=\"dashboard-tile bhbviewer-dashboard-tile\"]")).click();
        Thread.sleep(5000);

    }

//    @And("^confirm the Page Title is 'Sports Data Editor'$")
//    public void confirm_the_Page_Title_is_Sports_Data_Editor() throws Throwable {
//        //loginPage.getPageTitle();
//
//        if (driver.getTitle().equals("Sports Data Editor | Product Selector"))
//        {
//            Assert.assertTrue(true);
//            driver.findElement(By.xpath("//div[@class=\"dashboard-tile bhbviewer-dashboard-tile\"]")).click();
//            logger.info("Login test PASSED");
//        }
//        else
//        {
//            captureScreen(driver,"loginTest");
//            Assert.assertTrue(false);
//            logger.info("Login Failed");
//        }
//
//    }

    @Given("^User is on the BHB Meeting screen$")
    public void user_is_on_the_BHB_Meeting_screen() throws Throwable
    {

        String pageTitle = driver.findElement(By.xpath("//*[@id=\"MeetingSummaryTableItem\"]/thead/tr/th[1]")).getText();
        Assert.assertEquals(true, pageTitle.contains("Name"));

    }

    @Given("^User clicks on Republish button$")
    public void user_clicks_on_Republish_button() throws Throwable {

        driver.findElement(By.xpath("//table[@id='MeetingSummaryTableItem']/tbody/tr[2]/td[14]")).click();


    }

    @Given("^User confirms republish by clicking Yes on the popover$")
    public void user_confirms_republish_by_clicking_Yes_on_the_popover() throws Throwable {

        driver.findElement(By.xpath("//div[@class='popover fade show bs-popover-left']")).click();


    }

//    @Given("^User clicks Delete icon for the first meeting on the list$")
//    public void user_clicks_Delete_icon_for_the_first_meeting_on_the_list() throws Throwable {
//
//
//    }
//
//    @Then("^User Confirms Deletion by clicking Delete button on the popover$")
//    public void user_Confirms_Deletion_by_clicking_Delete_button_on_the_popover() throws Throwable {
//
//    }

    @Given("^That user clicks on the the first meeting on the list$")
    public void that_user_clicks_on_the_the_first_meeting_on_the_list() throws Throwable {

        driver.findElement(By.xpath("//*[@id=\"MeetingSummaryTableItem\"]/tbody/tr[2]/td[1]")).click();

    }

//    @Given("^User clicks on Delete icon$")
//    public void user_clicks_on_Delete_icon() throws Throwable {
//
//    }
//
//    @Given("^User confirms Event Deletion by clicking on Delete on the popover$")
//    public void user_confirms_Event_Deletion_by_clicking_on_Delete_on_the_popover() throws Throwable {
//
//    }

    @Then("^User clicks Runners button$")
    public void user_clicks_Runners_button() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"BhbEventTableItem-data-grid\"]/tbody/tr[1]/td[8]/sis-popup-button/a")).click();

    }

    @Then("^Click Delete icon next to a runner on the resulting popup$")
    public void click_Delete_icon_next_to_a_runner_on_the_resulting_popup() throws Throwable {

    }

    @Then("^User closes the Runners pop up$")
    public void user_closes_the_Runners_pop_up() throws Throwable {
        driver.findElement(By.xpath("//button[@class=\"close\"]")).click();

    }


}
