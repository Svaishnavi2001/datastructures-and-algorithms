package com.number_and_loops2;

// WAP to find the Factorial of given Number. 

public class Lab21 {

	public static void main(String[] args) {
		
		int num=5;
		int fact=1;
		
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
        System.out.println(fact);
	}

}
