package com.sept14;

public class Lab39 {

	public static void main(String[] args) {
		int stars=1;
		int rows=5;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=stars;j++) {
				System.out.print("*");
			}
			System.out.println("");
			stars++;
		}

		stars=4;
		rows=5;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=stars;j++) {
				System.out.print("*");
			}
			System.out.println("");
			stars--;
		}


	}

}
