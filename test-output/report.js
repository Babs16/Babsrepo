$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login to Web Editor",
  "description": "",
  "id": "login-to-web-editor",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "User should be able to Login to Web editor with Valid credentials",
  "description": "",
  "id": "login-to-web-editor;user-should-be-able-to-login-to-web-editor-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Enters valid URL for the Web Editor",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User enters valid username \"bfatade\" and Password \"Password10\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Clicks on Logon button",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Editor Homepage should be opened",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.enters_valid_URL_for_the_Web_Editor()"
});
formatter.result({
  "duration": 5095629600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bfatade",
      "offset": 28
    },
    {
      "val": "Password10",
      "offset": 51
    }
  ],
  "location": "LoginTest.user_enters_valid_username_and_Password(String,String)"
});
formatter.result({
  "duration": 313434600,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.clicks_on_Logon_button()"
});
formatter.result({
  "duration": 1029312000,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.editor_Homepage_should_be_opened()"
});
formatter.result({
  "duration": 5557884800,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 7,
      "value": "# And confirm the Page Title is \u0027Sports Data Editor\u0027"
    }
  ],
  "line": 9,
  "name": "View BHB Meetings and Republish a Meeting",
  "description": "",
  "id": "login-to-web-editor;view-bhb-meetings-and-republish-a-meeting",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "User is on the BHB Meeting screen",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User clicks on Republish button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User confirms republish by clicking Yes on the popover",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.user_is_on_the_BHB_Meeting_screen()"
});
formatter.result({
  "duration": 46884100,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.user_clicks_on_Republish_button()"
});
formatter.result({
  "duration": 116952600,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.user_confirms_republish_by_clicking_Yes_on_the_popover()"
});
formatter.result({
  "duration": 44708500,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@class\u003d\u0027popover fade show bs-popover-left\u0027]\"}\n  (Session info: chrome\u003d77.0.3865.90)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027B001145\u0027, ip: \u002710.180.4.76\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002712.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 77.0.3865.90, chrome: {chromedriverVersion: 77.0.3865.40 (f484704e052e0..., userDataDir: C:\\Users\\bfatade\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:63357}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: c396e24316384bcf0de3aca6d3da7701\n*** Element info: {Using\u003dxpath, value\u003d//div[@class\u003d\u0027popover fade show bs-popover-left\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat StepDefinitions.LoginTest.user_confirms_republish_by_clicking_Yes_on_the_popover(LoginTest.java:99)\r\n\tat ✽.And User confirms republish by clicking Yes on the popover(Login.feature:12)\r\n",
  "status": "failed"
});
formatter.scenario({
  "comments": [
    {
      "line": 13,
      "value": "#And User clicks Delete icon for the first meeting on the list"
    },
    {
      "line": 14,
      "value": "#Then User Confirms Deletion by clicking Delete button on the popover"
    }
  ],
  "line": 16,
  "name": "BHB Events processing",
  "description": "",
  "id": "login-to-web-editor;bhb-events-processing",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "That user clicks on the the first meeting on the list",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 18,
      "value": "#  And User clicks on Delete icon"
    },
    {
      "line": 19,
      "value": "#And User confirms Event Deletion by clicking on Delete on the popover"
    }
  ],
  "line": 20,
  "name": "User clicks Runners button",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Click Delete icon next to a runner on the resulting popup",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 22,
      "value": "# And  User Confirms Deletion by clicking Delete button on the popover"
    }
  ],
  "line": 23,
  "name": "User closes the Runners pop up",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.that_user_clicks_on_the_the_first_meeting_on_the_list()"
});
formatter.result({
  "duration": 459227800,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.user_clicks_Runners_button()"
});
formatter.result({
  "duration": 28193600,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\"BhbEventTableItem-data-grid\"]/tbody/tr[1]/td[8]/sis-popup-button/a\"}\n  (Session info: chrome\u003d77.0.3865.90)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027B001145\u0027, ip: \u002710.180.4.76\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002712.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 77.0.3865.90, chrome: {chromedriverVersion: 77.0.3865.40 (f484704e052e0..., userDataDir: C:\\Users\\bfatade\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:63357}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: c396e24316384bcf0de3aca6d3da7701\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"BhbEventTableItem-data-grid\"]/tbody/tr[1]/td[8]/sis-popup-button/a}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat StepDefinitions.LoginTest.user_clicks_Runners_button(LoginTest.java:134)\r\n\tat ✽.Then User clicks Runners button(Login.feature:20)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginTest.click_Delete_icon_next_to_a_runner_on_the_resulting_popup()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginTest.user_closes_the_Runners_pop_up()"
});
formatter.result({
  "status": "skipped"
});
});