package com.synchronization_Concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {
	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./BrowserExe_Files/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/vacationpackages?MDPCID=ALASKA-US.TPS.BRAND.VACATIONPACKAGES.PACKAGE");
		
		
		driver.findElement(By.name("FrAirport")).sendKeys("nyc");
		Thread.sleep(2000);
		driver.findElement(By.name("FrAirport")).sendKeys(Keys.DOWN);
		driver.findElement(By.name("FrAirport")).sendKeys(Keys.RETURN);
		
		
		driver.findElement(By.name("DestName")).sendKeys("Las Vegas");
		Thread.sleep(2000);
		//driver.findElement(By.name("DestName")).sendKeys("Keys.DOWN");
		//driver.findElement(By.name("DestName")).sendKeys("RETURN");
		
		
		driver.findElement(By.id("FH-fromDate")).click();
		driver.findElement(By.xpath("(//button[@data-day='30'] ) [1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("FH-toDate")).click();
		driver.findElement(By.xpath("//button[@data-day='5'] ")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("FH-searchButtonExt1")).click();
		
		
	  WebDriverWait wait = new WebDriverWait(driver,20);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='flex-link'])[1]"))).click();
	   
	   
		driver.findElement(By.xpath("(//a[@class='flex-link'])[1]")).click();
		Thread.sleep(3000);
		
				
		
	}
	
}
		
		
		
		
		
		
		

