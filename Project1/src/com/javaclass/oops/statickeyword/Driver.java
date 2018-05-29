package com.javaclass.oops.statickeyword;

public class Driver {

	public static void main(String[] args) {
		NewClass n1 = new NewClass();
		n1.name = "java";
		n1.age = 20;
		NewClass n2 = new NewClass();
		n2.name = "class";
		n2.age = 22;
		NewClass.counter++; // The advantage of the static keyword is that we can call the static variable as --------ClassName.staticvariableName------- unlike other variables.....
		System.out.println (NewClass.counter);
		NewClass.multiply(2, 3);
		System.out.println(NewClass.multiply(2, 3));

	}

}
