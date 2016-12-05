package com.mk.JavaCompRef.StringHandler16;

//listing 21
//Demonstrate replace()
class IndexOfDemo21 {
	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer("one two one");
		int i;

		i = sb.indexOf("one");
		System.out.println("First index: " + i);

		i = sb.lastIndexOf("one");
		System.out.println("Last index: " + i);
	}
}
