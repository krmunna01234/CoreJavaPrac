package com.mk.JavaCompRef.StringHandler16;

//listing 20
//Demonstrate replace()
class replaceDemo20 {
	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer("This is a test.");

		sb.replace(5, 7, "was");
		System.out.println("After replace: " + sb);
	}
}
