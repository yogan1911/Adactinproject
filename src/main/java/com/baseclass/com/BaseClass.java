package com.baseclass.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;
	public static Actions a;
	public static JavascriptExecutor js;
	public static File f;
	public static Select s1;

	public static void inputValues(WebElement element, String str) {
		element.sendKeys(str);
	}

	public static void clickonelement(WebElement element) {
		element.click();
	}

	public static void cleardata(WebElement element) {
		element.clear();
	}

	public static void selectedIs(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println(selected);
	}

	public static void IsEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
	}

	public static void IsDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
	}

	public static void closethepage() {
		driver.close();
	}

	public static void quitthebrowser() {
		driver.quit();
	}

	public static void tonavigate(String url) {
		driver.navigate().to(url);
	}

	public static void backnavigation(String url) {
		driver.navigate().back();
	}

	public static void forwardnavigation(String url) {
		driver.navigate().forward();
	}

	public static void freshen(String url) {
		driver.navigate().refresh();
	}

	public static void pageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

	public static String pageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public static void btnClick(WebElement element) {
		element.click();
	}

	public static void dragDrop(WebElement src, WebElement dest) {
		a.dragAndDrop(src, dest).perform();
	}

	public static void mouseRightClick(WebElement element) {
		a.contextClick(element).click();
	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static void scrollUp(WebElement element) {

		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);

	}

	public static void upAndDown(WebElement element) {

		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);

	}

	public static String text(WebElement element) {
		String txt = element.getText();
		return txt;
	}

	public static String Attribute(WebElement element) {

		String attr = element.getAttribute("value");

		return attr;

	}

//	public static void selectfirstOption() {
//
//	}

	public static void implicit(int i) {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	public static void explicitwait(long seconds, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void mouseover(WebElement element) {

		a = new Actions(driver);
		a.moveToElement(element).perform();

	}

	public static void Frames(WebElement iframe) {
		driver.switchTo().frame(0);
	}

	public static void switchToFrame(String e) {
		driver.switchTo().frame(e);
	}

	public static void simplealert() {
		Alert simplealert = driver.switchTo().alert();
		simplealert.accept();
	}

	public static void confirmalert() {
		Alert confirmalert = driver.switchTo().alert();
		confirmalert.accept();
	}

	public static void promptalert() {
		Alert promptalert = driver.switchTo().alert();
		promptalert.accept();
	}

	public static Set<String> window() {
		Set<String> win = driver.getWindowHandles();
		return win;
	}

	public static void selectText(WebElement element, String txt) {
		s1 = new Select(element);
		s1.selectByVisibleText(txt);

	}

	public static void selectIndex(WebElement element,int ind) {
		s1 = new Select(element);
		s1.selectByIndex(ind);

	}

	public static void selectValue(WebElement element, String value) {
		s1 = new Select(element);
		s1.selectByValue(value);
	}

	public static void robot(WebElement element) throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static WebDriver browserLaunch(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Yogan\\eclipse-workspace\\MavenProject\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Yogan\\eclipse-workspace\\MavenProject\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.out.println("invalid browser,check the browser name");
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void screenshot(String pic) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Yogan\\eclipse-workspace\\AdactinMainProject\\Screenshot\\" + pic + ".png");
		FileUtils.copyFile(source, destination);
	}
}
