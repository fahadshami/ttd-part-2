package com.tddpart2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCaseTest extends TestCase 
{
	WasRun test;
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
	public void setUp()
	{
		this.test= new WasRun("testMethod");
	}
	@Test
	public void testRunning() 
	{
		setUp();//should be called polymorphically
		this.test.run();
		System.out.println(this.test.wasRun);
		assertEquals(true,test.wasRun);
	}
	@Test
	public void testSetUp(){
		setUp();
		this.test.run();
		assertEquals(true,test.wasSetUp);
	}
}

