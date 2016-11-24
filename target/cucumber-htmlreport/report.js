$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HelloWorld.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Sample feature file for Behavior-Driven Testing and Development training"
    },
    {
      "line": 2,
      "value": "#Author: Fernanda Menks - fernanda.menks@accenture.com"
    },
    {
      "line": 3,
      "value": "#Creation date: September 16, 2016"
    }
  ],
  "line": 5,
  "name": "Search for definitions",
  "description": "In order to understand what is Cucumber BDD\r\nAs a user\r\nI want to be able to look up the meaning of Cucumber BDD",
  "id": "search-for-definitions",
  "keyword": "Feature",
  "tags": [
    {
      "line": 4,
      "name": "@HelloWorld"
    }
  ]
});
formatter.scenario({
  "line": 11,
  "name": "Make a Google search",
  "description": "",
  "id": "search-for-definitions;make-a-google-search",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@GoogleSearch"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "the user navigates to Google home page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "the user performs a search for Cucumber BDD",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "they should see that the search was performed",
  "keyword": "Then "
});
formatter.match({
  "location": "HelloWorld_StepDefinitions.theUserIsOnTheGoogleHomePage()"
});
formatter.result({
  "duration": 21502836329,
  "status": "passed"
});
formatter.match({
  "location": "HelloWorld_StepDefinitions.theUserPerformsASearchByKeyword()"
});
formatter.result({
  "duration": 1895289089,
  "status": "passed"
});
formatter.match({
  "location": "HelloWorld_StepDefinitions.theyShouldSeeThatTheSearchWasPerformed()"
});
formatter.result({
  "duration": 2253553505,
  "status": "passed"
});
});