package sample01;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleTest {

     static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
		 System.setProperty("webdriver.chrome.driver",
					"/Users/zeynabbabaei/Desktop/Selenium-WebDriver/BrowserDrivers/chromedriver_new");
			
         driver = new ChromeDriver();
		 driver.get("https://www.google.com/");
		 
//			WebElement searchBox = driver.findElement(By.name("q"));
//			searchBox.click();
//			searchBox.sendKeys("java");
//			WebElement sugList = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul"));
//			Thread.sleep(5000);
//			System.out.println(sugList.findElements(By.tagName("li")).size());
			
			
   WebElement searchBox = driver.findElement(By.name("q"));
    searchBox.click();
	searchBox.sendKeys("java");
	WebElement sugList = driver.findElement(By.xpath("//ul[@role='listbox']"));
	Thread.sleep(5000);
List<WebElement> list = sugList.findElements(By.tagName("li"));
System.out.println("Lists are : " + list.size());
for(int i=0; i<list.size(); i++) {
	System.out.println(list.get(i).getText());
	}
	
		 

			
		
	}

}
