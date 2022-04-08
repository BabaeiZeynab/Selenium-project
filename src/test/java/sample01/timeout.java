package sample01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class timeout {
	WebDriver driver;
  @Test
  public void f() {
	WebElement elemnt = driver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[4]/a"));
	///driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	Actions action = new Actions(driver);
	action.moveToElement(elemnt).perform();
//	driver.manage().window().fullscreen();
	
	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofNanos(2));
	
	driver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[4]/ul/li[3]/a")).click();
	  
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
