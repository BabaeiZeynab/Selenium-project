package sample01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class dropDown {
	
	static WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver",
				"/Users/zeynabbabaei/Desktop/Selenium-WebDriver/BrowserDrivers/chromedriver_new");
		

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		ChromeOptions options = new ChromeOptions();
//		options.setHeadless(false);
//		driver = new ChromeDriver(options);
		driver = new ChromeDriver();
		
		driver.get("http://demo-store.seleniumacademy.com/");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  Select select = new Select(driver.findElement(By.id("select-language")));
	  select.selectByIndex(2);
  }

}
