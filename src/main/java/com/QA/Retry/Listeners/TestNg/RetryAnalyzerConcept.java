package com.QA.Retry.Listeners.TestNg;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerConcept implements IRetryAnalyzer{

	int counter = 0;
	int maxRetryLimit = 3;
	public boolean retry(ITestResult result) {

		if(counter<maxRetryLimit)
		{
			counter++;
			return true;
		}
		
		return false;
	}

}
