package com.basicBrowserActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basic_BrowserActions {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver", "./BrowserExe_Files/geckodriver.exe");
		
		driver = new FirefoxDriver();

		/*
		 
		 * System.setProperty("webdriver.chrome.driver", "./BrowserExe_Files/chromedriver.exe"); 
		 * Web Driver= new ChromeDriver();
 		 * System.setProperty("webdriver.ie.driver", "./BrowserExe_Files/iedriverserver.exe"); 
 		 * WebDriver driver = new InternetExplorerDriver();
 		 
		 */

		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/");
		
		Thread.sleep(3000);
		
		String s= driver. getCurrentUrl();
		System.out.println(s);
		
		//System.out.println(getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		// String s = driver.getTitle();
		// Sysout(s);
		
		driver.close();
		
	}

}
