package com.sept10.Number_And_Loops;

// WAP to find No. of divisibles of a given Number.

public class Lab7 {

	public static void main(String[] args) {

		int n = 10; 
		int count = 0; 

		for (int i = 1; i <= n; i++) { 
			if (n % i == 0) 
				count ++; 
		} 
		System.out.println("Count : "+ count); 
	}

}
