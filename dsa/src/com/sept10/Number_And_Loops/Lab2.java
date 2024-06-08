package com.sept10.Number_And_Loops;

// WAP to find Max of Two Numbers.

public class Lab2 {

	public static void main(String[] args) {

		int a=10;
		int b=20;
		int max=0;
		if(a!=b) {

			if(a>b) {
				max=a;
			}else {
				max=b;
			}
			System.out.println("Max:"+max);

		}
		else {

			System.out.println("Both are same");
		}
	}
}
