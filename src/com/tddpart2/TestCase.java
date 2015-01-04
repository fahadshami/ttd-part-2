package com.tddpart2;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Method;

public class TestCase 
{
	String name;
	TestResult result;
	public TestCase()
	{
		
	}
	public TestCase(String name)
	{
		this.name = name;
	}

	public void run(TestResult result)
	{
		result.testStarted();
		this.setUp();
		try 
		{
			Method func = this.getClass().getMethod(this.name);
			func.invoke(this,new Object[0]);
		} catch (Exception e)
		{
			result.testFailed();
			e.printStackTrace();
		}
		this.tearDown();
	}
	public void setUp()
	{
		this.result= new TestResult();
	}
	public void tearDown()
	{
		
	}
	public void testTemplateMethod()
	{
		WasRun test= new WasRun("testMethod");
		test.run(this.result);
		assertEquals("setUp testMethod tearDown ",test.log);
	}
		
	public void testResult()
	{
		WasRun test= new WasRun("testMethod");
		test.run(result);
		assertEquals("1 run, 0 failed",result.summary());
	}
	public void testFailedResult()
	{	
		WasRun test= new WasRun("testBrokenMethod");
		test.run(result);
		assertEquals("1 run, 1 failed",result.summary());
	}
	public void testFailedResultFormatting()
	{	
		result.testStarted();
		result.testFailed();
		assertEquals("1 run, 1 failed",result.summary());
	}
}
