package com.QA.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass {
	
	@Test
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver", "C:/SeleniumDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F");
		System.out.println("@Test1 from TestClass1");
		
		driver.quit();
	}
	@Test
	public void test2()
	{
		System.out.println("@Test2 from TestClass1");
	}
	@Test
	public void test3()
	{
		System.out.println("@Test3 from TestClass1");
	}
	//adding comment from demoRepo Git repo on 27th Sep

}
