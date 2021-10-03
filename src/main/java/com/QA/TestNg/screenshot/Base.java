package com.QA.TestNg.screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;
	
	public static void initialization()
	{
		System.setProperty("webdriver.chrome.driver", "C:/SeleniumDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
	}
	
	//method to capture screenshot
	public  void takeScreenshotForFailedTCS(String methodName)
	{
		File screenshotImage = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			//if we run more than one failed tests, it will provide only one screenshot bcz eveytime it will override
			//FileUtils.copyFile(screenshotImage, new File("C:/Users/Welcome/git/DemoRepo/screenshots/testFailure.jpg"));
			FileUtils.copyFile(screenshotImage, new File("C:/Users/Welcome/git/DemoRepo/screenshots/" + methodName + ".jpg"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
