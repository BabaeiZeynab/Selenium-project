package sample01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadClass {
	   
	static WebDriver driver;

	public static void main(String[] args) throws Exception{
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("/Users/zeynabbabaei/eclipse-workspace/Maven2/src/test/java/sample01/test.properties");

		prop.load(ip);
		System.out.println("name is " + prop.getProperty("name"));
		System.out.println("age is "+prop.getProperty("age"));
		System.out.println("browser is " + prop.getProperty("browserName"));
		
		
	   if(prop.getProperty("browserName").equals("chrome")) {
		   System.out.println("chrome");
			System.setProperty("webdriver.chrome.driver", "/Users/zeynabbabaei/Desktop/Selenium-WebDriver/BrowserDrivers/chromedriver_new");
		     driver = new ChromeDriver();
	       driver.get("http://demo-store.seleniumacademy.com/vip.html");
	       driver.findElement(By.xpath(prop.getProperty("xpathInput"))).sendKeys(prop.getProperty("sendInput"));
	   }else
	   {
		   System.out.println("Error");
	   }
			
	
	
	
	
	
	
	
	
	
	
	
	}

}
