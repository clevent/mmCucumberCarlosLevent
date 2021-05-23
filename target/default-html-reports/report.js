$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/numbersOfProducts.feature");
formatter.feature({
  "name": "Products Numbers at search",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.scenario({
  "name": "Numbers of products check",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user should able to open main page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.manomano.step_definitions.SearchProductStepDefs.user_should_able_to_open_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select \"Animal Care / Beekeeping\" under products",
  "keyword": "When "
});
formatter.match({
  "location": "com.manomano.step_definitions.NumberOfProStepDef.user_select_under_products(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "check how many products listed and shown on page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.manomano.step_definitions.NumberOfProStepDef.check_how_many_products_listed_and_shown_on_page()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[5] products found\u003e but was:\u003c[4] products found\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat com.manomano.step_definitions.NumberOfProStepDef.check_how_many_products_listed_and_shown_on_page(NumberOfProStepDef.java:47)\r\n\tat ✽.check how many products listed and shown on page(file:///C:/Users/carlo/IdeaProjects/manomanoCucumber/src/test/resources/features/numbersOfProducts.feature:7)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/search.feature");
formatter.feature({
  "name": "Search Function",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.scenarioOutline({
  "name": "check search functionality for non registered user",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user should able to open main page",
  "keyword": "Given "
});
formatter.step({
  "name": "user should able to write product name \"\u003cproduct name\u003e\" and click on search button",
  "keyword": "When "
});
formatter.step({
  "name": "user should see \"\u003cproduct name\u003e\" at header",
  "keyword": "Then "
});
formatter.step({
  "name": "user should see all related products sorted by \"Relevance\"",
  "keyword": "And "
});
formatter.step({
  "name": "user should see 60 products out of 2015 at first page",
  "keyword": "And "
});
formatter.step({
  "name": "user should able to go next page by click on \"\u003cnext page\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "next page",
        "product name"
      ]
    },
    {
      "cells": [
        "2",
        "Umbrella"
      ]
    }
  ]
});
formatter.scenario({
  "name": "check search functionality for non registered user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user should able to open main page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.manomano.step_definitions.SearchProductStepDefs.user_should_able_to_open_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should able to write product name \"Umbrella\" and click on search button",
  "keyword": "When "
});
formatter.match({
  "location": "com.manomano.step_definitions.SearchProductStepDefs.user_should_able_to_write_product_name_and_click_on_search_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see \"Umbrella\" at header",
  "keyword": "Then "
});
formatter.match({
  "location": "com.manomano.step_definitions.SearchProductStepDefs.user_should_see_at_header(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see all related products sorted by \"Relevance\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.manomano.step_definitions.SearchProductStepDefs.user_should_see_all_related_products_sorted_by(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see 60 products out of 2015 at first page",
  "keyword": "And "
});
formatter.match({
  "location": "com.manomano.step_definitions.SearchProductStepDefs.user_should_see_products_out_of_at_first_page(java.lang.Integer,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should able to go next page by click on \"2\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.manomano.step_definitions.SearchProductStepDefs.user_should_able_to_go_next_page_by_click_on(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/searchEstimate.feature");
formatter.feature({
  "name": "Search Estimation Funcionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.scenario({
  "name": "check estimation area",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user should able to open main page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.manomano.step_definitions.SearchProductStepDefs.user_should_able_to_open_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should able to write product name \"sta\" and Stanley option under BRANDS",
  "keyword": "When "
});
formatter.match({
  "location": "com.manomano.step_definitions.SearchEstimateStepDefs.user_should_able_to_write_product_name_and_Stanley_option_under_BRANDS(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should able to select STANLEY Brand option",
  "keyword": "Then "
});
formatter.match({
  "location": "com.manomano.step_definitions.SearchEstimateStepDefs.user_should_able_to_select_STANLEY_Brand_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see \"Stanley\" brand products and headline at new page",
  "keyword": "And "
});
formatter.match({
  "location": "com.manomano.step_definitions.SearchEstimateStepDefs.user_should_see_brand_products_and_headline_at_new_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});