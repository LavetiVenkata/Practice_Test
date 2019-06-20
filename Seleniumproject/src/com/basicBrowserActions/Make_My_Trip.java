package com.basicBrowserActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Make_My_Trip {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./BrowserExe_Files/chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Selenium");
		driver.findElement(By.name("lastName")).sendKeys("Automation");
		driver.findElement(By.name("phone")).sendKeys("123456");
		driver.findElement(By.id("userName")).sendKeys("test@test.com");
		Thread.sleep(2000);
		driver.findElement(By.name("address1")).sendKeys("12 commerce ave");
		driver.findElement(By.name("address2")).sendKeys("Suite A");
		Thread.sleep(2000);
		driver.findElement(By.name("city")).sendKeys("New York City");
		driver.findElement(By.name("state")).sendKeys("NY");
		driver.findElement(By.name("postalCode")).sendKeys("72145");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("test@test.com");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("test123");
		driver.findElement(By.cssSelector("input[name='confirmPassword']")).sendKeys("test123");
		Thread.sleep(2000);
		driver.findElement(By.name("register")).click();
		
	}
	
	
}
		
		
				
		
				
		
		
		
	


