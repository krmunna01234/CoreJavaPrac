package com.mk.general;

class Parent {
	void doPrint() {
		System.out.println("Parent Class");
	}
}

class Child extends Parent {
	void doPrint() {
		System.out.println("Child Class");
	}
}

public class ParentChildObject {
	public static void main(String as[]) {
		Parent p = new Child();
		Parent c = (Parent) p;
		c.doPrint();

		Parent p1 = new Child();
		Child c1 = (Child) p1;
		c1.doPrint();
		
		Parent p2 = new Parent();
		Child c2 = (Child) p2;
		c2.doPrint();
	}

}
