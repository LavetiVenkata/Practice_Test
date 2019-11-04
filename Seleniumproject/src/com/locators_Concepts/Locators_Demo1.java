package com.locators_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Demo1 {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./BrowserExe_Files/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://www.ebay.com/");
		String s = driver.getTitle();
		System.out.println(s);
		
		driver.findElement(By.linkText("Toys")).click();
		Thread.sleep(2000);
		
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(2000);
		driver.close();
		
		System.out.println("Hello");

		
		
	}

}
