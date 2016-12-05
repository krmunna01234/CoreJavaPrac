package com.mk.JavaCompRef.ConcurrencyUtilit28;

//listing 11
//A simple example of Atomic. 

import java.util.concurrent.atomic.*;

class AtomicDemo11 {

	public static void main(String args[]) {
		new AtomThread("A");
		new AtomThread("B");
		new AtomThread("C");
	}
}

class Shared3 {
	static AtomicInteger ai = new AtomicInteger(0);
}

// A thread of execution that increments count.
class AtomThread implements Runnable {
	String name;

	AtomThread(String n) {
		name = n;
		new Thread(this).start();
	}

	public void run() {

		System.out.println("Starting " + name);

		for (int i = 1; i <= 3; i++)
			System.out.println(name + " got: " + Shared3.ai.getAndSet(i));
	}
}
