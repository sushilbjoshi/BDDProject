$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("homepage.feature");
formatter.feature({
  "line": 1,
  "name": "Goibibo",
  "description": "\r\nbackground:\r\nGiven user should launch url",
  "id": "goibibo",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 20,
  "name": "HotelsSearch",
  "description": "",
  "id": "goibibo;hotelssearch",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "user should be on hotels page",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "user enters Where dates clicks search",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "Hotels should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "GoibiboTest.user_should_be_on_hotels_page()"
});
formatter.result({
  "duration": 39832599600,
  "status": "passed"
});
formatter.match({
  "location": "GoibiboTest.user_enters_Where_dates_clicks_search()"
});
formatter.result({
  "duration": 9277418500,
  "status": "passed"
});
formatter.match({
  "location": "GoibiboTest.hotels_should_be_displayed()"
});
formatter.result({
  "duration": 17064800,
  "status": "passed"
});
formatter.match({
  "location": "GoibiboTest.close_the_browser()"
});
formatter.result({
  "duration": 135203100,
  "status": "passed"
});
});