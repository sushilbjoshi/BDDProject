$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("google.feature");
formatter.feature({
  "line": 1,
  "name": "Google",
  "description": "",
  "id": "google",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "GoogleTest",
  "description": "",
  "id": "google;googletest",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user should be on Google page",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleTest.user_should_be_on_Google_page()"
});
formatter.result({
  "duration": 3242775800,
  "status": "passed"
});
});