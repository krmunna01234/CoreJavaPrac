package com.mk.JavaCompRef.JavaUtility2MoreUtility19;

//listing 19
//Demonstrate left justification. 
import java.util.*;

class LeftJustify19 {
	public static void main(String args[]) {
		Formatter fmt = new Formatter();

		// Right justify by default
		fmt.format("|%10.2f|", 123.123);
		System.out.println(fmt);
		fmt.close();

		// Now, left justify.
		fmt = new Formatter();
		fmt.format("|%-10.2f|", 123.123);
		System.out.println(fmt);
		fmt.close();
	}
}
