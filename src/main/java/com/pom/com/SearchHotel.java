package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchHotel {
	public static WebDriver driver;
	public SearchHotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
		
	}
	@FindBy(xpath = "//select[@name='location']")
	private WebElement SelectLocation;
	
	@FindBy(xpath = "//select[@name='hotels']")
	private WebElement Selecthotel;
	
	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement roomtype;
	
	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement roomcount;
	
	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement inDate;
	
	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement outDate;
	
	@FindBy(id="adult_room")
	private WebElement personCount;
	
	@FindBy(id="child_room")
	private WebElement childroom;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement search;
	
	public WebElement getSelectLocation() {
		return SelectLocation;
	}
	public WebElement getSelecthotel() {
		return Selecthotel;

	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getRoomcount() {
		return roomcount;
	}
	public WebElement getinDate() {
		return inDate;
	}
	public WebElement getOutDate() {
		return outDate;
	}
	public WebElement getPersonCount() {
		return personCount;
	}
	
	public WebElement getChildroom() {
		return childroom;
	}
	public WebElement getSearch() {
		return search;
	}
	
	}
	
	

