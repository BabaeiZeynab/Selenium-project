package sample01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class iframeWindow {
	
	WebDriver driver;
  @Test

  public void f() throws InterruptedException {
	  
	  
	 
	   driver.findElement(By.cssSelector("a[title='Create an Account']")).click();
	   Set<String> windows = driver.getWindowHandles();
//	   System.out.println("window handel are: " + windows);
//	   Iterator<String> iterat = windows.iterator();
//	   String parent = iterat.next();
//	   String child = iterat.next();
//	   driver.switchTo().window(child);
	 
	   driver.findElement(By.id("firstname")).click();
	   driver.findElement(By.id("firstname")).sendKeys("safa");
	   



	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
		  System.setProperty("webdriver.chrome.driver", "/Users/zeynabbabaei/Desktop/Selenium-WebDriver/BrowserDrivers/chromedriver_new");
          driver = new ChromeDriver();
          driver.get("http://demo-store.seleniumacademy.com/customer/account/login/");
      
  }
  @AfterMethod
  public void afterMethod() {
  }

}
