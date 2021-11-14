package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage {
	public static WebDriver driver;
	public BookingPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
		
	}
	@FindBy(xpath = "//input[@name='radiobutton_0']")
	private WebElement buttonclick;
	
	@FindBy(xpath = "//input[@name='continue']")
	private WebElement continuebooking;
	
	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement firstName;
	
	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement lastName;
	
	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement address;
	
	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement CardNumber;
	
	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement cardtype;
	
	@FindBy(id = "cc_exp_month")
	private WebElement cardexp;
	
	@FindBy(xpath = "//select[@name='cc_exp_year']")
	private WebElement expYear;
	
	@FindBy(xpath = "//input[@name='cc_cvv']")
	private WebElement cvv;
	
	@FindBy(xpath = "//input[@name='book_now']")
	private WebElement Booknow;
	
	@FindBy(xpath="//input[@name='my_itinerary']")
	private WebElement itinerary;
	
	@FindBy(xpath = "//input[@name='logout']")
	private WebElement logout;
	
	public WebElement getButtonclick() {
		return buttonclick;
	}
	public WebElement getContinuebooking() {
		return continuebooking;
	}
	
	public WebElement getfirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCardNumber() {
		return CardNumber;
	}
	public WebElement getCardtype() {
		return cardtype;
	}
	public WebElement getCardexp() {
		return cardexp;
	}
	public WebElement getExpYear() {
		return expYear;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBooknow() {
		return Booknow;
	}
	public WebElement getLogout() {
		return logout;
	}
	public WebElement getItinerary() {

		return itinerary;
	}
}
