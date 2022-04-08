package newPackage;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScreenShot {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "/Users/zeynabbabaei/Desktop/Selenium-WebDriver/BrowserDrivers/chromedriver100");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("__headless");
		driver = new ChromeDriver(options);

		driver.get("http://www.google.com");
		driver.manage().window().maximize();

		File serfFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(serfFile, new File("/Users/zeynabbabaei/Desktop/screenShot/screen.png"));





	}
	//	
	//	public static void ScreenShot(String fileName) throws IOException {
	////		
	////     
	////    // 1- Convert WebDriver object to TakeScreenshot
	////		
	////		TakesScreenshot screenshot = ((TakesScreenshot)driver);
	////		
	////	//// 2- call getScreesnShotAs to create image file
	////		
	////		 File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
	////		
	////		/// 3- move image to new destination 
	////		 
	////		 File desFile = new File("fileWithPath");
	////		 
	////		 // 4- Copy file
	////		 FileUtils.copyFile(srcFile, desFile);
	////		 
	////		
	////		
	//		
	//		/////------------------------Take Screen Shot-----------------------------
	//		
	//		////-------------------------Easy Way to define TakeScreenshot------------
	//		 
	//		 
	////		 
	////		 File serfFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	////		 FileUtils.copyFile(serfFile, new File("/Users/zeynabbabaei/Desktop/screenShot/screen.png"));
	////	
	//	}

}
