package com.mk.JavaCompRef.JavaUtility1_18;

//listing 16
//Use thenComparing() to sort by last, then first name.  
import java.util.*;

//A comparator that compares last names.  
class CompLastNames implements Comparator<String> {
	public int compare(String aStr, String bStr) {
		int i, j;

		// Find index of beginning of last name.
		i = aStr.lastIndexOf(' ');
		j = bStr.lastIndexOf(' ');

		return aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
	}
}

// Sort by entire name when last names are equal.
class CompThenByFirstName implements Comparator<String> {
	public int compare(String aStr, String bStr) {
		int i, j;

		return aStr.compareToIgnoreCase(bStr);
	}
}

class TreeMapDemo16 {
	public static void main(String args[]) {
		// Use thenComparing() to create a comparator that compares
		// last names, then compares entire name when last names match.
		CompLastNames compLN = new CompLastNames();
		Comparator<String> compLastThenFirst = compLN.thenComparing(new CompThenByFirstName());

		// Create a tree map.
		TreeMap<String, Double> tm = new TreeMap<String, Double>(compLastThenFirst);

		// Put elements to the map.
		tm.put("John Doe", new Double(3434.34));
		tm.put("Tom Smith", new Double(123.22));
		tm.put("Jane Baker", new Double(1378.00));
		tm.put("Tod Hall", new Double(99.22));
		tm.put("Ralph Smith", new Double(-19.08));

		// Get a set of the entries.
		Set<Map.Entry<String, Double>> set = tm.entrySet();

		// Display the elements.
		for (Map.Entry<String, Double> me : set) {
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		System.out.println();

		// Deposit 1000 into John Doe's account.
		double balance = tm.get("John Doe");
		tm.put("John Doe", balance + 1000);

		System.out.println("John Doe's new balance: " + tm.get("John Doe"));
	}
}
