package com.javaclass.oops;

public class Person {
	private int age;
	public void setAge(int ag) {
		if(ag<100 && ag>0) {
			age = ag;
		}
		
	}
	String name;
	void display() {
		System.out.println("The person name is:"+name +
				"The person age is:" +age);
	}
	
	

	}
