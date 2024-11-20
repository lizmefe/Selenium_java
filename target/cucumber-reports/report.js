$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "SauceDemo Login",
  "description": "",
  "id": "saucedemo-login",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "a web browser is at the SauceDemo home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the user enters the username \"standard_user\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the user enters the password \"secret_sauce\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "the user clicks the login button Login",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.aWebBrowserHomePage()"
});
formatter.result({
  "duration": 2443750600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 30
    }
  ],
  "location": "LoginStep.theUserEntersTheUsername(String)"
});
formatter.result({
  "duration": 127145000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "secret_sauce",
      "offset": 30
    }
  ],
  "location": "LoginStep.theUserEntersThePassword(String)"
});
formatter.result({
  "duration": 82474100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.theUserClicksTheLoginButton()"
});
formatter.result({
  "duration": 218996100,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "User makes the purchase",
  "description": "",
  "id": "saucedemo-login;user-makes-the-purchase",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 35,
  "name": "the users add to cart a \"backpack\"",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "the user go to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "the user proceeds to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "the user fills in their information with \"FirstName\", \"LastName\", and \"12345\"",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "the user confirms the checkout",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "the user clicks the finish button",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "the user sees the button Back Home",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "backpack",
      "offset": 25
    }
  ],
  "location": "LoginStep.theUsersAddToCartA(String)"
});
formatter.result({
  "duration": 64875500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.theUserGoToCart()"
});
formatter.result({
  "duration": 128723300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.theUserProceedsToCheckout()"
});
formatter.result({
  "duration": 81707300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "FirstName",
      "offset": 42
    },
    {
      "val": "LastName",
      "offset": 55
    },
    {
      "val": "12345",
      "offset": 71
    }
  ],
  "location": "LoginStep.theUserFillsInTheirInformationWithAnd(String,String,String)"
});
formatter.result({
  "duration": 282371500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.theUserConfirmsTheCheckout()"
});
formatter.result({
  "duration": 85830000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.theUserClicksTheFinishButton()"
});
formatter.result({
  "duration": 64563900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.theUserSeesTheButtonBackHome()"
});
formatter.result({
  "duration": 26265200,
  "status": "passed"
});
formatter.uri("LoginUnhappy.feature");
formatter.feature({
  "line": 1,
  "name": "SauceDemo Login",
  "description": "",
  "id": "saucedemo-login",
  "keyword": "Feature"
});
});