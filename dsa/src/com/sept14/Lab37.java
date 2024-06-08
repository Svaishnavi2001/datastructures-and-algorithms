package com.sept14;

/*  Print the following Pattern 

 * * * * * 
 * * * * * 
 * * * * * 
 * * * * * 
 * * * * *

 */

public class Lab37 {

	public static void main(String[] args) {

		int stars=5;
		int rows=5;

		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=stars;j++) {

				System.out.print("*");

			}

			System.out.println("");
		}	    

	}

}
