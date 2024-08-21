package com.matrices;

public class Lab5 {

	public static void main(String[] args) {

		int arr[][]= {{1,2,3},{4,5,6,7},{8,9,10,11,12},{13,14,15,16,17,18}};

		System.out.println(" 1st Array:");

		// Accessing 1st Array Elements:
		for(int j=0;j<arr[0].length;j++) {
			System.out.print(arr[0][j]+"\t");
		}

		System.out.println("\n\n 2nd Array:");

		// Accessing 2nd Array Elements:
		for(int j=0;j<arr[1].length;j++) {
			System.out.print(arr[1][j]+"\t");
		}

		System.out.println("\n\n 3rd Array:");

		// Accessing 3rd Array Elements:
		for(int j=0;j<arr[2].length;j++) {
			System.out.print(arr[2][j]+"\t");
		}


	}

}
