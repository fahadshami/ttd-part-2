package com.tddpart2;

import java.lang.reflect.Method;

public class TestCase 
{
	String name;
	//Need a default constructor for the JUnit
	public TestCase()
	{
		
	}
	public TestCase(String name)
	{
		this.name = name;
	}

	public TestResult run()
	{
		TestResult result = new TestResult();
		result.testStarted();
		this.setUp();
		try 
		{
			
			Method func = this.getClass().getMethod(this.name);
			func.invoke(this,new Object[0]);
			this.tearDown();
		} catch (Exception e)
		{
			result.testFailed();
			e.printStackTrace();
		}
		return result;
	}
	public void setUp()
	{
	}
	public void tearDown()
	{
		
	}
}
