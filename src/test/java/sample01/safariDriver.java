package sample01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class safariDriver {
  
	static WebDriver driver;
	public static void main(String[] args) {
		 
//		
//		System.setProperty("webdriver.safari.driver",
//				"/Users/zeynabbabaei/Desktop/Selenium-WebDriver");
		driver = new SafariDriver();
		
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	
		driver.get("https://www.google.com/");

	}

}
