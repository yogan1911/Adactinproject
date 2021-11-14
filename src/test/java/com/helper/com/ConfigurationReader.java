package com.helper.com;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
	public static Properties p;

	public ConfigurationReader() throws Throwable {
		File f = new File(
				"C:\\Users\\Yogan\\eclipse-workspace\\AdactinMainProject\\src\\test\\java\\com\\properties\\com\\testdata.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);

	}

	public String getBrowser() {
		String browser = p.getProperty("Browser");
		return browser;
	}

	public String getURL() {
		String url = p.getProperty("URL");
		return url;
	}

	public String getLocation() {
		String location = p.getProperty("Location");
		return location;
	}

	public String getHotel() {
		String hotel = p.getProperty("HotelName");
		return hotel;
	}

	public String getRoomType() {
		String roomType = p.getProperty("RoomType");
		return roomType;
	}

	public String getRoomCount() {
		String roomcount = p.getProperty("RoomCount");
		return roomcount;
	}

	public String getCheckInDate() {
		String checkIndate = p.getProperty("CheckInDate");
		return checkIndate;
	}

	public String getCheckOutDate() {
		String checkOutdate = p.getProperty("CheckOutDate");
		return checkOutdate;
	}

	public String getAdultsroom() {
		String adultsRoom = p.getProperty("Adultsroom");
		return adultsRoom;
	}

	public String getChildRoom() {
		String childRoom = p.getProperty("Childroom");
		return childRoom;
	}

	public String getAddress() {
		String address = p.getProperty("Address");
		return address;
	}

	public String getCreditcard() {
		String creditCard = p.getProperty("CreditCard");
		return creditCard;
	}

	public String getCardType() {
		String cardType = p.getProperty("CardType");
		return cardType;
	}

	public String getCardExpiryMonth() {
		String cardExpiryMonth = p.getProperty("CardExpiryMonth");
		return cardExpiryMonth;
	}

	public String getCardExpiry() {
		String expiryYear = p.getProperty("CardExpiry");
		return expiryYear;
	}

	public String getCVV() {
		String cvv = p.getProperty("CVV");
		return cvv;
	}

	public String getScreenshot() {
		String screenshot = p.getProperty("Screenshot");
		return screenshot;
	}
}
