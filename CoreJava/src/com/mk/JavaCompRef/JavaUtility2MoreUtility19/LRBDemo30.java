package com.mk.JavaCompRef.JavaUtility2MoreUtility19;

//listing 30
//Demonstrate a resource bundle.
import java.util.*;

class LRBDemo30 {
	public static void main(String args[]) {
		SampleRB28 sr= new SampleRB28();
		ResourceBundle rd = ResourceBundle.getBundle("SampleRB28");

		System.out.println("English version: ");
		System.out.println("String for Title key : " + rd.getString("title"));

		System.out.println("String for StopText key: " + rd.getString("StopText"));

		System.out.println("String for StartText key: " + rd.getString("StartText"));

		rd = ResourceBundle.getBundle("SampleRB28", Locale.GERMAN);

		System.out.println("\nGerman version: ");
		System.out.println("String for Title key : " + rd.getString("title"));

		System.out.println("String for StopText key: " + rd.getString("StopText"));

		System.out.println("String for StartText key: " + rd.getString("StartText"));
	}
}
