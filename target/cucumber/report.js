$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Pregnancy.feature");
formatter.feature({
  "line": 1,
  "name": "Pregnancy+ Homepage",
  "description": "This feature verifies the functionality on Pregnancy+",
  "id": "pregnancy+-homepage",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6429684095,
  "status": "passed"
});
formatter.scenario({
  "line": 70,
  "name": "Verify Baby Tracker function options",
  "description": "",
  "id": "pregnancy+-homepage;verify-baby-tracker-function-options",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 69,
      "name": "@Guides"
    }
  ]
});
formatter.step({
  "line": 71,
  "name": "I verify that I am in Today Screen",
  "keyword": "Given "
});
formatter.step({
  "line": 72,
  "name": "I navigate to baby options screen",
  "keyword": "Then "
});
formatter.step({
  "line": 73,
  "name": "I verify that I am in baby options screen",
  "keyword": "And "
});
formatter.step({
  "line": 74,
  "name": "I navigate to Guides screen",
  "keyword": "Then "
});
formatter.match({
  "location": "PregnancyStep.i_verify_that_I_am_in_Today_Screen()"
});
formatter.result({
  "duration": 6079608275,
  "status": "passed"
});
formatter.match({
  "location": "PregnancyStep.i_navigate_to_baby_options_screen()"
});
formatter.result({
  "duration": 441477221,
  "status": "passed"
});
formatter.match({
  "location": "PregnancyStep.i_verify_that_I_am_in_baby_options_screen()"
});
formatter.result({
  "duration": 1116162738,
  "status": "passed"
});
formatter.match({
  "location": "PregnancyStep.i_navigate_to_Guides_screen()"
});
formatter.result({
  "duration": 26220551540,
  "error_message": "java.lang.ClassCastException: org.openqa.selenium.remote.RemoteWebDriver cannot be cast to io.appium.java_client.PerformsTouchActions\n\tat stepDefinitions.BabyOptions.BabyTrackerOptions(BabyOptions.java:97)\n\tat stepDefinitions.PregnancyStep.i_navigate_to_Guides_screen(PregnancyStep.java:60)\n\tat ✽.Then I navigate to Guides screen(Pregnancy.feature:74)\n",
  "status": "failed"
});
formatter.after({
  "duration": 373432146,
  "status": "passed"
});
});