package com.mk.JavaCompRef.StringHandler16;

//listing 12
//Demonstrate toUpperCase() and toLowerCase().

class ChangeCase12 {
	public static void main(String args[]) {
		String s = "This is a test.";

		System.out.println("Original: " + s);

		String upper = s.toUpperCase();
		String lower = s.toLowerCase();

		System.out.println("Uppercase: " + upper);
		System.out.println("Lowercase: " + lower);
	}
}