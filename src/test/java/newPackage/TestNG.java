package newPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class TestNG  {
	
	WebDriver driver;
	
//  @Test(priority=1,groups="inputFrom")
//  public void test1() throws InterruptedException {
// driver.findElement(By.id("bw-from")).sendKeys("Iran");
//  
//}
//  
//  @Test(priority=2,groups="inputTo",dependsOnMethods="test1")
//  public void test2() {
//	  
//	 
//	  driver.findElement(By.id("bw-to")).sendKeys("Istanbul");
//  }
//  
	
	
	
   @Test(invocationCount=10)
   public void test3() {
	   int a=10;
	   int b=20;
	   int c= a+b;
	   System.out.println("sum is: "+ c);
   } 
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "/Users/zeynabbabaei/Desktop/Selenium-WebDriver/BrowserDrivers/chromedriver_new");
	  
	 ChromeOptions option = new ChromeOptions();
//	 option.addArguments("--headless");
//	 option.addArguments("window-size=1920x1080");
	 driver = new ChromeDriver();
	  
    
//       driver.get("https://www.qatarairways.com/");
       driver.manage().window().maximize();
   
       driver.manage().deleteAllCookies();
       driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  }
  
  

  @AfterMethod
  public void afterMethod() {
  }

}
