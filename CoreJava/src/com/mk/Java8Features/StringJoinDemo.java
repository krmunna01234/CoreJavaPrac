package com.mk.Java8Features;

import java.time.ZoneId;

public class StringJoinDemo {
	public static void main(String[] args) {
		String joined = String.join("/", "usr", "local", "bin");
		System.out.println(joined);

		String ids = String.join(", ", ZoneId.getAvailableZoneIds());
		System.out.println(ids);
	}
}