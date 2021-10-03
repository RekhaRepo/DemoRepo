package com.QA.TestNG.IAnnotationTransformer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTests {
	
	@Test
	public void test1()
	{
		Assert.assertTrue(false);
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(true, true);
	}

}
