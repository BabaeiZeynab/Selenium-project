package newPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class AssertMethod {
	WebDriver driver;
	
  @Test
  public void testTitle() {
	  String title = driver.getTitle();
       Assert.assertEquals(title, "Google", "title is not mached");
       ///if its not match we can write error message 
  }
  
  @Test
public void testLogo() {
	  boolean logo = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")).isDisplayed();
	  Assert.assertTrue(logo);
  }
  
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver",
				"/Users/zeynabbabaei/Desktop/Selenium-WebDriver/BrowserDrivers/chromedriver_new");
		
	  ChromeOptions option = new ChromeOptions();
	  option.addArguments("--headless");
     driver = new ChromeDriver(option);
	 driver.get("https://www.google.com/");
  }
  
  

  @AfterMethod
  public void afterMethod() {
  }

}
