package com.number_and_loops1;

//  WAP to find sum of individual digits of given number.

public class Lab18 {

	public static void main(String[] args) {

		int num = 123; 
		int sum = 0; 

		while(num!=0) { 
			int digit = num %10; 
			sum = sum +digit; 
			num = num /10; 
		} 

		System.out.println("Sum : "+ sum); 
	} 

}


