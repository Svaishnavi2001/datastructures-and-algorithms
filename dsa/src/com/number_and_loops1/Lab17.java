package com.number_and_loops1;

// WAP to find number of digits of given number.

public class Lab17 {


	public static void main(String[] args) {

		int num=123;
		int count=0;

		while(num>0) {
			
			
			num=num/10;
			count++;
		}


		System.out.println("No of Digits:"+count);
	}

}
