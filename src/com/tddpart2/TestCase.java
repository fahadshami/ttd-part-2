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

	public void run()
	{
		try 
		{
			Method func = this.getClass().getMethod(this.name);
			func.invoke(this,new Object[0]);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
