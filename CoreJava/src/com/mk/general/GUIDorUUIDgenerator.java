package com.mk.general;

import java.util.UUID;

public class GUIDorUUIDgenerator {
	public static void main(String[] args) {
		//
		// Creating a random UUID (Universally unique identifier). Random UUID
		// String = d67f9f8f-1c6b-4ab1-9d61-521137faee6e
		//
		UUID uuid = UUID.randomUUID();
		String randomUUIDString = uuid.toString();

		System.out.println("Random UUID String = " + randomUUIDString);
		System.out.println("UUID version       = " + uuid.version());
		System.out.println("UUID variant       = " + uuid.variant());
	}
}
