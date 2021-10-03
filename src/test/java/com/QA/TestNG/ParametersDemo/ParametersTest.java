package com.QA.TestNG.ParametersDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {
	
WebDriver driver;
	
	@Test
	@Parameters({ "browser", "url","firstName","lastName","emailid","password" })
	public void EbayRegistrationTest(String browser,String url,String firstName,String lastName,String emailid,String password) 
	{
		
		if(browser.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:/SeleniumDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(url);
		
		
		driver.findElement(By.xpath("//*[@id='firstname']")).clear();
		driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys(firstName);
		
		driver.findElement(By.xpath("//*[@id='lastname']")).clear();
		driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys(lastName);
		
		driver.findElement(By.xpath("//*[@id='Email']")).clear();
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys(emailid);
		
		driver.findElement(By.xpath("//*[@id='password']")).clear();
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);	
		
	}
	

}
