package com.mk.JavaCompRef.StringHandler16;

//listing 6
//Demonstrate equals() and equalsIgnoreCase().
class equalsDemo6 {
	public static void main(String args[]) {
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "Good-bye";
		String s4 = "HELLO";
		String s5 = new String("Hello");
		String s6 = new String("Hello");
		String s7 = new String("HELLO");
		System.out.println(s1 + " equals " + s2 + " -> " + s1.equals(s2));
		System.out.println(s1 + " equals " + s3 + " -> " + s1.equals(s3));
		System.out.println(s1 + " equals " + s4 + " -> " + s1.equals(s4));
		System.out.println(s1 + " equalsIgnoreCase " + s4 + " -> " + s1.equalsIgnoreCase(s4));
		
		/**
		 * In Java, when the “==” operator is used to compare 2 objects, 
		 * it checks to see if the objects refer to the same place in memory. 
		 * In other words, it checks to see if the 2 object names are 
		 * basically references to the same memory location.
		 */
		System.out.println(s1 + " == " + s2 + " -> " + s1==s2);
		System.out.println(s1 + " == " + s3 + " -> " + s1==s3);
		System.out.println(s1 + " == " + s4 + " -> " + s1==s4);
		System.out.println(s5 + " == " + s6 + " -> " + s5==s6);
		System.out.println(s1 + " == " + s6 + " -> " + s1==s6);
		System.out.println(s7 + " == " + s6 + " -> " + s7==s6);
		
		System.out.println("Intern Impl");
		System.out.println(s1 + " == " + s5 + " -> " + s1==s5);
		System.out.println(s1 + " == " + s5 + " with intern-> " + s1==s5.intern());
		s5 = s5.intern();
		System.out.println(s1 + " == " + s5 + " After intern-> " + s1==s5);
	}
}
