package sample01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class jsExecuter {
	
	WebDriver driver;
  @Test
  public void f() {
	  JavascriptExecutor js = (JavascriptExecutor)driver;
//	  WebElement element = driver.findElement(By.xpath("//*[@id=\"newsletter-validate-detail\"]/div/div[3]/button/span/span"));
//	  js.executeScript("arguments[0].scrollIntoView(true);", element);
	   
	  WebElement highlight = driver.findElement(By.xpath("//*[@id=\"search\"]"));
	  js.executeScript("arguments[0].style.border='2px solid red'", highlight);  
	 
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "/Users/zeynabbabaei/Desktop/Selenium-WebDriver/BrowserDrivers/chromedriver_new");
      driver = new ChromeDriver();
      driver.get("http://demo-store.seleniumacademy.com/tori-tank-587.html");
  }

  @AfterMethod
  public void afterMethod() {
  }

}
