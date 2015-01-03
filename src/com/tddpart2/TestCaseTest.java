package com.tddpart2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCaseTest extends TestCase {

//	public TestCaseTest(String name) {
//		super(name);
//		// TODO Auto-generated constructor stub
//	}
	@Test
	public void testWasRun(){
		WasRun test = new WasRun("testMethod");
		test.run();
		
	}
	@Test
	public void testRunning() {
		WasRun test= new WasRun("testMethod");
		assertTrue(!test.wasRun);
		test.run();
		assertFalse(test.wasRun);
	}

}
