package com.mk.JavaCompRef.StringHandler16;

//listing 13
//Demonstrate the join() method defined by String.
class StringJoinDemo13 {
	public static void main(String args[]) {

		String result = String.join(" ", "Alpha", "Beta", "Gamma");
		System.out.println(result);

		result = String.join(", ", "John", "ID#: 569", "E-mail: John@HerbSchildt.com");
		System.out.println(result);
	}
}
