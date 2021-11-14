package com.projectclass.com;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.baseclass.com.BaseClass;
import com.pom.com.BookingPage;
import com.pom.com.LoginPage;
import com.pom.com.SearchHotel;

import okhttp3.internal.cache.DiskLruCache.Snapshot;

public class AdactinProject extends BaseClass {
	public static WebDriver driver;
    public static LoginPage lp;
    public static SearchHotel sh;
    public static BookingPage bp;
	public static void main(String[] args) throws IOException {
		driver = browserLaunch("chrome");
		launchUrl("https://adactinhotelapp.com/");
		lp = new LoginPage(driver);
		implicit(5);
		inputValues(lp.getUsername(), "Yogan123");
		inputValues(lp.getPassword(), "yogan@1911");
		clickonelement(lp.getLogin());
		System.out.println("Success");
		implicit(5);
	    sh = new SearchHotel(driver);
		selectText(sh.getSelectLocation(), "Sydney");
		selectText(sh.getSelecthotel(), "Hotel Sunshine");
		selectValue(sh.getRoomtype(), "Deluxe");
		selectValue(sh.getRoomcount(), "3");
		cleardata(sh.getinDate());
		inputValues(sh.getinDate(), "04/11/2021");
		cleardata(sh.getOutDate());
		inputValues(sh.getOutDate(), "06/11/2021");
		selectValue(sh.getPersonCount(), "2");
		selectValue(sh.getChildroom(), "3");
		clickonelement(sh.getSearch());
		implicit(10);
        bp = new BookingPage(driver);
		btnClick(bp.getButtonclick());
		clickonelement(bp.getContinuebooking());
		implicit(5);
		scrollUp(bp.getfirstName());
		inputValues(bp.getfirstName(), "Yogan");
		inputValues(bp.getLastName(), "Raja");
		inputValues(bp.getAddress(), "#no.6 ABC Street, Chennai");
		inputValues(bp.getCardNumber(), "5646 7632 6789 1234");
		selectValue(bp.getCardtype(), "VISA");
		implicit(5);
		selectValue(bp.getCardexp(), "6");
		selectValue(bp.getExpYear(), "2022");
		inputValues(bp.getCvv(), "453");
		clickonelement(bp.getBooknow());
		implicit(5);
		scrollUp(bp.getItinerary());
		clickonelement(bp.getItinerary());
		screenshot("adactinproject");
		clickonelement(bp.getLogout());
		System.out.println("Successfully completed...");
		/*waitExplicit(lod.getItinerary(),6);
		scrolltoElement(lod.getItinerary());
		clickIt(lod.getItinerary());
		screenshotPic("mybookingroom");
		clickIt(lod.getLogout());*/
		}
}
