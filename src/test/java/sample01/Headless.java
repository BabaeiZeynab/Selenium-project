package sample01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless {
     static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"/Users/zeynabbabaei/Desktop/Selenium-WebDriver/BrowserDrivers/chromedriver_new");
	
		ChromeOptions option = new ChromeOptions();
     /// option.addArguments("window-size=1400,800");
      option.addArguments("--headless");
	

		driver = new ChromeDriver(option);
	
		
//		
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		
		String title = driver.getTitle();
		System.out.println(title);

	}

}
