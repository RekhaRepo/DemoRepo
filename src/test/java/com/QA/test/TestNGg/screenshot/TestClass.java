package com.QA.test.TestNGg.screenshot;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.QA.TestNg.screenshot.Base;
import com.QA.TestNg.screenshot.CustomListener;

@Listeners(CustomListener.class)
public class TestClass extends Base{
	
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
	}
	
	@Test
	public void screenshotLoginTest()
	{
		Assert.assertEquals(true,false);
	}
	@Test
	public void screenshotHomeTest()
	{
		Assert.assertEquals(true,false);
	}

	@Test
	public void screenshotContactsTest()
	{
		Assert.assertEquals(true,false);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
