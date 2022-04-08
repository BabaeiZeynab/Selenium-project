package newPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SwitchToWindow {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/zeynabbabaei/Desktop/Selenium-WebDriver/BrowserDrivers/chromedriver100");

		driver = new ChromeDriver();
		driver.get("http://guidebook.seleniumacademy.com/Window.html");
		driver.manage().window().maximize();
		
		


	}

}
