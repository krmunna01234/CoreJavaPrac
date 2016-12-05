package com.mk.JavaCompRef.ExceptionHandling10;

//listing 10
//Demonstrate throw.
class ThrowDemo10 {
	static void demoproc() {
		try {
			throw new NullPointerException("demo");
		} catch (NullPointerException e) {
			System.out.println("Caught inside demoproc.");
			throw e; // re-throw the exception
		}
	}

	public static void main(String args[]) {
		try {
			demoproc();
		} catch (NullPointerException e) {
			System.out.println("Recaught: " + e);
		}
	}
}
