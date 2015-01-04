package com.tddpart2;

public class WasRun extends TestCase
{
	boolean wasRun;
	
	public WasRun(String name)
	{
		 super(name);
		 this.wasRun= false;
	}
	
	public void testMethod()
	{
		this.wasRun= true;
	}
	
}

