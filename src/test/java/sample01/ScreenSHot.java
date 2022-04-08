package sample01;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenSHot {

	public static void main(String[] args) {
		
     WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "/Users/zeynabbabaei/Desktop/Selenium-WebDriver/BrowserDrivers/chromedriver100");
		driver = new ChromeDriver();

		driver.get("http://www.google.com");
		driver.manage().window().maximize();

	}

}
