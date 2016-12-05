package com.mk.JavaCompRef.ConcurrencyUtilit28;

//listing 3
//An example of CountDownLatch. 

import java.util.concurrent.CountDownLatch;

class CDLDemo3 {
	public static void main(String args[]) {
		CountDownLatch cdl = new CountDownLatch(5);

		System.out.println("Starting");

		new MyThread(cdl);

		try {
			cdl.await();
		} catch (InterruptedException exc) {
			System.out.println(exc);
		}

		System.out.println("Done");
	}
}

class MyThread implements Runnable {
	CountDownLatch latch;

	MyThread(CountDownLatch c) {
		latch = c;
		new Thread(this).start();
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			latch.countDown(); // decrement count
		}
	}
}
