$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('googleImageLink\googleImageLink.feature');
formatter.feature({
  "line": 1,
  "name": "Google Image Link",
  "description": "",
  "id": "google-image-link",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Successful navigation to Google Image Page",
  "description": "",
  "id": "google-image-link;successful-navigation-to-google-image-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User navigates to google",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User clicks on Images hyperlink",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "User should be redirected to Google Images page",
  "keyword": "Then "
});
formatter.match({
  "location": "googleImageLink.User_navigates_to_google()"
});
formatter.result({
  "duration": 26049049600,
  "status": "passed"
});
formatter.match({
  "location": "googleImageLink.User_clicks_on_Images_hyperlink()"
});
formatter.result({
  "duration": 5154795500,
  "status": "passed"
});
formatter.match({
  "location": "googleImageLink.User_should_be_redirected_to_Google_Images_page()"
});
formatter.result({
  "duration": 3749634300,
  "status": "passed"
});
});