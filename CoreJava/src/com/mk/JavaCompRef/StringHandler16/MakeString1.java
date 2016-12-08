package com.mk.JavaCompRef.StringHandler16;

//listing 1
//Construct one String from another.
class MakeString1 {
	public static void main(String args[]) {
		char c[] = { 'J', 'a', 'v', 'a' };
		String s1 = new String(c);
		String s2 = new String(s1);
			
		System.out.println(s1);
		System.out.println(s2);
	}
}
