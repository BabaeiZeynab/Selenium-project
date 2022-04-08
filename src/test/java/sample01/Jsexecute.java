package sample01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jsexecute {

	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/zeynabbabaei/Desktop/Selenium-WebDriver/BrowserDrivers/chromedriver_new");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://demo-store.seleniumacademy.com/customer/account/login/");
	 
		WebElement element = driver.findElement(By.xpath("//button[@title='Login']"));
		
		flash(element, driver);

	}
	
	public static void flash(WebElement element, WebDriver driver) {
	
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String color = element.getCssValue("background");
		for(int i=0; i< 500; i++) {
			changeColor("rgb(0,200,0)", element, driver);
			changeColor(color, element,driver);
		}
	}
	
	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("argument[0].style.backgroundColor = '"+color+"'", element);
		
	}

}
