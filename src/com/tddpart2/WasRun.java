package com.tddpart2;

public class WasRun extends TestCase
{
	boolean wasRun;
	String log;
	public WasRun(String name)
	{
		 super(name);
		 this.wasRun= false;
	}
	public void testMethod()
	{
		this.wasRun= true;
		this.log += " testMethod";
	}
	public void setUp()
	{
		this.log="setUp";
	}
	public void tearDown()
	{
		this.wasRun= true;
		this.log += " tearDown";
	}
	public void testBrokenMethod() throws Exception
	{
		throw new Exception();
	}
}

