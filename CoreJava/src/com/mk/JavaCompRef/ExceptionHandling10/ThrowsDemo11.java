package com.mk.JavaCompRef.ExceptionHandling10;

//listing 11
//This program contains an error and will not compile.
class ThrowsDemo11 {
	static void throwOne() {
		System.out.println("Inside throwOne.");
		//throw new IllegalAccessException("demo");
	}

	public static void main(String args[]) {
		throwOne();
	}
}
