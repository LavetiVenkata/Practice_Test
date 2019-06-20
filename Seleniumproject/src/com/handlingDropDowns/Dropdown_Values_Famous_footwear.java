package com.handlingDropDowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import ele.getOptions;

public class Dropdown_Values_Famous_footwear {
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./BrowserExe_Files/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.famousfootwear.com/");
		
		
		// Identify the dropdown box

		WebElement dropdown = driver.findElement(By.xpath("(//div[contains(text(),('Women'))])"));

		// To select an Option we have to use Select class

		Select ele = new Select(dropdown);
		
	         List<WebElement> ele2  = ele.getOptions();
	         int total = ele2.size();
	         System.out.println("No of available options in the drop down are  "+ total);
					
		
	}

}
