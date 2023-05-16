$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("womentest.feature");
formatter.feature({
  "line": 2,
  "name": "Women Test",
  "description": "\r\nAs a user I should able to verify the products by name filter and can verify\r\nthe products sort by price filter",
  "id": "women-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4038322500,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "I am on homepage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 18,
  "name": "Verify user should filter by price",
  "description": "",
  "id": "women-test;verify-user-should-filter-by-price",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "I mouse hover on Women",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I mouse hover on Tops",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I mouse hover on Jackets and click",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I select on Sort By Price \"Price\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I verify product are in low to high",
  "keyword": "Then "
});
formatter.match({
  "location": "WomenTest.iMouseHoverOnWomen()"
});
formatter.result({
  "duration": 1263144800,
  "status": "passed"
});
formatter.match({
  "location": "WomenTest.iMouseHoverOnTops()"
});
formatter.result({
  "duration": 175767400,
  "status": "passed"
});
formatter.match({
  "location": "WomenTest.iMouseHoverOnJacketsAndClick()"
});
formatter.result({
  "duration": 1141852000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Price",
      "offset": 27
    }
  ],
  "location": "WomenTest.iSelectOnSortByPrice(String)"
});
formatter.result({
  "duration": 1146886000,
  "status": "passed"
});
formatter.match({
  "location": "WomenTest.iVerifyProductAreInLowToHigh()"
});
formatter.result({
  "duration": 621269700,
  "status": "passed"
});
formatter.after({
  "duration": 150800,
  "status": "passed"
});
});