package com.QA.verbose.concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestClass {

	public WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
	System.setProperty("webdriver.chrome.driver", "C:/SeleniumDrivers/chromedriver.exe");
	driver = new ChromeDriver();
	//driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	
	}
	
	@Test
	public void getTitleTest1()
	{
		String title = driver.getTitle();
		System.out.println("Title of the page is " + title);
		Assert.assertEquals(title,"Google");
		
	}
	@Test
	public void getTitleTest2()
	{
		String title = driver.getTitle();
		System.out.println("Title of the page is " + title);
		Assert.assertEquals(title,"Google");
		
	}
	@Test
	public void getTitleTest3()
	{
		String title = driver.getTitle();
		System.out.println("Title of the page is " + title);
		Assert.assertEquals(title,"Google");
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
