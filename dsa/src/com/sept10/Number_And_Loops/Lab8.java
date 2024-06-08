package com.sept10.Number_And_Loops;

//  WAP to Find whether given Number is Prime or Not.

public class Lab8 {

	public static void main(String[] args) {

		int n = 10; 
		int count = 0; 

		for (int i = 2; i <= n; i++) { 

			if (n % i == 0) { 
				count ++; 
				break; 
			} 

		} 

		if(count==0) { 
			System.out.println(n + " is Prime: "); 
		}else { 
			System.out.println(n + " is Not Prime: "); 
		} 

	}

}
