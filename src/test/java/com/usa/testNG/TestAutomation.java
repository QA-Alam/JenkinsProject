package com.usa.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class TestAutomation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200",
				"--ignore-certificate-errors", "--silent");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.zoopla.co.uk/find-agents/");
		//driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		
		  WebElement ele = driver.findElement(By.id("search-input-location"));
		            ele.sendKeys("New York");	            
		            ele.sendKeys(Keys.ENTER);
		            	
		  String url = "https://www.zoopla.co.uk/find-agents/";   		 
		  Assert.assertEquals(url, driver.getCurrentUrl());
		  System.out.println("Test is pass ");
		
		
		

	}

}
