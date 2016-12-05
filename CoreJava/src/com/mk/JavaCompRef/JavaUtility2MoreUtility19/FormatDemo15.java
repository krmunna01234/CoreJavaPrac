package com.mk.JavaCompRef.JavaUtility2MoreUtility19;

//listing 15
//Demonstrate the %n and %% format specifiers. 
import java.util.*;

class FormatDemo15 {
	public static void main(String args[]) {
		Formatter fmt = new Formatter();

		fmt.format("Copying file%nTransfer is %d%% complete", 88);
		System.out.println(fmt);
		fmt.close();
	}
}
