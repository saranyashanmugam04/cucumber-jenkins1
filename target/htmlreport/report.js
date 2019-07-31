$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/samplefolder/sam1.feature");
formatter.feature({
  "name": "Login functionality",
  "description": "Description: Registered user login to the application by entering valid username and password\n\nMapping: John would like access the online shoupping page. He should be registered and should use\nregistered credentials to get logged in to the application.",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login with valid combination",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user opens newtours application on chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Sam1Class.user_opens_newtours_application_on_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters mercury in username and password field",
  "keyword": "When "
});
formatter.match({
  "location": "Sam1Class.user_enters_mercury_in_username_and_password_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on SignIn Button",
  "keyword": "And "
});
formatter.match({
  "location": "Sam1Class.click_on_SignIn_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify login result as success",
  "keyword": "Then "
});
formatter.match({
  "location": "Sam1Class.verify_login_result_as_success()"
});
formatter.result({
  "status": "passed"
});
});