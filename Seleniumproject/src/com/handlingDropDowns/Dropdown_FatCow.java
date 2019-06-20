package com.handlingDropDowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_FatCow {
	public static void main(String[] args) {
		WebDriver  driver;
		System.setProperty("webdriver.chrome.driver", "./BrowserExe_Files/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.fatcow.com/");
		
		//Identify the drop down ;  we have to use select class ; List webelement  ; for each loop
		
		WebElement dropdown = driver.findElement(By.id("countrySelect"));
		
		Select list = new Select(dropdown);
		
		List<WebElement> menulist = list.getOptions();
		
       	int listoptions = menulist.size();
		
		System.out.println(listoptions);
		
		
		for (WebElement listdetails : menulist) 
			
		{
			String listing = listdetails.getText();
			System.out.println(listing);
			
		}
	
		
	}

}
