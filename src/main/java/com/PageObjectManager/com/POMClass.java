package com.PageObjectManager.com;

import org.openqa.selenium.WebDriver;

import com.pom.com.BookingPage;
import com.pom.com.LoginPage;
import com.pom.com.SearchHotel;


public class POMClass {

public static WebDriver driver;
private LoginPage lp;
private BookingPage bp;
private SearchHotel sh;


public POMClass(WebDriver driver2) {
this.driver=driver2;
}
public LoginPage login() {
lp=new LoginPage(driver);
return lp;
}
public BookingPage booking() {
	bp = new BookingPage(driver);
	return bp;
	
}
public SearchHotel getSh() {
	sh = new SearchHotel(driver);
	return sh;
}
}
