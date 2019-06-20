package com.basicBrowserActions;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestChromeBrowser {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./BrowserExe_Files/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		if  (title.contains("Bestbuy"))
				{
			     System.out.println("Test case passed");
				}
		else
		{
			   System.out.println("Test case failed");
		}
		
		
		driver.close();
						
	}

}
