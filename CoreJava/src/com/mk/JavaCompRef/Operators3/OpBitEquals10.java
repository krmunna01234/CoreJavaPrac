package com.mk.JavaCompRef.Operators3;

//listing 10
class OpBitEquals10 {
	public static void main(String args[]) {
		int a = 1;
		int b = 2;
		int c = 3;

		a |= 4;
		b >>= 1;
		c <<= 1;
		a ^= c;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}
}
