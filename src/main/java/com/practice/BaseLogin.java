package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseLogin {

	public void getLogin() {
		
		
		
	 System.setProperty("webdriver.chrome.driver", "/Users/naeimuddin/Downloads/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/"); 
		driver.manage().window().maximize();
	WebElement signinbutton =	driver.findElement(By.xpath("//*[@clas='login']"));
		
	signinbutton.click();
	
	WebElement user =	driver.findElement(By.xpath("//*[@name='userName']"));
	user.sendKeys("smarttech");
	WebElement password =	driver.findElement(By.xpath("//*[@name='password']"));
	password.sendKeys("student");
	
	WebElement submitbutton =	driver.findElement(By.xpath("//*[@name='submit']"));
	  
	submitbutton	.click();
	
	}
	
	
	
	
	
}
