package com.mk.datastructure;

//youtube: Ravindrababu Ravula: Algorithms Lecture 7 -- Insertion SOrt Algorithm and analysis
public class InsertionSort {

	public static void main(String[] args) {
		
		int arr[] = {12, 2, 0, 5,10, 9, 4, 6};

		for(int a: arr){
			System.out.print(a+", ");
		}
		
		int k, i;
		
		for(int j = 1 ; j < arr.length; j++){
			k = arr[j];
			i = j - 1;
			while( i>=0 && arr[i] > k){
				arr[i+1] = arr[i];
				i = i -1;
				arr[i+1] = k;
			}
		}
		
		System.out.println("\nSorted: "+arr.length);
		for(int a: arr){
			System.out.print(a+", ");
		}
	}

}
