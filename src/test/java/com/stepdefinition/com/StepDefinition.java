package com.stepdefinition.com;

import org.openqa.selenium.WebDriver;

import com.PageObjectManager.com.POMClass;
import com.baseclass.com.BaseClass;
import com.helper.com.FileReaderManager;
import com.pom.com.BookingPage;
import com.pom.com.LoginPage;
import com.pom.com.SearchHotel;
import com.runner.com.RunnerClass;

import cucumber.api.java.en.*;

public class StepDefinition extends BaseClass {

	public static WebDriver driver = RunnerClass.driver;

//	LoginPage lp = new LoginPage(driver);
//	SearchHotel sh = new SearchHotel(driver);
//	BookingPage bp = new BookingPage(driver);
	POMClass pom = new POMClass(driver);

	@Given("^user launch the application$")
	public void user_launch_the_application() throws Throwable {
		String url = FileReaderManager.getInstanceCR().getURL();
		launchUrl(url);
	}

	@When("^user enter the valid \"([^\"]*)\" in the username field$")
	public void user_enter_the_valid_in_the_username_field(String arg1) throws Throwable {
		inputValues(pom.login().getUsername(), arg1);
	}

	@When("^user enter the valid \"([^\"]*)\" in the password field$")
	public void user_enter_the_valid_in_the_password_field(String arg1) throws Throwable {
		inputValues(pom.login().getPassword(), arg1);
	}

	@Then("^user clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		clickonelement(pom.login().getLogin());
	}

	@Given("^User Navigate from login page$")
	public void user_Navigate_from_login_page() throws Throwable {

	}

	@When("^user select the correct location from the drop down menu$")
	public void user_select_the_correct_location_from_the_drop_down_menu() throws Throwable {
		String location = FileReaderManager.getInstanceCR().getLocation();
		// String location = FileReaderManager.getInstanceCR().getLocation();
		selectText(pom.getSh().getSelectLocation(), location);
		// inputValues(pom.getSh().getSelectLocation(), location);
	}

	@When("^user select the Hotel name from the drop down menu$")
	public void user_select_the_Hotel_name_from_the_drop_down_menu() throws Throwable {
		String hotel = FileReaderManager.getInstanceCR().getHotel();
		selectText(pom.getSh().getSelecthotel(), hotel);
		// inputValues(pom.getSh().getSelecthotel(), hotel);
	}

	@When("^user select the room type from the drop down menu$")
	public void user_select_the_room_type_from_the_drop_down_menu() throws Throwable {
		String roomType = FileReaderManager.getInstanceCR().getRoomType();
		inputValues(pom.getSh().getRoomtype(), roomType);
	}

	@When("^user select the Number of Rooms from the drop down menu$")
	public void user_select_the_Number_of_Rooms_from_the_drop_down_menu() throws Throwable {
		String roomCount = FileReaderManager.getInstanceCR().getRoomCount();
		inputValues(pom.getSh().getRoomcount(), roomCount);
	}

	@When("^user the valid check In date in the Check In Field$")
	public void user_the_valid_check_In_date_in_the_Check_In_Field() throws Throwable {
		cleardata(pom.getSh().getinDate());
		String checkInDate = FileReaderManager.getInstanceCR().getCheckInDate();
		inputValues(pom.getSh().getinDate(), checkInDate);
	}

	@When("^user the valid check Out date in the Check Out Field$")
	public void user_the_valid_check_Out_date_in_the_Check_Out_Field() throws Throwable {
		cleardata(pom.getSh().getOutDate());
		String checkOutDate = FileReaderManager.getInstanceCR().getCheckOutDate();
		inputValues(pom.getSh().getOutDate(), checkOutDate);
	}

	@When("^user select the Adults per room from the drop down menu$")
	public void user_select_the_Adults_per_room_from_the_drop_down_menu() throws Throwable {
		String adultsroom = FileReaderManager.getInstanceCR().getAdultsroom();
		inputValues(pom.getSh().getPersonCount(), adultsroom);

	}

	@When("^user select the Childrens per room from the drop down menu$")
	public void user_select_the_Childrens_per_room_from_the_drop_down_menu() throws Throwable {
		String childRoom = FileReaderManager.getInstanceCR().getChildRoom();
		inputValues(pom.getSh().getChildroom(), childRoom);
	}

	@Then("^user clicks on the Search button$")
	public void user_clicks_on_the_Search_button() throws Throwable {
		clickonelement(pom.getSh().getSearch());
	}

	@Given("^user navigate from search hotel page$")
	public void user_navigate_from_search_hotel_page() throws Throwable {

	}

	@When("^user selects the radio button for the confirmation of their search$")
	public void user_selects_the_radio_button_for_the_confirmation_of_their_search() throws Throwable {
		clickonelement(pom.booking().getButtonclick());
	}

	@Then("^user clicks on the Continue button$")
	public void user_clicks_on_the_Continue_button() throws Throwable {
		clickonelement(pom.booking().getContinuebooking());
	}

	@Given("^user navigate from select hotel page$")
	public void user_navigate_from_select_hotel_page() throws Throwable {

	}

	@When("^user enter the valid firstname in the firstname field$")
	public void user_enter_the_valid_firstname_in_the_firstname_field() throws Throwable {
		inputValues(pom.booking().getfirstName(), "Yogan");
	}

	@When("^user enter the valid lastname in the lastname field$")
	public void user_enter_the_valid_lastname_in_the_lastname_field() throws Throwable {
		inputValues(pom.booking().getLastName(), "Raja");
	}

	@When("^user enter the valid Billing Address in the Billing Address field$")
	public void user_enter_the_valid_Billing_Address_in_the_Billing_Address_field() throws Throwable {
		String address = FileReaderManager.getInstanceCR().getAddress();
		inputValues(pom.booking().getAddress(), address);
	}

	@When("^user enter the valid Credit card number in the Credit card No field$")
	public void user_enter_the_valid_Credit_card_number_in_the_Credit_card_No_field() throws Throwable {
		String creditcard = FileReaderManager.getInstanceCR().getCreditcard();
		inputValues(pom.booking().getCardNumber(), creditcard);
	}

	@When("^user select the valid Credit card Type in the given field$")
	public void user_select_the_valid_Credit_card_Type_in_the_given_field() throws Throwable {
		String cardType = FileReaderManager.getInstanceCR().getCardType();
		inputValues(pom.booking().getCardtype(), cardType);
	}

	@When("^user select the valid Expiry Date in the Month field$")
	public void user_select_the_valid_Expiry_Date_in_the_Month_field() throws Throwable {
		String cardExpiryMonth = FileReaderManager.getInstanceCR().getCardExpiryMonth();
		selectValue(pom.booking().getCardexp(), cardExpiryMonth);
		// inputValues(pom.booking().getCardexp(), cardExpiryMonth);

	}

	@When("^user select the valid Expiry Date in the year field$")
	public void user_select_the_valid_Expiry_Date_in_the_year_field() throws Throwable {
		String cardExpiry = FileReaderManager.getInstanceCR().getCardExpiry();
		inputValues(pom.booking().getExpYear(), cardExpiry);
	}

	@When("^user enter the valid CVV number in the CVV number field$")
	public void user_enter_the_valid_CVV_number_in_the_CVV_number_field() throws Throwable {
		String cvv = FileReaderManager.getInstanceCR().getCVV();
		inputValues(pom.booking().getCvv(), cvv);
	}

	@Then("^user clicks on the Book Now button$")
	public void user_clicks_on_the_Book_Now_button() throws Throwable {

		clickonelement(pom.booking().getBooknow());
	}

	@Given("^User navigate from Book hotel page$")
	public void user_navigate_from_Book_hotel_page() throws Throwable {

	}

	@When("^user scroll down to My Itinerary Button$")
	public void user_scroll_down_to_My_Itinerary_Button() throws Throwable {
		implicit(5);
		upAndDown(pom.booking().getItinerary());
	}

	@Then("^user clicks on the My Itinerary Button$")
	public void user_clicks_on_the_My_Itinerary_Button() throws Throwable {
		clickonelement(pom.booking().getItinerary());
	}

	@Given("^User navigate from Confimation page$")
	public void user_navigate_from_Confimation_page() throws Throwable {

	}

	@When("^user takes screen shot of the page$")
	public void user_takes_screen_shot_of_the_page() throws Throwable {
		String screenshot = FileReaderManager.getInstanceCR().getScreenshot();
		screenshot(screenshot);
	}

	@Then("^user clicks in logout button$")
	public void user_clicks_in_logout_button() throws Throwable {
		clickonelement(pom.booking().getLogout());
	}

}
