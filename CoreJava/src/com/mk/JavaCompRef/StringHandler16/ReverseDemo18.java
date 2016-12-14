package com.mk.JavaCompRef.StringHandler16;

//listing 18
//Using reverse() to reverse a StringBuffer.
class ReverseDemo18 {
	public static void main(String args[]) {
		StringBuffer s = new StringBuffer("abcdef");

		System.out.println(s);
		s.reverse();
		System.out.println(s);

		System.out.println("Through Loop");
		String str = "Hello World";
		String revStr = "";

		for (int i = str.length() - 1; i >= 0; --i) {
			revStr = revStr + str.charAt(i);
		}
		System.out.println(revStr);
		
		System.out.println("Using Recursion");
		System.out.println("Reverse of HelloWorld is: "+reverse("HelloWorld"));
	}

	private static String reverse(String s) {
		if (s.length() == 0)
			return "";
		return s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
	}
}