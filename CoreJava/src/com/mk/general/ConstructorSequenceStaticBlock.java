package com.mk.general;

class SuperTestClass {

	static {
		System.out.println("Super class static block");
	}

	{
		System.out.println("Super class init block");
	}

	SuperTestClass() {

	}

	/*SuperTestClass(String str) {

	}*/
}

class ChildClass extends SuperTestClass {

	/*ChildClass() {
		System.out.println("ChildClass default constructor");
	}*/

	ChildClass(String str) {
		//super(str);
		System.out.println("ChildClass paramter Constructor");
	}

	static {
		System.out.println("Child class static block");
	}

	{
		System.out.println("child class init block");
	}
}

public class ConstructorSequenceStaticBlock {

	public static void main(String[] args) {

		//ChildClass cc = new ChildClass();

	}

}
