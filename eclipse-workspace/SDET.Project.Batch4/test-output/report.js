$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/PennadaH/eclipse-workspace/SDET.Project.Batch4/src/test/java/com/qa/features/OrangeHRMsecond.feature");
formatter.feature({
  "line": 1,
  "name": "Validating Orange HRM Page",
  "description": "",
  "id": "validating-orange-hrm-page",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "I am logged into Orange Application",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the Browser is Invoked",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Orange should be loaded",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Enter the credentials",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User should be successfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "Orangestepdefinitionsecond.the_Browser_is_Invoked()"
});
formatter.result({
  "duration": 4431035000,
  "status": "passed"
});
formatter.match({
  "location": "Orangestepdefinitionsecond.orange_should_be_loaded()"
});
formatter.result({
  "duration": 6048112900,
  "status": "passed"
});
formatter.match({
  "location": "Orangestepdefinitionsecond.enter_the_credentials()"
});
formatter.result({
  "duration": 1922090500,
  "status": "passed"
});
formatter.match({
  "location": "Orangestepdefinitionsecond.user_should_be_successfully_logged_in()"
});
formatter.result({
  "duration": 237520400,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#menu_dashboard_index\"}\n  (Session info: chrome\u003d91.0.4472.124)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027HBADT4800642\u0027, ip: \u002710.104.68.227\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_211\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 91.0.4472.124, chrome: {chromedriverVersion: 90.0.4430.24 (4c6d850f087da..., userDataDir: C:\\Users\\PennadaH\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:65143}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: ab4e758cc802b44ec1b126fafc24a0ee\n*** Element info: {Using\u003did, value\u003dmenu_dashboard_index}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy16.getText(Unknown Source)\r\n\tat com.qa.stepdefinition.Orangestepdefinitionsecond.user_should_be_successfully_logged_in(Orangestepdefinitionsecond.java:48)\r\n\tat ✽.Then User should be successfully logged in(C:/Users/PennadaH/eclipse-workspace/SDET.Project.Batch4/src/test/java/com/qa/features/OrangeHRMsecond.feature:7)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 10,
  "name": "Validate Job Title in Orange HRM Page",
  "description": "",
  "id": "validating-orange-hrm-page;validate-job-title-in-orange-hrm-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "When I click on Admin Link",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "Click on Job",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "validate text Job Title",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Close Orange Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Orangestepdefinitionsecond.when_I_click_on_Admin_Link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Orangestepdefinitionsecond.click_on_Job()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Orangestepdefinitionsecond.validate_text_Job_Title()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Orangestepdefinitionsecond.close_Orange_Browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 3,
  "name": "I am logged into Orange Application",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the Browser is Invoked",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Orange should be loaded",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Enter the credentials",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User should be successfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "Orangestepdefinitionsecond.the_Browser_is_Invoked()"
});
formatter.result({
  "duration": 2142243100,
  "status": "passed"
});
formatter.match({
  "location": "Orangestepdefinitionsecond.orange_should_be_loaded()"
});
formatter.result({
  "duration": 8384967200,
  "status": "passed"
});
formatter.match({
  "location": "Orangestepdefinitionsecond.enter_the_credentials()"
});
formatter.result({
  "duration": 2145073900,
  "status": "passed"
});
formatter.match({
  "location": "Orangestepdefinitionsecond.user_should_be_successfully_logged_in()"
});
formatter.result({
  "duration": 43274200,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#menu_dashboard_index\"}\n  (Session info: chrome\u003d91.0.4472.124)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027HBADT4800642\u0027, ip: \u002710.104.68.227\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_211\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 91.0.4472.124, chrome: {chromedriverVersion: 90.0.4430.24 (4c6d850f087da..., userDataDir: C:\\Users\\PennadaH\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:60549}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: a17ab835d12fc785d09ac536b210adb9\n*** Element info: {Using\u003did, value\u003dmenu_dashboard_index}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy16.getText(Unknown Source)\r\n\tat com.qa.stepdefinition.Orangestepdefinitionsecond.user_should_be_successfully_logged_in(Orangestepdefinitionsecond.java:48)\r\n\tat ✽.Then User should be successfully logged in(C:/Users/PennadaH/eclipse-workspace/SDET.Project.Batch4/src/test/java/com/qa/features/OrangeHRMsecond.feature:7)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 32,
  "name": "Enter UserName in Admin Page",
  "description": "",
  "id": "validating-orange-hrm-page;enter-username-in-admin-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 31,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "When I click on Admin Link",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "Enter the UserName in the textbox",
  "rows": [
    {
      "cells": [
        "Broadridge"
      ],
      "line": 35
    },
    {
      "cells": [
        "info"
      ],
      "line": 36
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "Close Orange Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Orangestepdefinitionsecond.when_I_click_on_Admin_Link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Orangestepdefinitionsecond.enter_the_UserName_in_the_textbox(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Orangestepdefinitionsecond.close_Orange_Browser()"
});
formatter.result({
  "status": "skipped"
});
});