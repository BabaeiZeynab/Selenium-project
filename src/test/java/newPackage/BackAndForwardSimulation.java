package newPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndForwardSimulation {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/zeynabbabaei/Desktop/Selenium-WebDriver/BrowserDrivers/chromedriver100");
  ////what is difference between navigate().to and get() both will launch URL but navigate() use for move to external URL 
		driver = new ChromeDriver();
		driver.get("https://www.amazon.ca");
		driver.manage().window().maximize();
		
		
		
		
		//-----------------------------------------Navigate----------------------------
		
//		Thread.sleep(2000);
//		driver.get("https://mvnrepository.com/artifact/org.sikuli/sikuli-api/1.2.0");
//		Thread.sleep(2000);
//
////		driver.navigate().to("https://www.amazon.ca");
//		driver.get("https://www.amazon.ca");
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		//this wll come back to back
//		driver.navigate().back();
//		///this navigate forward
//		driver.navigate().forward();
//		
//		///this will refresh page
//		driver.navigate().refresh();
		

		//-----------------------------------------Take Screen SHot----------------------------
		
		
			
//    File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
// 	FileUtils.copyFile(srcFile, new File("/Users/zeynabbabaei/Desktop/screenShot/shot.png"));

	}

}
