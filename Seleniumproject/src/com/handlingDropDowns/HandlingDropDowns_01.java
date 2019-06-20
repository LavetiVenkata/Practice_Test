package com.handlingDropDowns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDowns_01 {
	
	public static void main(String[] args) throws Exception {
		// WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./BrowserExe_Files/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.newtours.demoaut.com/mercuryregister.php/");
		
		// First identify the Drop-down Box
		WebElement dropdownlist = driver.findElement(By.xpath("//select[@name='country']"));
		

		// We have to use the Select class to choose an Option/a Value from the Drop-down Box.
		Select sel = new Select(dropdownlist);
		
		

		// First Method -- By Index(  int   );
		sel.selectByIndex(0);
		Thread.sleep(3000);
		
		
		//Second Method--By VisibleText("      ");
		sel.selectByVisibleText("UNITED KINGDOM");
		Thread.sleep(3000);
		
		
		
		//Third Method --By Value("   " );
		sel.selectByValue("234");
							
		
	}
	

}
