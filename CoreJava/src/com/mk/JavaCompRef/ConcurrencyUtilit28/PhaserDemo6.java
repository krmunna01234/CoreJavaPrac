package com.mk.JavaCompRef.ConcurrencyUtilit28;

//listing 6
//An example of Phaser. 

import java.util.concurrent.*;

class PhaserDemo6 {
	public static void main(String args[]) {
		Phaser phsr = new Phaser(1);
		int curPhase;

		System.out.println("Starting");

		new MyThread111(phsr, "A");
		new MyThread111(phsr, "B");
		new MyThread111(phsr, "C");

		// Wait for all threads to complete phase one.
		curPhase = phsr.getPhase();
		phsr.arriveAndAwaitAdvance();
		System.out.println("Phase " + curPhase + " Complete");

		// Wait for all threads to complete phase two.
		curPhase = phsr.getPhase();
		phsr.arriveAndAwaitAdvance();
		System.out.println("Phase " + curPhase + " Complete");

		curPhase = phsr.getPhase();
		phsr.arriveAndAwaitAdvance();
		System.out.println("Phase " + curPhase + " Complete");

		// Deregister the main thread.
		phsr.arriveAndDeregister();

		if (phsr.isTerminated())
			System.out.println("The Phaser is terminated");
	}
}

// A thread of execution that uses a Phaser.
class MyThread111 implements Runnable {
	Phaser phsr;
	String name;

	MyThread111(Phaser p, String n) {
		phsr = p;
		name = n;
		phsr.register();
		new Thread(this).start();
	}

	public void run() {

		System.out.println("Thread " + name + " Beginning Phase One");
		phsr.arriveAndAwaitAdvance(); // Signal arrival.

		// Pause a bit to prevent jumbled output. This is for illustration
		// only. It is not required for the proper opration of the phaser.
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			System.out.println(e);
		}

		System.out.println("Thread " + name + " Beginning Phase Two");
		phsr.arriveAndAwaitAdvance(); // Signal arrival.

		// Pause a bit to prevent jumbled output. This is for illustration
		// only. It is not required for the proper opration of the phaser.
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			System.out.println(e);
		}

		System.out.println("Thread " + name + " Beginning Phase Three");
		phsr.arriveAndDeregister(); // Signal arrival and deregister.
	}
}
