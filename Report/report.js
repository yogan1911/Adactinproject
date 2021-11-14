$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("adactin.feature");
formatter.feature({
  "line": 1,
  "name": "To  Check the booking functionality of the Adactin hotel application",
  "description": "",
  "id": "to--check-the-booking-functionality-of-the-adactin-hotel-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "user checking the login page with combination of username and password.",
  "description": "",
  "id": "to--check-the-booking-functionality-of-the-adactin-hotel-application;user-checking-the-login-page-with-combination-of-username-and-password.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "user launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enter the valid \"\u003cusername\u003e\" in the username field",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enter the valid \"\u003cpassword\u003e\" in the password field",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user clicks on the login button",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "to--check-the-booking-functionality-of-the-adactin-hotel-application;user-checking-the-login-page-with-combination-of-username-and-password.;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 12,
      "id": "to--check-the-booking-functionality-of-the-adactin-hotel-application;user-checking-the-login-page-with-combination-of-username-and-password.;;1"
    },
    {
      "cells": [
        "Arun",
        "12365df"
      ],
      "line": 13,
      "id": "to--check-the-booking-functionality-of-the-adactin-hotel-application;user-checking-the-login-page-with-combination-of-username-and-password.;;2"
    },
    {
      "cells": [
        "Aravind",
        "123Reff"
      ],
      "line": 14,
      "id": "to--check-the-booking-functionality-of-the-adactin-hotel-application;user-checking-the-login-page-with-combination-of-username-and-password.;;3"
    },
    {
      "cells": [
        "Yogan123",
        "yogan@1911"
      ],
      "line": 15,
      "id": "to--check-the-booking-functionality-of-the-adactin-hotel-application;user-checking-the-login-page-with-combination-of-username-and-password.;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "user checking the login page with combination of username and password.",
  "description": "",
  "id": "to--check-the-booking-functionality-of-the-adactin-hotel-application;user-checking-the-login-page-with-combination-of-username-and-password.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "user launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enter the valid \"Arun\" in the username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enter the valid \"12365df\" in the password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user clicks on the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launch_the_application()"
});
formatter.result({
  "duration": 6895440377,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Arun",
      "offset": 22
    }
  ],
  "location": "StepDefinition.user_enter_the_valid_in_the_username_field(String)"
});
formatter.result({
  "duration": 224338703,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12365df",
      "offset": 22
    }
  ],
  "location": "StepDefinition.user_enter_the_valid_in_the_password_field(String)"
});
formatter.result({
  "duration": 183086123,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 869066848,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "user checking the login page with combination of username and password.",
  "description": "",
  "id": "to--check-the-booking-functionality-of-the-adactin-hotel-application;user-checking-the-login-page-with-combination-of-username-and-password.;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "user launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enter the valid \"Aravind\" in the username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enter the valid \"123Reff\" in the password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user clicks on the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launch_the_application()"
});
formatter.result({
  "duration": 534101054,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Aravind",
      "offset": 22
    }
  ],
  "location": "StepDefinition.user_enter_the_valid_in_the_username_field(String)"
});
formatter.result({
  "duration": 126577911,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123Reff",
      "offset": 22
    }
  ],
  "location": "StepDefinition.user_enter_the_valid_in_the_password_field(String)"
});
formatter.result({
  "duration": 132460801,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 626408867,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "user checking the login page with combination of username and password.",
  "description": "",
  "id": "to--check-the-booking-functionality-of-the-adactin-hotel-application;user-checking-the-login-page-with-combination-of-username-and-password.;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "user launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enter the valid \"Yogan123\" in the username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enter the valid \"yogan@1911\" in the password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user clicks on the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launch_the_application()"
});
formatter.result({
  "duration": 510719753,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Yogan123",
      "offset": 22
    }
  ],
  "location": "StepDefinition.user_enter_the_valid_in_the_username_field(String)"
});
formatter.result({
  "duration": 185478699,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "yogan@1911",
      "offset": 22
    }
  ],
  "location": "StepDefinition.user_enter_the_valid_in_the_password_field(String)"
});
formatter.result({
  "duration": 170235126,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 1471387170,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "User Navigate to Search Hotel page",
  "description": "",
  "id": "to--check-the-booking-functionality-of-the-adactin-hotel-application;user-navigate-to-search-hotel-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "User Navigate from login page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "user select the correct location from the drop down menu",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user select the Hotel name from the drop down menu",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user select the room type from the drop down menu",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user select the Number of Rooms from the drop down menu",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user the valid check In date in the Check In Field",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user the valid check Out date in the Check Out Field",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user select the Adults per room from the drop down menu",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user select the Childrens per room from the drop down menu",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user clicks on the Search button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Navigate_from_login_page()"
});
formatter.result({
  "duration": 84870,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_the_correct_location_from_the_drop_down_menu()"
});
formatter.result({
  "duration": 228698580,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_the_Hotel_name_from_the_drop_down_menu()"
});
formatter.result({
  "duration": 182141428,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_the_room_type_from_the_drop_down_menu()"
});
formatter.result({
  "duration": 142933134,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_the_Number_of_Rooms_from_the_drop_down_menu()"
});
formatter.result({
  "duration": 104719622,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_the_valid_check_In_date_in_the_Check_In_Field()"
});
formatter.result({
  "duration": 212367009,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_the_valid_check_Out_date_in_the_Check_Out_Field()"
});
formatter.result({
  "duration": 232884082,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_the_Adults_per_room_from_the_drop_down_menu()"
});
formatter.result({
  "duration": 142828787,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_the_Childrens_per_room_from_the_drop_down_menu()"
});
formatter.result({
  "duration": 119601921,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_the_Search_button()"
});
formatter.result({
  "duration": 924903989,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "User Navigate from Search Hotel to select hotel page",
  "description": "",
  "id": "to--check-the-booking-functionality-of-the-adactin-hotel-application;user-navigate-from-search-hotel-to-select-hotel-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 30,
  "name": "user navigate from search hotel page",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "user selects the radio button for the confirmation of their search",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "user clicks on the Continue button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_navigate_from_search_hotel_page()"
});
formatter.result({
  "duration": 80232,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_selects_the_radio_button_for_the_confirmation_of_their_search()"
});
formatter.result({
  "duration": 142147976,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_the_Continue_button()"
});
formatter.result({
  "duration": 1191595328,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "User Navigate from Select Hotel to Book hotel page",
  "description": "",
  "id": "to--check-the-booking-functionality-of-the-adactin-hotel-application;user-navigate-from-select-hotel-to-book-hotel-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 35,
  "name": "user navigate from select hotel page",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "user enter the valid firstname in the firstname field",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "user enter the valid lastname in the lastname field",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user enter the valid Billing Address in the Billing Address field",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user enter the valid Credit card number in the Credit card No field",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user select the valid Credit card Type in the given field",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user select the valid Expiry Date in the Month field",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user select the valid Expiry Date in the year field",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user enter the valid CVV number in the CVV number field",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "user clicks on the Book Now button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_navigate_from_select_hotel_page()"
});
formatter.result({
  "duration": 52870,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enter_the_valid_firstname_in_the_firstname_field()"
});
formatter.result({
  "duration": 176905493,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enter_the_valid_lastname_in_the_lastname_field()"
});
formatter.result({
  "duration": 144354118,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enter_the_valid_Billing_Address_in_the_Billing_Address_field()"
});
formatter.result({
  "duration": 249602899,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enter_the_valid_Credit_card_number_in_the_Credit_card_No_field()"
});
formatter.result({
  "duration": 148821590,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_the_valid_Credit_card_Type_in_the_given_field()"
});
formatter.result({
  "duration": 124972811,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_the_valid_Expiry_Date_in_the_Month_field()"
});
formatter.result({
  "duration": 159612068,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_the_valid_Expiry_Date_in_the_year_field()"
});
formatter.result({
  "duration": 126400752,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enter_the_valid_CVV_number_in_the_CVV_number_field()"
});
formatter.result({
  "duration": 130230543,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_the_Book_Now_button()"
});
formatter.result({
  "duration": 134954015,
  "status": "passed"
});
formatter.scenario({
  "line": 46,
  "name": "User navigate to Booking confirmation page",
  "description": "",
  "id": "to--check-the-booking-functionality-of-the-adactin-hotel-application;user-navigate-to-booking-confirmation-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 47,
  "name": "User navigate from Book hotel page",
  "keyword": "Given "
});
formatter.step({
  "line": 48,
  "name": "user scroll down to My Itinerary Button",
  "keyword": "When "
});
formatter.step({
  "line": 49,
  "name": "user clicks on the My Itinerary Button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_navigate_from_Book_hotel_page()"
});
formatter.result({
  "duration": 53333,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_scroll_down_to_My_Itinerary_Button()"
});
formatter.result({
  "duration": 5647134636,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_the_My_Itinerary_Button()"
});
formatter.result({
  "duration": 1252579822,
  "status": "passed"
});
formatter.scenario({
  "line": 51,
  "name": "User navigate to My Itinerary Page",
  "description": "",
  "id": "to--check-the-booking-functionality-of-the-adactin-hotel-application;user-navigate-to-my-itinerary-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 52,
  "name": "User navigate from Confimation page",
  "keyword": "Given "
});
formatter.step({
  "line": 53,
  "name": "user takes screen shot of the page",
  "keyword": "When "
});
formatter.step({
  "line": 54,
  "name": "user clicks in logout button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_navigate_from_Confimation_page()"
});
formatter.result({
  "duration": 52869,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_takes_screen_shot_of_the_page()"
});
formatter.result({
  "duration": 315221823,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_in_logout_button()"
});
formatter.result({
  "duration": 930502589,
  "status": "passed"
});
});