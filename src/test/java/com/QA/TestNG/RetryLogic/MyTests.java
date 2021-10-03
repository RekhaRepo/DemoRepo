package com.QA.TestNG.RetryLogic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTests {
	
	
	
	@Test(retryAnalyzer = com.QA.Retry.Listeners.TestNg.RetryAnalyzerConcept.class)
	public void test1()
	{
		Assert.assertTrue(false);
	}
	
	@Test(retryAnalyzer = com.QA.Retry.Listeners.TestNg.RetryAnalyzerConcept.class)
	public void test2()
	{
		Assert.assertEquals(true, false);
	}

}
