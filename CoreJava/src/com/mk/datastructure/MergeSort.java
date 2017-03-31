package com.mk.datastructure;

import java.util.Random;

//http://www.java2novice.com/java-sorting-algorithms/merge-sort/
//http://www.vogella.com/tutorials/JavaAlgorithmsMergesort/article.html
public class MergeSort {
	private int[] numbers;
	private int[] helper;

	private int length;

	public void sort(int[] values) {
		this.numbers = values;
		length = values.length;
		this.helper = new int[length];
		mergesort(0, length - 1);
	}

	private void mergesort(int low, int high) {
		// check if low is smaller than high, if not then the array is sorted
		if (low < high) {
			// Get the index of the element which is in the middle
			int middle = low + (high - low) / 2;
			// Sort the left side of the array
			mergesort(low, middle);
			// Sort the right side of the array
			mergesort(middle + 1, high);
			// Combine them both
			merge(low, middle, high);
		}
	}

	private void merge(int low, int middle, int high) {

		// Copy both parts into the helper array
		for (int i = low; i <= high; i++) {
			helper[i] = numbers[i];
		}

		int i = low;
		int j = middle + 1;
		int k = low;
		// Copy the smallest values from either the left or the right side back
		// to the original array
		while (i <= middle && j <= high) {
			if (helper[i] <= helper[j]) {
				numbers[k] = helper[i];
				i++;
			} else {
				numbers[k] = helper[j];
				j++;
			}
			k++;
		}
		// Copy the rest of the left side of the array into the target array
		while (i <= middle) {
			numbers[k] = helper[i];
			k++;
			i++;
		}

	}

	private static int[] nums;
	private final static int SIZE = 7;
	private final static int MAX = 20;

	public static void main(String as[]) {

		nums = new int[SIZE];
		Random generator = new Random();
		for (int i = 0; i < nums.length; i++) {
			nums[i] = generator.nextInt(MAX);
		}
		
		for (Integer i : nums) {
			System.out.println(i);
		}
			
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		MergeSort sorter = new MergeSort();
		sorter.sort(nums);
		for (Integer i : nums) {
			System.out.println(i);
		}
		long stopTime = System.currentTimeMillis();
		System.out.println(stopTime);
		long elapsedTime = stopTime - startTime;
		System.out.println("Mergesort " + elapsedTime);

	}
}