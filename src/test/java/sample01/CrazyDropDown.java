package sample01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class CrazyDropDown {
	WebDriver driver;

	@Test
	public void f() {


		//-----------------------------------------FINDING DROP DOWN USING STREAM------------------------------------------

		//This way my result print will be with space 
         //List<WebElement> allOptionList = driver.findElements(By.id("select-language"));

		///this way my print will be normal
				WebElement lanElements = driver.findElement(By.id("select-language"));
				Select select = new Select(lanElements);
				List<WebElement> allOptionList = select.getOptions();

		//get size of all option in drop down
        System.out.println("Number of options: " + allOptionList.size());
    
		
		
//		System.out.println("Number of options: "+  allOptionList.stream().count()); even wehen we use count it will show 1


		for(int i=0; i<allOptionList.size(); i++) {
			System.out.println(allOptionList.get(i).getText());
			if(allOptionList.get(i).getText().contains("German")) {
			allOptionList.get(i).click();
				break;
			}
	}

//////		
        //using stream 
//		allOptionList.stream()
//	.forEach(i-> {
//			System.out.println(i.getText());
//		if(i.getText().contains("German")) {
//				i.click();
//
//		}
//		});

		
////		allOptionList.stream()
////		.map(WebElemet -> {
////		if(WebElement.getText().equals("German")) {
////		WebElement.click();
////		}
////			
////	});
////	
//	
	



		
		//-----------------------------------------Questions ------------------------------------------
		
		
		// 1) what if My drop down is not <select can I still use it---> line 29 and 30
		

		/// 2) what if I wanna make map to make return type String print string in forEach
		///EXample : 
		//		allOptionList.stream()
		//		.map(s -> {
		//		   if(s.getText().startsWith("E")){
		//		   
		//	        s.click();	
		//	        }
		//         };)
		//		


		
		

		
		//-----------------------------------------VIP------------------------------------------
		
	     /////   The most important point is that we have to know what is out put of stream then map then filter 
		
		////   filter should return boolean otherwise it will not work
        ////   map(WebElement::getText()) --> here first we will write WebElement (Name of class) then
		///     method (getText()) which method should be related to class
		///    for example -----> map(String::toUpperCase())
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		




		//-----------------------------------------FINDING DROP DOWN FOR LOOP ------------------------------------------

		//		List<WebElement> lanElements = driver.findElements(By.id("select-language"));
		//
		//		for(int i=0; i<lanElements.size(); i++) {
		//			System.out.println("Before Trim");
		//			if(lanElements.get(i).getText().contains("German")) {
		//				lanElements.get(i).click();
		//				break;
		//			}
		//		}



		//-----------------------------------------FINDING NUMBER OF OPTIONS IN DROP DOWN ------------------------------------------

		//		WebElement lng=  driver.findElement(By.id("select-language"));
		//
		//         Select select = new Select(lng);
		//         List allOptionsList = select.getOptions();
		//         System.out.println("all options are: " + allOptionsList.size());





		//-----------------------------------------FINDING DROP DOWN WITH SELECT ------------------------------------------

		//		 WebElement lng=  driver.findElement(By.id("select-language"));

		//		 Select select = new Select(lng);
		//		 select.selectByVisibleText("German");


		//-----------------------------------------FINDING DROP DOWN WITH FOR LOOP with trem ------------------------------------------


		//				for(int j=0; j<languagesElements.size(); j++) {
		//					
		//					System.out.println(languagesElements.get(j).getText().trim());
		//					System.out.println(languagesElements.size());
		//						//languagesElements.get(j).click();
		//					
		//				}








	}


	@BeforeMethod
	public void beforeMethod() {

		System.setProperty("webdriver.chrome.driver", "/Users/zeynabbabaei/Desktop/Selenium-WebDriver/BrowserDrivers/chromedriver100");
		driver = new ChromeDriver();

		driver.get("http://demo-store.seleniumacademy.com/");
		driver.manage().window().maximize();

	}

	@AfterMethod
	public void afterMethod() {
		//		driver.quit();
	}

}
