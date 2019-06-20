package com.handlingDropDowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printing_AllLink_Names {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./BrowserExe_Files/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/");
		
		
		List<WebElement> ele = driver.findElements(By.tagName("a"));
		
		int num = ele.size();
		System.out.println("The Total No.of the Links present are  "+num);
		
		for (WebElement webElement : ele) 
		
		{
			             String options = webElement.getText();
			             System.out.println(options);
			
		}
	         
		
		
	}

}
