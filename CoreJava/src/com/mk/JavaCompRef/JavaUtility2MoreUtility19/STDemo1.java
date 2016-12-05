package com.mk.JavaCompRef.JavaUtility2MoreUtility19;

//listing 1
//Demonstrate StringTokenizer.
import java.util.StringTokenizer;

class STDemo1 {
	static String in = "title=Java: The Complete Reference;" + "author=Schildt;" + "publisher=McGraw-Hill;"
			+ "copyright=2014";

	public static void main(String args[]) {
		StringTokenizer st = new StringTokenizer(in, "=;");

		while (st.hasMoreTokens()) {
			String key = st.nextToken();
			String val = st.nextToken();
			System.out.println(key + "\t" + val);
		}
	}
}
