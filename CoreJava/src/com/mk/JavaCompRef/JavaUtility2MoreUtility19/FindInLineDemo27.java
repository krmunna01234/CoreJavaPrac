package com.mk.JavaCompRef.JavaUtility2MoreUtility19;

//listing 27
//Demonstrate findInLine(). 
import java.util.*;

class FindInLineDemo27 {
	public static void main(String args[]) {
		String instr = "Name: Tom Age: 28 ID: 77";

		Scanner conin = new Scanner(instr);

		// Find and display age.
		conin.findInLine("Age:"); // find Age

		if (conin.hasNext())
			System.out.println(conin.next());
		else
			System.out.println("Error!");

		conin.close();
	}
}
