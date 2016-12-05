package com.mk.JavaCompRef.JavaUtility2MoreUtility19;

//listing 16
//Demonstrate a field-width specifier. 
import java.util.*;

class FormatDemo16 {
	public static void main(String args[]) {
		Formatter fmt = new Formatter();

		fmt.format("|%f|%n|%12f|%n|%012f|", 10.12345, 10.12345, 10.12345);

		System.out.println(fmt);

		fmt.close();
	}
}
