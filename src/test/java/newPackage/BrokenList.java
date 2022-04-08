package newPackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrokenList {

	public static WebDriver driver;
	public static void main(String[] args) throws MalformedURLException, IOException{
		
		System.setProperty("webdriver.chrome.driver",
				"/Users/zeynabbabaei/Desktop/Selenium-WebDriver/BrowserDrivers/chromedriver_new");
		

	         driver = new ChromeDriver();
	         
	         driver.manage().window().maximize();
	         driver.manage().deleteAllCookies();
	         driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	         
	         driver.get("https://www.amazon.ca/");
	         
	         List<WebElement> activeList = new ArrayList<WebElement>();
	         
	         List<WebElement> linklist = driver.findElements(By.tagName("a"));
	         linklist.addAll(driver.findElements(By.tagName("img")));
	         
	         for(int i=0; i<linklist.size(); i++) {
	        	 if(linklist.get(i).getAttribute("href") != null) {
	        		 activeList.add(linklist.get(i));
	        	 }
	         }
	         
	         System.out.println("all the links : " + linklist.size());
	         System.out.println("all the active links: " + activeList.size());
	         
	         int brokenlinks = linklist.size() - activeList.size();
	         System.out.println("broken links: " + brokenlinks);
	         
	         
	         for(int j=0; j< activeList.size(); j++) {
	        	 HttpURLConnection connection =
	        			 (HttpURLConnection) new URL(activeList.get(j).getAttribute("href")).openConnection();
	        	 
	        	 connection.connect();
	        	 String response =  connection.getResponseMessage();
	        	 connection.disconnect();
//	        	 System.out.println("active links " + activeList.get(j).getAttribute("href") + "---> " + response);
	        	 System.out.println("linklist:   " + linklist.get(j).getAttribute("href") + "--->" + response);
	         }
	        
	       
	        
	}

}
