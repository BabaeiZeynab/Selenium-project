package sample01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class dragAndDrop {
	
	WebDriver driver;
  @Test
  public void f() {
	  driver.switchTo().frame(0);
	  WebElement drag = driver.findElement(By.id("draggable"));
	  WebElement drop = driver.findElement(By.id("droppable"));
	  
	  Actions action = new Actions(driver);
	  action.clickAndHold(drag).moveToElement(drop).build().perform();
	 
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "/Users/zeynabbabaei/Desktop/Selenium-WebDriver/BrowserDrivers/chromedriver_new");
      driver = new ChromeDriver();
      driver.get("https://jqueryui.com/droppable/");
  }

  @AfterMethod
  public void afterMethod() {
  }

}
