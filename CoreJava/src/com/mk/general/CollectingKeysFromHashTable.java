package com.mk.general;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.*;
import java.util.Set;

public class CollectingKeysFromHashTable {

	public static void main(String a[]) {
		HashMap<String, String> hm = new HashMap<String, String>();
		// add key-value pair to hashmap
		hm.put("first", "FIRST INSERTED");
		hm.put("second", "SECOND INSERTED");
		hm.put("third", "THIRD INSERTED");
		System.out.println(hm);
		Set<String> keys = hm.keySet();
		for (String key : keys) {
			System.out.println(key);
		}

		Map<String, String> ht = new Hashtable<String, String>();

		// add key-value pair to hashmap
		ht.put("first1", "FIRST INSERTED");
		ht.put("second1", "SECOND INSERTED");
		ht.put("third1", "THIRD INSERTED");
		System.out.println(ht);
		Set<String> keys1 = ht.keySet();
		List<String> list = new ArrayList<String>();
		list.addAll(keys1);
		for (String key : keys1) {
			System.out.println(key);
		}
		for (String l : list) {
			System.out.println(l);
		}
	}
}
