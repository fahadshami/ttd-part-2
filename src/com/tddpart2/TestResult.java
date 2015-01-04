package com.tddpart2;

public class TestResult 
{
	int runCount;
	int errorCount;
	
	TestResult()
	{
		runCount = 0;
		errorCount = 0;
	}
	public void testStarted()
	{
		this.runCount += 1;
	}
	public int testFailed()
	{
		return this.errorCount+=1;
	}	
	public String summary()
	{
		return this.runCount+" run, "+this.errorCount+" failed";
	}
		
}
