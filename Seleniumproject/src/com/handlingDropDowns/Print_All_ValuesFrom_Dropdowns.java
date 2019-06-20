package com.handlingDropDowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Print_All_ValuesFrom_Dropdowns {
	
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./BrowserExe_Files/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		driver.get("http://www.newtours.demoaut.com/mercuryregister.php");
		
		//First identify the Drop-down Box.
		WebElement ele = driver.findElement(By.name("country"));
		
		
		//We have to use the Select class to choose an Option/a Value from the Drop-down Box.
		Select ele2 = new Select(ele);
		
		//To get the list of web elements
		
		List<WebElement> opt = ele2.getOptions();
		int count = opt.size();
		System.out.println("No. of Available Options in the Dropdown is   "+ count);
		
		
		for  (WebElement optionslist : opt)
			
		{
			                     String list1 = optionslist.getText();
			                     System.out.println(list1);
			
		}
		
		
	}
	

}
