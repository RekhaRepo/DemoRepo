package com.QA.TestNG.dataprovider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EbayRegistrationTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:/SeleniumDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F");
	}
	//Exactly name of test data excel sheet 
	//Exactly no of columns in Excel sheet should provide exact no of input parameters
	@Test(dataProvider="testdata")
	public void halfEbayRegistrationTest(String firstName,String lastName,String email,String password) {
		driver.findElement(By.xpath("//*[@id='firstname']")).clear();
		driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys(firstName);
		
		driver.findElement(By.xpath("//*[@id='lastname']")).clear();
		driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys(lastName);
		
		driver.findElement(By.xpath("//*[@id='Email']")).clear();
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys(email);
		
		driver.findElement(By.xpath("//*[@id='password']")).clear();
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);
		
		driver.findElement(By.xpath("//*[@id='EMAIL_REG_FORM_SUBMIT']")).click();
		
		
		
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
