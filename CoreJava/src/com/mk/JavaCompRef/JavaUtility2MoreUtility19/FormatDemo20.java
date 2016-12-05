package com.mk.JavaCompRef.JavaUtility2MoreUtility19;

//listing 20
//Demonstrate the space format specifiers. 
import java.util.*;

class FormatDemo20 {
	public static void main(String args[]) {
		Formatter fmt = new Formatter();

		fmt.format("% d", -100);
		System.out.println(fmt);
		fmt.close();

		fmt = new Formatter();
		fmt.format("% d", 100);
		System.out.println(fmt);
		fmt.close();

		fmt = new Formatter();
		fmt.format("% d", -200);
		System.out.println(fmt);
		fmt.close();

		fmt = new Formatter();
		fmt.format("% d", 200);
		System.out.println(fmt);
		fmt.close();
	}
}
