package sample01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class mousehoverovr {
	
	WebDriver driver;
  @Test

  public void f() throws InterruptedException {
	  
	  WebElement element = driver.findElement(By.xpath("/html/body/div/div[2]/header/div/div[3]/nav/ol/li[5]/a"));
	  Actions action = new Actions(driver);
//	  action.moveToElement(element).perform();
	  
	  action.click().perform();
	 
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
		  System.setProperty("webdriver.chrome.driver", "/Users/zeynabbabaei/Desktop/Selenium-WebDriver/BrowserDrivers/chromedriver_new");
          driver = new ChromeDriver();
          driver.get("http://demo-store.seleniumacademy.com/");
      
  }
  @AfterMethod
  public void afterMethod() {
  }

}
