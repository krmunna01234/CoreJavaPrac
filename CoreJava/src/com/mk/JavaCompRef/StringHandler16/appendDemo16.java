package com.mk.JavaCompRef.StringHandler16;

//listing 16
//Demonstrate append().
class appendDemo16 {
	public static void main(String args[]) {
		String s;
		int a = 42;
		StringBuffer sb = new StringBuffer(40);

		s = sb.append("a = ").append(a).append("!").toString();
		System.out.println(s);
	}
}
