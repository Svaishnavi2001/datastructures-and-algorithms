package com.sept10.Number_And_Loops;

// WAP to print the divisibles of a given Number.

public class Lab6 {

	public static void main(String[] args) {

		int n = 10; 
		for (int i = 1; i <= n; i++) { 
			if (n % i == 0) 
				System.out.println(i); 
		} 

	}

}
