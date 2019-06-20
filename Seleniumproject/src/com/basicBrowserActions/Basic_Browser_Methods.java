package com.basicBrowserActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Browser_Methods {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "./BrowserExe_Files/chromedriver.exe");
		
		// WebDriver driver= new Chrome Driver();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		// String s1= driver.get Title();
		// System.out.println(s1);
		
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().to("http://www.ebay.com/");
		
		// String s2= driver.getTitle();
		// System.out.println(s2);
		
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().back();
		String s3 = driver.getTitle();
		System.out.println(s3);
		// System.out.println(driver.getTitle());
		driver.navigate().forward();
		//String s4 = driver.getTitle();
		//System.out.println(s4);
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
		driver.close();

	}

}
