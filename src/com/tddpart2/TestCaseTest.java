package com.tddpart2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCaseTest extends TestCase 
{

	@Test
	public void testWasRun()
	{
		WasRun test = new WasRun("testMethod");
		System.out.println(test.wasRun);
		assertEquals(false,test.wasRun);
		test.testMethod();
		System.out.println(test.wasRun);
		assertEquals(true,test.wasRun);

	}
	@Test
	public void testForMethodRun()
	{
		WasRun test = new WasRun("testMethod");
		System.out.println(test.wasRun);
		assertEquals(false,test.wasRun);
		test.run();
		System.out.println(test.wasRun);
		assertEquals(true,test.wasRun);

	}
	
	@Test
	public void testRunning() 
	{
		WasRun test= new WasRun("testMethod");
		assertEquals(false,test.wasRun);
		test.run();
		assertEquals(true,test.wasRun);
	}
	
}

