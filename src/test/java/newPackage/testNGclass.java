package newPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNGclass {

	WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "/Users/zeynabbabaei/Desktop/Selenium-WebDriver/BrowserDrivers/chromedriver100");
	      
//		 ChromeOptions option = new ChromeOptions();
//		 option.addArguments("--headless");
//		 option.addArguments("window-size=1920x1080");
		 driver = new ChromeDriver();
		 
	     driver.get("http://demo-store.seleniumacademy.com/");
	       
	       driver.manage().deleteAllCookies();
	       driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@Test(priority=1)
	public void test1() {
	
		driver.findElement(By.cssSelector("#bw-from")).sendKeys("Iran");
	}
////	
////	
////	@Test(priority=2)
////	public void test2() {
////	
////		driver.findElement(By.cssSelector("#bw-to")).sendKeys("Istanbul");
////	}
////	
////	
//	
	
}
