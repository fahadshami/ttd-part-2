package com.tddpart2;

import static org.junit.Assert.*;

//import org.junit.Before;
import org.junit.Test;

public class TestCaseTest extends TestCase 
{
//	WasRun test;
	
	@Test
	public void testFailedResult()
	{
		WasRun test= new WasRun("testBrokenMethod");
		TestResult result= test.run();
		System.out.println(result.summary());
		//providing 0 failed to verify the test pass
		assertEquals("1 run, 0 failed", result.summary());
	}
		
//	@Before
//	public void setUp()
//	{
//		this.test= new WasRun("testMethod");
//	}
//	@Test
//	public void testWasRun()
//	{
//		System.out.println(test.wasRun);
//		assertEquals(false,test.wasRun);
//		test.testMethod();
//		System.out.println(test.wasRun);
//		assertEquals(true,test.wasRun);
//
//	}
//	@Test
//	public void testForMethodRun()
//	{
//		System.out.println(test.wasRun);
//		assertEquals(false,test.wasRun);
//		test.run();
//		System.out.println(test.wasRun);
//		assertEquals(true,test.wasRun);
//
//	}
//	@Test
//	public void testRunning() 
//	{
//		this.test.run();
//		System.out.println(this.test.wasRun);
//		assertEquals(true,test.wasRun);
//	}
	
}

