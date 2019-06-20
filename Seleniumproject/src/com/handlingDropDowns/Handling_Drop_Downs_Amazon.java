package com.handlingDropDowns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_Drop_Downs_Amazon {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./BrowserExe_Files/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		
		// First identify the drop down
		WebElement dropdownlist = driver.findElement(By.id("searchDropdownBox"));

		// We have to use select class to choose a value from the drop down
		Select sel = new Select(dropdownlist);
		

		// First Method ByVisibleText(" " );
		sel.selectByVisibleText("Amazon Devices");
		Thread.sleep(3000);
		

		// Second Method ByValue(" ");
 		 sel.selectByValue("search-alias=financial");
		 Thread.sleep(3000);
		 

		// Third Method ByIndex( int);
		sel.selectByIndex(5);
		Thread.sleep(3000);
		

	}
	
	

}
