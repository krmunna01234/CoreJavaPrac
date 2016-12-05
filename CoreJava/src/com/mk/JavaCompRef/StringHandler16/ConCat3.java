package com.mk.JavaCompRef.StringHandler16;

//listing 3
//Using concatenation to prevent long lines.
class ConCat3 {
	public static void main(String args[]) {
		String longStr = "This could have been " + "a very long line that would have "
				+ "wrapped around.  But string concatenation " + "prevents this.";

		System.out.println(longStr);
	}
}
