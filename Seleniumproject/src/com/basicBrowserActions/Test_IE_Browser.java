package com.basicBrowserActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test_IE_Browser {
	
	public static void main(String[] args) throws Exception {
		
		//WebDriver  driver;
		
		System.setProperty("webdriver.gecko.driver","./BrowserExe_Files/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
								
		//System.setProperty("webdriver.ie.driver", "./BrowserExe_Files/IEDriverServer.exe");
		
		//WebDriver driver = new InternetExplorerDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(3000);
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		if (title.contains("Google")) 
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
	


