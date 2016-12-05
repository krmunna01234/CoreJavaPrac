package com.mk.JavaCompRef.StringHandler16;

//listing 18
//Using reverse() to reverse a StringBuffer.
class ReverseDemo18 {
	public static void main(String args[]) {
		StringBuffer s = new StringBuffer("abcdef");

		System.out.println(s);
		s.reverse();
		System.out.println(s);
	}
}