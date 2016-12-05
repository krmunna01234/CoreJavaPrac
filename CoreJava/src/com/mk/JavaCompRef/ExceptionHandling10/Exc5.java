package com.mk.JavaCompRef.ExceptionHandling10;

//listing 5
class Exc5 {
	public static void main(String args[]) {
		int a;
		try {
			a = 5;
		} catch (ArithmeticException e) {
			System.out.println("Exception: " + e);
			a = 0; // set a to zero and continue
		}
	}
}