package sample01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibility {
 
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

		
		///isDisplayed() method is for all element it will return true and false
		
		 Boolean subscrib = driver.findElement(By.xpath("//button[@title='Subscribe']")).isDisplayed();
		 System.out.println("subscrib " + subscrib);
		 
		 /// isEnable()

		 System.out.println("subscrib is anable ? " + subscrib);
		 
		 
	 }

}
