package com.mk.collectionsProgram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TraversingCollections {

	public static void main(String as[]) {
		List<String> list = new ArrayList<String>();
		list.add("Ram");
		list.add("Shyam");
		list.add("Ram");
		list.add("Abhishek");
		list.add("Anirudh");
		
		System.out.println("***********Traversing List****************");
		System.out.println("----------Iterator-----------");
		Iterator<String> it = list.iterator();
		it.forEachRemaining(System.out::println);
		System.out.println("............Iterator forEachRemaining()..........");
		Iterator<String> it1 = list.iterator();
		while(it1.hasNext()){
			System.out.println(it1.next());
		}
		System.out.println("..........Iterator forEachRemaining() without using iterator..........");
		list.iterator().forEachRemaining(System.out::println);
		
		System.out.println("----------for each-----------");
		for(String l: list){
			System.out.println(l);
		}
	}
}