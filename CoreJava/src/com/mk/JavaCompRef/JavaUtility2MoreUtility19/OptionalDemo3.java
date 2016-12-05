package com.mk.JavaCompRef.JavaUtility2MoreUtility19;

//listing 3
//Demonstrate Optional<T>.

import java.util.*;

class OptionalDemo3 {
	public static void main(String args[]) {

		Optional<String> noVal = Optional.empty();

		Optional<String> hasVal = Optional.of("ABCDEFG");

		if (noVal.isPresent())
			System.out.println("This won't be displayed");
		else
			System.out.println("noVal has no value");

		if (hasVal.isPresent())
			System.out.println("The string in hasVal is: " + hasVal.get());

		String defStr = noVal.orElse("Default String");
		System.out.println(defStr);
	}
}