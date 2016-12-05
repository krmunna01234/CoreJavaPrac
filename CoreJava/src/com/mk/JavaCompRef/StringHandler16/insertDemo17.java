package com.mk.JavaCompRef.StringHandler16;

//listing 17
//Demonstrate insert().
class insertDemo17 {
	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer("I Java!");

		sb.insert(2, "like ");
		System.out.println(sb);
	}
}
