package newPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ExplicitlyWait {

	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/zeynabbabaei/Desktop/Selenium-WebDriver/BrowserDrivers/chromedriver100");
  
		driver = new ChromeDriver();
		driver.get("https://www.amazon.ca");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		// ------------------------------------- PageTimeLoad ---------------------
		/// page time oad is waiting for page
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
		
		
		// ------------------------------------- ImplicitlyWaite ---------------------
       /// implicitly wait is waiting for all element

		///driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		
		// ------------------------------------- explicitly Wait ---------------------
       /// explicitly Wait is waiting for specific element 
		
		WebElement locatorElement = driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]/span[2]"));
		
		
		
		explicitWait(driver, locatorElement, 2);///this method is only for click webElement
	}
	
	public static void explicitWait(WebDriver driver, WebElement locator, int timeOut) {
		
		new WebDriverWait(driver, timeOut).ignoring(StaleElementReferenceException.class)
		.until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}
	
	


}
