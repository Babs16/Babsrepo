package tv.sis.capp2.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public interface BasePage {

    /*  Wait functions

     */

    void waitForPageLoaded();


    void waitForAndClickWebElement(WebElement webElement);

    void waitForAndClickElement(By by);

    WebElement waitForWebElement(By by);

    WebElement waitForWebElement(WebElement webElement);

    String getURL();


    /*
    send value to element
     */
    void sendValueToElement(WebElement webElement, String elementValue);

    void sendValueToElement(By by, String elementValue);

    public void navigateToURL(String url);


    /*
    select from drop down
     */
    void selectFromDropdown(By by, String visibleLabel);

    void selectFromDropdown(final WebElement dropdown, final String visibleLabel);


    /*
     get element/elements
     */
    List<WebElement> getWebElements(By by);

    WebElement getWebElement(By by);

    WebElement getWebElementWithoutWait(By by);


    /***
     *
     * @return actions
     */
    Actions getActions();

    /***
     *
     * @param webElement
     */
    void clearElementValue(WebElement webElement);

    /***
     *
     * @param webElement
     * @return boolean
     */
    boolean checkElement(WebElement webElement);

    boolean checkElement(By by);

    boolean checkElementEnabled(By by);

    boolean checkElementWithWait(By by);

    boolean checkElementWithWait(WebElement webElement);

    boolean checkElementSelected(By by);

    boolean checkElementSelected(WebElement webElement);

    boolean checkElementDisabled(By by);

    boolean checkSelectOptions(WebElement webElement);

    /*
      various getText methods
     */

    List<String> getAllAvailableOptions(Select select);

    List<String> getTextForElements(final By by);

    List<String> getTextForChildElementsFromParentElement(WebElement parentElement, By childBy);

    List<String> getTextFromWebElementList(List<WebElement> objs);

    List<String> getTextForInnerElements(By by, By innerBy);

    String getTextFromWebElement(WebElement webElement);

    String getTextForElement(final By by);

    String getTextFromBy(By by);

    /*
      some more get methods
    */
    List<WebElement> getChildElementsFromParentElement(WebElement parentElement, By childBy);

    List<String> getAttributeFromElementList(List<WebElement> objs, String attName);


    /*
      check methods
     */
    boolean checkAttributeFromElements(List<WebElement> webElements, String attributeName, String message);

    boolean checkPresenceOfString(List<String> stringList, String message);

    boolean checkTextFromElements(List<WebElement> webElements, String message);

    boolean checkStringFromElements(List<WebElement> webElements, String message);

    boolean isAlertPresent();


    void uploadFile(String fileName, WebElement webElement);

    void clickElementByKey(By by);



    /* *
     *
     * @param id
     * @param value
     * @return
     *//*
 String getJSStringByID(String id, String value);
 String getJSStringByID(String id);
 String getJSStringByName(String name, String value);
 String getJSStringByName(String name);

 *//***
     * Execute script using JavaScriptExecutor
     *//*
 void executeJavaScriptExecutor(String javascriptString);
 void executeJSByName(String stringName);
 void executeJSByID(String stringId);
 void performMouseAction(WebElement webElement);
 void performKeyAction(WebElement webElement);


 *//*
   scroll functionalities
  *//*
public void ScrollPageToVisibleElement(By by);
public void ScrollPageToVisibleElemen(WebElement webElement);
boolean checkAndWaitForWebElement(By by);
boolean checkAndWaitForWebElementHidden(By by);
*/

}
