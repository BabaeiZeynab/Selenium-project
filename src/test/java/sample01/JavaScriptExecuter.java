package sample01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class JavaScriptExecuter {
	
	WebDriver driver;
  @Test

  public void f() throws InterruptedException {
	  
	  JavascriptExecutor jsexe = (JavascriptExecutor)driver;
      driver.switchTo().frame("iframeResult");
//	  String script = "return document.title;";
//	  String title = (String)jsexe.executeAsyncScript(script);
//      System.out.println("title is " + title);
      
      
      ///// click 
      
//      driver.switchTo().frame("iframeResult");
//      jsexe.executeAsyncScript("myFunction()");
//      Thread.sleep(2000);
      

     /// highlighting 
      
      WebElement tryMe = driver.findElement(By.xpath("/html/body/button"));
      jsexe.executeScript("arguments[0].style.border = '3px solid green' ", tryMe);
	  
	  
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
