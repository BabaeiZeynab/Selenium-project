package sample01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeadlessBrowser {
	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"/Users/zeynabbabaei/Desktop/Selenium-WebDriver/BrowserDrivers/chromedriver_new");
//		driver = new ChromeDriver();
//		driver = new HtmlUnitDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://demo-store.seleniumacademy.com/");
		String before = driver.getTitle();

		System.out.println("title before " + before);

		driver.findElement(By.id("search")).sendKeys("pants");
		driver.findElement(By.xpath("//button[@title='Search']")).click();

		String after = driver.getTitle();

		System.out.println("title before " + after);

	}

}
