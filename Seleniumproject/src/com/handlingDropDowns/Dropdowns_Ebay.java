package com.handlingDropDowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns_Ebay {
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./BrowserExe_Files/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.ebay.com/");
		
		
		//Identify the dropdown
		
		WebElement ele= driver.findElement(By.id("gh-cat")); 
		
		//we have to use select class to choose an option
		
		Select ele1=new Select(ele);
		
		//finding list of elements
		
		 List<WebElement>  ele2 = ele1.getOptions();
		 int list = ele2.size();
		 System.out.println("No. of available Options are  " +list);
		 
		 for  (WebElement menulist : ele2)
		 
		 {
			                         String list1 = menulist.getText();
			                         System.out.println(list1);
		}
		 			
				
	}
	

}
