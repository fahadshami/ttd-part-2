package com.tddpart2;

public class TestResult 
{
	int runCount;
	
	TestResult()
	{
		this.runCount= 0;
	}
	public void testStarted()
	{
		this.runCount += 1;
	}
		
	public String summary()
	{
		return this.runCount+" run, 0 failed";
	}
		
}
