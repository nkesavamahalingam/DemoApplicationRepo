$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/addProducts.feature");
formatter.feature({
  "line": 3,
  "name": "Application Test - Add products to wishlist",
  "description": "",
  "id": "application-test---add-products-to-wishlist",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@apptest"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Verify_Customer_Add_The_Product_In_Wishlist_And_Add_To_Cart_\u003ctc_id\u003e",
  "description": "",
  "id": "application-test---add-products-to-wishlist;verify-customer-add-the-product-in-wishlist-and-add-to-cart-\u003ctc-id\u003e",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "I add \"\u003cno_of_products\u003e\" different products to my wishlist",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I view my wishlist table",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I find total \"\u003cno_of_products\u003e\" selected items in my wishlist",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I search for \"\u003cproduct_rate\u003e\" price product",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I am able to add the \"\u003cproduct_rate\u003e\" price item to my cart",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I am able to verify the item in my cart",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "application-test---add-products-to-wishlist;verify-customer-add-the-product-in-wishlist-and-add-to-cart-\u003ctc-id\u003e;",
  "rows": [
    {
      "cells": [
        "tc_id",
        "no_of_products",
        "product_rate"
      ],
      "line": 14,
      "id": "application-test---add-products-to-wishlist;verify-customer-add-the-product-in-wishlist-and-add-to-cart-\u003ctc-id\u003e;;1"
    },
    {
      "cells": [
        "TC_001",
        "4",
        "lowest"
      ],
      "line": 15,
      "id": "application-test---add-products-to-wishlist;verify-customer-add-the-product-in-wishlist-and-add-to-cart-\u003ctc-id\u003e;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 13592365700,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Verify_Customer_Add_The_Product_In_Wishlist_And_Add_To_Cart_TC_001",
  "description": "",
  "id": "application-test---add-products-to-wishlist;verify-customer-add-the-product-in-wishlist-and-add-to-cart-\u003ctc-id\u003e;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@apptest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I add \"4\" different products to my wishlist",
  "matchedColumns": [
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I view my wishlist table",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I find total \"4\" selected items in my wishlist",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I search for \"lowest\" price product",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I am able to add the \"lowest\" price item to my cart",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I am able to verify the item in my cart",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 7
    }
  ],
  "location": "ApplicationsStepsDefinition.i_add_different_product_to_my_wish_list(String)"
});
formatter.result({
  "duration": 4133079500,
  "status": "passed"
});
formatter.match({
  "location": "ApplicationsStepsDefinition.i_view_my_wishlist_table()"
});
formatter.result({
  "duration": 1061444300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 14
    }
  ],
  "location": "ApplicationsStepsDefinition.i_find_total_selected_items_in_my_Wishlist(String)"
});
formatter.result({
  "duration": 583954600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lowest",
      "offset": 14
    }
  ],
  "location": "ApplicationsStepsDefinition.i_search_for_price_product(String)"
});
formatter.result({
  "duration": 828275501,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lowest",
      "offset": 22
    }
  ],
  "location": "ApplicationsStepsDefinition.i_am_able_to_add_the_price_item_to_my_cart(String)"
});
formatter.result({
  "duration": 1003475300,
  "status": "passed"
});
formatter.match({
  "location": "ApplicationsStepsDefinition.i_am_able_to_verify_the_item_in_my_cart()"
});
formatter.result({
  "duration": 1105954400,
  "status": "passed"
});
formatter.after({
  "duration": 1077713599,
  "status": "passed"
});
});