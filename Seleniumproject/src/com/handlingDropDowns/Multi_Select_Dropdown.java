package com.handlingDropDowns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Select_Dropdown {
	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./BrowserExe_Files/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.ebay.com/");
		
		WebElement list = driver.findElement(By.id("gh-cat"));
		Select ele = new Select(list);
		System.out.println(ele.isMultiple());
		
		ele.selectByIndex(1);
		Thread.sleep(3000);
		ele.selectByIndex(2);
		Thread.sleep(3000);
		ele.selectByIndex(3);
		Thread.sleep(3000);
		ele.selectByIndex(4);
		Thread.sleep(3000);
		ele.selectByIndex(5);
		Thread.sleep(3000);
		
		
		ele.deselectAll();
		
		
	}
	
}
			
	                        
		
		
		
		



