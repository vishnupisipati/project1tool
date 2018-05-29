package com.javaclass.oops.statickeyword;

public class NewClass {
	static int counter = 0;
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static int multiply(int a, int b) {
		return a*b;
	}

}
