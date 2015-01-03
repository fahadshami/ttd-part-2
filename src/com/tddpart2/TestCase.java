package com.tddpart2;

public class TestCase {
	String name;
	
	public TestCase(){
	}
	
	public TestCase(String name){
		this.name = name;
	}
	public String run(){
		return this.name;
	}
}
