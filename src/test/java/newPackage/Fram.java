package newPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fram {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		
		///------------------------------This part is for Browse------------------
		System.setProperty("webdriver.chrome.driver", "/Users/zeynabbabaei/Desktop/Selenium-WebDriver/BrowserDrivers/chromedriver100");
        driver = new ChromeDriver();
		driver.get("https://html.com/input-type-file");
		driver.manage().window().maximize();
		
		
		
		//never ever use click for browse button just send keys
		
		WebElement ChooseFile  =  driver.findElement(By.xpath("//input[@name='fileupload']"));
		ChooseFile.sendKeys("/Users/zeynabbabaei/Desktop/screenshot");
		
		///--------------------------this part is for alert---------------------
		
//		System.setProperty("webdriver.chrome.driver", "/Users/zeynabbabaei/Desktop/Selenium-WebDriver/BrowserDrivers/chromedriver100");
//        
//		driver = new ChromeDriver();
//	
		///driver.get("https://mail.rediff.com/cgi-bin/login.cgi?mobilelogin=1");
//
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//
//		Alert alert = driver.switchTo().alert();
//		String alertText =	alert.getText();
//		System.out.println("alert text is: " + alertText);
//		Thread.sleep(2000);
//		alert.accept();
		
	


	}

}
