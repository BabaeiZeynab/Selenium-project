package sample01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

public class BootStrapDropDown {

  static WebDriver driver;
  
  @Test
  public void f() {
	  driver.findElement(By.xpath("//button[@id='dropdownMenuButton']")).click();
	  List<WebElement> list = driver.findElements(By.xpath("//div[@class='dropdown-menu show']/a"));
	  
	  System.out.println("size of dowpdown is: " + list.size());
	  
	  for(int i=0; i<list.size(); i++) {
		  System.out.println(list.get(i).getText());
		  
//		  if(list.get(i).getText().equals("Action")) {
//			  list.get(i).click();
//			  break;
//		  }
	  }
	  
	  
	  
	  
	  
  }
  
  
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
		System.setProperty("webdriver.chrome.driver",
				"/Users/zeynabbabaei/Desktop/Selenium-WebDriver/BrowserDrivers/chromedriver_new");
		
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless");
//		driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
  }

  
  
  
  @AfterMethod
  public void afterMethod() {
  }

}
