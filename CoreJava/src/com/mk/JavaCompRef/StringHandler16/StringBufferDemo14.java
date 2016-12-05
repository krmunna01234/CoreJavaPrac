package com.mk.JavaCompRef.StringHandler16;

//listing 14
//StringBuffer length vs. capacity.
class StringBufferDemo14 {
	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer("Hello");

		System.out.println("buffer = " + sb);
		System.out.println("length = " + sb.length());
		System.out.println("capacity = " + sb.capacity());
	}
}
