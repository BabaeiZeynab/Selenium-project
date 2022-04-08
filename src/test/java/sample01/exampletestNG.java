package sample01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class exampletestNG {
	WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.id("bw-from")).sendKeys("Iran");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver",
				"/Users/zeynabbabaei/Desktop/Selenium-WebDriver/BrowserDrivers/chromedriver_new");
	  //driver.manage().window().maximize();
	  //driver.manage().deleteAllCookies();
	  driver.get("https://www.qatarairways.com/");
  }

  @AfterMethod
  public void afterMethod() {
	
	  
  }

}
