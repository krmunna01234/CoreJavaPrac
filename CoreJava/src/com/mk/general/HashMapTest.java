package com.mk.general;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {

		Map<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(2, "Hello");
		
		for(Map.Entry<Integer, String> entry: hm.entrySet()){
			System.out.println(entry.getKey()+"     : "+entry.getValue());
		}
		
		

	}
	
	public static void meth1(){
		if(1==1){
			return;
		}
	}

}
