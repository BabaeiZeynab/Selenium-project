package newPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovment {
	
       static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/zeynabbabaei/Desktop/Selenium-WebDriver/BrowserDrivers/chromedriver100");
		  
		driver = new ChromeDriver();
		driver.get("https://corporate.spicejet.com/PayLater.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
		
       driver.findElement(By.linkText("SpicePlus")).click();
		
 
	}

}
