package com.mk.JavaCompRef.JavaUtility2MoreUtility19;

//listing 22
//Use automatic resource management with Formatter.
import java.util.*;

class FormatDemo22 {
	public static void main(String args[]) {

		try (Formatter fmt = new Formatter()) {
			fmt.format("Formatting %s is easy %d %f", "with Java", 10, 98.6);
			System.out.println(fmt);
		}
	}
}
