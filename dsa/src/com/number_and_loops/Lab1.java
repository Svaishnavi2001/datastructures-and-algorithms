package com.number_and_loops;

// WAP to Swap Two Numbers without third Variable.

public class Lab1 {

	public static void main(String[] args) {

		int a=10;
		int b=20;
		System.out.println("a="+a+","+"b="+b); 
		// Swapping of no.s
		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println("a="+a+","+"b="+b); 
	}

}
