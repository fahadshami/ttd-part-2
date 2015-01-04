package com.tddpart2;

import java.util.ArrayList;

public class TestSuite 
{
	ArrayList<TestCase> tests = null;
	TestSuite()
	{
		this.tests = new ArrayList<TestCase>();
	}
	public void add(TestCase test)
	{
		this.tests.add(test);
	}
	public void run(TestResult result)
	{
		for(TestCase test :tests)
		{
			test.run(result);
		}
	}
	
		
}
