package com.mk.general;

public class Thread2 implements Runnable {

	public void run() {
		System.out.println("Run Method");
		// throw new RuntimeException("Problem");
	}

	public static void main(String[] args) {
		Thread t = new Thread(new Thread2());
		System.out.println("Before start method");
		t.start();
		System.out.println("After Start method");
		System.out.println("After Start method");
	}

}
