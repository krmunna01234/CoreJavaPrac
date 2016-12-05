package com.mk.JavaCompRef.ExceptionHandling10;

//listing 2
class Exc2 {
	static void subroutine() {
		int d = 0;
		int a = 10 / d;
	}

	public static void main(String args[]) {
		Exc2.subroutine();
	}
}