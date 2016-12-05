package com.mk.JavaCompRef.StringHandler16;

//listing 2
//Construct string from subset of char array.
class SubStringCons2 {
	public static void main(String args[]) {
		byte ascii[] = { 65, 66, 67, 68, 69, 70 };

		String s1 = new String(ascii);
		System.out.println(s1);

		String s2 = new String(ascii, 2, 3);
		System.out.println(s2);
		
		
		String str= new String("quick brown fox jumps over the lazy dog");
	       System.out.println("Substring starting from index 3:");
	       System.out.println(str.substring(3));
	       System.out.println("Substring starting from index 3:");
	       System.out.println(str.substring(3));
	       System.out.println("Substring starting from index 15 and ending at 20:");
	       System.out.println(str.substring(3, 5));
	}
}
