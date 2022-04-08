package sample01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Tables {
	
	WebDriver driver;
  @Test

  public void f() throws InterruptedException {
	  
	  List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"main\"]/div[1]/div[4]/div[1]/div/div/div[1]/table/tbody/tr"));
	  List<WebElement> columns = driver.findElements(By.xpath("  //*[@id=\"main\"]/div[1]/div[4]/div[1]/div/div/div[1]/table/tbody/tr[2]/td"));
	  

	  System.out.println("number of rows " + rows.size());
	  System.out.println("number of columns " + columns.size());
	  
	  for(int i=1; i<rows.size(); i++) {
		  for(int j=1; j<columns.size(); j++){
			  
			 System.out.println(driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[4]"
			  		+ "/div[1]/div/div/div[1]/table/tbody/tr["+i+"]/td["+j+"]")).getText());
			  

		  }
		  
		  System.out.println("\n");
	  }
	 
  }
  @BeforeMethod
  public void beforeMethod() {
	  
		  System.setProperty("webdriver.chrome.driver", "/Users/zeynabbabaei/Desktop/Selenium-WebDriver/BrowserDrivers/chromedriver_new");
          driver = new ChromeDriver();
          driver.get("https://www.tgju.org/%D9%82%DB%8C%D9%85%D8%AA-%D8%AF%D9%84%D8%A7%D8%B1");
      
  }
  @AfterMethod
  public void afterMethod() {
  }

}
