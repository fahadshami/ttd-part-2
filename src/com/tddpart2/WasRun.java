package com.tddpart2;

public class WasRun extends TestCase
{
	boolean wasRun;
	boolean wasSetUp;
	
	public WasRun(String name)
	{
		 super(name);
		 this.wasRun= false;
	}
	public void testMethod()
	{
		this.wasRun= true;
	}
	public void setUp()
	{
		this.wasRun= false;
		this.wasSetUp= true;
	}
}

