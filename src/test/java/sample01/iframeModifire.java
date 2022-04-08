package sample01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class iframeModifire {
	
	WebDriver driver;
  @Test

  public void f() throws InterruptedException {
	  
	  
	   driver.switchTo().frame("iframeResult");
	  driver.findElement(By.xpath("/html/body/button")).click();
     
	  driver.switchTo().alert().sendKeys("Hello from safa");
	  driver.switchTo().alert().accept();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
		  System.setProperty("webdriver.chrome.driver", "/Users/zeynabbabaei/Desktop/Selenium-WebDriver/BrowserDrivers/chromedriver_new");
          driver = new ChromeDriver();
          driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
      
  }
  @AfterMethod
  public void afterMethod() {
  }

}
