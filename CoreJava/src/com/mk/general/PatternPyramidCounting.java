package com.mk.general;

public class PatternPyramidCounting {

	public static void main(String[] args) {
		
		/*
		 * if n = 4
		 * then print
		 * 1
		 * 3*2
		 * 4*5*6
		 * 10*9*8*7
		 * 
		 * 
		 */
		
		int n = 4, k = 0;
		
		
		for(int i = 1 ; i <= n ; i++){
			
			for(int j = i+1; j <= i+i ; j++){
				k = j;
				System.out.print(k);
				if(j!=i)
					System.out.print("*");
			}
			System.out.println("");
		}

	}

}
