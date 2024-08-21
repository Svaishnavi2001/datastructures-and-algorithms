package com.patterns;

public class Lab41 {

	public static void main(String[] args) {
		int stars=1;
		int rows=6;
		int spaces=15;

		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=stars;k++) {
				System.out.print("*");
			}
			System.out.println("");
			spaces=spaces-2;
			stars=stars+2;
		}

		for(int i=1;i<=rows/2;i++) {
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=stars;k++) {
				System.out.print("*");
			}
			System.out.println("");
			spaces=spaces+2;
			stars=stars-2;
		}
	}
}
