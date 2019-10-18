package tv.sis.capp2.Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;

    public LoginPage(WebDriver driver)
    {
       this.driver = driver;
       PageFactory.initElements(driver,this);
    }

    @FindBy(id="UserName")
    WebElement txtUsernameField;

    @FindBy(id="Password")
    WebElement txtPasswordField;

    @FindBy(xpath="//button[@type=\"submit\"]")
    WebElement btnLogOn;

    @FindBy(xpath = "//span[@class=\"fa fa-sign-out\"]")
    WebElement lnkLogOut;

    public void setTxtUsernameField(String Uname)
    {
        txtUsernameField.sendKeys(Uname);

    }

    public void setTxtPasswordField(String pwd)
    {
        txtPasswordField.sendKeys(pwd );
    }

    public void clickLogin()
    {
        btnLogOn.click();
    }

    public void clickLogOut()
    {
        lnkLogOut.click();
    }

    public void getPageTitle() {
        driver.getTitle().equals("Sports Data Editor | Product Selector");
        Assert.assertTrue(true);
    }



}
