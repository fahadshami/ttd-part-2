package com.tddpart2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCaseTest extends TestCase 
{
	@Test
	public void testSuite()
	{
		com.tddpart2.TestSuite suite = new com.tddpart2.TestSuite();
		suite.add(new TestCase("testTemplateMethod"));
		suite.add(new TestCase("testResult"));
		suite.add(new TestCase("testFailedResultFormatting"));
		suite.add(new TestCase("testFailedResult"));
		suite.add(new TestCase("testSuite"));
		TestResult result= new TestResult();
		suite.run(result);
		System.out.println(result.summary());
		assertEquals("5 run, 2 failed", result.summary());
	}
		
}
