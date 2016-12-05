package com.mk.general;

import java.util.*;



public class CollectionTest {

	public static void main(String as[]) {

		System.out
				.println("**********************************List**********************************");
		System.out
				.println("**********************************List**********************************");
		System.out
				.println("=============================ArrayList==================================");
		System.out.println("ArrayList Example: ");
		List<String> al = new ArrayList<String>();
		al.add("Ram");
		al.add("Shyam");
		al.add("Mohan");
		al.add("Shyam");

		System.out
				.println("Inserted value : Ram, Shyam, Mohan, Shyam in ArrayList");
		System.out.println("ArrayList#1 normal for loop");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		System.out.println("ArrayList#2 advance for loop");
		for (String temp : al) {
			System.out.println(temp);
		}

		System.out.println("ArrayList#3 while loop");
		int j = 0;
		while (al.size() > j) {
			System.out.println(al.get(j));
			j++;
		}

		System.out.println("ArrayList#4 iterator");
		Iterator<String> iterator = al.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("ArrayList#5 iterator");
		for (Iterator<String> iterator1 = al.iterator(); iterator1.hasNext(); /* */) {
			String value = iterator1.next();
			System.out.println(value);
		}
		System.out
				.println("ArrayList#6  iterator concurrentModification exception");
		Iterator<String> itttr = al.iterator();
		while (itttr.hasNext()) {
			System.out.println(itttr.next());

		}

		System.out
				.println("=============================LinkedList==================================");
		System.out.println("LinkedList Example: ");
		List<String> lList = new LinkedList<String>();
		lList.add("Ram");
		lList.add("Shyam");
		lList.add("Mohan");
		lList.add("Shyam");

		System.out
				.println("Inserted value : Ram, Shyam, Mohan, Shyam in LinkedList");
		System.out.println("LinkedList#1 normal for loop");
		for (int i = 0; i < lList.size(); i++) {
			System.out.println(al.get(i));
		}

		System.out.println("LinkedList#2 advance for loop");
		for (String temp : lList) {
			System.out.println(temp);
		}

		System.out.println("LinkedList#3 while loop");
		int k = 0;
		while (al.size() > k) {
			System.out.println(al.get(k));
			k++;
		}

		System.out.println("LinkedList#4 iterator");
		Iterator<String> it = lList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		List<String> vec = new Vector<String>();

		System.out
				.println("**********************************Set**********************************");
		System.out
				.println("**********************************Set**********************************");
		System.out
				.println("=============================HashList==================================");
		System.out.println("HashSet Example: ");
		Set<String> hs = new HashSet<String>();
		hs.add("Ram");
		hs.add("Shyam");
		hs.add("Mohan");
		hs.add("Shyam"); // not giving any error because of duplicate but it is
							// not inserting into Set collection

		System.out
				.println("Inserted value : Ram, Shyam, Mohan, Shyam in HashSet");
		/*
		 * System.out.println("HashSet#1 normal for loop"); for (int i = 0; i <
		 * hs.size(); i++) { System.out.println(hs.get(i)); }
		 */

		System.out.println("HashSet#2 advance for loop");
		for (String temp : hs) {
			System.out.println(temp);
		}

		/*
		 * System.out.println("HashSet#3 while loop"); int l = 0; while
		 * (hs.size() > k) { System.out.println(hs.get(l)); k++; }
		 */

		System.out.println("HashSet#4 iterator");
		Iterator<String> itrt = hs.iterator();
		while (itrt.hasNext()) {
			System.out.println(itrt.next());
		}

		System.out.println("LinkedHashSet Example: ");
		Set<String> lHS = new LinkedHashSet<String>();
		lHS.add("Ram");
		lHS.add("Shyam");
		lHS.add("Mohan");
		lHS.add("Shyam"); // not giving any error because of duplicate but it is
							// not inserting into Set collection

		System.out
				.println("Inserted value : Ram, Shyam, Mohan, Shyam in LinkedHashSet");

		System.out.println("LinkedHashSet#2 advance for loop");
		for (String temp : lHS) {
			System.out.println(temp);
		}

		System.out.println("LinkedHashSet#4 iterator");
		Iterator<String> itrtr = lHS.iterator();
		while (itrtr.hasNext()) {
			System.out.println(itrtr.next());
		}

		System.out.println("TreeSet Example: ");
		Set<String> tS = new TreeSet<String>();
		tS.add("Ram");
		tS.add("Shyam");
		tS.add("Mohan");
		tS.add("Shyam"); // not giving any error because of duplicate but it is
							// not inserting into Set collection

		System.out
				.println("Inserted value : Ram, Shyam, Mohan, Shyam in TreeSet");

		System.out.println("TreeSet#2 advance for loop");
		for (String temp : tS) {
			System.out.println(temp);
		}

		System.out.println("TreeSet#4 iterator");
		Iterator<String> itrtor = tS.iterator();
		while (itrtor.hasNext()) {
			System.out.println(itrtor.next());
		}

		System.out
				.println("**********************************MAP**********************************");
		System.out
				.println("**********************************Map**********************************");
		System.out
				.println("==============================HashMap==================================");
		System.out.println("HashMap Example: ");
		Map<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(3, "Ram");
		hm.put(1, "Shyam");
		hm.put(2, "Mohan");
		hm.put(2, "Shyam");
		hm.put(5, "Hiii");
		hm.put(null, null);
		hm.put(null, "Ram");
		hm.put(6, null);
		hm.put(null, "Sure");

		System.out.println("HashMap#1 advance for loop with Mp.Entry");
		for (Map.Entry<Integer, String> e : hm.entrySet()) {
			System.out.println("Key:" + e.getKey() + "  Value:" + e.getValue());
		}

		System.out.println("HashMap#2 advance for loop with get(key)");
		for (Integer key : hm.keySet()) {
			System.out.println("Key:" + key + "  Value:" + hm.get(key));
		}

		System.out.println("HashMap#3 advance for loop with Iterator, while");
		Iterator<Map.Entry<Integer, String>> itr1 = hm.entrySet().iterator();
		while (itr1.hasNext()) {
			Map.Entry<Integer, String> entry = itr1.next();
			System.out.println("Key:" + entry.getKey() + "  Value:"
					+ entry.getValue());
		}

		System.out.println("HashMap#2 advance for loop with Iterator, while");
		Iterator<Integer> itr2 = hm.keySet().iterator();
		while (itr2.hasNext()) {
			Integer key = itr2.next();
			System.out.println("Key:" + key + "  Value:" + hm.get(key));
		}

		Map<Employee, String> m = new HashMap<Employee, String>();

		System.out
				.println("==============================HashTable==================================");
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(1, "Ram");
		ht.put(4, "Ram");
		ht.put(2, "Shyam");
		ht.put(6, "Hello");
		ht.put(2, "ABC");
		ht.put(5, "XYZ");
		ht.put(17, "ABC");

		System.out.println("HashMap#1 advance for loop with Mp.Entry");
		for (Map.Entry<Integer, String> e : ht.entrySet()) {
			System.out.println("Key:" + e.getKey() + "  Value:" + e.getValue());
		}

		System.out.println("HashMap#2 advance for loop with get(key)");
		for (Integer key : ht.keySet()) {
			System.out.println("Key:" + key + "  Value:" + ht.get(key));
		}

		System.out.println("HashMap#3 advance for loop with Iterator, while");
		Iterator<Map.Entry<Integer, String>> itr3 = ht.entrySet().iterator();
		while (itr1.hasNext()) {
			Map.Entry<Integer, String> entry = itr3.next();
			System.out.println("Key:" + entry.getKey() + "  Value:"
					+ entry.getValue());
		}

		System.out.println("HashMap#2 advance for loop with Iterator, while");
		Iterator<Integer> itr4 = ht.keySet().iterator();
		while (itr4.hasNext()) {
			Integer key = itr2.next();
			System.out.println("Key:" + key + "  Value:" + ht.get(key));
		}

		System.out
				.println("==============================TreeMap==================================");
		Map<Integer, String> mt = new TreeMap<Integer, String>();

		mt.put(5, "Hello");
		mt.put(6, "World");
		mt.put(2, "WORD");
		mt.put(5, "abcdef");
		mt.put(5, "Hello");
		mt.put(8, "XYZ");

		Iterator<Map.Entry<Integer, String>> itr5 = mt.entrySet().iterator();
		while (itr5.hasNext()) {
			Map.Entry<Integer, String> entry = itr5.next();
			System.out.println("Key:" + entry.getKey() + "  Value:"
					+ entry.getValue());
		}

		System.gc();

		// ht.put(null, null);
		// ht.put(null, null);
		/*
		 * while(hm.){ System.out.println(hm); }
		 */
	}
}
