package com.mk.JavaCompRef.ConcurrencyUtilit28;

//listing 4
//An example of CyclicBarrier. 

import java.util.concurrent.*;

class BarDemo4 {
	public static void main(String args[]) {
		CyclicBarrier cb = new CyclicBarrier(3, new BarAction());

		System.out.println("Starting");

		new HelloThread(cb, "A");
		new HelloThread(cb, "B");
		new HelloThread(cb, "C");

	}
}

// A thread of execution that uses a CyclicBarrier.
class HelloThread implements Runnable {
	CyclicBarrier cbar;
	String name;

	HelloThread(CyclicBarrier c, String n) {
		cbar = c;
		name = n;
		new Thread(this).start();
	}

	public void run() {

		System.out.println(name);

		try {
			cbar.await();
		} catch (BrokenBarrierException exc) {
			System.out.println(exc);
		} catch (InterruptedException exc) {
			System.out.println(exc);
		}
	}
}

// An object of this class is called when the
// CyclicBarrier ends.
class BarAction implements Runnable {
	public void run() {
		System.out.println("Barrier Reached!");
	}
}
