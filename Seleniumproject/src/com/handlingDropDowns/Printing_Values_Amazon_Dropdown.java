package com.handlingDropDowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Printing_Values_Amazon_Dropdown {
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./BrowserExe_Files/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		
		
		// First Identify the Drop-down Box.

		WebElement ele1 = driver.findElement(By.id("searchDropdownBox"));

		// To select an option, we have to use select class

		Select ele2 = new Select(ele1);

		List<WebElement> opt = ele2.getOptions();
		int total = opt.size();
		System.out.println("No.of Options available in the Drop-down are  " +total);
		
		 for (WebElement listelements : opt)
		 {
			                String menulist = listelements.getText();
			                System.out.println(menulist);	
			                
		}
		
			
	}
	
}
