package sample01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlashingElement {
     static WebDriver driver;
    
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"/Users/zeynabbabaei/Desktop/Selenium-WebDriver/BrowserDrivers/chromedriver_new");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://demo-store.seleniumacademy.com/customer/account/login/");
		WebElement user = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		WebElement passWord = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='2px solid red'", user);
		js.executeScript("arguments[0].style.border='2px solid red'", passWord);
		WebElement login = driver.findElement(By.xpath("//*[@id=\"send2\"]"));
		
//		flash(login,driver);
		generateAlart(driver, "this is alert");

	}
	
	
	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String color = element.getCssValue("background");
		for(int i=0; i<100; i++) {
			changeColor("rgb(0,200,0)", element, driver);
			changeColor(color, element, driver);
		}
		
	}
	
	public static void changeColor(String color, WebElement element, WebDriver driver ) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("argumnets[0].style.background = '" + color + "'",element );
		
		
	}
	
	public static void generateAlart(WebDriver driver, String message) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("alart('"+ message+"')");
		
	}

}
