package com.sept25.Matrices;

public class Lab3 {

	public static void main(String[] args) {

		// Creating 2-D Array.
		int arr[][]=new int [3][3];

		// Initializing 1st Array/ 1st Row.
		arr[0][0]=11;
		arr[0][1]=12;
		arr[0][2]=13;

		// Initializing 2nd Array/ 2nd Row.
		arr[1][0]=21;
		arr[1][1]=22;
		arr[1][2]=23;

		// Initializing 3rd Array/ 3rd Row.   
		arr[2][0]=31;
		arr[2][1]=32;
		arr[2][2]=33;

		// Accessing Elements of 2-D.
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println("");
		}



	}

}
